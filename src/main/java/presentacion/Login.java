package presentacion;

/**
 * @author angel
 **/
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel = new javax.swing.JPanel();
        tfUser = new javax.swing.JTextField();
        pfPass = new javax.swing.JPasswordField();
        btnIniciar = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        lblWarningImg = new javax.swing.JLabel();
        lblWarningImg.setVisible(false);
        lblPass = new javax.swing.JLabel();
        lblRetry = new javax.swing.JLabel();
        lblRetry.setVisible(false);
        lblError = new javax.swing.JLabel();
        lblError.setVisible(false);
        errorImgPass = new javax.swing.JLabel();
        errorImgPass.setVisible(false);
        errorImgUser = new javax.swing.JLabel();
        errorImgUser.setVisible(false);
        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TMS");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.white);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(300, 325));
        setName("frame"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(250, 250));
        setResizable(false);
        setSize(new java.awt.Dimension(300, 325));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(51, 51, 51));
        panel.setForeground(new java.awt.Color(255, 255, 255));
        panel.setName("panel"); // NOI18N
        panel.setPreferredSize(new java.awt.Dimension(300, 250));
        panel.setLayout(new java.awt.GridBagLayout());

        tfUser.setBackground(new java.awt.Color(51, 51, 51));
        tfUser.setForeground(new java.awt.Color(255, 255, 255));
        tfUser.setToolTipText("Introduzca su usuario.");
        tfUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfUser.setCaretColor(new java.awt.Color(204, 0, 204));
        tfUser.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfUser.setName("tfUser"); // NOI18N
        tfUser.setNextFocusableComponent(pfPass);
        tfUser.setPreferredSize(new java.awt.Dimension(280, 18));
        tfUser.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfUserFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 279;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panel.add(tfUser, gridBagConstraints);

        pfPass.setBackground(new java.awt.Color(51, 51, 51));
        pfPass.setForeground(new java.awt.Color(255, 255, 255));
        pfPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        pfPass.setCaretColor(new java.awt.Color(204, 0, 204));
        pfPass.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        pfPass.setName("pfPass"); // NOI18N
        pfPass.setNextFocusableComponent(btnIniciar);
        pfPass.setPreferredSize(new java.awt.Dimension(280, 18));
        pfPass.setSelectionColor(new java.awt.Color(204, 0, 204));
        pfPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pfPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pfPassFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 279;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panel.add(pfPass, gridBagConstraints);

        btnIniciar.setBackground(new java.awt.Color(204, 0, 204));
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Iniciar Sesión");
        btnIniciar.setName("btnIniciar"); // NOI18N
        btnIniciar.setPreferredSize(new java.awt.Dimension(280, 35));
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 185;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 10, 59, 10);
        panel.add(btnIniciar, gridBagConstraints);

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Nombre de usuario");
        lblUser.setToolTipText("");
        lblUser.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblUser.setName("lblUser"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = -4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 0);
        panel.add(lblUser, gridBagConstraints);

        lblWarningImg.setForeground(new java.awt.Color(255, 255, 255));
        lblWarningImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWarningImg.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Documents\\NetBeansProjects\\TicketManagementSystem\\src\\main\\java\\recursos\\triangulo.png")); // NOI18N
        lblWarningImg.setToolTipText("");
        lblWarningImg.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblWarningImg.setName("lblWarningImg"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        panel.add(lblWarningImg, gridBagConstraints);

        lblPass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPass.setForeground(new java.awt.Color(255, 255, 255));
        lblPass.setText("Contraseña");
        lblPass.setToolTipText("");
        lblPass.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblPass.setName("lblPass"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = -4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        panel.add(lblPass, gridBagConstraints);

        lblRetry.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRetry.setForeground(new java.awt.Color(255, 255, 255));
        lblRetry.setText("Inténtalo de nuevo.");
        lblRetry.setName("lblRetry"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 129;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 11, 0, 10);
        panel.add(lblRetry, gridBagConstraints);

        lblError.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 255, 255));
        lblError.setText("El usuario o la contraseña son incorrectos.");
        lblError.setName("lblError"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 11, 0, 10);
        panel.add(lblError, gridBagConstraints);

        errorImgPass.setForeground(new java.awt.Color(255, 255, 255));
        errorImgPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorImgPass.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Documents\\NetBeansProjects\\TicketManagementSystem\\src\\main\\java\\recursos\\cerrar.png")); // NOI18N
        errorImgPass.setToolTipText("");
        errorImgPass.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        errorImgPass.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        errorImgPass.setName("errorImgPass"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 140, 0, 10);
        panel.add(errorImgPass, gridBagConstraints);

        errorImgUser.setForeground(new java.awt.Color(255, 255, 255));
        errorImgUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorImgUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Documents\\NetBeansProjects\\TicketManagementSystem\\src\\main\\java\\recursos\\cerrar.png")); // NOI18N
        errorImgUser.setToolTipText("");
        errorImgUser.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        errorImgUser.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        errorImgUser.setName("errorImgUser"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 140, 0, 10);
        panel.add(errorImgUser, gridBagConstraints);

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 300));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Documents\\NetBeansProjects\\TicketManagementSystem\\src\\main\\java\\recursos\\logo(2).png")); // NOI18N
        logo.setName("logo"); // NOI18N
        jPanel2.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 20, 20));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("TicketManagementSystem");
        lblTitulo.setName("lblTitulo"); // NOI18N
        jPanel2.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 22, 190, -1));

        jSeparator1.setPreferredSize(new java.awt.Dimension(280, 2));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 280, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\close-button.png")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 20, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUserFocusGained
        tfUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 0, 204)));        
        //tfUser.setBackground(Color.BLACK);
        //tfUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
        
        errorImgPass.setVisible(false);
        errorImgUser.setVisible(false);
        lblError.setVisible(false);
        lblRetry.setVisible(false);
        lblWarningImg.setVisible(false);
        
        pfPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        //pfPass.setBackground(new java.awt.Color(102, 102, 102));
        //pfPass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfUserFocusGained

    private void tfUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUserFocusLost
        tfUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        //tfUser.setBackground(new java.awt.Color(102, 102, 102));
        //tfUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfUserFocusLost

    private void pfPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfPassFocusGained
        pfPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 0, 204)));
        //pfPass.setBackground(Color.BLACK);
        //pfPass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
        
        errorImgPass.setVisible(false);
        errorImgUser.setVisible(false);
        lblError.setVisible(false);
        lblRetry.setVisible(false);
        lblWarningImg.setVisible(false);
        
        tfUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        //tfUser.setBackground(new java.awt.Color(102, 102, 102));
        //tfUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_pfPassFocusGained

    private void pfPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfPassFocusLost
        pfPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        //pfPass.setBackground(new java.awt.Color(102, 102, 102));
        //pfPass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_pfPassFocusLost

    private void btnIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseClicked
        if(tfUser.getText().equals("aa") && pfPass.getText().equals("aa")){
           /* Inicio inicio = new Inicio();
            inicio.setVisible(true);
            inicio.setLocationRelativeTo(null);*/
            
            Menu menu = new Menu();
            menu.setVisible(true);
            menu.setLocationRelativeTo(null);
            menu.setExtendedState(NORMAL);
            dispose();
        }else{
            //tfUser.setBackground(Color.BLACK);
            //pfPass.setBackground(Color.BLACK);
            tfUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 0, 0)));
            pfPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 0, 0)));                       
            //tfUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            //pfPass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
            
            errorImgPass.setVisible(true);
            errorImgUser.setVisible(true);
            lblError.setVisible(true);
            lblRetry.setVisible(true);
            lblWarningImg.setVisible(true);
        }
    }//GEN-LAST:event_btnIniciarMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    /**
     * @param args the command line arguments
     **/
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    private int xx;
    private int xy;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel errorImgPass;
    private javax.swing.JLabel errorImgUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblRetry;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblWarningImg;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panel;
    private javax.swing.JPasswordField pfPass;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables
}