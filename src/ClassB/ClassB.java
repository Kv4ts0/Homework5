package ClassB;

import java.io.*;


public class ClassB implements InterfaceB{
    @Override
    public void method1(){
        try{
            FileOutputStream fout = new FileOutputStream("F:\\Homework5\\Homework5\\src\\myFiles/data1.txt");
            PrintStream pout = new PrintStream(fout);
            int i;
            for(i = 0; i <= 100 ; i++) {
                pout.print(i + " ");
            }
            pout.close();
            System.out.println("success...");
        } catch(Exception e){
            System.out.println(e);
        }
    }
}

