import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        double valor,dsto,vdsto,neto;
        Scanner lee=new Scanner (System.in);
        System.out.print("ESCRIBA El VALOR DE COMPRA ");
        valor=lee.nextInt();
        if (valor>=200000 && valor<=400000)
            dsto=0.02;
        else
            if(valor>400000)
                dsto=0.03;
            else
                dsto=0;
        vdsto=valor*dsto;
        neto=valor-vdsto;
        System.out.println("SU COMPRA ES DE: $"+valor);
        System.out.println("SU DESCUENTO ES DE: $"+dsto);
        System.out.println("EL VALOR TOTAL DE SU COMPRA ES DE: $"+neto);
    }
}