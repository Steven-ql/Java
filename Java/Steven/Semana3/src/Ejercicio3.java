//Importamos la clase JOptionPane ubicada en la biblioteca javax.swing.
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
//Nombre de la clase//
public class Ejercicio3{
    //Especifica el acceso de la palabra clave unica para las todas las intancias,indicando el compilador//
    //JVM,Almacenando caracteres y argumentos que esten presente en la linea de comandos//
    public static void main(String []args){
        //Declara tres Variables de datos entero y decimal//
        float Hombres,Mujeres,Total;
        //Declara dos Variables de datos enteros//
        int PorH,PorM;
        //Declara un caracter n//
        String n;
        //Obtenemos el Cuadro de entrada del JOptionPane usando el metodo showInputDialog.
        Hombres = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de Hombres: "));
        Mujeres = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de Mujeres: "));
        //Suma los datos ingresados en la variable Total//
        Total = Hombres + Mujeres;
        
       DecimalFormat dec = new DecimalFormat("###.##");
       //Declara la variable con resultado entero y opera los datos ingresados x el %(100) / el total //
        PorH =(int) ((Hombres*100)/Total);
        PorM =(int) ((Mujeres*100)/Total);
        
        //El caracter n, muestra el texto entre comillas "" // \n (salto de linea) //
        n = "El porcentaje de Alumnos es:";
        n = n + "\n Hombres: "+PorH;
        n = n + "\n Mujeres: "+PorM;
        //Cuadro de texto del caracter n //
        JOptionPane.showMessageDialog(null,""+n);
    }
    
}
//Ramos Sandoval ,Angello//
//Quiñonez Lindo ,Steven//
//Durand Torres ,Aldair//
//Cordova Vega ,Paul//

