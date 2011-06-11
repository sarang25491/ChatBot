/**
 * ChatBot, an attempt at a sub intelligent bot written in Java.
 *
 * Copyright (C) 2011  Ki113d.
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.ki113d.chatbot;

import com.ki113d.chatbot.exceptions.WordException;
import com.ki113d.chatbot.vocab.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ki113d
 * @version 0.1a
 */
public class Main {

    public static Vocabulary vocab = new Vocabulary();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
    
    public static void addWord(Word word) {
        try {
            vocab.addWord(word);
        } catch (WordException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
