
package serhumano;

import java.util.Scanner;

public class SerHumano {
    public static void main(String[] args) {
     
        String sexo;
        String nombre;
        int edad;
        String parantesco;
      Scanner teclado=new Scanner(System.in);
      
      System.out.println("Ingrese su Sexo: ");
      sexo=teclado.nextLine();
      System.out.println("Ingrese su Nombre: ");
      nombre=teclado.nextLine();
      System.out.println("Ingrese su Parantesco: ");
      parantesco=teclado.nextLine();
      System.out.println("Ingrese su Edad: ");
      edad=teclado.nextInt();
      
      
    
      System.out.println("Bienvenid@ a este mundo,el sexo "+sexo+" tiene u nuevo integrante");
      System.out.println("Nombre: "+nombre);
      System.out.println("Sexo: "+sexo);
      System.out.println("Edad: "+edad);
      System.out.println("Parantesco: "+parantesco);
      
    }
      
      
      
        
        
        
                
    }
