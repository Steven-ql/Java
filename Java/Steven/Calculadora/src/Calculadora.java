public class Calculadora extends javax.swing.JFrame {
    double num1,num2,resultado;
    char operacion;
    
    
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
      
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnigual = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        btndivision = new javax.swing.JButton();
        btnmultiplicacion = new javax.swing.JButton();
        btnmenos1 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnsuma = new javax.swing.JButton();
        btnresta = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnpunto = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPorciento = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(48, 48, 48));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnigual.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        btnigual.setForeground(new java.awt.Color(204, 204, 204));
        btnigual.setIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\signoigual.png")); // NOI18N
        btnigual.setText("=");
        btnigual.setToolTipText("");
        btnigual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnigual.setPreferredSize(new java.awt.Dimension(70, 70));
        btnigual.setPressedIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\signoigual2.png")); // NOI18N
        btnigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnigualActionPerformed(evt);
            }
        });
        jPanel2.add(btnigual, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, 140));

        btnborrar.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        btnborrar.setForeground(new java.awt.Color(204, 204, 204));
        btnborrar.setIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\iconblack.png")); // NOI18N
        btnborrar.setText("C");
        btnborrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnborrar.setPreferredSize(new java.awt.Dimension(70, 70));
        btnborrar.setPressedIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\icongris.png")); // NOI18N
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnborrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        btndivision.setFont(new java.awt.Font("Consolas", 0, 27)); // NOI18N
        btndivision.setForeground(new java.awt.Color(204, 204, 204));
        btndivision.setIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\iconblack.png")); // NOI18N
        btndivision.setText("÷");
        btndivision.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btndivision.setPreferredSize(new java.awt.Dimension(70, 70));
        btndivision.setPressedIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\icongris.png")); // NOI18N
        btndivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivisionActionPerformed(evt);
            }
        });
        jPanel2.add(btndivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        btnmultiplicacion.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        btnmultiplicacion.setForeground(new java.awt.Color(204, 204, 204));
        btnmultiplicacion.setIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\iconblack.png")); // NOI18N
        btnmultiplicacion.setText("x");
        btnmultiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnmultiplicacion.setPreferredSize(new java.awt.Dimension(70, 70));
        btnmultiplicacion.setPressedIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\icongris.png")); // NOI18N
        btnmultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplicacionActionPerformed(evt);
            }
        });
        jPanel2.add(btnmultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        btnmenos1.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        btnmenos1.setForeground(new java.awt.Color(204, 204, 204));
        btnmenos1.setIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\iconblack.png")); // NOI18N
        btnmenos1.setText("<<");
        btnmenos1.setToolTipText("");
        btnmenos1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnmenos1.setPreferredSize(new java.awt.Dimension(70, 70));
        btnmenos1.setPressedIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\icongris.png")); // NOI18N
        btnmenos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenos1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnmenos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        btn9.setFont(new java.awt.Font("Consolas", 0, 27)); // NOI18N
        btn9.setForeground(new java.awt.Color(28, 78, 57));
        btn9.setIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\num.png")); // NOI18N
        btn9.setText("9");
        btn9.setToolTipText("");
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.setPreferredSize(new java.awt.Dimension(70, 70));
        btn9.setPressedIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\icongris.png")); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        btnsuma.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        btnsuma.setForeground(new java.awt.Color(204, 204, 204));
        btnsuma.setIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\iconblack.png")); // NOI18N
        btnsuma.setText("+");
        btnsuma.setToolTipText("");
        btnsuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsuma.setPreferredSize(new java.awt.Dimension(70, 70));
        btnsuma.setPressedIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\icongris.png")); // NOI18N
        btnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumaActionPerformed(evt);
            }
        });
        jPanel2.add(btnsuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        btnresta.setFont(new java.awt.Font("Consolas", 0, 28)); // NOI18N
        btnresta.setForeground(new java.awt.Color(204, 204, 204));
        btnresta.setIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\iconblack.png")); // NOI18N
        btnresta.setText("-");
        btnresta.setToolTipText("");
        btnresta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnresta.setPreferredSize(new java.awt.Dimension(70, 70));
        btnresta.setPressedIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\icongris.png")); // NOI18N
        btnresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestaActionPerformed(evt);
            }
        });
        jPanel2.add(btnresta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        btn7.setFont(new java.awt.Font("Consolas", 0, 27)); // NOI18N
        btn7.setForeground(new java.awt.Color(28, 78, 57));
        btn7.setIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\num.png")); // NOI18N
        btn7.setText("7");
        btn7.setToolTipText("");
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.setPreferredSize(new java.awt.Dimension(70, 70));
        btn7.setPressedIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\icongris.png")); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        btn8.setFont(new java.awt.Font("Consolas", 0, 27)); // NOI18N
        btn8.setForeground(new java.awt.Color(28, 78, 57));
        btn8.setIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\num.png")); // NOI18N
        btn8.setText("8");
        btn8.setToolTipText("");
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.setPreferredSize(new java.awt.Dimension(70, 70));
        btn8.setPressedIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\icongris.png")); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        btn6.setFont(new java.awt.Font("Consolas", 0, 27)); // NOI18N
        btn6.setForeground(new java.awt.Color(28, 78, 57));
        btn6.setIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\num.png")); // NOI18N
        btn6.setText("6");
        btn6.setToolTipText("");
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setPreferredSize(new java.awt.Dimension(70, 70));
        btn6.setPressedIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\icongris.png")); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        btn5.setFont(new java.awt.Font("Consolas", 0, 27)); // NOI18N
        btn5.setForeground(new java.awt.Color(28, 78, 57));
        btn5.setIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\num.png")); // NOI18N
        btn5.setText("5");
        btn5.setToolTipText("");
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setPreferredSize(new java.awt.Dimension(70, 70));
        btn5.setPressedIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\icongris.png")); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        btn4.setFont(new java.awt.Font("Consolas", 0, 27)); // NOI18N
        btn4.setForeground(new java.awt.Color(28, 78, 57));
        btn4.setIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\num.png")); // NOI18N
        btn4.setText("4");
        btn4.setToolTipText("");
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setPreferredSize(new java.awt.Dimension(70, 70));
        btn4.setPressedIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\icongris.png")); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

        btn3.setFont(new java.awt.Font("Consolas", 0, 27)); // NOI18N
        btn3.setForeground(new java.awt.Color(28, 78, 57));
        btn3.setIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\num.png")); // NOI18N
        btn3.setText("3");
        btn3.setToolTipText("");
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setPreferredSize(new java.awt.Dimension(70, 70));
        btn3.setPressedIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\icongris.png")); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        btn2.setFont(new java.awt.Font("Consolas", 0, 27)); // NOI18N
        btn2.setForeground(new java.awt.Color(28, 78, 57));
        btn2.setIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\num.png")); // NOI18N
        btn2.setText("2");
        btn2.setToolTipText("");
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setPreferredSize(new java.awt.Dimension(70, 70));
        btn2.setPressedIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\icongris.png")); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        btn1.setFont(new java.awt.Font("Consolas", 0, 27)); // NOI18N
        btn1.setForeground(new java.awt.Color(28, 78, 57));
        btn1.setIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\num.png")); // NOI18N
        btn1.setText("1");
        btn1.setToolTipText("");
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setPreferredSize(new java.awt.Dimension(70, 70));
        btn1.setPressedIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\icongris.png")); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, -1));

        btnpunto.setFont(new java.awt.Font("Consolas", 0, 28)); // NOI18N
        btnpunto.setForeground(new java.awt.Color(28, 78, 57));
        btnpunto.setIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\num.png")); // NOI18N
        btnpunto.setText(".");
        btnpunto.setToolTipText("");
        btnpunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnpunto.setPreferredSize(new java.awt.Dimension(70, 70));
        btnpunto.setPressedIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\icongris.png")); // NOI18N
        btnpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpuntoActionPerformed(evt);
            }
        });
        jPanel2.add(btnpunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, -1, -1));

        btn0.setFont(new java.awt.Font("Consolas", 0, 27)); // NOI18N
        btn0.setForeground(new java.awt.Color(28, 78, 57));
        btn0.setIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\num.png")); // NOI18N
        btn0.setText("0");
        btn0.setToolTipText("");
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.setPreferredSize(new java.awt.Dimension(70, 70));
        btn0.setPressedIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\icongris.png")); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        btnPorciento.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        btnPorciento.setForeground(new java.awt.Color(28, 78, 57));
        btnPorciento.setIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\num.png")); // NOI18N
        btnPorciento.setText("%");
        btnPorciento.setToolTipText("");
        btnPorciento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPorciento.setPreferredSize(new java.awt.Dimension(70, 70));
        btnPorciento.setPressedIcon(new javax.swing.ImageIcon("C:\\Steven\\Calculadora\\icongris.png")); // NOI18N
        btnPorciento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcientoActionPerformed(evt);
            }
        });
        jPanel2.add(btnPorciento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, -1, -1));

        jPanel3.setBackground(new java.awt.Color(24, 24, 24));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(204, 204, 204));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 260, 40));

        txtResultado.setFont(new java.awt.Font("Consolas", 0, 40)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(28, 78, 57));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 260, 70));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 150));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPorcientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcientoActionPerformed
        valor1();
        operacion='%';
        ClickOperador();
    }//GEN-LAST:event_btnPorcientoActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        Clicknumeros('1');
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        Clicknumeros('2');
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        Clicknumeros('0');
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpuntoActionPerformed
        Clicknumeros('.');
    }//GEN-LAST:event_btnpuntoActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        Clicknumeros('3');
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnigualActionPerformed
        valor2();
        calcular();
        txtOperacion.setText(txtOperacion.getText()+" "+num2);
    }//GEN-LAST:event_btnigualActionPerformed

    private void btnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumaActionPerformed
        valor1();
        operacion='+';
        ClickOperador();
    }//GEN-LAST:event_btnsumaActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        Clicknumeros('6');
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        Clicknumeros('5');
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        Clicknumeros('4');
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        Clicknumeros('7');
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        Clicknumeros('8');
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        Clicknumeros('9');
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestaActionPerformed
        valor1();
        operacion='-';
        ClickOperador();
    }//GEN-LAST:event_btnrestaActionPerformed

    private void btnmenos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenos1ActionPerformed
        String texto = txtResultado.getText().substring(0, txtResultado.getText().length() - 1);
        txtResultado.setText(texto);
    }//GEN-LAST:event_btnmenos1ActionPerformed

    private void btnmultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplicacionActionPerformed
        valor1();
        operacion='*';
        ClickOperador();
    }//GEN-LAST:event_btnmultiplicacionActionPerformed

    private void btndivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivisionActionPerformed
        valor1();
        operacion='/';
        ClickOperador();
    }//GEN-LAST:event_btndivisionActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        txtResultado.setText("");
        txtOperacion.setText("");
    }//GEN-LAST:event_btnborrarActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnPorciento;
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btndivision;
    private javax.swing.JButton btnigual;
    private javax.swing.JButton btnmenos1;
    private javax.swing.JButton btnmultiplicacion;
    private javax.swing.JButton btnpunto;
    private javax.swing.JButton btnresta;
    private javax.swing.JButton btnsuma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables

    public void Clicknumeros(char numero){
        String texto=txtResultado.getText();
        texto=texto+numero;
        txtResultado.setText(texto);       
    }
    
    public void valor1(){
        num1=Double.parseDouble(txtResultado.getText());
        txtResultado.setText("");
        txtOperacion.setText(String.valueOf(num1));     
    }
    
    public void valor2(){
        num2=Double.parseDouble(txtResultado.getText());
        txtResultado.setText("");
    }
    
    public void calcular(){
        if(num1!=0 && num2!=0){
            if (operacion == '+'){
            resultado=num1+num2;
        }else if(operacion=='*'){
            resultado=num1*num2;
        }else if(operacion=='/'){
            resultado=num1/num2;    
        }else if(operacion=='-'){
            resultado=num1-num2;
        }else if(operacion=='%'){
            resultado=(num1*num2)/100.0;
       
        }
        txtResultado.setText(String.valueOf(resultado));
        }
    }
    public void ClickOperador(){
        txtOperacion.setText(num1+" "+operacion);
    }
}

