
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
public class AmericaSur {
    static String URI_BASE = "http://www.paises.com/";
    public static boolean crearModelo(String ruta) {
        Model paisesModel = ModelFactory.createDefaultModel();
        
        Resource model = paisesModel.createResource(URI_BASE + "america-sur")
            .addProperty(VCARD.LABEL, "Corresponde a la parte sur del continente americano.")
            .addProperty(VCARD.GROUP, "Sur")             
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "colombia")
                    .addProperty(VCARD.Country, "Colombia")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=colombia&bih=568&biw=1366&hl=es&sxsrf=ALeKk00sBi95bDl88Fo2C1bY8z3ShGIC0g:1605024365015&tbm=isch&source=iu&ictx=1&fir=Gt-ELPfrPINUmM%252CZMTbs0DX8GsOyM%252C%252Fm%252F01ls2&vet=1&usg=AI4_-kQTL48JcIz3TliOmdIIu8NrJjOF4g&sa=X&ved=2ahUKEwjNpIfZrfjsAhWRm1kKHecxAWQQ_B16BAgIEAM#imgrc=Gt-ELPfrPINUmM")
                    .addProperty(VCARD.Other, "49,65 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "peru")
                    .addProperty(VCARD.Country, "Perù")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=peru+bandera&hl=es&sxsrf=ALeKk01oE0J9fseFymkGhwI6N7HBnbyObg:1605024573264&tbm=isch&source=iu&ictx=1&fir=nbazDwjwRXNiOM%252CtQilKtBxHrLf4M%252C_&vet=1&usg=AI4_-kQJDbm8_dD3eU42t5Csl40XM2LPtg&sa=X&ved=2ahUKEwi11a28rvjsAhUxwFkKHYFuB-gQ_h0wAXoECB4QBA&biw=1366&bih=568#imgrc=nbazDwjwRXNiOM")
                    .addProperty(VCARD.Other, "31,99 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "argentina")
                    .addProperty(VCARD.Country, "Argentina")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=argentina+bandera&tbm=isch&ved=2ahUKEwjL28S-rvjsAhUI3VkKHXNaBQAQ2-cCegQIABAA&oq=argentina+bandera&gs_lcp=CgNpbWcQAzIFCAAQsQMyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCAA6BggAEAcQHjoECCMQJzoHCAAQsQMQQzoECAAQQ1CX_wVY2pEGYOeYBmgAcAB4AIABpAGIAa4OkgEEMC4xM5gBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=QbuqX4u3Moi65wLztBU&bih=568&biw=1366&hl=es#imgrc=Xddmq0s9PShMaM")
                    .addProperty(VCARD.Other, "44,49 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "brasil")
                    .addProperty(VCARD.Country, "Brasil")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=brasil+bandera&tbm=isch&ved=2ahUKEwjH9rDur_jsAhVGnFkKHRnoDHQQ2-cCegQIABAA&oq=brasil+&gs_lcp=CgNpbWcQARgBMgQIIxAnMgUIABCxAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAOgQIABBDOgYIABAFEB46BggAEAgQHjoECAAQGFD6I1juL2CnRGgAcAB4AIAB9gGIAccKkgEFMC44LjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=sryqX8fVJMa45gKZ0LOgBw&bih=568&biw=1366&hl=es#imgrc=jKcelTijzCtnuM")
                    .addProperty(VCARD.Other, "209,5 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "chile")
                    .addProperty(VCARD.Country, "Chile")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=chile+bandera&tbm=isch&ved=2ahUKEwiRppnzr_jsAhXVcTABHaIZDxcQ2-cCegQIABAA&oq=chile+bandera&gs_lcp=CgNpbWcQAzIHCAAQsQMQQzIECAAQQzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAOgYIABAHEB46BAgjECdQxI0DWJyiA2C-pgNoAHAAeACAAb4CiAGDDpIBCDAuMTAuMC4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=vLyqX5HYKtXjwbkPorO8uAE&bih=568&biw=1366&hl=es#imgrc=tbgB7Z_LlfO_bM")
                    .addProperty(VCARD.Other, "18,73 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "bolivia")
                    .addProperty(VCARD.Country, "Bolivia")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=bolivia+bandera&bih=568&biw=1366&hl=es&sxsrf=ALeKk03fGmCZ6XbgaSs0wuKCjuscJv-K5g:1605025282893&tbm=isch&source=iu&ictx=1&fir=OXd5I5uGJO_-PM%252CSZ36GBDpojEAXM%252C%252Fm%252F0263m1&vet=1&usg=AI4_-kQ2ABBIVcU_MWrM0atFZK5uY-usyg&sa=X&ved=2ahUKEwjfgt6OsfjsAhUCjVkKHQ1rCpkQ_B16BAgPEAM#imgrc=OXd5I5uGJO_-PM")
                    .addProperty(VCARD.Other, "11,35 millones")
            )
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "uruguay")
                    .addProperty(VCARD.Country, "Uruguay")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=uruguay+bandera&hl=es&sxsrf=ALeKk012D2V2Egl6rYInGEyp6EsKOsQ25w:1605025489330&tbm=isch&source=iu&ictx=1&fir=uIRzPMOHPLQ1iM%252CUC6wF4B9AUhgDM%252C_&vet=1&usg=AI4_-kRkat9b6b0Zgki_JDDJwskYYjdDQg&sa=X&ved=2ahUKEwiA_pXxsfjsAhVuuVkKHbvbDjIQ_h0wAXoECB4QBA&biw=1366&bih=568#imgrc=h2opCid4r_Un7M")
                    .addProperty(VCARD.Other, "3,44 millones")
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
