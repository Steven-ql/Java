import javax.swing.JOptionPane;
public class Ejercicio2{
    public static void main(String[]args){
        int $200,$100,$50,$20,$10,$5,$2,$1;
        int cantidad;
         cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto: "));
         $200 = cantidad/200;
         $100 = (cantidad - 200*$200)/100;
         $50 = (cantidad - 200*$200-100*$100)/50;
         $20 = (cantidad - 200*$200 - 100*$100 - 50*$50)/20;
         $10 = (cantidad - 200*$200 - 100*$100 - 50*$50 - 20*$20)/10;
         $5 = (cantidad - 200*$200 - 100*$100 - 50*$50 - 20*$20 - 10*$10)/5;
         $2 = (cantidad - 200*$200 - 100*$100 - 50*$50 - 20*$20 - 10*$10 - 5*$5)/2;
         $1 = (cantidad - 200*$200 - 100*$100 - 50*$50 - 20*$20 - 10*$10 - 5*$5 - 2*$2);
         
         JOptionPane.showMessageDialog(null,"Es necesario pagar con: "+cantidad);
         JOptionPane.showMessageDialog(null,"Billetes de 200: "+$200);
         JOptionPane.showMessageDialog(null,"Billetes de 100: "+$100);
         JOptionPane.showMessageDialog(null,"Billetes de 50: "+$50);
         JOptionPane.showMessageDialog(null,"Billetes de 20: "+$20);
         JOptionPane.showMessageDialog(null,"Billetes de 10: "+$10);
         JOptionPane.showMessageDialog(null,"Billetes de 5: "+$5);
         JOptionPane.showMessageDialog(null,"Billetes de 2: "+$2);
         JOptionPane.showMessageDialog(null,"Billetes de 1: "+$1);
        
    }
}