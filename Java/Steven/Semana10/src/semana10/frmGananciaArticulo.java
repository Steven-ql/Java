/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10;

/**
 *
 * @author F4_di
 */
public class frmGananciaArticulo extends javax.swing.JFrame {

    /**
     * Creates new form frmGananciaArticulo
     */
    public frmGananciaArticulo() {
        initComponents();
        setLocationRelativeTo(null);
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
        etiPrecioCompra = new javax.swing.JLabel();
        etiGanancia = new javax.swing.JLabel();
        txtPrecioCompra = new javax.swing.JTextField();
        txtGanancia = new javax.swing.JTextField();
        etiPrecioVenta = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnCalcular1 = new javax.swing.JButton();
        etiImagen2 = new javax.swing.JLabel();
        etiImagen1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Ganancia Articulo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiPrecioCompra.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        etiPrecioCompra.setText("Precio Compra: ");
        etiPrecioCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(etiPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 140, -1));

        etiGanancia.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        etiGanancia.setText("Ganancia 30%: ");
        etiGanancia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(etiGanancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 130, -1));
        jPanel1.add(txtPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 140, -1));

        txtGanancia.setEditable(false);
        jPanel1.add(txtGanancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 140, -1));

        etiPrecioVenta.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        etiPrecioVenta.setText("Precio venta: ");
        jPanel1.add(etiPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 130, -1));

        txtPrecioVenta.setEditable(false);
        jPanel1.add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 140, -1));

        btnLimpiar.setBackground(new java.awt.Color(153, 153, 153));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 120, -1));

        btnCalcular1.setBackground(new java.awt.Color(153, 153, 153));
        btnCalcular1.setText("Calcular");
        btnCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 120, -1));

        etiImagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semana10/ganancia.png"))); // NOI18N
        jPanel1.add(etiImagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, 80));

        etiImagen1.setIcon(new javax.swing.ImageIcon("C:\\Steven\\Semana10\\Imagenes\\calculadora.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(etiImagen1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(etiImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtPrecioCompra.setText("");
        txtGanancia.setText("");
        txtPrecioVenta.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular1ActionPerformed
        // TODO add your handling code here:
        double precioCompra=0;
        double precioVenta=0;
        double ganancia=0;
        precioCompra=Double.parseDouble(txtPrecioCompra.getText());
        ganancia=precioCompra*0.30;precioVenta=precioCompra+ganancia;
        txtGanancia.setText(String.valueOf(ganancia));
        txtPrecioVenta.setText(String.valueOf(precioVenta));
    }//GEN-LAST:event_btnCalcular1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmGananciaArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGananciaArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGananciaArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGananciaArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGananciaArticulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular1;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel etiGanancia;
    private javax.swing.JLabel etiImagen1;
    private javax.swing.JLabel etiImagen2;
    private javax.swing.JLabel etiPrecioCompra;
    private javax.swing.JLabel etiPrecioVenta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtGanancia;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    // End of variables declaration//GEN-END:variables
}
