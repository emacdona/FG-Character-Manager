package net.edmacdonald.fantasyGrounds;

import net.edmacdonald.fantasyGrounds.character.fourthEdition.jpg.Root;
import net.edmacdonald.fantasyGrounds.character.fourthEdition.jpg.Total;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App
{
    private static Log log = LogFactory.getLog(App.class);

    public static void main( String[] args )
            throws JAXBException
    {
        InputStream is = App.class.getResourceAsStream("/4E_JPG.xml");

        JAXBContext jc = JAXBContext.newInstance("net.edmacdonald.fantasyGrounds.character.fourthEdition.jpg");
        
        Unmarshaller um = jc.createUnmarshaller();

        Root r = (Root) um.unmarshal(is);

        log.info("Character: " + r.getCharacter().getName().getContent());
        log.info("Constitution: " + r.getCharacter().getAbilities().getConstitution().getScore().getValue());
        log.info("Base Attack: " + ((Total) r.getCharacter().getAttacks().getBase().getContent().get(2)).getValue());

    }
}
