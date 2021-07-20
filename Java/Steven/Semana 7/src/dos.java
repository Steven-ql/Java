
import javax.swing.JOptionPane;

public class dos {
public static void main(String[ ] args) {
int calif1, calif2, calif3;
double prom;
calif1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1era Calificación"));
calif2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 2da Calificación"));
calif3=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 3era Calificación"));
prom=(calif1 + calif2 + calif3)/3.0;
if(prom>=10.5)
JOptionPane.showMessageDialog(null,"ALUMNO APROBADO");
else
JOptionPane.showMessageDialog(null,"ALUMNO DESAPROBADO");
}
}