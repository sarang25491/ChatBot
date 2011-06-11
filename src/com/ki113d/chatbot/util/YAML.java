package com.ki113d.chatbot.util;

import java.io.*;
import java.util.*;
import com.ki113d.chatbot.vocab.Word;
import com.esotericsoftware.yamlbeans.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ki113d
 */
public class YAML {
    
    private static String sep = System.getProperty("file.separator");

//<editor-fold desc="Vocabulary Functions">
    
    public static List<Word> loadVocab() throws Exception {
        List<Word> words = new ArrayList();
        Word temp = null;
        File vocabDir = new File(sep + "Vocabulary" + sep + "Words" + sep);
        String[] files = vocabDir.list();
        YamlReader reader = null;
        if (files == null) {
            throw new Exception("Vocabulary directory does not exist. "
                    + "or there are no word files in existence.");
        }
        for (int i = 0; i <= files.length; i++) {
            reader = new YamlReader(new FileReader(vocabDir
                    + files[i].toString()
                    + ".yml"));
            temp = reader.read(Word.class);
            words.add(temp);
        }
        return words;
    }
    
    public static void saveVocab(List<Word> words) {
        Word temp = null;
        YamlWriter writer = null;
        
        for (int i = 0; i <= words.size(); i ++) {
            temp = words.get(i);
            try {
                writer = new YamlWriter(new FileWriter(sep + "Vocabulary"
                        + sep + "Words"
                        + sep + temp.getWord()
                        + ".yml"));
                writer.write(temp);
            } catch(YamlException ex) {
                Logger.getLogger(YAML.class.getName()).log(
                        Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(YAML.class.getName()).log(
                        Level.SEVERE, null, ex);
            }
        }
    }
    
//</editor-fold>
    
}
