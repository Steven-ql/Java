import java.util.Scanner;
public class N3{
    public static void main(String[] args) {
        String nombre1;
        String nombre2;
        double edad1;
        double edad2;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el nombre de la primera persona");
        nombre1=teclado.nextLine(); 
        System.out.println("Ingrese la edad de la primera persona");
        edad1=Double.parseDouble(teclado.next());
        if(edad1>0){
        }
        else {
            System.out.println("Ingrese # > de 0");
            System.out.println("Ingrese la edad de la primera persona");
            edad1=Double.parseDouble(teclado.next());
        }
        System.out.println("Ingrese el nombre de la segunda persona");
        nombre2=teclado.next();
        System.out.println("Ingrese la edad de la segunda persona");
        edad2=teclado.nextDouble();
        if(edad1<0){
        }
        else {
            System.out.println("Ingrese # > 0");
            System.out.println("Ingrese la edad de la Segunda persona");
            edad1=Double.parseDouble(teclado.next());
        }
        
        if(edad1<edad2)
        {
            System.out.println("La persona mayor es: "+nombre1);
        }
        else
        {
            System.out.println("La persona mayor es: "+nombre2);
        } 
        
    }
}

        