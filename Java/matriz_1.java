import javax.swing.JOptionPane;
public class Matriz {
    public static void main(String[] args) {
        int A[][]=new int [3][3];
        for(int f=0; f<3; f++)
            for(int c=0; c<3; c++)
                A[f][c]=Integer.parseInt(JOptionPane.showInputDialog("Diguite un número"));
        for(int f=0; f<3; f++){
            for(int c=0; c<3; c++){
                System.out.print(A[f][c]+"\t");
                // "\t" tabula
            }
            System.out.println();
        }
    }
}