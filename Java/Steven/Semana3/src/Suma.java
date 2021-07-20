import javax.swing.JOptionPane;   
class Suma{
    public static void main(String[]args){
        String N1,N2;int n1,n2,suma;
        N1 = JOptionPane.showInputDialog("Ingrese N1 : ");
        N2 = JOptionPane.showInputDialog("Ingrese N2 : ");
        n1 = Integer.parseInt(N1);
        n2 = Integer.parseInt(N2);
        
        suma= n1+n2;
        JOptionPane.showMessageDialog(null,"La suma es: " +suma);
        System.exit(0);
    }
}