package ClassG;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class ClassG implements InterfaceG{
    public void method1() throws FileNotFoundException {


        for (int i = 1; i <= 10000; i++) {
            String file = "F:\\Homework5\\Homework5\\src\\myFiles/" + i + ".txt";
            try {
                PrintStream pout = new PrintStream(file);
                pout.print(i);
                new File(file).createNewFile();
                pout.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
