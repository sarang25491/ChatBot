package com.ki113d.chatbot.engine;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The interpreter is merely a thread that reads data from input and output
 * streams.
 * 
 * @author Ki113d
 * @since 0.1a 30/05/2011
 */
public class Interpreter implements Runnable {

    private Thread thread;
    private DataInputStream input;
    private DataOutputStream output;
    private DataOutputStream error;

    /**
     * An empty constructor.
     */
    public Interpreter() {
    }

    public void run() {
        input = new DataInputStream(System.in);
        output = new DataOutputStream(System.out);
        error = new DataOutputStream(System.err);
        String incoming;
        while (true) {
            try {
                incoming = input.readLine();
                if (isCommand(incoming)) {
                    handleCommand(incoming);
                } else {
                    handleConversation(incoming);
                }
            } catch (Exception ex) {
                Logger.getLogger(Interpreter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * Starts the interpreter thread.
     */
    public void start() {
        (thread = new Thread(this)).start();
    }

    /**
     * Determines whether a string of text is meant to be a command or just
     * normal conversation.
     *
     * @param line The string to test whether it in fact is a command
     * @return True is the parameter {@code line}> is a command false
     * otherwise.
     */
    private boolean isCommand(String line) {
        if (line.startsWith("/") || line.startsWith("!")) {
            return true;
        }
        return false;
    }

    /**
     *
     * @param line The string to be interpreted.
     */
    public void handleCommand(String line) {
        // Do nothing
    }

    private void handleConversation(String line) {
        // Do nothing
    }
}