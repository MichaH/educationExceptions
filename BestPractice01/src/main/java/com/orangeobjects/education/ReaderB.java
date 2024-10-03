/*
 *   O R A N G E   O B J E C T S
 * 
 *   copyright by Orange Objects
 *   http://www.OrangeObjects.de
 * 
 */

package com.orangeobjects.education;

import com.orangeobjects.ex.DataException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Michael.Hofmann@OrangeObjects.de
 * 
 */
public class ReaderB {
    
    private static Logger LOGGER = Logger.getLogger(ReaderB.class.getName());

    public String readData() throws DataException {
        
        try {
            Path dataFile = Path.of("../../dataB.txt");
            return Files.readString(dataFile);
        } catch (IOException ex) {
            /*
                
            - Elementare Exceptions sollten sofort geloggt werden. Sie enthalten immer
              eine eindeutige ooID.
            - Kann das Problem nicht lokal gelöst werden, wird es nach oben gegeben. Die
              Exception nach oben ist eine höherwertige oder höchstwertige Exception.
            - Wird ein Fehler nach oben gegeben, sollte die bereits verwendete errorID
              mit nach oben gegeben werden, um die Fehlertexte später leichter zusammen
              zu bringen.
            - Die originale Exception sollte mit nach oben gegeben werden.
            
            */
            String errorID = ""+System.currentTimeMillis();
            LOGGER.log(Level.SEVERE, "ooID:errorID: Fehler beim Lesen von Data B", ex);
            throw new DataException("ooID:errorID: Fehler beim Datenlesen", ex);
        }
    }
}
