import javax.swing.JOptionPane;
public class seis {
public static void main(String[ ] args) {
int num, producto, i=1; String cad="";
num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
if(num>0)
{
while(i<=12)
{
producto=num*i;
cad=cad + i + " x " + num + " = " + producto + "\n";
i=i+1;
}
JOptionPane.showMessageDialog(null, cad);
}
else
JOptionPane.showMessageDialog(null, "Error de ingreso..!! El numero debe ser mayor que cero");
}
}