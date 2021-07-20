import javax.swing.JOptionPane;

public class promedioPanel{
    public static void main(String[]args){
        int n1,n2;
        double prom;
        n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1er Numero"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 2do Numero"));
        prom=(n1+n2)/2;
        JOptionPane.showMessageDialog(null,"El promedio final es: "+ prom);
        
    }
}