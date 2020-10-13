package ClassC;
import java.io.*;
public class ClassC implements InterfaceC {
    @Override
    public void method1() {


        for (int i = 1; i <= 30; i++) {
            String file = "F:\\Homework5\\Homework5\\src\\myFiles1/file" + i + ".txt";
            try{
                PrintStream pout = new PrintStream(file);
                pout.print("Programmer");
                new File(file).createNewFile();
                pout.close();
            }

            catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
