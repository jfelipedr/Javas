package javaapplication;
import java.util.Scanner;
public class JavaApplication {
    public static void main(String[] args) {
        int a;
        Scanner lee = new Scanner(System.in);
        System.out.println("Digite un número");
        a = lee.nextInt();
        if (a%4==0 && a%100!=0)
            System.out.println("Bisiesto");
        else
            System.out.println("Normal");
    }
}