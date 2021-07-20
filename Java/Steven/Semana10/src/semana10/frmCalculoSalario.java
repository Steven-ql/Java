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
public class frmCalculoSalario extends javax.swing.JFrame {

    /**
     * Creates new form frmCalculoSalario
     */
    public frmCalculoSalario() {
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
        etiCapital = new javax.swing.JLabel();
        etiTotal = new javax.swing.JLabel();
        etiInteres = new javax.swing.JLabel();
        txtSalarioTotal = new javax.swing.JTextField();
        txtSalarioBase = new javax.swing.JTextField();
        txtVenta1 = new javax.swing.JTextField();
        etiImagen = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        etiTotal1 = new javax.swing.JLabel();
        etiTotal2 = new javax.swing.JLabel();
        txtVenta2 = new javax.swing.JTextField();
        txtVenta3 = new javax.swing.JTextField();
        etiTotal3 = new javax.swing.JLabel();
        txtComision = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Cálculo de Salario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiCapital.setText("Monto de salario base:");
        etiCapital.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(etiCapital, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 130, -1));

        etiTotal.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        etiTotal.setText("Salario total Obtenido: ");
        jPanel1.add(etiTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 160, -1));

        etiInteres.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        etiInteres.setText("Monto venta 1: ");
        etiInteres.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(etiInteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 130, -1));

        txtSalarioTotal.setEditable(false);
        jPanel1.add(txtSalarioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 140, -1));
        jPanel1.add(txtSalarioBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 140, -1));
        jPanel1.add(txtVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 140, -1));

        etiImagen.setIcon(new javax.swing.ImageIcon("C:\\Steven\\Semana10\\Imagenes\\calculadora.png")); // NOI18N
        jPanel1.add(etiImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, 80));

        btnCalcular.setBackground(new java.awt.Color(153, 153, 153));
        btnCalcular.setText("Calcular salario total");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 180, -1));

        etiTotal1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        etiTotal1.setText("Monto venta 2: ");
        jPanel1.add(etiTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 130, -1));

        etiTotal2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        etiTotal2.setText("Monto venta 3: ");
        jPanel1.add(etiTotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 130, -1));
        jPanel1.add(txtVenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 140, -1));
        jPanel1.add(txtVenta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 140, -1));

        etiTotal3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        etiTotal3.setText("Comision obtenidas de ventas: ");
        jPanel1.add(etiTotal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 190, -1));

        txtComision.setEditable(false);
        jPanel1.add(txtComision, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 140, -1));

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

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        //Declaracion e inicializacion de variables
        double capital=0.0; //declara e inicializa en 0 la variable capital
        double interes=0.0; //declara e inicializa en 0 la variable interes
        double total=0.0; // declara e inicializa en 0 la variable total
        //Lectura de datos de entrada
        //Captura la Informacion de la caja de texto capital y se la asigna a
        //la variable capital convertida en double
        capital=Double.parseDouble(txtSalarioBase.getText());
        //Procesos
        interes=capital*0.02;
        total=capital+interes;
        //Salida de resultados
        txtVenta1.setText(String.valueOf(interes));
        txtSalarioTotal.setText(String.valueOf(total));
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(frmCalculoSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCalculoSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCalculoSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCalculoSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCalculoSalario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel etiCapital;
    private javax.swing.JLabel etiImagen;
    private javax.swing.JLabel etiInteres;
    private javax.swing.JLabel etiTotal;
    private javax.swing.JLabel etiTotal1;
    private javax.swing.JLabel etiTotal2;
    private javax.swing.JLabel etiTotal3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtComision;
    private javax.swing.JTextField txtSalarioBase;
    private javax.swing.JTextField txtSalarioTotal;
    private javax.swing.JTextField txtVenta1;
    private javax.swing.JTextField txtVenta2;
    private javax.swing.JTextField txtVenta3;
    // End of variables declaration//GEN-END:variables
}
