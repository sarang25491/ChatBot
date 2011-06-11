package com.ki113d.chatbot.vocab;

/**
 * An object that contains information about a word that is added to the
 * bots vocabulary.
 * @author Ki113d
 */
public class Word {
    private boolean isPronoun;
    private boolean isAdjective;
    private boolean isNoun;
    private boolean isVerb;
    private boolean isAdverb;
    private String word = null;

    /**
     * Constructs an empty {@code Word} object.
     */
    public Word() {
        
    }
    
//<editor-fold defaultstate="collapsed" desc="Setters">
    
    public void setIsAdjective(boolean isAdjective) {
        this.isAdjective = isAdjective;
    }
    
    public void setIsAdverb(boolean isAdverb) {
        this.isAdverb = isAdverb;
    }
    
    public void setIsNoun(boolean isNoun) {
        this.isNoun = isNoun;
    }
    
    public void setIsPronoun(boolean isPronoun) {
        this.isPronoun = isPronoun;
    }
    
    public void setIsVerb(boolean isVerb) {
        this.isVerb = isVerb;
    }
    
    public void setWord(String word) {
        this.word = word;
    }
    
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Getters">
    
    public boolean isIsAdjective() {
        return isAdjective;
    }
    
    public boolean isIsAdverb() {
        return isAdverb;
    }
    
    public boolean isIsNoun() {
        return isNoun;
    }
    
    public boolean isIsPronoun() {
        return isPronoun;
    }
    
    public boolean isIsVerb() {
        return isVerb;
    }
    
    public String getWord() {
        return word;
    }
    
//</editor-fold>
     
}