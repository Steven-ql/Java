import javax.swing.JOptionPane;
class Ejercici1{
    public static void main(String[]args){
        String vendedor;
        int Auto;
        Double ventaTotal, salario;
        
            vendedor = JOptionPane.showInputDialog("Ingrese el nombre : ");
            Auto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de automoviles : "));
            ventaTotal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor Total : "));
            salario=1250 + 150*Auto+0.15*ventaTotal;
            JOptionPane.showMessageDialog(null," "+vendedor+ " Su salario es de: "+salario+"");
           
    }
}
