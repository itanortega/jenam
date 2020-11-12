
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
public class PrimerMundo {
    static String URI_BASE = "http://www.paises.com/";
    public static boolean crearModelo(String ruta) {
        Model paisesModel = ModelFactory.createDefaultModel();
        
        Resource model = paisesModel.createResource(URI_BASE + "primermundo")
            .addProperty(VCARD.LABEL, "Corresponde paises de primer mundo.")
            .addProperty(VCARD.GROUP, "Ninguno")             
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "japon")
                    .addProperty(VCARD.Country, "Japon")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=japon+bandera&hl=es&sxsrf=ALeKk02L8KTHpyxbXqKTE6M9DNraMlxVCA:1605025903298&tbm=isch&source=iu&ictx=1&fir=7NEZnjOF5zUg_M%252Cr2aAdHKUbI4wCM%252C_&vet=1&usg=AI4_-kREXUH9_pYxUC6AtY6iKze6NdWqYQ&sa=X&ved=2ahUKEwiT1Mi2s_jsAhXEzlkKHdM2D78Q_h0wAXoECB0QBA&biw=1366&bih=568#imgrc=7NEZnjOF5zUg_M")
                    .addProperty(VCARD.Other, "126,5 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "reinounido")
                    .addProperty(VCARD.Country, "Reino Unido")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=reino+unido+bandera&tbm=isch&ved=2ahUKEwie1ei3s_jsAhWocjABHbWTDH4Q2-cCegQIABAA&oq=reino+bandera&gs_lcp=CgNpbWcQARgBMgIIADIGCAAQBxAeMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB4yBggAEAcQHjoECCMQJzoHCAAQsQMQQzoECAAQQ1C5jgdY8Z4HYJmwB2gAcAB4AIABtgGIAb4LkgEEMC4xMJgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=ccCqX97YN6jlwbkPtaey8Ac&bih=568&biw=1366&hl=es#imgrc=eNS_ImQ1CuCoIM")
                    .addProperty(VCARD.Other, "66,65 millones")
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
                paisesModel.createResource(URI_BASE + "francia")
                    .addProperty(VCARD.Country, "Francia")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=francia+bandera&hl=es&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiA8rn96PjsAhVJj1kKHYl7Bg8Q_AUoAXoECBkQAw&biw=1366&bih=625#imgrc=L3jSqX2sHSScWM")
                    .addProperty(VCARD.Other, "66,99 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "alemania")
                    .addProperty(VCARD.Country, "Alemania")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=aleman+bandera&tbm=isch&ved=2ahUKEwiz9e_-6PjsAhUWuFkKHYHEAg0Q2-cCegQIABAA&oq=ale+bandera&gs_lcp=CgNpbWcQARgCMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB46AggAOgcIABCxAxBDOgQIABBDUMvcAliX8AJgkosDaABwAHgAgAGOAogBpAySAQUwLjkuMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=mviqX7NAlvDmAoGJi2g&bih=625&biw=1366&hl=es#imgrc=VTNo1KlXXSXIlM")
                    .addProperty(VCARD.Other, "83,02 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "sudafrica")
                    .addProperty(VCARD.Country, "Sudàfrica")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=sudafrica+bandera&tbm=isch&ved=2ahUKEwjyheSX9PjsAhVcG1kKHYSXBqYQ2-cCegQIABAA&oq=sud+bandera&gs_lcp=CgNpbWcQARgAMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB46BAgAEEM6AggAOgcIABCxAxBDUM6rBViEuwVg98YFaABwAHgAgAG4AYgBqQuSAQQwLjEwmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=VwSrX7L-Ady25AKEr5qwCg&bih=625&biw=1366&hl=es#imgrc=3Y2eGLhHjNZ2BM")
                    .addProperty(VCARD.Other, "57,78 millones")
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
