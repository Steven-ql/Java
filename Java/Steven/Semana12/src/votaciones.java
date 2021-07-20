
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author F4_di
 */
public class votaciones {
    public static void main (String a[]){
        String candidatos[],sedes[];
        int votos[][],fil,col;
        JTextArea area=new JTextArea(15,30);
        JScrollPane scroll =new JScrollPane(area);
        fil = Integer.parseInt(JOptionPane.showInputDialog
        ("Ingrese el número de sedes:"));
        
        sedes=new String[fil];
        for(int x=0;x < fil; x++){
            sedes[x]=JOptionPane.showInputDialog("Sede No "
                    + ":"+(x+1));
        }
        col=Integer.parseInt(JOptionPane.showInputDialog(
                "Ingrese el número de candidatos:"));
        candidatos= new String[col];
        for(int x=0;x < col; x++){
            candidatos[x]= JOptionPane.showInputDialog("Nombre del "
                    + "Candidato No:"+(x+1));
        }
        votos=new int[fil][col];
        for(int x= 0;x <fil; x++){
            for(int y=0;y< col; y++){
                votos[x][y]= Integer.parseInt(JOptionPane
                        .showInputDialog("Ingreselos votos de la sede"
                        + "" +sedes[x]+ "para el candidato" +candidatos[y]));
            }
        }
        int[] totalVotos = new int[candidatos.length];
        for(int y= 0; y< col; y++){
            for (int x= 0; x< fil; x++){
            totalVotos[y] +=votos[x][y];
            }
        }
        int max=0;
        int pos=0;
        for(int i=0; i <totalVotos.length; i++){
            if(max <totalVotos[1]){
            max=totalVotos[i];
            pos=i;                
            }
            area.append("candidato con mayoria de votos:"+candidatos[pos]+".Total de Votos:"+totalVotos[pos]);
        }
        for(int i= 0;i< fil;i++){
            area.append("\n"+sedes[i]);
            for(int x=0;x<col; x++){
                area.append("\n"+candidatos[x]);
                area.append("\t"+votos[i][x]);
            }
        }
        JOptionPane.showMessageDialog(null, scroll);     
    }
}

