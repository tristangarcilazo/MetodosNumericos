/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosnumericos2;

/**
 *
 * @author tristan
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        jLabel1 = new javax.swing.JLabel();
        SENL = new javax.swing.JButton();
        Interpolacion = new javax.swing.JButton();
        integracion = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú principal");
        setBackground(new java.awt.Color(102, 255, 255));
        setForeground(new java.awt.Color(102, 255, 255));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Seleccione la categoria deseada.");
        jLabel1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1200px-Escudo-UNAM-escalable.svg.png"))); // NOI18N

        SENL.setBackground(new java.awt.Color(214, 214, 214));
        SENL.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        SENL.setText("Sistema de ecuaciones no lineales.");
        SENL.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1200px-Escudo-UNAM-escalable.svg.png"))); // NOI18N
        SENL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SENLActionPerformed(evt);
            }
        });

        Interpolacion.setBackground(new java.awt.Color(214, 214, 214));
        Interpolacion.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Interpolacion.setText("Interpolación");
        Interpolacion.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1200px-Escudo-UNAM-escalable.svg.png"))); // NOI18N
        Interpolacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InterpolacionActionPerformed(evt);
            }
        });

        integracion.setBackground(new java.awt.Color(214, 214, 214));
        integracion.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        integracion.setText("Integración definida");
        integracion.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1200px-Escudo-UNAM-escalable.svg.png"))); // NOI18N
        integracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                integracionActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(214, 214, 214));
        salir.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        salir.setText("Salir");
        salir.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1200px-Escudo-UNAM-escalable.svg.png"))); // NOI18N
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Interpolacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(integracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SENL, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(153, 153, 153)))
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(SENL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Interpolacion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(integracion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        Salida sal=new Salida();
        sal.setLocationRelativeTo(null);
        this.setVisible(false);
        sal.setVisible(true);
    }//GEN-LAST:event_salirActionPerformed

    private void InterpolacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterpolacionActionPerformed
        // TODO add your handling code here:
        IntroInter inter=new IntroInter();
        inter.setLocationRelativeTo(null);
        this.setVisible(false);
        inter.setVisible(true);
    }//GEN-LAST:event_InterpolacionActionPerformed

    private void integracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_integracionActionPerformed
        // TODO add your handling code here:
        IntroIntegraDef inte=new IntroIntegraDef();
        inte.setLocationRelativeTo(null);
        this.setVisible(false);
        inte.setVisible(true);
    }//GEN-LAST:event_integracionActionPerformed

    private void SENLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SENLActionPerformed
        // TODO add your handling code here:
        SENL sisnolin=new SENL();
        sisnolin.setLocationRelativeTo(null);
        sisnolin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SENLActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Interpolacion;
    private javax.swing.JButton SENL;
    private javax.swing.JButton integracion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
