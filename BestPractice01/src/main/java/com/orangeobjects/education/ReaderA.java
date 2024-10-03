/*
 *   O R A N G E   O B J E C T S
 * 
 *   copyright by Orange Objects
 *   http://www.OrangeObjects.de
 * 
 */

package com.orangeobjects.education;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Michael.Hofmann@OrangeObjects.de
 * 
 */
public class ReaderA {
    
    private static Logger LOGGER = Logger.getLogger(ReaderA.class.getName());

    public Optional<String> readData() {
        
        try {
            Path dataFile = Path.of("../../dataA.txt");
            String content = Files.readString(dataFile);
            return Optional.of(content);            
        } catch (IOException ex) {
            /*
                
            - Elementare Exceptions sollten sofort geloggt werden. Sie enthalten immer
              eine eindeutige ooID.
            - Kann das Problem gelöst werden, hier z.B. durch eine definierte, leere
              Rückgabe, ist keine zusätzliche errorID nötig.
            - Kann das Problem gelöst werden, wird keine Exception geworfen.
            
            */
            LOGGER.log(Level.WARNING, "ooID: Fehler beim Lesen von Data A", ex);
            return Optional.empty();
        }
    }
}
