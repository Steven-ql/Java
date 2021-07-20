
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ddd {
    public static void main(String[] args) {
        // TODO code application logic here
        int inicio=1,
                sumaTotal=0,
                contador=0,
                cont=1;
        
        Scanner teclado = new Scanner(System.in);
        
        do{
            if(inicio % 2>0){
                String imprimir=cont + ". " + sumaTotal + " + ";
                sumaTotal += inicio;
                imprimir += inicio + " = " +sumaTotal;
                System.out.println(imprimir);
                cont++;
                
                if(100 < cont){
                    break;   
            }
        }
        inicio++;
    }while(inicio < 500);
    
    JOptionPane.showMessageDialog(null,"La suma de los primeros 100 numeros impares menores a 500 es: " +sumaTotal);
    }
}
