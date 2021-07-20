public class N7A {
    public static void main(String[] args) {
        int cantidad;
        float precio, subTotal, montolGV, total;
        cantidad=Integer.parseInt("0");
        precio=Float.parseFloat("1");
        final float igv=0.19F; 
        subTotal =cantidad * precio;
        montolGV =subTotal * igv;
        total =subTotal + montolGV;
        System.out.println("Sub-Total:    "+ subTotal);
        System.out.println("lGV      :    "+ montolGV);
        System.out.println("Total    :    "+ total);
    }
}