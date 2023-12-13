import javax.swing.JOptionPane;
public class Ejercicio6 {
    public static void main(String[] args) {
        int a,b;
        a=Integer.parseInt(JOptionPane.showInputDialog("Escriba el 1 número "));
        b=Integer.parseInt(JOptionPane.showInputDialog("Escriba el 2 número "));
        while (a>b){
        a=Integer.parseInt(JOptionPane.showInputDialog("Escriba el 1 número "));
        b=Integer.parseInt(JOptionPane.showInputDialog("Escriba el 2 número "));
        }
        while(a<=b){
            JOptionPane.showMessageDialog(null,a);
            a+=2;
        }
    }
}