
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
public class AmericaCentro {
    static String URI_BASE = "http://www.paises.com/";
    public static boolean crearModelo(String ruta) {
        Model paisesModel = ModelFactory.createDefaultModel();
        
        Resource model = paisesModel.createResource(URI_BASE + "america-centro")
            .addProperty(VCARD.LABEL, "Corresponde a la parte central del continente americano.")
            .addProperty(VCARD.GROUP, "Centro")             
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "mexico")
                    .addProperty(VCARD.Country, "Mèxico")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=bandera+de+mexico&bih=568&biw=1366&hl=es&sxsrf=ALeKk03S03G0xLJotkM4KucnTRvv-2G4rw:1605020308549&tbm=isch&source=iu&ictx=1&fir=e7F3uzauV1Zs8M%252CQDKYNLjZ4syDEM%252C%252Fm%252F0k0wq&vet=1&usg=AI4_-kSw664Lsw3rMNcY3pbqtsKKSDnESw&sa=X&ved=2ahUKEwjwmeTKnvjsAhXRpFkKHfUHCD0Q_B16BAgKEAM#imgrc=e7F3uzauV1Zs8M")
                    .addProperty(VCARD.Other, "127,09 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "guatemala")
                    .addProperty(VCARD.Country, "Guatemala")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=bandera+de+guatemala&hl=es&sxsrf=ALeKk00vRM3OfZlLCy1Lmf_mjd3_XfqXyA:1605021470024&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiRhM_0ovjsAhUxwFkKHYFuB-gQ_AUoAXoECB4QAw&biw=1366&bih=568#imgrc=740uZhuZ3Y8G_M")
                    .addProperty(VCARD.Other, "17,26 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "jamaica")
                    .addProperty(VCARD.Country, "Jamaica")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=bandera+de+jamaica&sa=X&hl=es&sxsrf=ALeKk012CMwNtT-M_pVVGeAv7B15eQJ5Bw:1605021678979&tbm=isch&source=iu&ictx=1&fir=jrI_6xAyPeSdjM%252CJWvlaewtwZHsvM%252C%252Fm%252F02c14y&vet=1&usg=AI4_-kSfmdUF_uOOLcPVEVJnymU1Jnkwww&ved=2ahUKEwi84KDYo_jsAhUP11kKHYXCB2QQ_B16BAgQEAI&biw=1366&bih=568#imgrc=jrI_6xAyPeSdjM")
                    .addProperty(VCARD.Other, "2,934 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "cuba")
                    .addProperty(VCARD.Country, "Cuba")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=bandera+de+cuba&bih=568&biw=1366&hl=es&sxsrf=ALeKk01Id55OoRwvDg8EFg4TPHuIMN-G5A:1605021880173&tbm=isch&source=iu&ictx=1&fir=CexP7JRERUmWDM%252CihewGxK_8kjb-M%252C%252Fm%252F02b_xq&vet=1&usg=AI4_-kRMi7PqAmws9jfYym9hZcGhxzL2_g&sa=X&ved=2ahUKEwi5wJi4pPjsAhXRs1kKHZM3BLAQ_B16BAgMEAM#imgrc=CexP7JRERUmWDM")
                    .addProperty(VCARD.Other, "11,34 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "republicadominicana")
                    .addProperty(VCARD.Country, "Republica Dominicana")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=republica+dominicana&bih=568&biw=1366&hl=es&sxsrf=ALeKk01K6jH54jlpwcFQmZLz010O-fiffQ:1605023663451&tbm=isch&source=iu&ictx=1&fir=3KzU4Z5tkfwG3M%252CG-7p8bFXa80phM%252C%252Fm%252F027rn&vet=1&usg=AI4_-kTUvwC_ASGaTuUP6Vn6Aeq346Aj0A&sa=X&ved=2ahUKEwi6hMOKq_jsAhVCj1kKHa03CyAQ_B16BAgHEAM#imgrc=3KzU4Z5tkfwG3M")
                    .addProperty(VCARD.Other, "10,63 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "costarica")
                    .addProperty(VCARD.Country, "Costa Rica")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=rep%C3%BAblica+dominicana+poblaci%C3%B3n&bih=568&biw=1366&hl=es&sxsrf=ALeKk01a6p39O7T8axM3EV8aOm52ZhZBgQ:1605023699064&tbm=isch&source=iu&ictx=1&fir=3KzU4Z5tkfwG3M%252CG-7p8bFXa80phM%252C%252Fm%252F027rn&vet=1&usg=AI4_-kQ-uPObap_x00YRgMg14BoudSXYAg&sa=X&ved=2ahUKEwiu88Cbq_jsAhXQ1VkKHXzADEUQ_B16BAgKEAM#imgrc=3KzU4Z5tkfwG3M")
                    .addProperty(VCARD.Other, "4,9 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "puertorico")
                    .addProperty(VCARD.Country, "Puerto Rico")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=puerto+rico&bih=568&biw=1366&hl=es&sxsrf=ALeKk020RVYnJi9Me3FW8dCBWkFUFFfXEw:1605024202075&tbm=isch&source=iu&ictx=1&fir=VFhfUUU0YC8vEM%252CB_f2n6AqX9kPmM%252C%252Fm%252F05r7t&vet=1&usg=AI4_-kTITy5XTg9byLaUJ54ww9hOO_XcKg&sa=X&ved=2ahUKEwiXqq6LrfjsAhVHiFkKHaYFAgoQ_B16BAgVEAM#imgrc=VFhfUUU0YC8vEM")
                    .addProperty(VCARD.Other, "3,19 millones")
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
