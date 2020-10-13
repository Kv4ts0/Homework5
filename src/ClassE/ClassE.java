package ClassE;
import java.io.*;
public class ClassE implements InterfaceE {
    @Override
    public void method1() throws FileNotFoundException {


        for (int i = 1; i <= 30; i++) {
            String file = "F:\\Homework5\\Homework5\\src\\myFiles2/file" + i + ".txt";
            try {
                    PrintStream pout = new PrintStream(file);
                    pout.print("Programmer" + i);
                    new File(file).createNewFile();
                    pout.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
