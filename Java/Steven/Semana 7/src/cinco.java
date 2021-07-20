import javax. swing.JOptionPane;
public class cinco {
    public static void main(String[ ] args) {
        int cantProducto,opcion,cont;
        double precioProducto,compra;
        compra=0;cont=0;
        do
        {
//contador de productos ingresados cont=cont+1;
//Ingreso de cantidad y precio del producto a comprar
            cantProducto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cantidad del Producto " +cont));
            precioProducto=Double.parseDouble(JOptionPane.showInputDialog("Ingrese Precio Producto " + cont));
//Obtencion del subtotal de la compra de uno o mas productos compra=compra + cantProducto *precioProducto;
//Pregunta de si DESEA SEGUIR ingresando al bucle para seguir
//acumulando el subtotal de los productos comprados.
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Desea continuar[Si=1 , No=2]"));
        }while(opcion==1);
        JOptionPane.showMessageDialog(null, "El total a pagar por la compra de " + cont + " productos" +"\nes : " + compra);
    }
}