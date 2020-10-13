package ClassF;
import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class ClassF implements InterfaceF {
    @Override

    public void method1() throws IOException {
        String file = "F:\\Homework5\\Homework5\\src\\myFiles/data2.txt";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: \n");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second number: \n");
        int secondNumber = sc.nextInt();
        Random rand = new Random();
        for (int i = 0; i <= 100; i ++){
            int randnumber = rand.nextInt(secondNumber - firstNumber);
            PrintStream pout = new PrintStream(file);
            pout.println(randnumber);
            pout.close();
        }

        }

    }