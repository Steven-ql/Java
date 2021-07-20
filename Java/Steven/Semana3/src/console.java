import java.util.Scanner;
public class console{
    public static void main (String[]args){
        
       float Hombres,Mujeres,Total;
       int PorH,PorM;
       
       Scanner teclado=new Scanner(System.in);
       System.out.println("Ingrese la cantidad de Hombres: ");
       Hombres=teclado.nextFloat();
       System.out.println("Ingrese la cantidad de Mujeres: ");
       Mujeres=teclado.nextFloat();
       Total = Hombres + Mujeres;
       PorH =(int) ((Hombres*100)/Total);
       PorM =(int) ((Mujeres*100)/Total);
       
       System.out.println("El porcentaje de alumnos es:");
       System.out.println("Hobres:"+PorH);
       System.out.println("Mujeres:"+PorM);
       
    }
}