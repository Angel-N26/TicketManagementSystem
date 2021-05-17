package presentacion;

import dominio.Asociacion;
import dominio.Colores;
import dominio.ControlAsociacion;
import java.awt.Color;
import java.sql.Date;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import dominio.RegularExpresions;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author angel
 **/
public class AsociacionPanel extends javax.swing.JPanel implements Colores, RegularExpresions {

    //private Connection con;
    
    public AsociacionPanel(Asociacion asociacion, EntradasPanel ep, Connection con) {
        this.asociacion = asociacion;
        this.ep = ep;
        
        ca = new ControlAsociacion(con);
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        panelLogo = new javax.swing.JPanel();
        edit = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        lblNombreLogo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        tfTipo = new javax.swing.JTextField();
        lblFechaCreacion = new javax.swing.JLabel();
        dcFechaCreacion = new com.toedter.calendar.JDateChooser();
        lblTlf = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfTlf = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfCorreo = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        lblCalle = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfCalle = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        lblPiso = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfPiso = new javax.swing.JTextField();
        lblCodPostal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfCodPostal = new javax.swing.JTextField();
        lblLocalidad = new javax.swing.JLabel();
        tfLocalidad = new javax.swing.JTextField();
        lblProvincia = new javax.swing.JLabel();
        cbProvincia = new javax.swing.JComboBox<>();
        lblDatosJuridicos = new javax.swing.JLabel();
        lblCIF = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfCIF = new javax.swing.JTextField();
        lblNReg = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfNReg = new javax.swing.JTextField();
        btnEditar = new keeptoo.KButton();

        panel.setBackground(new java.awt.Color(51, 51, 51));
        panel.setMinimumSize(new java.awt.Dimension(800, 520));
        panel.setName("panel"); // NOI18N
        panel.setPreferredSize(new java.awt.Dimension(800, 520));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogo.setBackground(new java.awt.Color(51, 51, 51));
        panelLogo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        panelLogo.setName("panelLogo"); // NOI18N
        panelLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        edit.setVisible(false);
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editar.png"))); // NOI18N
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit.setName("edit"); // NOI18N
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });
        panelLogo.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setName("logo"); // NOI18N
        panelLogo.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 184, 184));

        panel.add(panelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, 190));

        lblNombreLogo.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        lblNombreLogo.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreLogo.setName("lblNombreLogo"); // NOI18N
        panel.add(lblNombreLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 190, -1));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre*");
        lblNombre.setName("lblNombre"); // NOI18N
        panel.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 60, -1));

        jLabel1.setVisible(false);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/error.png"))); // NOI18N
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        tfNombre.setBackground(new java.awt.Color(51, 51, 51));
        tfNombre.setForeground(new java.awt.Color(255, 255, 255));
        tfNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfNombre.setCaretColor(new java.awt.Color(204, 0, 204));
        tfNombre.setDisabledTextColor(new java.awt.Color(80, 80, 80));
        tfNombre.setEnabled(false);
        tfNombre.setName("tfNombre"); // NOI18N
        tfNombre.setOpaque(false);
        tfNombre.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNombreFocusLost(evt);
            }
        });
        panel.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 260, 25));

        lblTipo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo.setText("Tipo");
        lblTipo.setName("lblTipo"); // NOI18N
        panel.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 240, -1));

        tfTipo.setBackground(new java.awt.Color(51, 51, 51));
        tfTipo.setForeground(new java.awt.Color(255, 255, 255));
        tfTipo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfTipo.setCaretColor(new java.awt.Color(204, 0, 204));
        tfTipo.setDisabledTextColor(new java.awt.Color(80, 80, 80));
        tfTipo.setEnabled(false);
        tfTipo.setName("tfTipo"); // NOI18N
        tfTipo.setOpaque(false);
        tfTipo.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfTipo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfTipoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfTipoFocusLost(evt);
            }
        });
        panel.add(tfTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 240, 25));

        lblFechaCreacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFechaCreacion.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaCreacion.setText("Fecha Creación Asociación");
        lblFechaCreacion.setName("lblFechaCreacion"); // NOI18N
        panel.add(lblFechaCreacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 210, -1));

        JTextFieldDateEditor dateChooserEditor1 = ((JTextFieldDateEditor)dcFechaCreacion.getDateEditor());
        dateChooserEditor1.setBackground(new Color(51, 51, 51));
        dateChooserEditor1.setForeground(new Color(255, 255, 255));
        dateChooserEditor1.setEditable(false);
        dateChooserEditor1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        dcFechaCreacion.getCalendarButton().setSize(25, 25);
        dcFechaCreacion.getCalendarButton().setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\calendario-white.png"));
        dcFechaCreacion.getCalendarButton().setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        dcFechaCreacion.getCalendarButton().setBackground(new Color(51,51,51));
        dcFechaCreacion.getCalendarButton().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dcFechaCreacion.getCalendarButton().setEnabled(false);
        dcFechaCreacion.setForeground(new java.awt.Color(255, 255, 255));
        dcFechaCreacion.setDateFormatString("yyy-MM-dd");
        dcFechaCreacion.setName("dcFechaCreacion"); // NOI18N
        panel.add(dcFechaCreacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 260, 25));

        lblTlf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTlf.setForeground(new java.awt.Color(255, 255, 255));
        lblTlf.setText("Teléfono");
        lblTlf.setName("lblTlf"); // NOI18N
        panel.add(lblTlf, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 240, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informacion-gray.png"))); // NOI18N
        jLabel2.setToolTipText("ej: 123456789");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, -1, -1));

        tfTlf.setBackground(new java.awt.Color(51, 51, 51));
        tfTlf.setForeground(new java.awt.Color(255, 255, 255));
        tfTlf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfTlf.setCaretColor(new java.awt.Color(204, 0, 204));
        tfTlf.setDisabledTextColor(new java.awt.Color(80, 80, 80));
        tfTlf.setEnabled(false);
        tfTlf.setName("tfTlf"); // NOI18N
        tfTlf.setOpaque(false);
        tfTlf.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfTlf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfTlfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfTlfFocusLost(evt);
            }
        });
        panel.add(tfTlf, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 240, 25));

        lblCorreo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("Email");
        lblCorreo.setName("lblCorreo"); // NOI18N
        panel.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 530, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informacion-gray.png"))); // NOI18N
        jLabel3.setToolTipText("ej: alguien@example.com/es");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, -1, -1));

        tfCorreo.setBackground(new java.awt.Color(51, 51, 51));
        tfCorreo.setForeground(new java.awt.Color(255, 255, 255));
        tfCorreo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfCorreo.setCaretColor(new java.awt.Color(204, 0, 204));
        tfCorreo.setDisabledTextColor(new java.awt.Color(80, 80, 80));
        tfCorreo.setEnabled(false);
        tfCorreo.setName("tfCorreo"); // NOI18N
        tfCorreo.setOpaque(false);
        tfCorreo.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCorreoFocusLost(evt);
            }
        });
        panel.add(tfCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 530, 25));

        lblDireccion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setText("Dirección");
        lblDireccion.setName("lblDireccion"); // NOI18N
        panel.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        lblCalle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCalle.setForeground(new java.awt.Color(255, 255, 255));
        lblCalle.setText("Calle");
        lblCalle.setName("lblCalle"); // NOI18N
        panel.add(lblCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 310, -1));

        jLabel10.setVisible(false);
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/error.png"))); // NOI18N
        panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        tfCalle.setBackground(new java.awt.Color(51, 51, 51));
        tfCalle.setForeground(new java.awt.Color(255, 255, 255));
        tfCalle.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfCalle.setCaretColor(new java.awt.Color(204, 0, 204));
        tfCalle.setDisabledTextColor(new java.awt.Color(80, 80, 80));
        tfCalle.setEnabled(false);
        tfCalle.setName("tfCalle"); // NOI18N
        tfCalle.setOpaque(false);
        tfCalle.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfCalle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCalleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCalleFocusLost(evt);
            }
        });
        panel.add(tfCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 310, 25));

        lblNumero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero.setText("Número");
        lblNumero.setName("lblNumero"); // NOI18N
        panel.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 50, -1));

        jLabel9.setVisible(false);
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/error.png"))); // NOI18N
        panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, -1));

        tfNumero.setBackground(new java.awt.Color(51, 51, 51));
        tfNumero.setForeground(new java.awt.Color(255, 255, 255));
        tfNumero.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfNumero.setCaretColor(new java.awt.Color(204, 0, 204));
        tfNumero.setDisabledTextColor(new java.awt.Color(80, 80, 80));
        tfNumero.setEnabled(false);
        tfNumero.setName("tfNumero"); // NOI18N
        tfNumero.setOpaque(false);
        tfNumero.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNumeroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNumeroFocusLost(evt);
            }
        });
        panel.add(tfNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 60, 25));

        lblPiso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPiso.setForeground(new java.awt.Color(255, 255, 255));
        lblPiso.setText("Piso y puerta");
        lblPiso.setName("lblPiso"); // NOI18N
        panel.add(lblPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 80, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informacion-gray.png"))); // NOI18N
        jLabel4.setToolTipText("ej: 6E");
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, -1, -1));

        tfPiso.setBackground(new java.awt.Color(51, 51, 51));
        tfPiso.setForeground(new java.awt.Color(255, 255, 255));
        tfPiso.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfPiso.setCaretColor(new java.awt.Color(204, 0, 204));
        tfPiso.setDisabledTextColor(new java.awt.Color(80, 80, 80));
        tfPiso.setEnabled(false);
        tfPiso.setName("tfPiso"); // NOI18N
        tfPiso.setOpaque(false);
        tfPiso.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfPiso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPisoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPisoFocusLost(evt);
            }
        });
        panel.add(tfPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 110, 25));

        lblCodPostal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCodPostal.setForeground(new java.awt.Color(255, 255, 255));
        lblCodPostal.setText("Código Postal");
        lblCodPostal.setName("lblCodPostal"); // NOI18N
        panel.add(lblCodPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 130, -1));

        jLabel6.setVisible(false);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/error.png"))); // NOI18N
        jLabel6.setToolTipText("");
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, -1, -1));

        tfCodPostal.setBackground(new java.awt.Color(51, 51, 51));
        tfCodPostal.setForeground(new java.awt.Color(255, 255, 255));
        tfCodPostal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfCodPostal.setCaretColor(new java.awt.Color(204, 0, 204));
        tfCodPostal.setDisabledTextColor(new java.awt.Color(80, 80, 80));
        tfCodPostal.setEnabled(false);
        tfCodPostal.setName("tfCodPostal"); // NOI18N
        tfCodPostal.setOpaque(false);
        tfCodPostal.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfCodPostal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCodPostalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCodPostalFocusLost(evt);
            }
        });
        panel.add(tfCodPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 130, 25));

        lblLocalidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLocalidad.setForeground(new java.awt.Color(255, 255, 255));
        lblLocalidad.setText("Localidad");
        lblLocalidad.setName("lblLocalidad"); // NOI18N
        panel.add(lblLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 310, -1));

        tfLocalidad.setBackground(new java.awt.Color(51, 51, 51));
        tfLocalidad.setForeground(new java.awt.Color(255, 255, 255));
        tfLocalidad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfLocalidad.setCaretColor(new java.awt.Color(204, 0, 204));
        tfLocalidad.setDisabledTextColor(new java.awt.Color(80, 80, 80));
        tfLocalidad.setEnabled(false);
        tfLocalidad.setName("tfLocalidad"); // NOI18N
        tfLocalidad.setNextFocusableComponent(cbProvincia);
        tfLocalidad.setOpaque(false);
        tfLocalidad.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfLocalidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfLocalidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfLocalidadFocusLost(evt);
            }
        });
        panel.add(tfLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 310, 25));

        lblProvincia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblProvincia.setForeground(new java.awt.Color(255, 255, 255));
        lblProvincia.setText("Provincia");
        lblProvincia.setName("lblProvincia"); // NOI18N
        panel.add(lblProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 215, -1));

        cbProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Álava", "Albacete", "Alicante", "Almeria", "Asturias", "Ávila", "Badajoz", "Barcelona", "Burgos", "Cáceres", "Cádiz", "Cantabria", "Castellón", "Ciudad Real", "Córdoba", "La Coruña", "Cuenca", "Gerona", "Granada", "Guadalajara", "Guipúzcua", "Huelva", "Huesca", "Baleares", "Jaén", "León", "Lérida", "Lugo", "Madrid", "Málaga", "Murcia", "Navarra", "Orense", "Palencia", "Las Palmas", "Pontevedra", "La Rioja", "Salamanca", "Segovia", "Sevilla", "Soria", "Tarragona", "Santa Cruz de Tenerife", "Teruel", "Toledo", "Valencia", "Valladolid", "Vizcaya", "Zamora", "Zaragoza" }));
        cbProvincia.setEnabled(false);
        cbProvincia.setName("cbProvincia"); // NOI18N
        cbProvincia.setNextFocusableComponent(tfCIF);
        panel.add(cbProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 215, 25));

        lblDatosJuridicos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDatosJuridicos.setForeground(new java.awt.Color(255, 255, 255));
        lblDatosJuridicos.setText("Datos Jurídicos");
        lblDatosJuridicos.setName("lblDatosJuridicos"); // NOI18N
        panel.add(lblDatosJuridicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        lblCIF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCIF.setForeground(new java.awt.Color(255, 255, 255));
        lblCIF.setText("C.I.F");
        lblCIF.setName("lblCIF"); // NOI18N
        panel.add(lblCIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 70, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informacion-gray.png"))); // NOI18N
        jLabel7.setToolTipText("ej: G12345678");
        panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, -1, -1));

        tfCIF.setBackground(new java.awt.Color(51, 51, 51));
        tfCIF.setForeground(new java.awt.Color(255, 255, 255));
        tfCIF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfCIF.setCaretColor(new java.awt.Color(204, 0, 204));
        tfCIF.setDisabledTextColor(new java.awt.Color(80, 80, 80));
        tfCIF.setEnabled(false);
        tfCIF.setName("tfCIF"); // NOI18N
        tfCIF.setOpaque(false);
        tfCIF.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfCIF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCIFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCIFFocusLost(evt);
            }
        });
        panel.add(tfCIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 210, 25));

        lblNReg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNReg.setForeground(new java.awt.Color(255, 255, 255));
        lblNReg.setText("Nº Registro");
        lblNReg.setName("lblNReg"); // NOI18N
        panel.add(lblNReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 210, -1));

        jLabel8.setVisible(false);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/error.png"))); // NOI18N
        panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, -1, -1));

        tfNReg.setBackground(new java.awt.Color(51, 51, 51));
        tfNReg.setForeground(new java.awt.Color(255, 255, 255));
        tfNReg.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfNReg.setCaretColor(new java.awt.Color(204, 0, 204));
        tfNReg.setDisabledTextColor(new java.awt.Color(80, 80, 80));
        tfNReg.setEnabled(false);
        tfNReg.setName("tfNReg"); // NOI18N
        tfNReg.setOpaque(false);
        tfNReg.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfNReg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNRegFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNRegFocusLost(evt);
            }
        });
        panel.add(tfNReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 210, 25));

        btnEditar.setBorder(null);
        btnEditar.setText("Editar");
        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEditar.setkBorderRadius(20);
        btnEditar.setkEndColor(new java.awt.Color(51, 0, 51));
        btnEditar.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        btnEditar.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnEditar.setkHoverStartColor(new java.awt.Color(51, 0, 51));
        btnEditar.setkPressedColor(new java.awt.Color(255, 153, 204));
        btnEditar.setkStartColor(new java.awt.Color(204, 0, 204));
        btnEditar.setName("btnEditar"); // NOI18N
        btnEditar.setNextFocusableComponent(tfNombre);
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEditarMouseReleased(evt);
            }
        });
        panel.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusGained
        tfNombre.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
        jLabel1.setVisible(false);
        nombreVal = true;
    }//GEN-LAST:event_tfNombreFocusGained

    private void tfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusLost
        tfNombre.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
        if(tfNombre.getText().replace(" ","").equals("") || !comprobarNombre(tfNombre.getText())){
            tfNombre.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
            jLabel1.setVisible(true);
            nombreVal = false;
        }
    }//GEN-LAST:event_tfNombreFocusLost

    private boolean comprobarNombre(String nombre){
        boolean comprobar = true;
        ArrayList<Asociacion> asocs = obtenerAsociaciones();
        
        for(int i = 0 ; i < asocs.size() ; i++){
            if(!asociacion.getNombre().equals(asocs.get(i).getNombre()))
                if(nombre.equals(asocs.get(i).getNombre())){
                    comprobar = false;
                }            
        }        
        
        return comprobar;
    }
    
    private void tfTlfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTlfFocusGained
        tfTlf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/informacion.png")));
        tlfVal = true;
    }//GEN-LAST:event_tfTlfFocusGained

    private void tfTlfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTlfFocusLost
        tfTlf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
        Matcher matcher = TLF.matcher(tfTlf.getText());
        if(!matcher.matches() || !comprobarTlf(Integer.parseInt(tfTlf.getText()))){
            tfTlf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
            jLabel2.setIcon(new ImageIcon(getClass().getResource("/error.png")));
            tlfVal = false;
        }
    }//GEN-LAST:event_tfTlfFocusLost

    private boolean comprobarTlf(int tlf){
        boolean comprobar = true;
        ArrayList<Asociacion> asocs = obtenerAsociaciones();

        for(int i = 0 ; i < asocs.size() ; i++){
            if(!asociacion.getNombre().equals(asocs.get(i).getNombre()))
                if(tlf == asocs.get(i).getTelefono()){
                    comprobar = false;
                }            
        }
        
        return comprobar;
    }
    
    private void tfCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCorreoFocusGained
        tfCorreo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/informacion.png")));
        emailVal = true;        
    }//GEN-LAST:event_tfCorreoFocusGained

    private void tfCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCorreoFocusLost
        tfCorreo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
        Matcher matcher = EMAIL.matcher(tfCorreo.getText());
        if(!matcher.matches() || !comprobarEmail(tfCorreo.getText())){
            tfCorreo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
            jLabel3.setIcon(new ImageIcon(getClass().getResource("/error.png")));
            emailVal = false;
        }
    }//GEN-LAST:event_tfCorreoFocusLost

    private boolean comprobarEmail(String email){
        boolean comprobar = true;
        ArrayList<Asociacion> asocs = obtenerAsociaciones();
        
        for(int i = 0 ; i < asocs.size() ; i++){
            if(!asociacion.getNombre().equals(asocs.get(i).getNombre()))
            if(email.equals(asocs.get(i).getEmail())){
                comprobar = false;
            }
        }
        
        return comprobar;
    }
    
    private void tfCalleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCalleFocusGained
        tfCalle.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));            
        jLabel10.setVisible(false);
        calleVal = true;        
    }//GEN-LAST:event_tfCalleFocusGained

    private void tfCalleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCalleFocusLost
        tfCalle.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
    }//GEN-LAST:event_tfCalleFocusLost

    private void tfLocalidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLocalidadFocusGained
        tfLocalidad.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
    }//GEN-LAST:event_tfLocalidadFocusGained

    private void tfLocalidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLocalidadFocusLost
        tfLocalidad.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
    }//GEN-LAST:event_tfLocalidadFocusLost

    private void tfCIFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCIFFocusGained
        tfCIF.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/informacion.png")));
        cifVal = true;                
    }//GEN-LAST:event_tfCIFFocusGained

    private void tfCIFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCIFFocusLost
        tfCIF.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
        Matcher matcher = CIF.matcher(tfCIF.getText());
        if(!matcher.matches() || !comprobarCIF(tfCIF.getText())){
            tfCIF.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
            jLabel7.setIcon(new ImageIcon(getClass().getResource("/error.png")));
            cifVal = false;
        }
    }//GEN-LAST:event_tfCIFFocusLost

    private boolean comprobarCIF(String cif){
        boolean comprobar = true;
        ArrayList<Asociacion> asocs = obtenerAsociaciones();
        
        for(int i = 0 ; i < asocs.size() ; i++){
            if(!asociacion.getNombre().equals(asocs.get(i).getNombre()))
            if(cif.equals(asocs.get(i).getCIF())){
                comprobar = false;
            }
        }        
        
        return comprobar;
    }
    
    private void tfNRegFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNRegFocusGained
        tfNReg.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
        jLabel8.setVisible(false);
        nRegVal = true;        
    }//GEN-LAST:event_tfNRegFocusGained

    private void tfNRegFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNRegFocusLost
        tfNReg.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
        Matcher matcher = NUMERO.matcher(tfNReg.getText());
        if(!matcher.matches() || !comprobarNReg(Integer.parseInt(tfNReg.getText()))){
            tfNReg.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
            jLabel8.setVisible(true);
            nRegVal = false;
        }
    }//GEN-LAST:event_tfNRegFocusLost

    private boolean comprobarNReg(int nReg){
        boolean comprobar = true;
        ArrayList<Asociacion> asocs = obtenerAsociaciones();
        
        for(int i = 0 ; i < asocs.size() ; i++){
            if(!asociacion.getNombre().equals(asocs.get(i).getNombre()))
                if(nReg == asocs.get(i).getnRegistro()){
                    comprobar = false;
                }
        }
        
        return comprobar;
    }
    
    private void tfTipoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTipoFocusGained
        tfTipo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
    }//GEN-LAST:event_tfTipoFocusGained

    private void tfTipoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTipoFocusLost
        tfTipo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
    }//GEN-LAST:event_tfTipoFocusLost

    private void tfNumeroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNumeroFocusGained
        tfNumero.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));            
        jLabel9.setVisible(false);
        numVal = true;         
    }//GEN-LAST:event_tfNumeroFocusGained

    private void tfNumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNumeroFocusLost
        tfNumero.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
        Matcher matcher = NUMERO.matcher(tfNumero.getText());
        if(!matcher.matches() && !tfNumero.getText().equals("")){
            tfNumero.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));            
            jLabel9.setVisible(true);
            numVal = false;
        }
    }//GEN-LAST:event_tfNumeroFocusLost

    private void tfPisoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPisoFocusGained
        tfPiso.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/informacion.png")));
        pisoVal = true;         
    }//GEN-LAST:event_tfPisoFocusGained

    private void tfPisoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPisoFocusLost
        tfPiso.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
        Matcher matcher = PISO.matcher(tfPiso.getText());
        if(!matcher.matches() && !tfPiso.getText().equals("")){
            tfPiso.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
            jLabel4.setIcon(new ImageIcon(getClass().getResource("/error.png")));
            pisoVal = false;
        }
    }//GEN-LAST:event_tfPisoFocusLost

    private void tfCodPostalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCodPostalFocusGained
        tfCodPostal.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
        codPosVal = true;
        jLabel6.setVisible(false);
    }//GEN-LAST:event_tfCodPostalFocusGained

    private void tfCodPostalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCodPostalFocusLost
        tfCodPostal.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
        Matcher matcher = CCPP.matcher(tfCodPostal.getText());
        if(!matcher.matches() && !tfCodPostal.getText().equals("")){
            tfCodPostal.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
            codPosVal = false;
            jLabel6.setVisible(true);
        }
    }//GEN-LAST:event_tfCodPostalFocusLost

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images","jpg","png");
        fc.setFileFilter(filter);
        
        int seleccion = fc.showOpenDialog(this);
        if(seleccion == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile();
            try{
                String extension = Files.probeContentType(file.toPath());
                if(extension != null){
                    logo.setIcon(new ImageIcon(file.getAbsolutePath()));
                }else{
                    JOptionPane.showMessageDialog(this,
                        "No se ha seleccionado una extensión de archivos válida."
                        , "Error", JOptionPane.ERROR_MESSAGE);   
                }              
            }
            catch (IOException ioException){
                System.out.println("Error: " + ioException.getMessage());
            }
        }
    }//GEN-LAST:event_editMouseClicked

    private void btnEditarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseReleased
        String imageDisabled = "/informacion-gray.png";
        String imageEnabled = "/informacion.png";
        if(activar){
            JTextFieldDateEditor dcEditor2 = ((JTextFieldDateEditor)dcFechaCreacion.getDateEditor());               
            Date fechaCreacion = null;
            if(!dcEditor2.getText().equals(""))
                fechaCreacion = Date.valueOf(dcEditor2.getText());

            int tlf = 0, nReg = 0;
            if(!tfTlf.getText().replace(" ", "").equals(""))
                tlf = Integer.parseInt(tfTlf.getText());
            if(!tfNReg.getText().replace(" ", "").equals(""))
                nReg = Integer.parseInt(tfNReg.getText());
            
            String filePath = logo.getIcon().toString();
            if(filePath.contains("file:/")){
                filePath = "";
            }
            

            if(btnEditar.getText().equals("Editar")){
                editable(true, imageEnabled);
                btnEditar.setText("Guardar");
            }else{
                if(valido()){
                    //ControlAsociacion ca = new ControlAsociacion();
                    Asociacion asoc = new Asociacion(asociacion.getId(), tfNombre.getText(),tfTipo.getText(),
                        fechaCreacion, tlf, tfCorreo.getText(), direccion(),
                        tfCIF.getText(), nReg, filePath);
                    if(ca.modificarAsociacion(asoc, asociacion.getId())){
                        editable(false, imageDisabled);
                        btnEditar.setText("Editar");
                        lblNombreLogo.setText(tfNombre.getText());
                        asociacion = asoc;
                        
                        ep.setAsociacion(asociacion);
                    }else{
                        JOptionPane.showMessageDialog(this, 
                            "No se ha podido actualizar la asoicación", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnEditarMouseReleased

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        activar = false;
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMousePressed
        activar = true;
    }//GEN-LAST:event_btnEditarMousePressed
    
    public void rellenarCampos(){
        tfNombre.setText(asociacion.getNombre());
        lblNombreLogo.setText(asociacion.getNombre());
        tfTipo.setText(asociacion.getTipo());
        dcFechaCreacion.setDate(asociacion.getFecha());
        if(asociacion.getTelefono() != 0)
            tfTlf.setText(asociacion.getTelefono()+"");
        tfCorreo.setText(asociacion.getEmail());
        separarDireccion(asociacion.getDireccion());
        tfCIF.setText(asociacion.getCIF());
        if(asociacion.getnRegistro() != 0)
            tfNReg.setText(asociacion.getnRegistro()+"");
        if(!asociacion.getRutaLogo().equals("")){
            try{
                logo.setIcon(new ImageIcon(getClass().getResource(asociacion.getRutaLogo())));
            }catch(Exception e){
                logo.setIcon(new ImageIcon(asociacion.getRutaLogo()));
            }
            
        }else{
            logo.setIcon(new ImageIcon(getClass().getResource("/asociacion.png")));
        }  
    }
    
    public void editable(boolean b, String image){
        tfNombre.setEnabled(b);        
        tfTipo.setEnabled(b);        
        dcFechaCreacion.getCalendarButton().setEnabled(b);
        dcFechaCreacion.setForeground(new Color(255,255,255));
        tfTlf.setEnabled(b);        
        tfCorreo.setEnabled(b);                
        tfCalle.setEnabled(b);        
        tfNumero.setEnabled(b);        
        tfPiso.setEnabled(b);          
        tfCodPostal.setEnabled(b);        
        tfLocalidad.setEnabled(b);        
        cbProvincia.setEnabled(b);        
        tfCIF.setEnabled(b);        
        tfNReg.setEnabled(b);        
        
        edit.setVisible(b);
        
        jLabel2.setIcon(new ImageIcon(image));
        jLabel3.setIcon(new ImageIcon(image));
        jLabel4.setIcon(new ImageIcon(image));
        jLabel7.setIcon(new ImageIcon(image));
    }
    
    private String direccion(){
        String direccion;
        if(tfPiso.getText().equals("")){
            direccion =  "C/" + tfCalle.getText() + ", " + tfNumero.getText() +
                ", " + tfCodPostal.getText() + ", " + tfLocalidad.getText() +
                ", " + cbProvincia.getSelectedItem();
            
        }else{
            direccion =  "C/" + tfCalle.getText() + ", " + tfNumero.getText() +
                ", " + tfPiso.getText() + ", " + tfCodPostal.getText() + ", " +
                tfLocalidad.getText() + ", " + cbProvincia.getSelectedItem();
        }
        return direccion;
    }
    
    private void separarDireccion(String dir){
        if(dir != null){
            String [] d = dir.split("/"); //Separar la C/
            String [] c = d[1].split(","); //Separar cada apartado
            tfCalle.setText(c[0]);
            tfNumero.setText(c[1].replaceFirst(" ", ""));
            if(c.length == 6){            
                tfPiso.setText(c[2].replaceFirst(" ", ""));
                tfCodPostal.setText(c[3].replaceFirst(" ", ""));
                tfLocalidad.setText(c[4].replaceFirst(" ", ""));
                cbProvincia.setSelectedItem(c[5].replaceFirst(" ", ""));
            }else{
                tfCodPostal.setText(c[2].replaceFirst(" ", ""));
                tfLocalidad.setText(c[3].replaceFirst(" ", ""));
                cbProvincia.setSelectedItem(c[4].replaceFirst(" ", ""));
            }
        }
    }
    
    private ArrayList<Asociacion> obtenerAsociaciones(){
        //ControlAsociacion ca = new ControlAsociacion();
        return ca.obtenerAsociaciones();
    }       
    
    private boolean comprobarDireccion(){
        boolean comprobar = true;
        
        if((!tfNumero.getText().equals("") || !tfCodPostal.getText().equals("") || !tfPiso.getText().equals("")) 
                && tfCalle.getText().replace(" ","").equals("")){
            tfCalle.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
            jLabel10.setVisible(true);
            calleVal = false;
            comprobar = false;
        }
        
        return comprobar;
    }
    
    private boolean valido(){
        boolean valido = false;
        
        if(nombreVal && tlfVal && emailVal && cifVal && nRegVal && calleVal && numVal &&
                pisoVal && codPosVal && comprobarDireccion()){
            valido = true;
        }
        
        return valido;
    }

    private Asociacion asociacion;
    private ControlAsociacion ca;
    
    private EntradasPanel ep;
    
    private boolean nombreVal = true;
    private boolean tlfVal = true;
    private boolean emailVal = true;
    private boolean cifVal = true;
    private boolean nRegVal = true;
    private boolean calleVal = true;
    private boolean numVal = true;
    private boolean pisoVal = true;
    private boolean codPosVal = true;
    
    private boolean activar;
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnEditar;
    private javax.swing.JComboBox<String> cbProvincia;
    private com.toedter.calendar.JDateChooser dcFechaCreacion;
    private javax.swing.JLabel edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCIF;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblCodPostal;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDatosJuridicos;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFechaCreacion;
    private javax.swing.JLabel lblLocalidad;
    private javax.swing.JLabel lblNReg;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreLogo;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPiso;
    private javax.swing.JLabel lblProvincia;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTlf;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JTextField tfCIF;
    private javax.swing.JTextField tfCalle;
    private javax.swing.JTextField tfCodPostal;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfLocalidad;
    private javax.swing.JTextField tfNReg;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfPiso;
    private javax.swing.JTextField tfTipo;
    private javax.swing.JTextField tfTlf;
    // End of variables declaration//GEN-END:variables
}