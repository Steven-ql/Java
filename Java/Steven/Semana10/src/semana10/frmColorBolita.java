/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author F4_di
 */
public class frmColorBolita extends javax.swing.JFrame {

    /**
     * Creates new form frmColorBolita
     */
    public frmColorBolita() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnProcesar = new javax.swing.JButton();
        txtColor = new javax.swing.JTextField();
        etiGanancia1 = new javax.swing.JLabel();
        etiGanancia = new javax.swing.JLabel();
        txtCompra = new javax.swing.JTextField();
        etiGanancia2 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        etiGanancia3 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Venta de Manzanas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLimpiar.setBackground(new java.awt.Color(153, 153, 153));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 120, -1));

        btnProcesar.setBackground(new java.awt.Color(153, 153, 153));
        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });
        jPanel1.add(btnProcesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 120, -1));
        jPanel1.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 90, -1));

        etiGanancia1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        etiGanancia1.setText("Color de Bolita:");
        etiGanancia1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(etiGanancia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 140, 20));

        etiGanancia.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        etiGanancia.setText("Monto total de Compra:");
        etiGanancia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(etiGanancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 150, 20));
        jPanel1.add(txtCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 90, -1));

        etiGanancia2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        etiGanancia2.setText("Total a Pagar:");
        etiGanancia2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(etiGanancia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 130, 20));

        txtTotal.setEditable(false);
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 110, -1));

        etiGanancia3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        etiGanancia3.setText("Descuento:");
        etiGanancia3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(etiGanancia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 100, 20));

        txtDescuento.setEditable(false);
        jPanel1.add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 90, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Steven\\Semana10\\Imagenes\\blitas de colores.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtColor.setText("");
        txtCompra.setText("");
        txtTotal.setText("");
        txtDescuento.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
       Random rnd=new Random();
       double compra=0,descuento=0,total=0;
       int color=0;
       if(txtCompra.getText().equals(""))
           JOptionPane.showMessageDialog(null,"Digite el monto de compra.");
       else{ compra=Double.parseDouble(txtCompra.getText());color=(int)(rnd.nextDouble()*5.0);
       }switch(color)
       {case 0://el cero será usuado para el color blanco 
               descuento=0;
               txtColor.setText("Blanco");
               break;
       case 1://el uno será usuado para el color verde 
               descuento=compra*0.10;
               txtColor.setText("Verde");
               break;
       case 2://el dos será usuado para el color amarillo
               descuento=compra*0.25;
               txtColor.setText("Amarillo");
           break;
       case 3://el tres será usuado para el color azul 
           descuento=compra*0.50;
           txtColor.setText("Azul");
           break;
       case 4://el cuatro será usuado para el color rojo 
           descuento=compra;
           txtColor.setText("Rojo");
           break;
       }
       total=compra-descuento;
       txtDescuento.setText(String.valueOf(descuento));
       txtTotal.setText(String.valueOf(total)) ;
    }//GEN-LAST:event_btnProcesarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmColorBolita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmColorBolita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmColorBolita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmColorBolita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmColorBolita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JLabel etiGanancia;
    private javax.swing.JLabel etiGanancia1;
    private javax.swing.JLabel etiGanancia2;
    private javax.swing.JLabel etiGanancia3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtCompra;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}