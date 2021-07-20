import javax.swing.*;
public class Ejemplo2 {
static String salida="";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m, n;
        int a[][];
        int b[][];
        int c[][];
        
        m=Integer.parseInt(JOptionPane.showInputDialog("Número de filas de las matrices:"));
        n=Integer.parseInt(JOptionPane.showInputDialog("Número de Columnas delas matrices:"));
        
        a=new int[m][n];
        b=new int[m][n];
        c=new int[m][n];
        
        leerMatriz(a, "Matriz A");
        leerMatriz(b, "Matriz B");
        
        calcularSuma(a,b,c);
        
        generarSalida(a, "Matriz A");
        generarSalida(b, "Matriz B");
        generarSalida(c, "Matriz A+B");
        
        JTextArea areaSalida = new JTextArea();
        areaSalida.setText(salida);
        JOptionPane.showMessageDialog(null,areaSalida,"Suma de Matrices",JOptionPane.INFORMATION_MESSAGE);
    }
    
    static void leerMatriz(int matriz[][],String s){
        for(int m=0;m<matriz.length; m++){
            for(int n=0; n<matriz[m].length; n++){
                matriz[m][n]=Integer.parseInt(JOptionPane.showInputDialog(
                        s + ": Valor posicion["+
                        m + "]["+ n +"]:"));
            }
        }
    }
    static void calcularSuma(int a[][],int b[][],int c[][]){
        for(int m=0;m<c.length; m++){
            for(int n=0;n<c[m].length;n++){
                c[m][n]= a[m][n] +b[m][n];
            }
        }
    }
    static void generarSalida(int a[][],String titulo){
        salida += titulo+":\n";
        for(int m=0;m <a.length;m++){
        for(int n=0;n<a[m].length; n++){
            salida +=a[m][n] + "\t";
        }
        salida +="\n";
        }
        salida +="\n";
    }    
    }

