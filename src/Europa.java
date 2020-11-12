
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
public class Europa {
    static String URI_BASE = "http://www.paises.com/";
    public static boolean crearModelo(String ruta) {
        Model paisesModel = ModelFactory.createDefaultModel();
        
        Resource model = paisesModel.createResource(URI_BASE + "europa")
            .addProperty(VCARD.LABEL, "Corresponde al continente europeo.")
            .addProperty(VCARD.GROUP, "Ninguno")             
            .addProperty(VCARD.N,
                paisesModel.createResource(URI_BASE + "islandia")
                    .addProperty(VCARD.Country, "Islandia")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=islandia+bandera&tbm=isch&ved=2ahUKEwjbvp7ysfjsAhWR1lkKHeSSDiIQ2-cCegQIABAA&oq=islandia&gs_lcp=CgNpbWcQARgAMgQIABBDMgUIABCxAzIHCAAQsQMQQzIFCAAQsQMyBAgAEEMyBAgAEEMyAggAMgIIADICCAAyAggAOgQIIxAnOgcIIxDqAhAnUMDpB1ihhAhg-5QIaAFwAHgEgAHJAYgB0RGSAQYwLjE0LjGYAQCgAQGqAQtnd3Mtd2l6LWltZ7ABCsABAQ&sclient=img&ei=076qX5uJIpGt5wLkpbqQAg&bih=568&biw=1366&hl=es#imgrc=SK6wnCQsXyKCPM")
                    .addProperty(VCARD.Other, "364,134 millones")
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
                paisesModel.createResource(URI_BASE + "españa")
                    .addProperty(VCARD.Country, "España")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=espa%C3%B1a+bandera&bih=625&biw=1366&hl=es&tbm=isch&source=iu&ictx=1&fir=BXMNnq0N31B7sM%252CJ4SPDe_SPJl6wM%252C%252Fm%252F02c2ln&vet=1&usg=AI4_-kR1N1uL14prbI23wj30hQLclVHv8w&sa=X&ved=2ahUKEwjWjPDE5_jsAhVh0FkKHSa_A8kQ_B16BAgVEAM#imgrc=BXMNnq0N31B7sM")
                    .addProperty(VCARD.Other, "46,94 millones")
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
                paisesModel.createResource(URI_BASE + "polonia")
                    .addProperty(VCARD.Country, "Polonia")
                    .addProperty(VCARD.LOGO, "https://www.google.com/search?q=polonia+bandera&bih=625&biw=1366&hl=es&tbm=isch&source=iu&ictx=1&fir=3u7WvxoTpca2hM%252C3hhnmUL-76QV2M%252C%252Fm%252F0155l6&vet=1&usg=AI4_-kQ9rvbL2cHLTA8fWAeDgfE0oU2MYQ&sa=X&ved=2ahUKEwiihYeZ6vjsAhWxtlkKHVngDA8Q_B16BAgVEAM#imgrc=3u7WvxoTpca2hM")
                    .addProperty(VCARD.Other, "37,97 millones")
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
