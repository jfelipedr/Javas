import javax.swing.JOptionPane;
public class Fechas {
    public static void main(String[] args) {
        int dd,mm,aa;
        int dfeb=28;
        String mes="",errord="",errorm="";
        dd=Integer.parseInt(JOptionPane.showInputDialog("Escriba el dia"));
        mm=Integer.parseInt(JOptionPane.showInputDialog("Escriba el mes"));
        aa=Integer.parseInt(JOptionPane.showInputDialog("Escriba el año"));
        if(aa%4==0 && aa%100!=100)
            dfeb=29;
        if(mm==1 && dd>31)
            errord="ERROR EN EL DIA";
        if(mm==2 && dd>dfeb)
            errord="ERROR EN EL DIA";
        if(mm==3 && dd>31)
            errord="ERROR EN EL DIA";
        if(mm==4 && dd>30)
            errord="ERROR EN EL DIA";
        if(mm==5 && dd>31)
            errord="ERROR EN EL DIA";
        if(mm==6 && dd>30)
            errord="ERROR EN EL DIA";
        if(mm==7 && dd>31)
            errord="ERROR EN EL DIA";
        if(mm==8 && dd>31)
            errord="ERROR EN EL DIA";
        if(mm==9 && dd>30)
            errord="ERROR EN EL DIA";
        if(mm==10 && dd>31)
            errord="ERROR EN EL DIA";
        if(mm==11 && dd>30)
            errord="ERROR EN EL DIA";
        if(mm==12 && dd>31)
            errord="ERROR EN EL DIA";
        switch(mm){
            case 1:
                mes="enero"; break;
            case 2:
                mes="febrero"; break;
            case 3:
                mes="marzo"; break;
            case 4:
                mes="abril"; break;
            case 5:
                mes="mayo"; break;
            case 6:
                mes="junio"; break;
            case 7:
                mes="julio"; break;
            case 8:
                mes="agosto"; break;
            case 9:
                mes="septiembre"; break;
            case 10:
                mes="octubre"; break;
            case 11:
                mes="noviembre"; break;
            case 12:
                mes="diciembre"; break;
            default:
                errorm="ERROR EN EL MES"; break;
        }
        if(errord!="")
            JOptionPane.showMessageDialog(null,errord);
        if(errorm!="")
            JOptionPane.showMessageDialog(null,errorm);
        if(errord=="" && errorm=="")
            JOptionPane.showMessageDialog(null,"Su fecha es: "+dd+" de "+mes+" de "+aa);
    }
}