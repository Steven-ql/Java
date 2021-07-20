import java.util.Scanner;
public class SueldoTrabajador{
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        String nombre;
        double horas,preciohora,salariobruto,impuesto,salarioneto;
        System.out.println("Ingrese el nombre del trabajador: ");
        nombre=leer.next();
        System.out.println("Ingrese horas trabajadas: ");
        horas=leer.nextDouble();
        System.out.println("Ingrese pago por horas: ");
        preciohora=leer.nextDouble();
        salariobruto=horas*preciohora;
        impuesto=0.20*salariobruto;
        salarioneto=salariobruto-impuesto;
        System.out.println("Estimado: "+nombre);
        System.out.println("Su salario bruto es: "+salariobruto);
        System.out.println("Su descuento es: "+impuesto);
        System.out.println("Su salario neto es: "+salarioneto);
        
    }
}
