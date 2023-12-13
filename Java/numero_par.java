import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args) {
        int a;
        Scanner lee=new Scanner (System.in);
        System.out.print("ESCRIBA UN NUMERO ");
        a=lee.nextInt();
        if (a%2==0)
            System.out.println(a+" ES UN NUMERO PAR");
        else
            System.out.println(a+" ES UN NUMERO IMPAR");

    }

}