
package viscosimetro;
import javax.swing.JOptionPane;

public class Viscosimetro {

    public static void main(String[] args) {

       //VARIABLES
        
        double Vel_ang= 1;
        double Rad1= 0.12;
        double Rad2= 0.3;
        double Radb= 0.0007;
        double Tens= 1;
        double L= 1;
        double Lb= 0.1;
        double La= 1;
        double h= 1;
        double t= 1;
        double m= 1;
        int op=1;
        
        while (op!=7){
       op = Integer.parseInt(JOptionPane.showInputDialog("\n¿Que Opcion Desea? : "             
                + "\n1. Velocidad Tangencial"
                + "\n2. Espaciamiento entre los cilindros"
                + "\n3. Rapidez de deformacion"
                + "\n4. Torque"
                + "\n5. Esfuerzo de Corte"
                + "\n6. Viscosidad"
                + "\n7. Ver Variables"
                + "\n7.Salir"));  
       
       switch(op){
           
           case (1):{
               
               double Vel_tang= ((h)*(Rad1))/(Radb)*(t);
               JOptionPane.showMessageDialog(null, "La Velocidad Tangencial es:"+Vel_tang);
           
               break;}
            
           case (2):{
               
               double Esp_Cil= (Rad2)-(Rad1);
               JOptionPane.showMessageDialog(null, "El espaciamiento entre los cilindros es:"+Esp_Cil);
          
               break;}
           
           case (3):{
               
               double Rap_Def=((h)*(Rad1))/(Radb*(Rad2-Rad1)*t);
               JOptionPane.showMessageDialog(null, "La Rapidez de deformacion es:"+Rap_Def);
      
               break;}
           
           case (4):{
               
               double Tor= (Tens) * (Radb);
                JOptionPane.showMessageDialog(null, "El Torque es:"+Tor);
               
                break;}
               
           case(5):{
               
               double x= Rad1*Rad1;
               double Ez_Cor= (m*9.8*Radb)/(2*Math.PI*(x)*L);
               JOptionPane.showMessageDialog(null, "El Esfuerzo Cortante es:"+Ez_Cor);
               
          
               break;}
               
           case(6):{
               
               double y=Radb*Radb;
               double x=Rad1*Rad1*Rad1;
               double Visco=((m*9.8*y)*(Rad2-Rad1)*t)/(2*Math.PI*(x)*L*h);
               JOptionPane.showMessageDialog(null, "La Viscosidad de este liquido es:"+Visco);
               
           break;}
           
            default:{
                JOptionPane.showMessageDialog(null,"esta opcion no es valida");
            }
         
        }
        }
    }
}
