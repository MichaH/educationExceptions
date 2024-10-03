/*
 *   O R A N G E   O B J E C T S
 * 
 *   copyright by Orange Objects
 *   http://www.OrangeObjects.de
 * 
 */

package com.orangeobjects.ex;

/**
 * @author Michael.Hofmann@OrangeObjects.de
 * 
 */
public class DataException extends Exception {

    public DataException() {
    }

    public DataException(String message) {
        super(message);
    }

    public DataException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataException(Throwable cause) {
        super(cause);
    }
    
    
}
