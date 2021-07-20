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
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form ejemploJFram
     */
    public Menu() {
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
        btnBolitas = new javax.swing.JButton();
        btnInteresGanado = new javax.swing.JButton();
        btnCalcularSalario = new javax.swing.JButton();
        btnPresupuestoHospital = new javax.swing.JButton();
        btnGananciaArticulo = new javax.swing.JButton();
        btnInversionDinero = new javax.swing.JButton();
        btnLeer = new javax.swing.JButton();
        btnJubilacion = new javax.swing.JButton();
        btnLlantera = new javax.swing.JButton();
        btnManzanas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Menú de Opciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBolitas.setBackground(new java.awt.Color(153, 153, 153));
        btnBolitas.setText("Color Bolita");
        btnBolitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBolitasActionPerformed(evt);
            }
        });
        jPanel1.add(btnBolitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 180, -1));

        btnInteresGanado.setBackground(new java.awt.Color(153, 153, 153));
        btnInteresGanado.setText("Calcular interés ganado");
        btnInteresGanado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInteresGanadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnInteresGanado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 180, -1));

        btnCalcularSalario.setBackground(new java.awt.Color(153, 153, 153));
        btnCalcularSalario.setText("Calcular Salario Total");
        btnCalcularSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularSalarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcularSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 180, -1));

        btnPresupuestoHospital.setBackground(new java.awt.Color(153, 153, 153));
        btnPresupuestoHospital.setText("Presupuesto Hospital");
        btnPresupuestoHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPresupuestoHospitalActionPerformed(evt);
            }
        });
        jPanel1.add(btnPresupuestoHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 180, -1));

        btnGananciaArticulo.setBackground(new java.awt.Color(153, 153, 153));
        btnGananciaArticulo.setText("Ganancia Articulo");
        btnGananciaArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGananciaArticuloActionPerformed(evt);
            }
        });
        jPanel1.add(btnGananciaArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 180, -1));

        btnInversionDinero.setBackground(new java.awt.Color(153, 153, 153));
        btnInversionDinero.setText("Inversión de Diseño");
        btnInversionDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInversionDineroActionPerformed(evt);
            }
        });
        jPanel1.add(btnInversionDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 180, -1));

        btnLeer.setBackground(new java.awt.Color(153, 153, 153));
        btnLeer.setText("Leer dos números");
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });
        jPanel1.add(btnLeer, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 180, -1));

        btnJubilacion.setBackground(new java.awt.Color(153, 153, 153));
        btnJubilacion.setText("Tipo de Jubilacion");
        btnJubilacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJubilacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnJubilacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 180, -1));

        btnLlantera.setBackground(new java.awt.Color(153, 153, 153));
        btnLlantera.setText("Llantas \"Ponchadas\"");
        btnLlantera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlanteraActionPerformed(evt);
            }
        });
        jPanel1.add(btnLlantera, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 180, -1));

        btnManzanas.setBackground(new java.awt.Color(153, 153, 153));
        btnManzanas.setText("Venta de Manzanas");
        btnManzanas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManzanasActionPerformed(evt);
            }
        });
        jPanel1.add(btnManzanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 180, -1));

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

    private void btnInteresGanadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInteresGanadoActionPerformed
        // TODO add your handling code here:
        new frmInteresGanado().setVisible(true);
    }//GEN-LAST:event_btnInteresGanadoActionPerformed

    private void btnCalcularSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularSalarioActionPerformed
        // TODO add your handling code here:
        new frmCalculoSalario().setVisible(true);
    }//GEN-LAST:event_btnCalcularSalarioActionPerformed

    private void btnPresupuestoHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPresupuestoHospitalActionPerformed
        // TODO add your handling code here:
        new frmPresupuestoHospital().setVisible(true);
    }//GEN-LAST:event_btnPresupuestoHospitalActionPerformed

    private void btnGananciaArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGananciaArticuloActionPerformed
        // TODO add your handling code here:
        new frmGananciaArticulo().setVisible(true);
    }//GEN-LAST:event_btnGananciaArticuloActionPerformed

    private void btnInversionDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInversionDineroActionPerformed
        // TODO add your handling code here:
        new frmInverciondeDiseño().setVisible(true);
    }//GEN-LAST:event_btnInversionDineroActionPerformed

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        // TODO add your handling code here:
        new frmLeerDosNumeros().setVisible(true);
    }//GEN-LAST:event_btnLeerActionPerformed

    private void btnJubilacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJubilacionActionPerformed
        new frmTipoJubilacion().setVisible(true);
    }//GEN-LAST:event_btnJubilacionActionPerformed

    private void btnLlanteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlanteraActionPerformed
        new frmLlantera().setVisible(true);
    }//GEN-LAST:event_btnLlanteraActionPerformed

    private void btnManzanasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManzanasActionPerformed
        new frmVentaManzanas().setVisible(true);
    }//GEN-LAST:event_btnManzanasActionPerformed

    private void btnBolitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBolitasActionPerformed
        new frmColorBolita().setVisible(true);
    }//GEN-LAST:event_btnBolitasActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBolitas;
    private javax.swing.JButton btnCalcularSalario;
    private javax.swing.JButton btnGananciaArticulo;
    private javax.swing.JButton btnInteresGanado;
    private javax.swing.JButton btnInversionDinero;
    private javax.swing.JButton btnJubilacion;
    private javax.swing.JButton btnLeer;
    private javax.swing.JButton btnLlantera;
    private javax.swing.JButton btnManzanas;
    private javax.swing.JButton btnPresupuestoHospital;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
