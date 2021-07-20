public class N7B {
    public static void main(String[] args) {
        int cantidad;
        float precio, subTotal, montolGV, total;
        cantidad=Integer.parseInt("100");
        precio=Float.parseFloat("50");
        final float igv =0.19F;
        subTotal =cantidad * precio; 
        montolGV =subTotal * igv;
        total =subTotal + montolGV;
        System.out.println("Sub-Total:    "+ subTotal);
        System.out.println("lGV      :    "+ montolGV);
        System.out.println("Total    :    "+ total);
    }
}