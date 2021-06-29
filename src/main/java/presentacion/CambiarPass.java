package presentacion;

import dominio.Colores;
import dominio.ControlUsuarios;
import dominio.PasswordAuthentication;
import dominio.Usuario;
import java.awt.Color;
import java.sql.Connection;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 * @author angel
 **/
public class CambiarPass extends javax.swing.JFrame implements Colores {

    public CambiarPass(Usuario user, Connection con) {
        initComponents();
        this.user = user;
        cu = new ControlUsuarios(con);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        kButton1 = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(450, 300));
        setMinimumSize(new java.awt.Dimension(450, 300));
        setUndecorated(true);

        jPanel1.setMinimumSize(new java.awt.Dimension(450, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 250));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        jPanel2.setMaximumSize(new java.awt.Dimension(450, 40));
        jPanel2.setMinimumSize(new java.awt.Dimension(450, 40));
        jPanel2.setPreferredSize(new java.awt.Dimension(450, 40));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close-button.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setPreferredSize(new java.awt.Dimension(16, 16));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 2, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cambiar contraseña administrador");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jPanel3.setMaximumSize(new java.awt.Dimension(450, 75));
        jPanel3.setMinimumSize(new java.awt.Dimension(450, 75));
        jPanel3.setPreferredSize(new java.awt.Dimension(450, 75));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        kButton1.setBorder(null);
        kButton1.setText("Cancelar");
        kButton1.setkEndColor(new java.awt.Color(51, 0, 51));
        kButton1.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(51, 0, 51));
        kButton1.setkPressedColor(new java.awt.Color(255, 153, 204));
        kButton1.setkStartColor(new java.awt.Color(204, 0, 204));
        kButton1.setMaximumSize(new java.awt.Dimension(185, 35));
        kButton1.setMinimumSize(new java.awt.Dimension(185, 35));
        kButton1.setPreferredSize(new java.awt.Dimension(185, 35));
        kButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kButton1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                kButton1MouseReleased(evt);
            }
        });
        jPanel3.add(kButton1);

        kButton2.setBorder(null);
        kButton2.setText("Aceptar");
        kButton2.setkEndColor(new java.awt.Color(51, 0, 51));
        kButton2.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(51, 0, 51));
        kButton2.setkPressedColor(new java.awt.Color(255, 153, 204));
        kButton2.setkStartColor(new java.awt.Color(204, 0, 204));
        kButton2.setMaximumSize(new java.awt.Dimension(185, 35));
        kButton2.setMinimumSize(new java.awt.Dimension(185, 35));
        kButton2.setPreferredSize(new java.awt.Dimension(185, 35));
        kButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kButton2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kButton2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                kButton2MouseReleased(evt);
            }
        });
        jPanel3.add(kButton2);

        jPanel1.add(jPanel3, java.awt.BorderLayout.SOUTH);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        jPanel4.setMaximumSize(new java.awt.Dimension(450, 135));
        jPanel4.setMinimumSize(new java.awt.Dimension(450, 185));
        jPanel4.setPreferredSize(new java.awt.Dimension(450, 185));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña actual*");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel8.setVisible(false);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/error.png"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        jPasswordField1.setBackground(new java.awt.Color(51, 51, 51));
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        jPasswordField1.setCaretColor(new java.awt.Color(204, 0, 204));
        jPasswordField1.setMaximumSize(new java.awt.Dimension(280, 25));
        jPasswordField1.setMinimumSize(new java.awt.Dimension(280, 25));
        jPasswordField1.setPreferredSize(new java.awt.Dimension(280, 25));
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPanel4.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 370, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña nueva*");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel7.setVisible(false);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/error.png"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        jPasswordField2.setBackground(new java.awt.Color(51, 51, 51));
        jPasswordField2.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        jPasswordField2.setCaretColor(new java.awt.Color(204, 0, 204));
        jPasswordField2.setMaximumSize(new java.awt.Dimension(280, 25));
        jPasswordField2.setMinimumSize(new java.awt.Dimension(280, 25));
        jPasswordField2.setPreferredSize(new java.awt.Dimension(280, 25));
        jPasswordField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusLost(evt);
            }
        });
        jPanel4.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 370, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Repetir contraseña*");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel6.setVisible(false);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        jPasswordField3.setBackground(new java.awt.Color(51, 51, 51));
        jPasswordField3.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        jPasswordField3.setCaretColor(new java.awt.Color(204, 0, 204));
        jPasswordField3.setMaximumSize(new java.awt.Dimension(280, 25));
        jPasswordField3.setMinimumSize(new java.awt.Dimension(280, 25));
        jPasswordField3.setPreferredSize(new java.awt.Dimension(280, 25));
        jPasswordField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField3FocusLost(evt);
            }
        });
        jPanel4.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 370, -1));

        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setToolTipText("");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setToolTipText("");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setToolTipText("");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void kButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton1MouseExited
        activarCancelar = false;
    }//GEN-LAST:event_kButton1MouseExited

    private void kButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton1MousePressed
        activarCancelar = true;
    }//GEN-LAST:event_kButton1MousePressed

    private void kButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton1MouseReleased
        if(activarCancelar){
            dispose();
        }
    }//GEN-LAST:event_kButton1MouseReleased

    private void kButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton2MouseExited
        activarAceptar = false;
    }//GEN-LAST:event_kButton2MouseExited

    private void kButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton2MousePressed
        activarAceptar = true;
    }//GEN-LAST:event_kButton2MousePressed

    private void kButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton2MouseReleased
        if(activarAceptar){
            PasswordAuthentication pa = new PasswordAuthentication();
            if(camposVacios() && comprobarCampos()){
                user.setContrasena(pa.hash(jPasswordField2.getText()));
                if(cu.modificarUsuario(user)){
                    JOptionPane.showMessageDialog(this, "Contraseña actualizada",
                        "Valido", JOptionPane.PLAIN_MESSAGE);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(this,  
                        "No se ha podido actualizar la contraseña",
                        "Error", JOptionPane.ERROR_MESSAGE);
                }
            }      
        }
    }//GEN-LAST:event_kButton2MouseReleased

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        jPasswordField1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
        jLabel8.setVisible(false);
        jLabel9.setText("");
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        jPasswordField1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jPasswordField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusGained
        jPasswordField2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
        jLabel7.setVisible(false);
        jLabel10.setText("");
    }//GEN-LAST:event_jPasswordField2FocusGained

    private void jPasswordField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusLost
        jPasswordField2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
    }//GEN-LAST:event_jPasswordField2FocusLost

    private void jPasswordField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField3FocusGained
        jPasswordField3.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
        jLabel6.setVisible(false);
        jLabel11.setText("");
    }//GEN-LAST:event_jPasswordField3FocusGained

    private void jPasswordField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField3FocusLost
        jPasswordField3.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
    }//GEN-LAST:event_jPasswordField3FocusLost

    private boolean camposVacios(){
        boolean noVacio = true;
        
        if(jPasswordField1.getText().equals("")){
            jPasswordField1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
            jLabel8.setVisible(true);
            jLabel9.setText("Campo vacio");
            noVacio = false;
        }
        
        if(jPasswordField2.getText().equals("")){
            jPasswordField2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
            jLabel7.setVisible(true);
            jLabel10.setText("Campo vacio");
            noVacio = false;
        }
        
        if(jPasswordField3.getText().equals("")){
            jPasswordField3.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
            jLabel6.setVisible(true);
            jLabel11.setText("Campo vacio");
            noVacio = false;
        }
        
        return noVacio;
    }
    
    private boolean comprobarCampos(){
        boolean comprobar = true;
        PasswordAuthentication pa = new PasswordAuthentication();
        if(!pa.authenticate(jPasswordField1.getText(), user.getContrasena())){
            jPasswordField1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
            jLabel8.setVisible(true);
            jLabel9.setText("Contraseña actual erronea");
            comprobar = false;
        }
        
        if(!jPasswordField3.getText().equals(jPasswordField2.getText())){
            jPasswordField3.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
            jLabel11.setText("Las contraseñas no coinciden");
            jLabel6.setVisible(true);
            comprobar = false;
        }
        
        return comprobar;
    }
    
    private final ControlUsuarios cu;
    private final Usuario user;
    
    private boolean activarCancelar;
    private boolean activarAceptar;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    // End of variables declaration//GEN-END:variables
}
