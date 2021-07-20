/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10;

import javax.swing.JOptionPane;

/**
 *
 * @author F4_di
 */
public class frmLeerDosNumeros extends javax.swing.JFrame {

    /**
     * Creates new form frmLeerDosNumeros
     */
    public frmLeerDosNumeros() {
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
        txtOperacion = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnProcesar = new javax.swing.JButton();
        etiImagen2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Comparar dos Números", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiPrecioCompra.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        etiPrecioCompra.setText("Operacion: ");
        etiPrecioCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(etiPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 140, -1));

        etiGanancia.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        etiGanancia.setText("Resultado: ");
        etiGanancia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(etiGanancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 130, -1));

        txtOperacion.setEditable(false);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 140, -1));

        txtResultado.setEditable(false);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 140, -1));

        btnLimpiar.setBackground(new java.awt.Color(153, 153, 153));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 120, -1));

        btnProcesar.setBackground(new java.awt.Color(153, 153, 153));
        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });
        jPanel1.add(btnProcesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 120, -1));

        etiImagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semana10/dosnumeros.png"))); // NOI18N
        jPanel1.add(etiImagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, 80));

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
        txtResultado.setText("");
        txtOperacion.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        // TODO add your handling code here:
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero:"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero:"));
        int resultado;
        
        if(num1==num2){
            resultado = num1*num2;
        txtOperacion.setText("Multiplicacion");
    }
    else if(num1>num2)
    {
            resultado = num1-num2;
        txtOperacion.setText("Resta");
    }
    else{
            resultado = num1+num2;
        txtOperacion.setText("Suma");
    }
        txtResultado.setText(String.valueOf(resultado));
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
            java.util.logging.Logger.getLogger(frmLeerDosNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLeerDosNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLeerDosNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLeerDosNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLeerDosNumeros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JLabel etiGanancia;
    private javax.swing.JLabel etiImagen2;
    private javax.swing.JLabel etiPrecioCompra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtOperacion;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}