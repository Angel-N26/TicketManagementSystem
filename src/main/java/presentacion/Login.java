package presentacion;

import dominio.Colores;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.ColorUIResource;

/**
 * @author angel
 **/
public class Login extends javax.swing.JFrame implements Colores {

    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        tfUser = new javax.swing.JTextField();
        pfPass = new javax.swing.JPasswordField();
        lblUser = new javax.swing.JLabel();
        lblWarningImg = new javax.swing.JLabel();
        lblWarningImg.setVisible(false);
        lblPass = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        lblError.setVisible(false);
        errorImgPass = new javax.swing.JLabel();
        errorImgPass.setVisible(false);
        errorImgUser = new javax.swing.JLabel();
        errorImgUser.setVisible(false);
        kButton1 = new keeptoo.KButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TMS");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.white);
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(300, 300));
        setMinimumSize(new java.awt.Dimension(300, 300));
        setName("frame"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(300, 300));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        jPanel2.setMaximumSize(new java.awt.Dimension(300, 50));
        jPanel2.setMinimumSize(new java.awt.Dimension(300, 50));
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
        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\logo(2).png")); // NOI18N
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
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 3, 20, -1));

        getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);

        panel.setBackground(new java.awt.Color(51, 51, 51));
        panel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        panel.setForeground(new java.awt.Color(255, 255, 255));
        panel.setMaximumSize(new java.awt.Dimension(300, 250));
        panel.setMinimumSize(new java.awt.Dimension(300, 250));
        panel.setName("panel"); // NOI18N
        panel.setPreferredSize(new java.awt.Dimension(300, 250));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        panel.add(tfUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 25));

        pfPass.setBackground(new java.awt.Color(51, 51, 51));
        pfPass.setForeground(new java.awt.Color(255, 255, 255));
        pfPass.setToolTipText("Introduzca su contraseña");
        pfPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        pfPass.setCaretColor(new java.awt.Color(204, 0, 204));
        pfPass.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        pfPass.setName("pfPass"); // NOI18N
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
        panel.add(pfPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 25));

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Nombre de usuario");
        lblUser.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblUser.setName("lblUser"); // NOI18N
        panel.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 120, 10));

        lblWarningImg.setForeground(new java.awt.Color(255, 255, 255));
        lblWarningImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWarningImg.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\warning.png")); // NOI18N
        lblWarningImg.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblWarningImg.setName("lblWarningImg"); // NOI18N
        panel.add(lblWarningImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 29, 40));

        lblPass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPass.setForeground(new java.awt.Color(255, 255, 255));
        lblPass.setText("Contraseña");
        lblPass.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblPass.setName("lblPass"); // NOI18N
        panel.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 70, 10));

        lblError.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 255, 255));
        lblError.setText("Usuario y/o contraseña incorrecotos.");
        lblError.setName("lblError"); // NOI18N
        panel.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 240, 20));

        errorImgPass.setForeground(new java.awt.Color(255, 255, 255));
        errorImgPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorImgPass.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\error.png")); // NOI18N
        errorImgPass.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        errorImgPass.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        errorImgPass.setName("errorImgPass"); // NOI18N
        panel.add(errorImgPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 20, 20));

        errorImgUser.setForeground(new java.awt.Color(255, 255, 255));
        errorImgUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorImgUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\error.png")); // NOI18N
        errorImgUser.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        errorImgUser.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        errorImgUser.setName("errorImgUser"); // NOI18N
        panel.add(errorImgUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 20, 20));

        kButton1.setBorder(null);
        kButton1.setText("Iniciar Sesión");
        kButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kButton1.setkEndColor(new java.awt.Color(51, 0, 51));
        kButton1.setkStartColor(new java.awt.Color(204, 0, 204));
        kButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton1MouseClicked(evt);
            }
        });
        panel.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 205, 280, 30));

        jCheckBox1.setBackground(new java.awt.Color(51, 51, 51));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Recuerdame");
        panel.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 165, -1, -1));

        getContentPane().add(panel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUserFocusGained
        focus(tfUser, pfPass);        
    }//GEN-LAST:event_tfUserFocusGained

    private void tfUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUserFocusLost
        tfUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
    }//GEN-LAST:event_tfUserFocusLost

    private void pfPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfPassFocusGained
        focus(pfPass, tfUser);
    }//GEN-LAST:event_pfPassFocusGained

    private void pfPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfPassFocusLost
        pfPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
    }//GEN-LAST:event_pfPassFocusLost

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

    private void kButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton1MouseClicked
        if(tfUser.getText().equals("aa") && pfPass.getText().equals("aa")){            
            Menu menu = new Menu();
            menu.setVisible(true);
            menu.setLocationRelativeTo(null);
            menu.setExtendedState(NORMAL);
            dispose();
        }else{
            tfUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
            pfPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
            
            errorImgPass.setVisible(true);
            errorImgUser.setVisible(true);
            lblError.setVisible(true);
            lblWarningImg.setVisible(true);
        }
    }//GEN-LAST:event_kButton1MouseClicked

    private void focus(JTextField tfgained, JTextField tflost){
        tfgained.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
        
        errorImgPass.setVisible(false);
        errorImgUser.setVisible(false);
        lblError.setVisible(false);
        lblWarningImg.setVisible(false);
        
        tflost.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
    }
    
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
                try{
                    UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                    /*UIManager.put("ComboBox.selectionBackground", new ColorUIResource(204,0,204));
                    UIManager.put("ComboBox.selectionForeground", new ColorUIResource(255,255,255));
                    UIManager.put("ComboBox.disabledBackground", new ColorUIResource(51,51,51));
                    UIManager.put("ComboBox.disabledForeground", new ColorUIResource(153,153,153));
                    UIManager.put("ComboBox.buttonBackground", new ColorUIResource(102,102,102));
                    UIManager.put("ComboBox.buttonDarkShadow", new ColorUIResource(255,255,255));
                    UIManager.put("ComboBox.buttonHighlight", new ColorUIResource(153,0,0));
                    UIManager.put("ComboBox.buttonShadow", new ColorUIResource(153,0,0));
                    
                    UIManager.put("TableHeader.background", new ColorUIResource(51,51,51));
                    UIManager.put("TableHeader.foreground", new ColorUIResource(255,255,255));
                    UIManager.put("TableHeader.cellBorder", BorderFactory.createLineBorder(new java.awt.Color(255, 0, 255)));
                    
                    UIManager.put("Table.dropLineColor", new ColorUIResource(255,0,0));
                    UIManager.put("Table.dropLineShortColor", new ColorUIResource(0,255,0));

                    UIManager.put("ComboBox.border", BorderFactory.createLineBorder(new java.awt.Color(255, 0, 255)));*/
                }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){
                    e.printStackTrace();
                }
                       
                    
                new Login().setVisible(true);
            }
        });
    }
    
    private int xx;
    private int xy;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorImgPass;
    private javax.swing.JLabel errorImgUser;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private keeptoo.KButton kButton1;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblWarningImg;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panel;
    private javax.swing.JPasswordField pfPass;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables
}