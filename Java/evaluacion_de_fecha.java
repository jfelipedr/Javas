import javax.swing.JOptionPane;
public class Fechas {
    public static void main(String[] args) {
        int dd,mm,aa;
        int diasfebrero=28;
        String errordia="",nombremes;
        dd=Integer.parseInt(JOptionPane.showInputDialog("Escriba el dia"));
        mm=Integer.parseInt(JOptionPane.showInputDialog("Escriba el mes"));
        aa=Integer.parseInt(JOptionPane.showInputDialog("Escriba el año"));
        if(aa%4==0 && aa%100!=100)
            diasfebrero=29;
        if(mm==1 && dd>diasfebrero)
            errordia="error dia";
    }
}