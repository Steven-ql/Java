public class ventte{

public static void main (String[]args){
int mes=4;
String estacion;

    switch (mes) {
        case 12:
        case 1:
        case 2:
            estacion = "invierno";
            break;
        case 3:
        case 4:
        case 5:
            estacion = "primavera";
            break;
        case 6:
        case 7:
        case 8:
            estacion ="verano";
            break;
        case 9:
        case 10:
        case 11:
            estacion="otoño";
            break;
        default:
            estacion="mes desconocido";
            break;
    }
System.out.println("abril esta en "+ estacion+".");

}
}