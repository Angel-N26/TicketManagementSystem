package presentacion;

import dominio.Asociacion;
import dominio.Cargo;
import dominio.Colores;
import dominio.ControlAsociacion;
import dominio.ControlJuntaDirectiva;
import dominio.ControlMembresia;
import dominio.ControlUsuarios;
import dominio.Email;
import dominio.Membresia;
import dominio.PasswordAuthentication;
import static dominio.RegularExpresions.EMAIL;
import dominio.Usuario;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import javax.mail.MessagingException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.ColorUIResource;
import persistencia.Agente;

/**
 * @author angel
 **/
public class Login extends javax.swing.JFrame implements Colores {

    public Login() {
        conn = Agente.getConexion();
        
        ca = new ControlAsociacion(conn);
        cu = new ControlUsuarios(conn);
        cjd = new ControlJuntaDirectiva(conn);
        cm = new ControlMembresia(conn);
        
        initComponents();   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNorth = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        close = new javax.swing.JLabel();
        lblInicioSesion = new javax.swing.JLabel();
        lblRegistro = new javax.swing.JLabel();
        panelCenter = new javax.swing.JPanel();
        panelIniciarSesion = new javax.swing.JPanel();
        lblWarningImg = new javax.swing.JLabel();
        lblWarningImg.setVisible(false);
        lblError = new javax.swing.JLabel();
        lblError.setVisible(false);
        lblUser = new javax.swing.JLabel();
        errorImgUser = new javax.swing.JLabel();
        errorImgUser.setVisible(false);
        tfUser = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        errorImgPass = new javax.swing.JLabel();
        errorImgPass.setVisible(false);
        jLabel1 = new javax.swing.JLabel();
        pfPass = new javax.swing.JPasswordField();
        infor = new javax.swing.JLabel();
        lblInfor1 = new javax.swing.JLabel();
        lblInfor2 = new javax.swing.JLabel();
        lblInfor3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelRegistrarse = new javax.swing.JPanel();
        lblUserReg = new javax.swing.JLabel();
        lblUserRegError = new javax.swing.JLabel();
        errorImgUserReg = new javax.swing.JLabel();
        errorImgUserReg.setVisible(false);
        tfUserReg = new javax.swing.JTextField();
        lblPassReg = new javax.swing.JLabel();
        lblPassRegError = new javax.swing.JLabel();
        errorImgPassReg = new javax.swing.JLabel();
        errorImgPassReg.setVisible(false);
        jLabel3 = new javax.swing.JLabel();
        pfPassReg = new javax.swing.JPasswordField();
        lblRepPass = new javax.swing.JLabel();
        lblRepPassError = new javax.swing.JLabel();
        errorImgRepPass = new javax.swing.JLabel();
        errorImgRepPass.setVisible(false);
        jLabel2 = new javax.swing.JLabel();
        pfRepPass = new javax.swing.JPasswordField();
        lblNombreAsoc = new javax.swing.JLabel();
        lblNombreAsocError = new javax.swing.JLabel();
        errorImgNombreAsoc = new javax.swing.JLabel();
        errorImgNombreAsoc.setVisible(false);
        tfNombreAsoc = new javax.swing.JTextField();
        panelSouth = new javax.swing.JPanel();
        btnInicioSesion = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TMS");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.white);
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(300, 400));
        setMinimumSize(new java.awt.Dimension(300, 400));
        setName("frame"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(300, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(300, 400));

        panelNorth.setBackground(new java.awt.Color(51, 51, 51));
        panelNorth.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        panelNorth.setMaximumSize(new java.awt.Dimension(300, 80));
        panelNorth.setMinimumSize(new java.awt.Dimension(300, 80));
        panelNorth.setName("panelNorth"); // NOI18N
        panelNorth.setPreferredSize(new java.awt.Dimension(300, 80));
        panelNorth.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelNorthMouseDragged(evt);
            }
        });
        panelNorth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelNorthMousePressed(evt);
            }
        });
        panelNorth.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo16.PNG"))); // NOI18N
        logo.setName("logo"); // NOI18N
        panelNorth.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 20, 20));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("TicketManagementSystem");
        lblTitulo.setName("lblTitulo"); // NOI18N
        lblTitulo.setPreferredSize(new java.awt.Dimension(182, 20));
        panelNorth.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 5, 190, -1));

        separator.setName("separator"); // NOI18N
        separator.setPreferredSize(new java.awt.Dimension(280, 2));
        panelNorth.add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 280, -1));

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close-button.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.setMaximumSize(new java.awt.Dimension(16, 16));
        close.setMinimumSize(new java.awt.Dimension(16, 16));
        close.setName("close"); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                closeMouseReleased(evt);
            }
        });
        panelNorth.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 6, -1, -1));

        lblInicioSesion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblInicioSesion.setForeground(new java.awt.Color(204, 0, 204));
        lblInicioSesion.setText("Iniciar Sesión");
        lblInicioSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInicioSesion.setName("lblInicioSesion"); // NOI18N
        lblInicioSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInicioSesionMouseClicked(evt);
            }
        });
        panelNorth.add(lblInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        lblRegistro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistro.setText("Registrarse");
        lblRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistro.setName("lblRegistro"); // NOI18N
        lblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistroMouseClicked(evt);
            }
        });
        panelNorth.add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        getContentPane().add(panelNorth, java.awt.BorderLayout.NORTH);

        panelCenter.setBackground(new java.awt.Color(51, 51, 51));
        panelCenter.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        panelCenter.setForeground(new java.awt.Color(255, 255, 255));
        panelCenter.setMaximumSize(new java.awt.Dimension(300, 250));
        panelCenter.setMinimumSize(new java.awt.Dimension(300, 250));
        panelCenter.setName("panelCenter"); // NOI18N
        panelCenter.setPreferredSize(new java.awt.Dimension(300, 250));
        panelCenter.setLayout(new java.awt.CardLayout());

        panelIniciarSesion.setBackground(new java.awt.Color(51, 51, 51));
        panelIniciarSesion.setMaximumSize(new java.awt.Dimension(300, 250));
        panelIniciarSesion.setMinimumSize(new java.awt.Dimension(300, 250));
        panelIniciarSesion.setName("panelIniciarSesion"); // NOI18N
        panelIniciarSesion.setPreferredSize(new java.awt.Dimension(300, 250));
        panelIniciarSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblWarningImg.setForeground(new java.awt.Color(255, 255, 255));
        lblWarningImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWarningImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/warning.png"))); // NOI18N
        lblWarningImg.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblWarningImg.setName("lblWarningImg"); // NOI18N
        panelIniciarSesion.add(lblWarningImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 29, 40));

        lblError.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 255, 255));
        lblError.setText("Usuario y/o contraseña incorrectos.");
        lblError.setName("lblError"); // NOI18N
        panelIniciarSesion.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 240, 20));

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Nombre de usuario");
        lblUser.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblUser.setName("lblUser"); // NOI18N
        panelIniciarSesion.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, 10));

        errorImgUser.setForeground(new java.awt.Color(255, 255, 255));
        errorImgUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorImgUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/error.png"))); // NOI18N
        errorImgUser.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        errorImgUser.setName("errorImgUser"); // NOI18N
        panelIniciarSesion.add(errorImgUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 55, 20, 20));

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
        panelIniciarSesion.add(tfUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 25));

        lblPass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPass.setForeground(new java.awt.Color(255, 255, 255));
        lblPass.setText("Contraseña");
        lblPass.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblPass.setName("lblPass"); // NOI18N
        panelIniciarSesion.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 70, 10));

        errorImgPass.setForeground(new java.awt.Color(255, 255, 255));
        errorImgPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorImgPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/error.png"))); // NOI18N
        errorImgPass.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        errorImgPass.setName("errorImgPass"); // NOI18N
        panelIniciarSesion.add(errorImgPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 115, 20, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visible-eye.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
        });
        panelIniciarSesion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 145, -1, -1));

        pfPass.setBackground(new java.awt.Color(51, 51, 51));
        pfPass.setForeground(new java.awt.Color(255, 255, 255));
        pfPass.setToolTipText("Introduzca su contraseña");
        pfPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        pfPass.setCaretColor(new java.awt.Color(204, 0, 204));
        pfPass.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        pfPass.setName("pfPass"); // NOI18N
        pfPass.setOpaque(false);
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
        panelIniciarSesion.add(pfPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 25));

        infor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informacion.png"))); // NOI18N
        infor.setName("infor"); // NOI18N
        panelIniciarSesion.add(infor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        lblInfor1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblInfor1.setForeground(new java.awt.Color(255, 255, 255));
        lblInfor1.setText("Ticket Management System es una aplicación");
        lblInfor1.setName("lblInfor1"); // NOI18N
        lblInfor1.setPreferredSize(new java.awt.Dimension(237, 16));
        panelIniciarSesion.add(lblInfor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 260, -1));

        lblInfor2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblInfor2.setForeground(new java.awt.Color(255, 255, 255));
        lblInfor2.setText("realizada para el Trabajo de Fin de Grado por");
        lblInfor2.setName("lblInfor2"); // NOI18N
        lblInfor2.setPreferredSize(new java.awt.Dimension(212, 16));
        panelIniciarSesion.add(lblInfor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 280, -1));

        lblInfor3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblInfor3.setForeground(new java.awt.Color(255, 255, 255));
        lblInfor3.setText("Ángel Sánchez González");
        lblInfor3.setName("lblInfor3"); // NOI18N
        lblInfor3.setPreferredSize(new java.awt.Dimension(212, 16));
        panelIniciarSesion.add(lblInfor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 280, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 204));
        jLabel4.setText("¿Has olvidado tu contraseña?");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel4MouseReleased(evt);
            }
        });
        panelIniciarSesion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 200, -1));

        panelCenter.add(panelIniciarSesion, "iniciarsesion");

        panelRegistrarse.setBackground(new java.awt.Color(51, 51, 51));
        panelRegistrarse.setMaximumSize(new java.awt.Dimension(300, 250));
        panelRegistrarse.setMinimumSize(new java.awt.Dimension(300, 250));
        panelRegistrarse.setName("panelRegistrarse"); // NOI18N
        panelRegistrarse.setPreferredSize(new java.awt.Dimension(300, 250));
        panelRegistrarse.setRequestFocusEnabled(false);
        panelRegistrarse.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUserReg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUserReg.setForeground(new java.awt.Color(255, 255, 255));
        lblUserReg.setText("Usuario*");
        lblUserReg.setName("lblUserReg"); // NOI18N
        panelRegistrarse.add(lblUserReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lblUserRegError.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUserRegError.setForeground(new java.awt.Color(255, 51, 51));
        lblUserRegError.setName("lblUserRegError"); // NOI18N
        panelRegistrarse.add(lblUserRegError, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        errorImgUserReg.setForeground(new java.awt.Color(255, 255, 255));
        errorImgUserReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorImgUserReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/error.png"))); // NOI18N
        errorImgUserReg.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        errorImgUserReg.setName("errorImgUser"); // NOI18N
        panelRegistrarse.add(errorImgUserReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 15, 20, 20));

        tfUserReg.setBackground(new java.awt.Color(51, 51, 51));
        tfUserReg.setForeground(new java.awt.Color(255, 255, 255));
        tfUserReg.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfUserReg.setCaretColor(new java.awt.Color(204, 0, 204));
        tfUserReg.setName("tfUserReg"); // NOI18N
        tfUserReg.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfUserReg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfUserRegFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfUserRegFocusLost(evt);
            }
        });
        panelRegistrarse.add(tfUserReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 280, 25));

        lblPassReg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPassReg.setForeground(new java.awt.Color(255, 255, 255));
        lblPassReg.setText("Contraseña*");
        lblPassReg.setName("lblPassReg"); // NOI18N
        panelRegistrarse.add(lblPassReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        lblPassRegError.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPassRegError.setForeground(new java.awt.Color(255, 51, 51));
        lblPassRegError.setToolTipText("");
        lblPassRegError.setName("lblPassRegError"); // NOI18N
        panelRegistrarse.add(lblPassRegError, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 80, -1, -1));

        errorImgPassReg.setForeground(new java.awt.Color(255, 255, 255));
        errorImgPassReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorImgPassReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/error.png"))); // NOI18N
        errorImgPassReg.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        errorImgPassReg.setName("errorImgUser"); // NOI18N
        panelRegistrarse.add(errorImgPassReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 75, 20, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visible-eye.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel3MouseReleased(evt);
            }
        });
        panelRegistrarse.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 105, -1, -1));

        pfPassReg.setBackground(new java.awt.Color(51, 51, 51));
        pfPassReg.setForeground(new java.awt.Color(255, 255, 255));
        pfPassReg.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        pfPassReg.setCaretColor(new java.awt.Color(204, 0, 204));
        pfPassReg.setName("pfPassReg"); // NOI18N
        pfPassReg.setOpaque(false);
        pfPassReg.setSelectionColor(new java.awt.Color(204, 0, 204));
        pfPassReg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pfPassRegFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pfPassRegFocusLost(evt);
            }
        });
        panelRegistrarse.add(pfPassReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 280, 25));

        lblRepPass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRepPass.setForeground(new java.awt.Color(255, 255, 255));
        lblRepPass.setText("Confirmar contraseña*");
        lblRepPass.setName("lblRepPass"); // NOI18N
        panelRegistrarse.add(lblRepPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        lblRepPassError.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRepPassError.setForeground(new java.awt.Color(255, 51, 51));
        lblRepPassError.setName("lblRepPassError"); // NOI18N
        panelRegistrarse.add(lblRepPassError, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        errorImgRepPass.setForeground(new java.awt.Color(255, 255, 255));
        errorImgRepPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorImgRepPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/error.png"))); // NOI18N
        errorImgRepPass.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        errorImgRepPass.setName("errorImgUser"); // NOI18N
        panelRegistrarse.add(errorImgRepPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 135, 20, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visible-eye.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        panelRegistrarse.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 165, -1, -1));

        pfRepPass.setBackground(new java.awt.Color(51, 51, 51));
        pfRepPass.setForeground(new java.awt.Color(255, 255, 255));
        pfRepPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        pfRepPass.setCaretColor(new java.awt.Color(204, 0, 204));
        pfRepPass.setName("pfRepPass"); // NOI18N
        pfRepPass.setOpaque(false);
        pfRepPass.setSelectionColor(new java.awt.Color(204, 0, 204));
        pfRepPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pfRepPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pfRepPassFocusLost(evt);
            }
        });
        panelRegistrarse.add(pfRepPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 280, 25));

        lblNombreAsoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombreAsoc.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreAsoc.setText("Nombre asociación*");
        lblNombreAsoc.setName("lblNombreAsoc"); // NOI18N
        panelRegistrarse.add(lblNombreAsoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        lblNombreAsocError.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombreAsocError.setForeground(new java.awt.Color(255, 51, 51));
        lblNombreAsocError.setName("lblNombreAsocError"); // NOI18N
        panelRegistrarse.add(lblNombreAsocError, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 200, -1, -1));

        errorImgNombreAsoc.setForeground(new java.awt.Color(255, 255, 255));
        errorImgNombreAsoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorImgNombreAsoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/error.png"))); // NOI18N
        errorImgNombreAsoc.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        errorImgNombreAsoc.setName("errorImgUser"); // NOI18N
        panelRegistrarse.add(errorImgNombreAsoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 195, 20, 20));

        tfNombreAsoc.setBackground(new java.awt.Color(51, 51, 51));
        tfNombreAsoc.setForeground(new java.awt.Color(255, 255, 255));
        tfNombreAsoc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfNombreAsoc.setCaretColor(new java.awt.Color(204, 0, 204));
        tfNombreAsoc.setName("tfNombreAsoc"); // NOI18N
        tfNombreAsoc.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfNombreAsoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNombreAsocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNombreAsocFocusLost(evt);
            }
        });
        panelRegistrarse.add(tfNombreAsoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 280, 25));

        panelCenter.add(panelRegistrarse, "registrarse");

        getContentPane().add(panelCenter, java.awt.BorderLayout.CENTER);

        panelSouth.setBackground(new java.awt.Color(51, 51, 51));
        panelSouth.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        panelSouth.setMaximumSize(new java.awt.Dimension(300, 50));
        panelSouth.setMinimumSize(new java.awt.Dimension(300, 50));
        panelSouth.setName("panelSouth"); // NOI18N
        panelSouth.setPreferredSize(new java.awt.Dimension(300, 50));
        panelSouth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        btnInicioSesion.setBorder(null);
        btnInicioSesion.setText("Iniciar Sesión");
        btnInicioSesion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInicioSesion.setkEndColor(new java.awt.Color(51, 0, 51));
        btnInicioSesion.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        btnInicioSesion.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnInicioSesion.setkHoverStartColor(new java.awt.Color(51, 0, 51));
        btnInicioSesion.setkPressedColor(new java.awt.Color(255, 153, 204));
        btnInicioSesion.setkStartColor(new java.awt.Color(204, 0, 204));
        btnInicioSesion.setName("btnInicioSesion"); // NOI18N
        btnInicioSesion.setPreferredSize(new java.awt.Dimension(280, 30));
        btnInicioSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicioSesionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnInicioSesionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnInicioSesionMouseReleased(evt);
            }
        });
        panelSouth.add(btnInicioSesion);

        getContentPane().add(panelSouth, java.awt.BorderLayout.SOUTH);

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

    private void panelNorthMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNorthMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_panelNorthMousePressed

    private void panelNorthMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNorthMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_panelNorthMouseDragged

    private void lblInicioSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioSesionMouseClicked
        CardLayout cardLayout = (CardLayout) panelCenter.getLayout();
        cardLayout.show(panelCenter, "iniciarsesion");
        
        lblInicioSesion.setForeground(new Color(204,0,204));
        lblRegistro.setForeground(new Color(255,255,255));
        
        btnInicioSesion.setText("Iniciar Sesión");
    }//GEN-LAST:event_lblInicioSesionMouseClicked

    private void lblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseClicked
        CardLayout cardLayout = (CardLayout) panelCenter.getLayout();
        cardLayout.show(panelCenter, "registrarse");
        
        lblRegistro.setForeground(new Color(204,0,204));
        lblInicioSesion.setForeground(new Color(255,255,255));
        
        btnInicioSesion.setText("Registrarse");
    }//GEN-LAST:event_lblRegistroMouseClicked

    private void tfUserRegFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUserRegFocusGained
        tfUserReg.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
        lblUserRegError.setText("");
        errorImgUserReg.setVisible(false);
    }//GEN-LAST:event_tfUserRegFocusGained

    private void tfUserRegFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUserRegFocusLost
        tfUserReg.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
    }//GEN-LAST:event_tfUserRegFocusLost

    private void pfPassRegFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfPassRegFocusGained
        pfPassReg.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
        lblPassRegError.setText("");
        errorImgPassReg.setVisible(false);
    }//GEN-LAST:event_pfPassRegFocusGained

    private void pfPassRegFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfPassRegFocusLost
        pfPassReg.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
    }//GEN-LAST:event_pfPassRegFocusLost

    private void pfRepPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfRepPassFocusGained
        pfRepPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
        lblRepPassError.setText("");
        errorImgRepPass.setVisible(false);
    }//GEN-LAST:event_pfRepPassFocusGained

    private void pfRepPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfRepPassFocusLost
        pfRepPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
    }//GEN-LAST:event_pfRepPassFocusLost

    private void tfNombreAsocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreAsocFocusGained
        tfNombreAsoc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
        lblNombreAsocError.setText("");
        errorImgNombreAsoc.setVisible(false);
    }//GEN-LAST:event_tfNombreAsocFocusGained

    private void tfNombreAsocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreAsocFocusLost
        tfNombreAsoc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
    }//GEN-LAST:event_tfNombreAsocFocusLost

    private void btnInicioSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioSesionMouseExited
        activar = false;
    }//GEN-LAST:event_btnInicioSesionMouseExited

    private void btnInicioSesionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioSesionMouseReleased
        Asociacion asoc;
        if(activar){
            if(btnInicioSesion.getText().equals("Iniciar Sesión")){
                if(comprobarUsuario(tfUser.getText(), pfPass.getText())){
                    
                    
                    Usuario usuario = cu.obtenerUsuario(tfUser.getText());
                    asoc = ca.obtenerAsociacion(usuario.getIdAsociacion());
                    Menu menu = new Menu(asoc, usuario, conn);
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
            }else{
                if(camposVacios() && comprobarCampos()){
                    if(ca.insertarAsociacion(tfNombreAsoc.getText())){
                        asoc = ca.obtenerAsociacionNombre(tfNombreAsoc.getText());
                        crearCargos(asoc.getId());
                        Membresia m = new Membresia("Ninguna", 0, asoc.getId());
                        cm.insertarMembresia(m);
                        
                        PasswordAuthentication pa = new PasswordAuthentication();
                        //String pass = pa.hash(pfPassReg.getText());                                
                        String pass = pfPassReg.getText();        
                        
                        Usuario user = new Usuario(tfUserReg.getText(), pass, asoc.getId());
                        if(cu.insertarUsuario(user)){
                            Menu menu = new Menu(asoc, user, conn);
                            menu.setVisible(true);
                            menu.setLocationRelativeTo(null);
                            menu.setExtendedState(NORMAL);
                            dispose();
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnInicioSesionMouseReleased

    private void btnInicioSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioSesionMousePressed
        activar = true;
    }//GEN-LAST:event_btnInicioSesionMousePressed

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        activarPassLogIn = false;
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        activarPassLogIn = true;
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
        if(activarPassLogIn){
            if(visiblePass){
                pfPass.setEchoChar('•');
                jLabel1.setIcon(new ImageIcon(getClass().getResource("/visible-eye.png")));
                visiblePass = false;
            }else{
                pfPass.setEchoChar((char)0);
                jLabel1.setIcon(new ImageIcon(getClass().getResource("/blind.png")));
                visiblePass = true;
            }
        }
    }//GEN-LAST:event_jLabel1MouseReleased

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        activarPassReg = false;
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        activarPassReg = true;
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseReleased
        if(activarPassReg){
            if(visiblePassReg){
                pfPassReg.setEchoChar('•');
                jLabel3.setIcon(new ImageIcon(getClass().getResource("/visible-eye.png")));
                visiblePassReg = false;
            }else{
                pfPassReg.setEchoChar((char)0);
                jLabel3.setIcon(new ImageIcon(getClass().getResource("/blind.png")));
                visiblePassReg = true;
            }
        }
    }//GEN-LAST:event_jLabel3MouseReleased

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        activarRepPass = false;
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        activarRepPass = true;
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        if(activarRepPass){
            if(visibleRepPass){
                pfRepPass.setEchoChar('•');
                jLabel2.setIcon(new ImageIcon(getClass().getResource("/visible-eye.png")));
                visibleRepPass = false;
            }else{
                pfRepPass.setEchoChar((char)0);
                jLabel2.setIcon(new ImageIcon(getClass().getResource("/blind.png")));
                visibleRepPass = true;
            }
        }
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        Font font = jLabel4.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        jLabel4.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        Font font = jLabel4.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, -1);
        jLabel4.setFont(font.deriveFont(attributes));
        activarOlvidarPass = false;
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        activarOlvidarPass = true;
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseReleased
        if(activarOlvidarPass){
            PasswordAuthentication pa = new PasswordAuthentication();
                        
            String user;
            boolean existe = false;
            ArrayList<Usuario> usuarios = cu.obtenerUsuarios();
            JTextField tf = new JTextField();
            int action = JOptionPane.showConfirmDialog(null, tf,"Introduzaca su nombre de usuario",JOptionPane.OK_CANCEL_OPTION);
            if(action < 0);
            else{
                user = tf.getText(); 
                for(int i = 0 ; i < usuarios.size() ; i++){
                    if(user.equals(usuarios.get(i).getUsuario()))
                        existe = true;            
                }
                if(existe){               
                    String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                        + "0123456789" + "abcdefghijklmnopqrstuvxyz";

                    StringBuilder sb = new StringBuilder(8);  
                    for (int i = 0; i < 8; i++) {
                        int index= (int)(AlphaNumericString.length()* Math.random());
                        sb.append(AlphaNumericString.charAt(index));
                    }

                    JOptionPane.showMessageDialog(this, "Su nueva contraseña es: " + sb.toString(),
                         "Valido", JOptionPane.PLAIN_MESSAGE);
                    Usuario u = cu.obtenerUsuario(user);
                    u.setContrasena(sb.toString()/*pa.hash(sb.toString())*/);
                    cu.modificarUsuario(u);                                                  
                }else{
                    JOptionPane.showMessageDialog(this, "El usuario no existe.", 
                                "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jLabel4MouseReleased

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setIcon(new ImageIcon(getClass().getResource("/close-button-red.png")));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        activarCerrar = false;
        close.setIcon(new ImageIcon(getClass().getResource("/close-button.png")));
    }//GEN-LAST:event_closeMouseExited

    private void closeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMousePressed
        activarCerrar = true;
    }//GEN-LAST:event_closeMousePressed

    private void closeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseReleased
        if(activarCerrar){
            Agente.closeConexion(conn);
            System.exit(0);
        }
    }//GEN-LAST:event_closeMouseReleased

    private boolean comprobarUsuario(String nombre, String pass){
        boolean existe = false;
        PasswordAuthentication pa = new PasswordAuthentication();
        ArrayList<Usuario> usuarios = cu.obtenerUsuarios();                       
        for(int i = 0 ; i < usuarios.size() ; i++){
            if(nombre.equals(usuarios.get(i).getUsuario()) && pass.equals(usuarios.get(i).getContrasena()) /*pa.authenticate(pass, usuarios.get(i).getContrasena())*/){
                existe = true;
            }
        }
        return existe;
    }   
    
    private void focus(JTextField tfgained, JTextField tflost){
        tfgained.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
        
        errorImgPass.setVisible(false);
        errorImgUser.setVisible(false);
        lblError.setVisible(false);
        lblWarningImg.setVisible(false);
        
        tflost.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
    }
    
    private void crearCargos(int idAsoc){
        Cargo cargo;
        cargo = new Cargo("Presidente", null, idAsoc);
        cjd.insertarCargo(cargo);
        cargo = new Cargo("Vicepresidente", null, idAsoc);
        cjd.insertarCargo(cargo);
        cargo = new Cargo("Tesorero", null, idAsoc);
        cjd.insertarCargo(cargo);
        cargo = new Cargo("Secretario", null, idAsoc);
        cjd.insertarCargo(cargo);
        cargo = new Cargo("Vocal1", null, idAsoc);
        cjd.insertarCargo(cargo);
        cargo = new Cargo("Vocal2", null, idAsoc);
        cjd.insertarCargo(cargo);
        
    }
    
    private boolean camposVacios(){
        boolean registro = true;
        if(tfUserReg.getText().replace(" ","").equals("")){
            registro = false;
            tfUserReg.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
            lblUserRegError.setText("Campo vacio");
            errorImgUserReg.setVisible(true);
        }
        if(pfPassReg.getText().equals("")){
            registro = false;
            pfPassReg.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
            lblPassRegError.setText("Campo vacio");
            errorImgPassReg.setVisible(true);
        }
        if(pfRepPass.getText().equals("")){
            registro = false;
            pfRepPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
            lblRepPassError.setText("Campo vacio");
            errorImgRepPass.setVisible(true);
        }
        if(tfNombreAsoc.getText().replace(" ","").equals("")){
            registro = false;
            tfNombreAsoc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
            lblNombreAsocError.setText("Campo vacio");
            errorImgNombreAsoc.setVisible(true);
        }
        return registro;
    }
    
    private boolean comprobarCampos(){
        boolean registro = true;
        
        ArrayList<Usuario> usuarios = cu.obtenerUsuarios();
        ArrayList<Asociacion> asociaciones = ca.obtenerAsociaciones();
        
        for(int i = 0 ; i < usuarios.size() ; i++){
            if(tfUserReg.getText().equals(usuarios.get(i).getUsuario())){
                registro = false;
                tfUserReg.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
                lblUserRegError.setText("El usuario ya existe");
                errorImgUserReg.setVisible(true);
            }
        }
        
        if(!pfPassReg.getText().equals(pfRepPass.getText())){
            registro = false;
            pfRepPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
            lblRepPassError.setText("Contraseñas diferentes");
            errorImgRepPass.setVisible(true);
        }
        
        for(int i = 0 ; i < asociaciones.size() ; i++){
            if(tfNombreAsoc.getText().equals(asociaciones.get(i).getNombre())){
                registro = false;
                tfNombreAsoc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
                lblNombreAsocError.setText("La asociacion ya existe");
                errorImgNombreAsoc.setVisible(true);
            }
        }
        
        return registro;
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
                    
                    /*Option Pane*/
                    UIManager.put("OptionPane.background", new ColorUIResource(51,51,51));
                    UIManager.put("Panel.background", new ColorUIResource(51,51,51));
                    UIManager.put("OptionPane.messageForeground", new ColorUIResource(255,255,255));                                         
                    
                    /*ToolTip*/
                    UIManager.put("ToolTip.background", new ColorUIResource(31,31,31));
                    UIManager.put("ToolTip.border", BorderFactory.createLineBorder(new java.awt.Color(204,0,204)));
                    UIManager.put("ToolTip.foreground", new ColorUIResource(255,255,255));
                    UIManager.put("ToolTip.font", new java.awt.Font("Console", 1, 12));
                    
                    /*Password Field*/
                    UIManager.put("PasswordField.background", new ColorUIResource(51,51,51));
                    UIManager.put("PasswordField.border", BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 0, 204)));
                    UIManager.put("PasswordField.foreground", new ColorUIResource(255,255,255));                                       
                    
                    /*Text Fied*/
                    UIManager.put("TextField.background", new ColorUIResource(51,51,51));
                    UIManager.put("TextField.border", BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 0, 204)));
                    UIManager.put("TextField.foreground", new ColorUIResource(255,255,255));  
                    UIManager.put("TextField.caretForeground", new ColorUIResource(204,0,204));  
                    
                    /*Table Header*/
                    UIManager.put("TableHeader.background", new ColorUIResource(51,51,51));
                    UIManager.put("TableHeader.foreground", new ColorUIResource(255,255,255));
                    UIManager.put("Viewport.background", new ColorUIResource(31,31,31));
                    
                }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){
                    e.printStackTrace();
                }                    
                new Login().setVisible(true);
            }
        });
    }
    
    private boolean activar;
    
    private int xx;
    private int xy;
    
    private final Connection conn;
    
    private final ControlAsociacion ca;
    private final ControlUsuarios cu;
    private final ControlJuntaDirectiva cjd;
    private final ControlMembresia cm;
    
    private boolean visiblePass = false;
    private boolean visiblePassReg = false;
    private boolean visibleRepPass = false;
    
    private boolean activarPassLogIn;
    private boolean activarPassReg;
    private boolean activarRepPass;
    private boolean activarOlvidarPass;
    private boolean activarCerrar;
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnInicioSesion;
    private javax.swing.JLabel close;
    private javax.swing.JLabel errorImgNombreAsoc;
    private javax.swing.JLabel errorImgPass;
    private javax.swing.JLabel errorImgPassReg;
    private javax.swing.JLabel errorImgRepPass;
    private javax.swing.JLabel errorImgUser;
    private javax.swing.JLabel errorImgUserReg;
    private javax.swing.JLabel infor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblInfor1;
    private javax.swing.JLabel lblInfor2;
    private javax.swing.JLabel lblInfor3;
    private javax.swing.JLabel lblInicioSesion;
    private javax.swing.JLabel lblNombreAsoc;
    private javax.swing.JLabel lblNombreAsocError;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPassReg;
    private javax.swing.JLabel lblPassRegError;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblRepPass;
    private javax.swing.JLabel lblRepPassError;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUserReg;
    private javax.swing.JLabel lblUserRegError;
    private javax.swing.JLabel lblWarningImg;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelIniciarSesion;
    private javax.swing.JPanel panelNorth;
    private javax.swing.JPanel panelRegistrarse;
    private javax.swing.JPanel panelSouth;
    private javax.swing.JPasswordField pfPass;
    private javax.swing.JPasswordField pfPassReg;
    private javax.swing.JPasswordField pfRepPass;
    private javax.swing.JSeparator separator;
    private javax.swing.JTextField tfNombreAsoc;
    private javax.swing.JTextField tfUser;
    private javax.swing.JTextField tfUserReg;
    // End of variables declaration//GEN-END:variables
}