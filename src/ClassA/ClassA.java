package ClassA;

import java.io.File;
import java.io.FileReader;
import java.io.Writer;
import java.io.FileWriter;
import java.io.IOException;

public class ClassA implements InterfaceA {


    @Override
    public void createFIle() throws IOException {
        File file = new File("F:\\Homework5\\Homework5\\src\\myFiles/data.txt");
        Writer fr = new FileWriter("F:\\Homework5\\Homework5\\src\\myFiles/data.txt");
        fr.write(Integer.toString(90) + " " +  Integer.toString(30) + " " + Integer.toString(-90));
        fr.close();
        FileReader rd = new FileReader("F:\\Homework5\\Homework5\\src\\myFiles/data.txt");
        rd.read();
        rd.close();
        try{
            System.out.println("Successfuly created" + file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

