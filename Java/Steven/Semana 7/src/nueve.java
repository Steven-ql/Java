import java.util.Scanner;
public class nueve {
    public static void main(String[] args) {
        double venta=0;
        double total=0;
        double cantidad;
        double precio;
        Scanner teclado=new Scanner(System.in);
        for (int i=1;i<=5;i++){
            System.out.println("Ingrese la cantidad de producto");
            cantidad=teclado.nextDouble();
            System.out.println("Ingrese el precio producto");
            precio=teclado.nextDouble();
            venta=cantidad*precio;
            if (cantidad>10)
            {
                total=total+((venta-(venta*0.15)));
            }
            else{
                total=total+venta;
            }
        }
        System.out.println("Ingrese totales: "+ total );
    }
}