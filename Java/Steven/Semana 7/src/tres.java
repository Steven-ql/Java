import javax.swing.JOptionPane;
public class tres {
public static void main(String[]
args) {
int num;
num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero entero"));
if(num==0)
JOptionPane.showMessageDialog(null, "NUMERO NEUTRO");
else
{
if(num>0)
JOptionPane.showMessageDialog(null, "NUMERO POSITIVO");
else
JOptionPane.showMessageDialog(null, "NUMERO NEGATIVO");
}
}
}