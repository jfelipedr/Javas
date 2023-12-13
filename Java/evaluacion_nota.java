import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[] args) {
        double nota;
        Scanner lee=new Scanner (System.in);
        System.out.print("ESCRIBA LA NOTA ");
        nota=lee.nextDouble();
        if (nota<3)
            System.out.print("REPROBO ");
        else
            if (nota>=3 && nota<=4.0)
                System.out.print("LA NOTA ES BUENA ");
            else
                System.out.print("LA NOTA ES EXCELENTE ");

    }
}