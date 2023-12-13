package javaapplication;
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        System.out.println("Digite una fecha");
        String nmes;
        int mes=12;
        switch(mes){
            case 1:
                nmes="enero"; break;
            case 2:
                nmes="febrero"; break;
            case 3:
                nmes="marzo"; break;
            case 4:
                nmes="abril"; break;
            case 5:
                nmes="mayo"; break;
            case 6:
                nmes="junio"; break;
            case 7:
                nmes="julio"; break;
            case 8:
                nmes="agosto"; break;
            case 9:
                nmes="septiembre"; break;
            case 10:
                nmes="octubre"; break;
            case 11:
                nmes="noviembre"; break;
            case 12:
                nmes="diciembre"; break;
            default:
                nmes="Error verifique el mes"; break;
        }

    }
}