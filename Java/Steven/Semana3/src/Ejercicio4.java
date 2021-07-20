import javax.swing.JOptionPane;

public class Ejercicio4{
    public static void main(String[]args){
        int Urgencias,Pediatria,Traumatologia;
        double MPresu;
        String n;
      
        MPresu = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el Presupuesto anual"));
        Urgencias = (int)(0.37*MPresu);
        Pediatria = (int)(0.42*MPresu);
        Traumatologia = (int)(0.21*MPresu);
        
        n = "EL presupuesto anual por Area es:";
        n = n + "\n Urgencias: S/."+Urgencias;
        n = n + "\n Pediatria: S/."+Pediatria;
        n = n + "\n Traumatologia: S/."+Traumatologia;
        JOptionPane.showMessageDialog(null,"  "+n);
    }
}