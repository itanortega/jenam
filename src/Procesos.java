
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.util.FileManager;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author io
 */
public class Procesos {
    public static boolean Unir(String inputFileName1, String inputFileName2, String ruta) {        
        Model model1 = ModelFactory.createDefaultModel();
        InputStream is1 = FileManager.get().open(inputFileName1);
        if (is1 == null) {
            throw new IllegalArgumentException("File " + inputFileName1 + " not exists");
        }

        Model model2 = ModelFactory.createDefaultModel();
        InputStream is2 = FileManager.get().open(inputFileName2);
        if (is2 == null) {
            throw new IllegalArgumentException("File " + inputFileName2 + " not exists");
        }

        model1.read(is1, "");
        model2.read(is2, "");

        Model model = model1.union(model2);

        try {
            FileOutputStream fos = new FileOutputStream(ruta);
            model.write(fos);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
    
    public static boolean Unir3(String inputFileName1, String inputFileName2, String inputFileName3, String ruta) {        
        Model model1 = ModelFactory.createDefaultModel();
        InputStream is1 = FileManager.get().open(inputFileName1);
        if (is1 == null) {
            throw new IllegalArgumentException("File " + inputFileName1 + " not exists");
        }

        Model model2 = ModelFactory.createDefaultModel();
        InputStream is2 = FileManager.get().open(inputFileName2);
        if (is2 == null) {
            throw new IllegalArgumentException("File " + inputFileName2 + " not exists");
        }
        
        Model model3 = ModelFactory.createDefaultModel();
        InputStream is3 = FileManager.get().open(inputFileName3);
        if (is3 == null) {
            throw new IllegalArgumentException("File " + inputFileName3 + " not exists");
        }

        model1.read(is1, "");
        model2.read(is2, "");
        model3.read(is3, "");

        Model model1y2 = model1.union(model2);
        Model model = model1y2.union(model3);

        try {
            FileOutputStream fos = new FileOutputStream(ruta);
            model.write(fos);
            return true;
        } catch (IOException e) {
            System.out.println(e);
            return false;
        }
    }
    
    public static boolean Unir7(String inputFileName1, String inputFileName2, String inputFileName3, String inputFileName4, String inputFileName5, String inputFileName6, String inputFileName7, String ruta) {        
        Model model1 = ModelFactory.createDefaultModel();
        InputStream is1 = FileManager.get().open(inputFileName1);
        if (is1 == null) {
            throw new IllegalArgumentException("File " + inputFileName1 + " not exists");
        }

        Model model2 = ModelFactory.createDefaultModel();
        InputStream is2 = FileManager.get().open(inputFileName2);
        if (is2 == null) {
            throw new IllegalArgumentException("File " + inputFileName2 + " not exists");
        }
        
        Model model3 = ModelFactory.createDefaultModel();
        InputStream is3 = FileManager.get().open(inputFileName3);
        if (is3 == null) {
            throw new IllegalArgumentException("File " + inputFileName3 + " not exists");
        }
        
        Model model4 = ModelFactory.createDefaultModel();
        InputStream is4 = FileManager.get().open(inputFileName4);
        if (is4 == null) {
            throw new IllegalArgumentException("File " + inputFileName4 + " not exists");
        }
        
        Model model5 = ModelFactory.createDefaultModel();
        InputStream is5 = FileManager.get().open(inputFileName5);
        if (is5 == null) {
            throw new IllegalArgumentException("File " + inputFileName5 + " not exists");
        }
        
        Model model6 = ModelFactory.createDefaultModel();
        InputStream is6 = FileManager.get().open(inputFileName6);
        if (is6 == null) {
            throw new IllegalArgumentException("File " + inputFileName6 + " not exists");
        }
        
        Model model7 = ModelFactory.createDefaultModel();
        InputStream is7 = FileManager.get().open(inputFileName7);
        if (is7 == null) {
            throw new IllegalArgumentException("File " + inputFileName7 + " not exists");
        }

        model1.read(is1, "");
        model2.read(is2, "");
        model3.read(is3, "");
        model4.read(is4, "");
        model5.read(is5, "");
        model6.read(is6, "");
        model7.read(is7, "");

        Model model1y2 = model1.union(model2);
        Model model1y2y3 = model1y2.union(model3);
        Model model1y2y3y4 = model1y2y3.union(model4);
        Model model1y2y3y4y5 = model1y2y3y4.union(model5);
        Model model1y2y3y4y5y6 = model1y2y3y4y5.union(model6);
        Model model = model1y2y3y4y5y6.union(model7);

        try {
            FileOutputStream fos = new FileOutputStream(ruta);
            model.write(fos);
            return true;
        } catch (IOException e) {
            System.out.println(e);
            return false;
        }
    }

    public static boolean Intersecar(String inputFileName1, String inputFileName2, String ruta) {        
        Model model1 = ModelFactory.createDefaultModel();
        InputStream is1 = FileManager.get().open(inputFileName1);
        if (is1 == null) {
            throw new IllegalArgumentException("File " + inputFileName1 + " not exists");
        }

        Model model2 = ModelFactory.createDefaultModel();
        InputStream is2 = FileManager.get().open(inputFileName2);
        if (is2 == null) {
            throw new IllegalArgumentException("File " + inputFileName2 + " not exists");
        }

        model1.read(is1, "");
        model2.read(is2, "");

        Model model = model1.intersection(model2);

        try {
            FileOutputStream fos = new FileOutputStream(ruta);
            model.write(fos);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
