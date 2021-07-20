
import javax.swing.JOptionPane;
public class siete {
public static void main(String[ ] args) {
    int num, producto, i; String cad="";
    num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
    if(num>0)
    {
        for(i=1;i<=12;i++)
        {
            producto=num*i;
            cad=cad + i + " x " + num + " = " + producto + "\n";
        }
        JOptionPane.showMessageDialog(null, cad);
    }
    else
        JOptionPane.showMessageDialog(null, "Error de ingreso..!! El numero debe ser mayor que cero");
}
}