/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package examen;
import java.util.*;

/**
 *
 * @author F4_di
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base,expo;
        Scanner teclado=new Scanner(System.in);
            System.out.println("Tabla de potencia");
            System.out.println("Ingrese la base:");
            base=teclado.nextInt();
            System.out.println("Ingrese el exponente:");
            expo=teclado.nextInt();
            
            for(base=1;base<=20;base++)
            {
                int resultado=(int) Math.pow(base,expo);
                System.out.println("El resultado es: "+resultado);
                
            }
    }
    
}
