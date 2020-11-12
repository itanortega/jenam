
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.vocabulary.VCARD;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author io
 */
public class AmericaNorte {
    static String URI_BASE = "http://www.paises.com/";
    public static boolean crearModelo(String ruta) {
        Model paisesModel = ModelFactory.createDefaultModel();
        
        Resource model = paisesModel.createResource(URI_BASE + "america-norte")
            .addProperty(VCARD.LABEL, "Corresponde a la parte norte del continente americano.")
            .addProperty(VCARD.GROUP, "Norte")             
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "canada")
                    .addProperty(VCARD.Country, "Canadà")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=bandera+de+canada&sxsrf=ALeKk015wra0JwI4RBRoQqR90xv2f4F64Q:1605019997753&tbm=isch&source=iu&ictx=1&fir=8BbVkRiS5q_auM%252C_m8JLZkFhwroTM%252C%252Fm%252F0p0sz&vet=1&usg=AI4_-kRIcHI_tNIxzmq-2u8v0CHYSZPflw&sa=X&ved=2ahUKEwjv28q2nfjsAhUivlkKHU93BhUQ_B16BAgcEAI&biw=1366&bih=568#imgrc=gp8w63tAaRihLM")
                    .addProperty(VCARD.Other, "37,74 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "mexico")
                    .addProperty(VCARD.Country, "Mèxico")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=bandera+de+mexico&bih=568&biw=1366&hl=es&sxsrf=ALeKk03S03G0xLJotkM4KucnTRvv-2G4rw:1605020308549&tbm=isch&source=iu&ictx=1&fir=e7F3uzauV1Zs8M%252CQDKYNLjZ4syDEM%252C%252Fm%252F0k0wq&vet=1&usg=AI4_-kSw664Lsw3rMNcY3pbqtsKKSDnESw&sa=X&ved=2ahUKEwjwmeTKnvjsAhXRpFkKHfUHCD0Q_B16BAgKEAM#imgrc=e7F3uzauV1Zs8M")
                    .addProperty(VCARD.Other, "127,09 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "estadosunidos")
                    .addProperty(VCARD.Country, "Estados Unidos")
                    .addProperty(VCARD.LOGO, "https://es.wikipedia.org/wiki/Bandera_de_los_Estados_Unidos#/media/Archivo:Flag_of_the_United_States.svg")
                    .addProperty(VCARD.Other, "328,2 millones")
            );

        
        try {
            FileOutputStream fos = new FileOutputStream(ruta);
            paisesModel.write(fos);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
