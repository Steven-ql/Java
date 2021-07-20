package semana10;
import javax.swing.JOptionPane;
public class Ejemplo2 {
     public static void main(String[] args) {
    String productos[] = new String[10], salida;
    int precios [] = new int[10];
    salida="Los singuientes articulos cuestan mas de $3000 \n";
    for (int i=0; i<2; i++){
    productos[i]= JOptionPane.showInputDialog("Ingrese el articulo: "+i);
    precios[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio: "+i));
    }
    for(int j=0; j<2 ; j++){
        if(precios[j]>3000){
            salida+=productos [j]+ ": "+precios[j]+"\n";
        }
    }   
    JOptionPane.showConfirmDialog(null, salida);
}  
}
