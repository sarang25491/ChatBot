package com.ki113d.chatbot.engine;

import com.ki113d.chatbot.util.BasicUtils;
import com.ki113d.chatbot.vocab.*;

import java.util.*;

/**
 *
 * @author Ki113d
 */
public class CommandHandler {
    
    private BasicUtils bUtil = new BasicUtils();

    public String time(String line) throws Exception {
        String time = null;
        int zone = 0;
        
        if (line.length() > 5) {
            zone = Integer.valueOf(line.substring(line.indexOf("!time ")));
            if (zone < 13 && zone > -12) {
                time = bUtil.getTime(zone);
            } else {
                throw new Exception("Time zone is invalid!");
            }
        } else {
            time = "The time here is " + bUtil.getTime();
        }

        return time;
    }
    
    public void learn(HashMap hm) {
        Word word = new Word();
        int temp = 0;
        word.setWord(hm.get("Word").toString());
        temp = (Integer.valueOf(hm.get("Adjective").toString()) == 0 ? 0 : 1);
        word.setIsAdjective((temp == 0 ? true : false));
        temp = (Integer.valueOf(hm.get("Adverb").toString()) == 0 ? 0 : 1);
        word.setIsAdverb((temp == 0 ? true : false));
        temp = (Integer.valueOf(hm.get("Noun").toString()) == 0 ? 0 : 1);
        word.setIsNoun(temp == 0 ? true : false);
        temp = (Integer.valueOf(hm.get("Pronoun").toString()) == 0 ? 0 : 1);
        word.setIsPronoun(temp == 0 ? true : false);
        temp = (Integer.valueOf(hm.get("Verb").toString()) == 0 ? 0 : 1);
        word.setIsVerb(temp == 0 ? true : false);
        
        com.ki113d.chatbot.Main.addWord(word);
    }
}
