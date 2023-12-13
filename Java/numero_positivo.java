import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        int num;
        Scanner lee=new Scanner (System.in);
        System.out.print("ESCRIBA UN NUMERO ");
        num=lee.nextInt();
        if (num>=0)
            System.out.println(num+" ES UN NUMERO POSITIVO");
        else
            System.out.println(num+" ES UN NUMERO NEGATIVO");

    }

}