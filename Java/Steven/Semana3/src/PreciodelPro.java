import java.util.Scanner;

public class PreciodelPro{
    public static void main(String[]args){
        float precio;
        int cantidad;
        double igv;
        double subtotal;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese la cantdad del productos a comprar");
        precio=teclado.nextFloat();
        System.out.println("Ingrese el precio del producto");
        cantidad=teclado.nextInt();
        subtotal=cantidad*precio;
        igv=subtotal*0.18;
        System.out.println("Subtotal: "+subtotal);
        System.out.println("IGV: "+igv);
        System.out.println("Subtotal: "+subtotal);
        System.out.println("Total a pagar: "+(subtotal+igv));
        
    }
}
