public class N8A {
    public static void main(String[] args) {
        double radio, area, longitud;
        final double PI=3.1416;
        radio=Double.parseDouble("0");
        area=PI * radio * radio;
        longitud =2 * PI * radio;
        System.out.println("EL AREA DE LA CIRCUNFERENCIA ES:      "+area);
        System.out.println("LA LONGITUD DE LA CIRCUNFERENCIA ES:  "+longitud);
    }
}