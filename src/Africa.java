
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
public class Africa {
    static String URI_BASE = "http://www.paises.com/";
    public static boolean crearModelo(String ruta) {
        Model paisesModel = ModelFactory.createDefaultModel();
        
        Resource model = paisesModel.createResource(URI_BASE + "africa")
            .addProperty(VCARD.LABEL, "Corresponde al continente africano.")
            .addProperty(VCARD.GROUP, "Ninguno")             
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "madagascar")
                    .addProperty(VCARD.Country, "Madagascar")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=madagascar+bandera&bih=568&biw=1366&hl=es&sxsrf=ALeKk02POMhDdxPsTmbMGSVj1Y0eMN8V6A:1605026423154&tbm=isch&source=iu&ictx=1&fir=SoyPwvuG5iXZ7M%252CwVyGvBGDuwzsbM%252C%252Fm%252F02c1t7&vet=1&usg=AI4_-kSwnA_UaqrMIhelePNfcQwu30IduA&sa=X&ved=2ahUKEwjTlLqutfjsAhVwuVkKHeZbDZsQ_B16BAgOEAM#imgrc=SoyPwvuG5iXZ7M")
                    .addProperty(VCARD.Other, "26,26 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "camerun")
                    .addProperty(VCARD.Country, "Camerùn")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=camerun+bandera&tbm=isch&ved=2ahUKEwjQh5ea6vjsAhXvvVkKHYICClUQ2-cCegQIABAA&oq=came+bandera&gs_lcp=CgNpbWcQARgAMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB4yCAgAEAcQBRAeMggIABAHEAUQHjIICAAQCBAHEB46AggAOgcIABCxAxBDOgQIABBDUIvUM1j6jTRgnqE0aABwAHgAgAH1AYgBpw2SAQUwLjkuMpgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=3_mqX5CcK-_75gKChaioBQ&bih=625&biw=1366&hl=es#imgrc=pDbPfK3eQF6HyM")
                    .addProperty(VCARD.Other, "25,22 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "egipto")
                    .addProperty(VCARD.Country, "Egipto")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=egipto+bandera&hl=es&source=lnms&tbm=isch&sa=X&ved=2ahUKEwi5_7LS7_jsAhXvwVkKHYg7CBsQ_AUoAXoECBwQAw&biw=1366&bih=625#imgrc=HER1n7SjSU-VNM")
                    .addProperty(VCARD.Other, "98,42 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "marruecos")
                    .addProperty(VCARD.Country, "Marruecos")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=marruecos+bandera&tbm=isch&ved=2ahUKEwiazojV7_jsAhWPBVkKHc7LAJUQ2-cCegQIABAA&oq=marruecos+bandera&gs_lcp=CgNpbWcQAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCAA6BggAEAcQHjoHCAAQsQMQQzoECAAQQ1CewQpYidYKYM7bCmgAcAB4AIAB_wGIAekSkgEGMC4xMy4ymAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=mf-qX9qdF4-L5ALOl4OoCQ&bih=625&biw=1366&hl=es#imgrc=7pDHIBAt2FPgzM")
                    .addProperty(VCARD.Other, "36,03 millones")
                )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "nigeria")
                    .addProperty(VCARD.Country, "Nigeria")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=nigeria+bandera&hl=es&tbm=isch&source=iu&ictx=1&fir=SFfK8f-nqCnUKM%252C5TtGka-vy1HGVM%252C_&vet=1&usg=AI4_-kSc43zvlPQKTgCeYL6PsNaIo4fSAg&sa=X&ved=2ahUKEwiFrOf08fjsAhVvplkKHVW_BBwQ_h0wAXoECBQQBA&biw=1366&bih=625#imgrc=SFfK8f-nqCnUKM")
                    .addProperty(VCARD.Other, "195,9 millones")
                )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "congo")
                    .addProperty(VCARD.Country, "Congo")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=congo+bandera&tbm=isch&ved=2ahUKEwj9oYf28fjsAhVGq1kKHXP0B0IQ2-cCegQIABAA&oq=congo+bandera&gs_lcp=CgNpbWcQAzIECAAQQzICCAAyAggAMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB4yBggAEAUQHjIGCAAQBRAeMgYIABAFEB46CAgAEAcQBRAeOgcIABCxAxBDULKlCViOuQlg9r4JaABwAHgAgAG1AYgB7A2SAQQwLjEymAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=9wGrX73KGsbW5gLz6J-QBA&bih=625&biw=1366&hl=es#imgrc=bSiQotbtGUkzLM")
                    .addProperty(VCARD.Other, "5,244 millones")
                )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "argelia")
                    .addProperty(VCARD.Country, "Argelia")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=argelia+bandera&bih=625&biw=1366&hl=es&tbm=isch&source=iu&ictx=1&fir=84tSQAhw9hderM%252CQuD4bpJt8LHZUM%252C_&vet=1&usg=AI4_-kTx_-LtWPwrJdRNIrm1l3HAZVAFtQ&sa=X&ved=2ahUKEwjngreW9PjsAhXvRd8KHUOKD4YQ_h16BAgMEAU#imgrc=84tSQAhw9hderM")
                    .addProperty(VCARD.Other, "42,23 millones")
                )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "sudafrica")
                    .addProperty(VCARD.Country, "Sudàfrica")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=sudafrica+bandera&tbm=isch&ved=2ahUKEwjyheSX9PjsAhVcG1kKHYSXBqYQ2-cCegQIABAA&oq=sud+bandera&gs_lcp=CgNpbWcQARgAMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB46BAgAEEM6AggAOgcIABCxAxBDUM6rBViEuwVg98YFaABwAHgAgAG4AYgBqQuSAQQwLjEwmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=VwSrX7L-Ady25AKEr5qwCg&bih=625&biw=1366&hl=es#imgrc=3Y2eGLhHjNZ2BM")
                    .addProperty(VCARD.Other, "57,78 millones")
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
