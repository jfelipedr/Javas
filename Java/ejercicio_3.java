import javax.swing.JOptionPane;
public class Ejercicio3 {
    public static void main(String[] args) {
        int a=20;
        while(a>=15){
            JOptionPane.showMessageDialog(null,+a);
            a-=1;
            // a-=1; es igual a a=a-1;
        }
    }
}