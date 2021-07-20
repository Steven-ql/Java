import java.util.Scanner;
public class ocho {
    public static void main(String[] args) {
        int edad = 0;
        int cantidadNiños=0;
        int cantidadJovenes=0;
        int cantidadAdultos=0;
        int cantidadviejos=0;
        int año=0 ,añoAc = 2020;
        Scanner teclado=new Scanner(System.in);
        for (int i=1;i<=3;i++){
            System.out.println("Ingrese la edad de la "+i+"° persona");
            edad=teclado.nextInt();
            año=añoAc - edad;
            System.out.println("Año de Nacimiento es: "+año);
        if (edad>=60){
                cantidadviejos=cantidadviejos+1;
            }
            else if(edad>=30){
                cantidadAdultos=cantidadAdultos+1;
            }
            else if(edad>=13){
                cantidadJovenes=cantidadJovenes+1;
            }
            else if(edad>=0){
                cantidadNiños=cantidadNiños+1;
            }
        }
        System.out.println("Cantidad de niños son: "+cantidadNiños);
        System.out.println("Cantidad de jovenes son: "+cantidadJovenes);
        System.out.println("Cantidad de adultos son: "+cantidadAdultos);
        System.out.println("Cantidad de Viejos son: "+cantidadviejos); 
        }
}



        
    




    



