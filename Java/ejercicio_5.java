import javax.swing.JOptionPane;
public class Ejercicio5 {
    public static void main(String[] args) {
        int a;
        a=Integer.parseInt(JOptionPane.showInputDialog("Escriba un número menor a 20 "));
        while(a>=20){
        a=Integer.parseInt(JOptionPane.showInputDialog("Escriba un número menor a 20 "));
        }
        while(a>=1){
            JOptionPane.showMessageDialog(null,a);
           a=a-3;
        }
    }
}