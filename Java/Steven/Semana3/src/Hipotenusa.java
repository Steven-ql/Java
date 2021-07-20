import java.util.Scanner;
public class Hipotenusa{
public static void main(String[]args){
double ladoA;
double ladoB;
Scanner teclado=new Scanner(System.in);
System.out.println("Ingrese el primer lado del triangulo en cm");
ladoA=teclado.nextDouble();
System.out.println("Ingrese el segundo lado del triangulo en cm");
ladoB=teclado.nextDouble();
System.out.println("La Hipotenusa del triangulo es: "+Math.sqrt((ladoA*ladoA)+(ladoB*ladoB)));
}
}