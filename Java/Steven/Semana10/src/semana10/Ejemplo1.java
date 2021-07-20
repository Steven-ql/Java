package semana10;
import javax.swing.JOptionPane;
public class Ejemplo1 {
    
    public static void main(String[] args) {
        int n,i;
        String lista="Lista de nombres de los EStudiantes es:\n";
        
        n =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de estudiantes del curso: "));
        
        String nombres[]=new String [n];
        
        for (i=0; i < nombres.length;i++){
            nombres [i] =JOptionPane.showInputDialog("Ingrese el nombre del estudiante"+(i+1)+": ");
        }
        for (i=0; i < nombres.length;i++){
            lista=lista+ (i+1)+". "+nombres[i]+"\n";       
        }   
        JOptionPane.showMessageDialog(null, lista);        
    }
}
