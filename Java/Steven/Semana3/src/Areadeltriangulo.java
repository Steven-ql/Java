import javax.swing.JOptionPane;
public class Areadeltriangulo{
    public static void main(String[]args){
        double area,base,altura;
        base=Double.parseDouble(JOptionPane.showInputDialog("ingrese la base"));
        altura=Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura"));
        area=(base*altura)/2;
        JOptionPane.showMessageDialog(null,"el area es: "+area);
    }
}
