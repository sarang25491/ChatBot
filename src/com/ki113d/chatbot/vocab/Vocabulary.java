package com.ki113d.chatbot.vocab;

import com.ki113d.chatbot.exceptions.WordException;
import com.ki113d.chatbot.util.YAML;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The vocabulary is merely a collection of words that the bot can use to
 * construct sentences.
 * @author Ki113d
 */
public class Vocabulary {
    
    private List<Word> words= new ArrayList();
    
    public Vocabulary() {
        // Add vocab loading code here.
    }
    
    /**
     * Returns a {@link Word} object from the {@link ArrayList}.
     * 
     * @param word The string value of a {@link Word} object to return.
     * @return A word object or null if the object does not exist.
     */
    public Word getWord(String word) {
        if (wordExists(word)) return words.get(getWordIndex(word));
        return null;
    }
    
    /**
     * Returns the integer representing the location of a {@link Word}.
     * <p>Only call this method if you know the {@link Word} exists.</p>
     * 
     * @param word The string value of the word object to search for.
     * @return The index value representing the location of the {@link Word}
     *         in the {@link ArrayList} or -1 if the {@link Word} doesn't exist.
     */
    private int getWordIndex(String word) {
        Word temp = new Word();
        int index = -1;
        for (int i = 0; i <= words.size(); i++) {
            temp = words.get(i);
            if (temp.getWord().equalsIgnoreCase(word)) index = i;
        }
        return index;
    }
    
    /**
     * Adds a {@link Word} to the {@link ArrayList}.
     * 
     * @param word The {@link Word} object to add to the {@link ArrayList}.
     */
    public void addWord(Word word) throws WordException {
        if (wordExists(word)) throw new WordException("Word already exists.");
        words.add(word);
    }
    
    /**
     * Returns whether a {@link Word} exists in the {@link ArrayList}.
     * 
     * @param word The {@link Word} to search for.
     * @return {@code true} if the {@link Word} exists otherwise {@code false}.
     */
    private boolean wordExists(Word word) {
        if (words.contains(word)) return true;
        return false;
    }
    
    /**
     * Returns whether a {@link Word} exists in the {@link ArrayList}.
     * 
     * @param word The string representation of a {@link Word} to search for.
     * @return {@code true} if the {@link Word} exists otherwise {@code false}.
     */
    private boolean wordExists(String word) {
        Word temp = new Word();
        for (int i = 0; i <= words.size(); i++) {
            temp = words.get(i);
            if (temp.getWord().equalsIgnoreCase(word)) return true;
        }
        return false;
    }
    
    /**
     * Saves the vocabulary to disk.
     */
    public void saveVocab() {
        YAML.saveVocab(this.words);
    }
    
    /**
     * Loads the vocabulary from disk.
     */
    public void loadVocab() {
        try {
            words = YAML.loadVocab();
        } catch (Exception ex) {
            Logger.getLogger(Vocabulary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
