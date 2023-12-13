import javax.swing.JOptionPane;
public class Ejercicio2 {
    public static void main(String[] args) {
        int a=4;
        while(a<=12){
            JOptionPane.showMessageDialog(null,+a);
            a+=2;
            // a+=2; es igual a a=a+2;
        }
    }
}