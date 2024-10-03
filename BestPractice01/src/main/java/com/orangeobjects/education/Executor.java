/*
 *   O R A N G E   O B J E C T S
 * 
 *   copyright by Orange Objects
 *   http://www.OrangeObjects.de
 * 
 */

package com.orangeobjects.education;

import com.orangeobjects.ex.ApplicationException;
import com.orangeobjects.ex.DataException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Michael.Hofmann@OrangeObjects.de
 * 
 */
public class Executor {
    
    private static Logger LOGGER = Logger.getLogger(Executor.class.getName());

    ReaderA a = new ReaderA();
    ReaderB b = new ReaderB();
    ReaderC c = new ReaderC();
            
    public String execute() throws ApplicationException {
        try {
            String allContent = 
                    a.readData().orElse("") + 
                    b.readData() + 
                    c.readData();
            return allContent.repeat(2);
        } catch (DataException ex) {
            /*
            
            - Die höherwerige Exception wird hier behandelt. Wir wissen per Definition,
              dass sie unten nicht geloggt oder behandelt werden konnte.
            */
            throw new ApplicationException("ooID: Datenfehler im Executor", ex);
        }
    }
}
