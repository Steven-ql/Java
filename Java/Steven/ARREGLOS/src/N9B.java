public class N9B {
    public static void main(String[] args) {
        int cantidad, resto, c200, c100, c50, c20, c10, m5, m2, m1, copia;
        cantidad=Integer.parseInt("126");
        copia=cantidad;
        c200=cantidad/200;
        cantidad=cantidad%200;
        c100=cantidad/100; 
        cantidad=cantidad%100;
        c50=cantidad/50; 
        cantidad=cantidad%50;
        c20=cantidad/20;
        cantidad=cantidad%20;
        c10=cantidad/10;
        cantidad=cantidad%10;
        m5=cantidad/5;
        cantidad=cantidad%5;
        m2=cantidad/2;
        m1=cantidad%2;
        System.out.println("CANTIDAD INGRESADA " +copia);
        System.out.println("------------------");
        System.out.println("BILLETES DE 200 : " +c200);
        System.out.println("BILLETES DE 100 : " +c100);
        System.out.println("BILLETES DE 50  : " +c50);
        System.out.println("BILLETES DE 20  : " +c20);
        System.out.println("BILLETES DE 10  : " +c10);
        System.out.println("MONEDAS DE 5    : " +m5);
        System.out.println("MONEDAS DE 2    : " +m2);
        System.out.println("MONEDAS DE 1    : " +m1);
    }
}