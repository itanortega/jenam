
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
public class Asia {
    static String URI_BASE = "http://www.paises.com/";
    public static boolean crearModelo(String ruta) {
        Model paisesModel = ModelFactory.createDefaultModel();
        
        Resource model = paisesModel.createResource(URI_BASE + "asia")
            .addProperty(VCARD.LABEL, "Corresponde al continente asiatico.")
            .addProperty(VCARD.GROUP, "Ninguno")             
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "japon")
                    .addProperty(VCARD.Country, "Japon")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=japon+bandera&hl=es&sxsrf=ALeKk02L8KTHpyxbXqKTE6M9DNraMlxVCA:1605025903298&tbm=isch&source=iu&ictx=1&fir=7NEZnjOF5zUg_M%252Cr2aAdHKUbI4wCM%252C_&vet=1&usg=AI4_-kREXUH9_pYxUC6AtY6iKze6NdWqYQ&sa=X&ved=2ahUKEwiT1Mi2s_jsAhXEzlkKHdM2D78Q_h0wAXoECB0QBA&biw=1366&bih=568#imgrc=7NEZnjOF5zUg_M")
                    .addProperty(VCARD.Other, "126,5 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "filipinas")
                    .addProperty(VCARD.Country, "Filipinas")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=filipinas+bandera&tbm=isch&ved=2ahUKEwiW6pawtPjsAhUEkVkKHdGPC8kQ2-cCegQIABAA&oq=fili+bandera&gs_lcp=CgNpbWcQARgAMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB46AggAOgQIIxAnOgQIABBDOgcIABCxAxBDULqjBljWtAZgxsEGaABwAHgAgAH2AYgB4A2SAQYwLjEwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=bsGqX5b7E4Si5gLRn67IDA&bih=568&biw=1366&hl=es#imgrc=OccRkCmGaahpeM")
                    .addProperty(VCARD.Other, "106,7 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "china")
                    .addProperty(VCARD.Country, "China")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=china+bandera&tbm=isch&ved=2ahUKEwjlg6uwtfjsAhXHM1kKHSukA_0Q2-cCegQIABAA&oq=china+bandera&gs_lcp=CgNpbWcQAzIHCAAQsQMQQzIECAAQQzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAOgYIABAHEB46CAgAEAcQBRAeOggIABAIEAcQHjoECCMQJ1DrwgVY8dYFYPrZBWgAcAB4AIABrQGIAccQkgEEMC4xNZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=e8KqX6XaBcfn5AKryI7oDw&bih=568&biw=1366&hl=es#imgrc=S5dG9iCck-2_EM")
                    .addProperty(VCARD.Other, "1,393 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "rusia")
                    .addProperty(VCARD.Country, "Rusia")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=rusia+bandera&bih=568&biw=1366&hl=es&sxsrf=ALeKk02wT3tQQnI_jZJqE5yRJI2VhXeFdQ:1605026617389&tbm=isch&source=iu&ictx=1&fir=xkULyaLyIqVM2M%252CKEfNUlKH2YNvEM%252C%252Fm%252F01w499&vet=1&usg=AI4_-kQ9xjV61PVxZRFh4ZMqaBo-vO0v2A&sa=X&ved=2ahUKEwjClomLtvjsAhUx01kKHXI9BnEQ_B16BAgWEAM#imgrc=xkULyaLyIqVM2M")
                    .addProperty(VCARD.Other, "144,5 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "turquia")
                    .addProperty(VCARD.Country, "Turquìa")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=turquia+bandera&tbm=isch&ved=2ahUKEwiCrKCMtvjsAhWRkVkKHSnMA8kQ2-cCegQIABAA&oq=tur&gs_lcp=CgNpbWcQARgAMgcIABCxAxBDMgcIABCxAxBDMgQIABBDMgQIABBDMgcIABCxAxBDMgQIABBDMgcIABCxAxBDMgQIABBDMgQIABBDMgoIABCxAxCDARBDOgQIIxAnOgIIADoFCAAQsQM6BwgjEOoCECc6CAgAELEDEIMBUMvlBFjWhwVg-pQFaAJwAHgAgAGtAYgBtxGSAQQwLjE2mAEAoAEBqgELZ3dzLXdpei1pbWewAQrAAQE&sclient=img&ei=O8OqX8KiNJGj5gKpmI_IDA&bih=568&biw=1366&hl=es#imgrc=qJworiLSVIj3aM")
                    .addProperty(VCARD.Other, "82 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "eau")
                    .addProperty(VCARD.Country, "EAU")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=EAU+bandera&tbm=isch&ved=2ahUKEwjx7ZbJt_jsAhUSJFkKHT-9DqgQ2-cCegQIABAA&oq=EAU+bandera&gs_lcp=CgNpbWcQAzICCAAyBggAEAgQHjIGCAAQCBAeOgQIABBDOgYIABAHEB46BAgjECc6BwgAELEDEEM6CAgAEAcQBRAeOggIABAIEAcQHlDczRFY89wRYPbqEWgAcAB4AIABqQGIAfsHkgEDMC43mAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=yMSqX_HpA5LI5AK_-rrACg&bih=568&biw=1366&hl=es#imgrc=--JtcbgYhV6q1M")
                    .addProperty(VCARD.Other, "9,631 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "india")
                    .addProperty(VCARD.Country, "India")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=india+bandera&source=lnms&tbm=isch&sa=X&ved=2ahUKEwj8ivbI5vjsAhXErFkKHYyvA6MQ_AUoAXoECB0QAw&biw=1366&bih=625#imgrc=dYOLRQe6bQWVeM")
                    .addProperty(VCARD.Other, "1,353 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "iran")
                    .addProperty(VCARD.Country, "Iràn")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=iran+bandera&bih=625&biw=1366&hl=es&tbm=isch&source=iu&ictx=1&fir=iliPUQPPqwaswM%252CxQIk0GMaSf3KNM%252C%252Fm%252F0259v5&vet=1&usg=AI4_-kSs087knxCpScfwixHk54qRGKDI-w&sa=X&ved=2ahUKEwidm4uS9fjsAhVJheAKHVxUDN0Q_B16BAgQEAM#imgrc=iliPUQPPqwaswM")
                    .addProperty(VCARD.Other, "81,08 millones")
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
