
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
public class Islas {
    static String URI_BASE = "http://www.paises.com/";
    public static boolean crearModelo(String ruta) {
        Model paisesModel = ModelFactory.createDefaultModel();
        
        Resource model = paisesModel.createResource(URI_BASE + "islas")
            .addProperty(VCARD.LABEL, "Corresponde a paises que son islas.")
            .addProperty(VCARD.GROUP, "Ninguno")             
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
                paisesModel.createResource(URI_BASE + "puertorico")
                    .addProperty(VCARD.Country, "Puerto Rico")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=puerto+rico&bih=568&biw=1366&hl=es&sxsrf=ALeKk020RVYnJi9Me3FW8dCBWkFUFFfXEw:1605024202075&tbm=isch&source=iu&ictx=1&fir=VFhfUUU0YC8vEM%252CB_f2n6AqX9kPmM%252C%252Fm%252F05r7t&vet=1&usg=AI4_-kTITy5XTg9byLaUJ54ww9hOO_XcKg&sa=X&ved=2ahUKEwiXqq6LrfjsAhVHiFkKHaYFAgoQ_B16BAgVEAM#imgrc=VFhfUUU0YC8vEM")
                    .addProperty(VCARD.Other, "3,19 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "islandia")
                    .addProperty(VCARD.Country, "Islandia")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=islandia+bandera&tbm=isch&ved=2ahUKEwjbvp7ysfjsAhWR1lkKHeSSDiIQ2-cCegQIABAA&oq=islandia&gs_lcp=CgNpbWcQARgAMgQIABBDMgUIABCxAzIHCAAQsQMQQzIFCAAQsQMyBAgAEEMyBAgAEEMyAggAMgIIADICCAAyAggAOgQIIxAnOgcIIxDqAhAnUMDpB1ihhAhg-5QIaAFwAHgEgAHJAYgB0RGSAQYwLjE0LjGYAQCgAQGqAQtnd3Mtd2l6LWltZ7ABCsABAQ&sclient=img&ei=076qX5uJIpGt5wLkpbqQAg&bih=568&biw=1366&hl=es#imgrc=SK6wnCQsXyKCPM")
                    .addProperty(VCARD.Other, "364,134 millones")
            )
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
                paisesModel.createResource(URI_BASE + "irlanda")
                    .addProperty(VCARD.Country, "Irlanda")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=irlanda+bandera&bih=568&biw=1366&hl=es&sxsrf=ALeKk00cxSTCA62exfmuhglcOeiGqzCJbw:1605026155456&tbm=isch&source=iu&ictx=1&fir=PszqXWzk-UVAMM%252Cu7LFWlAtLR4C2M%252C%252Fm%252F016q8l&vet=1&usg=AI4_-kTboq1Pul5r4hNIGYjc5UcWICS72w&sa=X&ved=2ahUKEwimoOeutPjsAhVEq1kKHbpcCUsQ_B16BAgOEAM#imgrc=PszqXWzk-UVAMM")
                    .addProperty(VCARD.Other, "4,904 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "filipinas")
                    .addProperty(VCARD.Country, "Filipinas")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=filipinas+bandera&tbm=isch&ved=2ahUKEwiW6pawtPjsAhUEkVkKHdGPC8kQ2-cCegQIABAA&oq=fili+bandera&gs_lcp=CgNpbWcQARgAMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB46AggAOgQIIxAnOgQIABBDOgcIABCxAxBDULqjBljWtAZgxsEGaABwAHgAgAH2AYgB4A2SAQYwLjEwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=bsGqX5b7E4Si5gLRn67IDA&bih=568&biw=1366&hl=es#imgrc=OccRkCmGaahpeM")
                    .addProperty(VCARD.Other, "106,7 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "madagascar")
                    .addProperty(VCARD.Country, "Madagascar")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=madagascar+bandera&bih=568&biw=1366&hl=es&sxsrf=ALeKk02POMhDdxPsTmbMGSVj1Y0eMN8V6A:1605026423154&tbm=isch&source=iu&ictx=1&fir=SoyPwvuG5iXZ7M%252CwVyGvBGDuwzsbM%252C%252Fm%252F02c1t7&vet=1&usg=AI4_-kSwnA_UaqrMIhelePNfcQwu30IduA&sa=X&ved=2ahUKEwjTlLqutfjsAhVwuVkKHeZbDZsQ_B16BAgOEAM#imgrc=SoyPwvuG5iXZ7M")
                    .addProperty(VCARD.Other, "26,26 millones")
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
