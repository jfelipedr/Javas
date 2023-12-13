import javax.swing.JOptionPane;
public class NewClass1 {
    public static void main(String[] args) {
        int con=1,num;
    while(con<=10){
        num=(int) (Math.random()*30);
        JOptionPane.showMessageDialog(null,num);
        con+=1;
    }
    }
}
*****************************
import javax.swing.JOptionPane;
public class NewClass1 {
    public static void main(String[] args) {
        int con=1,num;
        String sal="";
    while(con<=30){
        num=(int) (Math.random()*76)+5;
        sal=sal+"\n"+num;
        //el "\n" se utiliza para saltar una linea.
        con+=1;
    }
    JOptionPane.showMessageDialog(null,sal);
    }
}
*****************************
import javax.swing.JOptionPane;
public class NewClass1 {
    public static void main(String[] args) {
        int con=1,num;
        String sal="";
    while(con<=30){
        num=(int) (Math.random()*76)+5;
        sal=sal+con+". "+num+"\n";
        con+=1;
    }
    JOptionPane.showMessageDialog(null,sal);
    }
}
*****************************
//juego para adivinar un número
import javax.swing.JOptionPane;
public class Ejercicio1 {
    public static void main(String[] args) {
      int entrada,seguir;
      seguir=1;
      while(seguir==1){
      int aleatorio = (int) (Math.random()*99+10);
      entrada=Integer.parseInt(JOptionPane.showInputDialog("ADIVINE UN NUMERO DE DOS CIFRAS"));
      while(aleatorio!= entrada) {
      if (entrada < aleatorio)
        JOptionPane.showMessageDialog(null,"EL NÚMERO INGRESADO ES MENOR");
      else
        JOptionPane.showMessageDialog(null,"EL NÚMERO INGRESADO ES MAYOR");
      entrada=Integer.parseInt(JOptionPane.showInputDialog("ESCRIBA OTRO NUMERO"));
      }
      JOptionPane.showMessageDialog(null,"USTED ADIVINO EL NUMERO");
      seguir=Integer.parseInt(JOptionPane.showInputDialog("DESEA SEGUIR ? 1=SI 2=NO "));
    }
    }
}