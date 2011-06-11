package com.ki113d.chatbot.exceptions;

/**
 *
 * @author Ki113d
 */
public class WordException extends Exception {
    
    /**
     * Constructs a {@code WordException} with {@code null} as its
     * detail message.
     */
    public WordException() {
        super();
    }
    
    /**
     * Constructs a {@code WordException} with a specified detail message.
     * 
     * @param message
     *        An error message which is saved for later retrieval with
     *        the {@link #getMessage()} method.
     */
    public WordException(String message) {
        super(message);
    }
    
    /**
     * Constructs a {@code WordException} with the specified detail message
     * and cause.
     *
     * <p> Note that the detail message associated with {@code cause} is
     * <i>not</i> automatically incorporated into this exception's detail
     * message.
     *
     * @param message
     *        The detail message (which is saved for later retrieval
     *        by the {@link #getMessage()} method)
     *
     * @param cause
     *        The cause (which is saved for later retrieval by the
     *        {@link #getCause()} method).  (A null value is permitted,
     *        and indicates that the cause is nonexistent or unknown.)
     *
     */
    public WordException(String message, Throwable cause) {
        super(message, cause);
    }
    
    /**
     * Constructs a {@code WordException} with the specified cause and a
     * detail message of {@code (cause==null ? null : cause.toString())}
     * (which typically contains the class and detail message of {@code cause}).
     *
     * @param cause
     *        The cause (which is saved for later retrieval by the
     *        {@link #getCause()} method).  (A null value is permitted,
     *        and indicates that the cause is nonexistent or unknown.)
     *
     */
    public WordException(Throwable cause) {
        super(cause);
    }
}
