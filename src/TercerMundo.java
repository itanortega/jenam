
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
public class TercerMundo {
    static String URI_BASE = "http://www.paises.com/";
    public static boolean crearModelo(String ruta) {
        Model paisesModel = ModelFactory.createDefaultModel();
        
        Resource model = paisesModel.createResource(URI_BASE + "tercermundo")
            .addProperty(VCARD.LABEL, "Corresponde a paises del tercer mundo.")
            .addProperty(VCARD.GROUP, "Ninguno")             
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "guatemala")
                    .addProperty(VCARD.Country, "Guatemala")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=bandera+de+guatemala&hl=es&sxsrf=ALeKk00vRM3OfZlLCy1Lmf_mjd3_XfqXyA:1605021470024&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiRhM_0ovjsAhUxwFkKHYFuB-gQ_AUoAXoECB4QAw&biw=1366&bih=568#imgrc=740uZhuZ3Y8G_M")
                    .addProperty(VCARD.Other, "17,26 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "cuba")
                    .addProperty(VCARD.Country, "Cuba")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=bandera+de+cuba&bih=568&biw=1366&hl=es&sxsrf=ALeKk01Id55OoRwvDg8EFg4TPHuIMN-G5A:1605021880173&tbm=isch&source=iu&ictx=1&fir=CexP7JRERUmWDM%252CihewGxK_8kjb-M%252C%252Fm%252F02b_xq&vet=1&usg=AI4_-kRMi7PqAmws9jfYym9hZcGhxzL2_g&sa=X&ved=2ahUKEwi5wJi4pPjsAhXRs1kKHZM3BLAQ_B16BAgMEAM#imgrc=CexP7JRERUmWDM")
                    .addProperty(VCARD.Other, "11,34 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "bolivia")
                    .addProperty(VCARD.Country, "Bolivia")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=bolivia+bandera&bih=568&biw=1366&hl=es&sxsrf=ALeKk03fGmCZ6XbgaSs0wuKCjuscJv-K5g:1605025282893&tbm=isch&source=iu&ictx=1&fir=OXd5I5uGJO_-PM%252CSZ36GBDpojEAXM%252C%252Fm%252F0263m1&vet=1&usg=AI4_-kQ2ABBIVcU_MWrM0atFZK5uY-usyg&sa=X&ved=2ahUKEwjfgt6OsfjsAhUCjVkKHQ1rCpkQ_B16BAgPEAM#imgrc=OXd5I5uGJO_-PM")
                    .addProperty(VCARD.Other, "11,35 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "camerun")
                    .addProperty(VCARD.Country, "Camerùn")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=camerun+bandera&tbm=isch&ved=2ahUKEwjQh5ea6vjsAhXvvVkKHYICClUQ2-cCegQIABAA&oq=came+bandera&gs_lcp=CgNpbWcQARgAMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB4yCAgAEAcQBRAeMggIABAHEAUQHjIICAAQCBAHEB46AggAOgcIABCxAxBDOgQIABBDUIvUM1j6jTRgnqE0aABwAHgAgAH1AYgBpw2SAQUwLjkuMpgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=3_mqX5CcK-_75gKChaioBQ&bih=625&biw=1366&hl=es#imgrc=pDbPfK3eQF6HyM")
                    .addProperty(VCARD.Other, "25,22 millones")
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
