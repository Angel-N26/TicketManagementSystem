package presentacion;

import com.toedter.calendar.JTextFieldDateEditor;
import dominio.Asociacion;
import dominio.ControlMembresia;
import dominio.ControlSocio;
import dominio.Membresia;
import dominio.Socio;
import java.awt.CardLayout;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author angel
 **/
public class EditSocioPanel extends javax.swing.JPanel {

    public EditSocioPanel(Asociacion asociacion) {
        this.asociacion = asociacion;
        
        initComponents();
        this.cs = new ControlSocio();
        btnEliminar.setVisible(false);
    }

    public EditSocioPanel(Socio soc, Asociacion asociacion){
        this.asociacion = asociacion;
        this.socio = soc;
        initComponents();
        this.cs = new ControlSocio();      
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        panelCenter = new javax.swing.JPanel();
        panelImg = new javax.swing.JPanel();
        edit = new javax.swing.JLabel();
        fotoSocio = new javax.swing.JLabel();
        lblDatosPersonales = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        tfApellidos = new javax.swing.JTextField();
        lblFechaNacimiento = new javax.swing.JLabel();
        dcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        lblDNI = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfDNI = new javax.swing.JTextField();
        lblDatosContacto = new javax.swing.JLabel();
        lblTlf = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfTlf = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lblCalle = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfCalle = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        lblPiso = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfPiso = new javax.swing.JTextField();
        lblCodPostal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfCodPostal = new javax.swing.JTextField();
        lblLocalidad = new javax.swing.JLabel();
        tfLocalidad = new javax.swing.JTextField();
        lblProvincia = new javax.swing.JLabel();
        cbProvincia = new javax.swing.JComboBox<>();
        lblDireccion = new javax.swing.JLabel();
        lblFechaIngreso = new javax.swing.JLabel();
        dcFechaIngreso = new com.toedter.calendar.JDateChooser();
        lblMembresia = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbMembresias = new javax.swing.JComboBox<>();
        cbPagos = new javax.swing.JCheckBox();
        panelSouth = new javax.swing.JPanel();
        panelSouthLeft = new javax.swing.JPanel();
        btnEliminar = new keeptoo.KButton();
        panelSouthRight = new javax.swing.JPanel();
        btnCancelar = new keeptoo.KButton();
        btnAnadir = new keeptoo.KButton();

        panel.setName("panel"); // NOI18N
        panel.setLayout(new java.awt.BorderLayout());

        panelCenter.setBackground(new java.awt.Color(51, 51, 51));
        panelCenter.setMinimumSize(new java.awt.Dimension(780, 445));
        panelCenter.setName("panelCenter"); // NOI18N
        panelCenter.setPreferredSize(new java.awt.Dimension(780, 445));
        panelCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelImg.setBackground(new java.awt.Color(51, 51, 51));
        panelImg.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        panelImg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        edit.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\editar.png")); // NOI18N
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit.setName("edit"); // NOI18N
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });
        panelImg.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        fotoSocio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotoSocio.setName("fotoSocio"); // NOI18N
        panelImg.add(fotoSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 184, 184));

        panelCenter.add(panelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, 190));

        lblDatosPersonales.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDatosPersonales.setForeground(new java.awt.Color(255, 255, 255));
        lblDatosPersonales.setText("Datos Personales");
        lblDatosPersonales.setFocusable(false);
        lblDatosPersonales.setName("lblDatosPersonales"); // NOI18N
        panelCenter.add(lblDatosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre*");
        lblNombre.setFocusable(false);
        lblNombre.setName("lblNombre"); // NOI18N
        panelCenter.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        jLabel1.setVisible(false);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\error.png")); // NOI18N
        panelCenter.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));

        tfNombre.setBackground(new java.awt.Color(51, 51, 51));
        tfNombre.setForeground(new java.awt.Color(255, 255, 255));
        tfNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfNombre.setCaretColor(new java.awt.Color(204, 0, 204));
        tfNombre.setName("tfNombre"); // NOI18N
        tfNombre.setNextFocusableComponent(tfApellidos);
        tfNombre.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNombreFocusLost(evt);
            }
        });
        panelCenter.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 260, 25));

        lblApellidos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidos.setText("Apellidos");
        lblApellidos.setFocusable(false);
        lblApellidos.setName("lblApellidos"); // NOI18N
        panelCenter.add(lblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, -1));

        tfApellidos.setBackground(new java.awt.Color(51, 51, 51));
        tfApellidos.setForeground(new java.awt.Color(255, 255, 255));
        tfApellidos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfApellidos.setCaretColor(new java.awt.Color(204, 0, 204));
        tfApellidos.setName("tfApellidos"); // NOI18N
        tfApellidos.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfApellidosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfApellidosFocusLost(evt);
            }
        });
        panelCenter.add(tfApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 270, 25));

        lblFechaNacimiento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaNacimiento.setText("Fecha Nacimiento");
        lblFechaNacimiento.setFocusable(false);
        lblFechaNacimiento.setName("lblFechaNacimiento"); // NOI18N
        panelCenter.add(lblFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        JTextFieldDateEditor dateChooserEditor1 = ((JTextFieldDateEditor)dcFechaNacimiento.getDateEditor());
        dateChooserEditor1.setBackground(new Color(51, 51, 51));
        dateChooserEditor1.setForeground(new Color(255, 255, 255));
        dateChooserEditor1.setEditable(false);
        dateChooserEditor1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        dcFechaNacimiento.getCalendarButton().setSize(25, 25);
        dcFechaNacimiento.getCalendarButton().setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\calendario-white.png"));
        dcFechaNacimiento.getCalendarButton().setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        dcFechaNacimiento.getCalendarButton().setBackground(new Color(51,51,51));
        dcFechaNacimiento.getCalendarButton().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dcFechaNacimiento.setBackground(new java.awt.Color(51, 51, 51));
        dcFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        dcFechaNacimiento.setDateFormatString("yyyy-MM-dd");
        dcFechaNacimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dcFechaNacimientoMouseClicked(evt);
            }
        });
        panelCenter.add(dcFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 260, 25));

        lblDNI.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDNI.setForeground(new java.awt.Color(255, 255, 255));
        lblDNI.setText("DNI*");
        lblDNI.setFocusable(false);
        lblDNI.setName("lblDNI"); // NOI18N
        panelCenter.add(lblDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        jLabel2.setVisible(false);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\informacion.png")); // NOI18N
        jLabel2.setToolTipText("ej: 66666666A");
        panelCenter.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, -1, -1));

        tfDNI.setBackground(new java.awt.Color(51, 51, 51));
        tfDNI.setForeground(new java.awt.Color(255, 255, 255));
        tfDNI.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfDNI.setCaretColor(new java.awt.Color(204, 0, 204));
        tfDNI.setName("tfDNI"); // NOI18N
        tfDNI.setNextFocusableComponent(tfTlf);
        tfDNI.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfDNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDNIFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDNIFocusLost(evt);
            }
        });
        panelCenter.add(tfDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 270, 25));

        lblDatosContacto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDatosContacto.setForeground(new java.awt.Color(255, 255, 255));
        lblDatosContacto.setText("Datos de Contacto");
        lblDatosContacto.setFocusable(false);
        lblDatosContacto.setName("lblDatosContacto"); // NOI18N
        panelCenter.add(lblDatosContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        lblTlf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTlf.setForeground(new java.awt.Color(255, 255, 255));
        lblTlf.setText("Teléfono");
        lblTlf.setFocusable(false);
        lblTlf.setName("lblTlf"); // NOI18N
        panelCenter.add(lblTlf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\informacion.png")); // NOI18N
        jLabel3.setToolTipText("ej: 666666666");
        panelCenter.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        tfTlf.setBackground(new java.awt.Color(51, 51, 51));
        tfTlf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfTlf.setForeground(new java.awt.Color(255, 255, 255));
        tfTlf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        tfTlf.setCaretColor(new java.awt.Color(204, 0, 204));
        tfTlf.setName("tfTlf"); // NOI18N
        tfTlf.setNextFocusableComponent(tfEmail);
        tfTlf.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfTlf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfTlfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfTlfFocusLost(evt);
            }
        });
        panelCenter.add(tfTlf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 220, 25));

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");
        lblEmail.setFocusable(false);
        lblEmail.setName("lblEmail"); // NOI18N
        panelCenter.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\informacion.png")); // NOI18N
        jLabel4.setToolTipText("ej: alguien@example.com/es");
        panelCenter.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, -1, -1));

        tfEmail.setBackground(new java.awt.Color(51, 51, 51));
        tfEmail.setForeground(new java.awt.Color(255, 255, 255));
        tfEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfEmail.setCaretColor(new java.awt.Color(204, 0, 204));
        tfEmail.setName("tfEmail"); // NOI18N
        tfEmail.setNextFocusableComponent(tfCalle);
        tfEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfEmailFocusLost(evt);
            }
        });
        panelCenter.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 520, 25));

        lblCalle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCalle.setForeground(new java.awt.Color(255, 255, 255));
        lblCalle.setText("Calle");
        lblCalle.setFocusable(false);
        lblCalle.setName("lblCalle"); // NOI18N
        panelCenter.add(lblCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel6.setVisible(false);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\error.png")); // NOI18N
        panelCenter.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        tfCalle.setBackground(new java.awt.Color(51, 51, 51));
        tfCalle.setForeground(new java.awt.Color(255, 255, 255));
        tfCalle.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfCalle.setCaretColor(new java.awt.Color(204, 0, 204));
        tfCalle.setName("tfCalle"); // NOI18N
        tfCalle.setNextFocusableComponent(tfNumero);
        tfCalle.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfCalle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCalleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCalleFocusLost(evt);
            }
        });
        panelCenter.add(tfCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, 25));

        lblNumero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero.setText("Número");
        lblNumero.setFocusable(false);
        lblNumero.setName("lblNumero"); // NOI18N
        panelCenter.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        jLabel9.setVisible(false);
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\error.png")); // NOI18N
        panelCenter.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        tfNumero.setBackground(new java.awt.Color(51, 51, 51));
        tfNumero.setForeground(new java.awt.Color(255, 255, 255));
        tfNumero.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfNumero.setCaretColor(new java.awt.Color(204, 0, 204));
        tfNumero.setName("tfNumero"); // NOI18N
        tfNumero.setNextFocusableComponent(tfPiso);
        tfNumero.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNumeroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNumeroFocusLost(evt);
            }
        });
        panelCenter.add(tfNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 50, 25));

        lblPiso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPiso.setForeground(new java.awt.Color(255, 255, 255));
        lblPiso.setText("Piso y puerta");
        lblPiso.setFocusable(false);
        lblPiso.setName("lblPiso"); // NOI18N
        panelCenter.add(lblPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\informacion.png")); // NOI18N
        jLabel8.setToolTipText("ej: 6E");
        panelCenter.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        tfPiso.setBackground(new java.awt.Color(51, 51, 51));
        tfPiso.setForeground(new java.awt.Color(255, 255, 255));
        tfPiso.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfPiso.setCaretColor(new java.awt.Color(204, 0, 204));
        tfPiso.setName("tfPiso"); // NOI18N
        tfPiso.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfPiso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPisoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPisoFocusLost(evt);
            }
        });
        panelCenter.add(tfPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 90, 25));

        lblCodPostal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCodPostal.setForeground(new java.awt.Color(255, 255, 255));
        lblCodPostal.setText("Código Postal");
        lblCodPostal.setFocusable(false);
        lblCodPostal.setName("lblCodPostal"); // NOI18N
        panelCenter.add(lblCodPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));

        jLabel7.setVisible(false);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\error.png")); // NOI18N
        panelCenter.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, -1));

        tfCodPostal.setBackground(new java.awt.Color(51, 51, 51));
        tfCodPostal.setForeground(new java.awt.Color(255, 255, 255));
        tfCodPostal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfCodPostal.setCaretColor(new java.awt.Color(204, 0, 204));
        tfCodPostal.setName("tfCodPostal"); // NOI18N
        tfCodPostal.setNextFocusableComponent(tfLocalidad);
        tfCodPostal.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfCodPostal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCodPostalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCodPostalFocusLost(evt);
            }
        });
        panelCenter.add(tfCodPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 100, 25));

        lblLocalidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLocalidad.setForeground(new java.awt.Color(255, 255, 255));
        lblLocalidad.setText("Localidad");
        lblLocalidad.setFocusable(false);
        lblLocalidad.setName("lblLocalidad"); // NOI18N
        panelCenter.add(lblLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, -1, -1));

        tfLocalidad.setBackground(new java.awt.Color(51, 51, 51));
        tfLocalidad.setForeground(new java.awt.Color(255, 255, 255));
        tfLocalidad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfLocalidad.setCaretColor(new java.awt.Color(204, 0, 204));
        tfLocalidad.setName("tfLocalidad"); // NOI18N
        tfLocalidad.setNextFocusableComponent(cbProvincia);
        tfLocalidad.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfLocalidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfLocalidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfLocalidadFocusLost(evt);
            }
        });
        panelCenter.add(tfLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 170, 25));

        lblProvincia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblProvincia.setForeground(new java.awt.Color(255, 255, 255));
        lblProvincia.setText("Provincia");
        lblProvincia.setFocusable(false);
        lblProvincia.setName("lblProvincia"); // NOI18N
        panelCenter.add(lblProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, -1, -1));

        cbProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Álava", "Albacete", "Alicante", "Almeria", "Asturias", "Ávila", "Badajoz", "Barcelona", "Burgos", "Cáceres", "Cádiz", "Cantabria", "Castellón", "Ciudad Real", "Córdoba", "La Coruña", "Cuenca", "Gerona", "Granada", "Guadalajara", "Guipúzcua", "Huelva", "Huesca", "Baleares", "Jaén", "León", "Lérida", "Lugo", "Madrid", "Málaga", "Murcia", "Navarra", "Orense", "Palencia", "Las Palmas", "Pontevedra", "La Rioja", "Salamanca", "Segovia", "Sevilla", "Soria", "Tarragona", "Santa Cruz de Tenerife", "Teruel", "Toledo", "Valencia", "Valladolid", "Vizcaya", "Zamora", "Zaragoza" }));
        cbProvincia.setName("cbProvincia"); // NOI18N
        panelCenter.add(cbProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 130, 25));

        lblDireccion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setText("Datos Asociación");
        lblDireccion.setFocusable(false);
        lblDireccion.setName("lblDireccion"); // NOI18N
        panelCenter.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        lblFechaIngreso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFechaIngreso.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaIngreso.setText("Fecha de Ingreso");
        lblFechaIngreso.setFocusable(false);
        lblFechaIngreso.setName("lblFechaIngreso"); // NOI18N
        panelCenter.add(lblFechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        JTextFieldDateEditor dateChooserEditor2 = ((JTextFieldDateEditor)dcFechaIngreso.getDateEditor());
        dateChooserEditor2.setBackground(new Color(51, 51, 51));
        dateChooserEditor2.setForeground(new Color(255, 255, 255));
        dateChooserEditor2.setEditable(false);
        dateChooserEditor2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        dcFechaIngreso.getCalendarButton().setSize(25, 25);
        dcFechaIngreso.getCalendarButton().setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\calendario-white.png"));
        dcFechaIngreso.getCalendarButton().setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        dcFechaIngreso.getCalendarButton().setBackground(new Color(51,51,51));
        dcFechaIngreso.getCalendarButton().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dcFechaIngreso.setDateFormatString("yyyy-MM-dd");
        dcFechaIngreso.setName("dcFechaIngreso"); // NOI18N
        panelCenter.add(dcFechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 260, 25));

        lblMembresia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMembresia.setForeground(new java.awt.Color(255, 255, 255));
        lblMembresia.setText("Membresia");
        lblMembresia.setFocusable(false);
        lblMembresia.setName("lblMembresia"); // NOI18N
        panelCenter.add(lblMembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, -1));

        jLabel5.setVisible(false);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\error.png")); // NOI18N
        panelCenter.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, -1));

        rellenarMembresias();
        cbMembresias.setName("cbMembresias"); // NOI18N
        cbMembresias.setNextFocusableComponent(cbPagos);
        panelCenter.add(cbMembresias, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 200, 25));

        cbPagos.setBackground(new java.awt.Color(51, 51, 51));
        cbPagos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbPagos.setForeground(new java.awt.Color(255, 255, 255));
        cbPagos.setText("Al dia de pagos");
        cbPagos.setName("cbPagos"); // NOI18N
        cbPagos.setNextFocusableComponent(btnEliminar);
        panelCenter.add(cbPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, -1, 25));

        panel.add(panelCenter, java.awt.BorderLayout.CENTER);

        panelSouth.setBackground(new java.awt.Color(51, 51, 51));
        panelSouth.setMinimumSize(new java.awt.Dimension(800, 55));
        panelSouth.setName("panelSouth"); // NOI18N
        panelSouth.setPreferredSize(new java.awt.Dimension(800, 55));
        panelSouth.setLayout(new java.awt.GridLayout(1, 2));

        panelSouthLeft.setBackground(new java.awt.Color(51, 51, 51));
        panelSouthLeft.setMinimumSize(new java.awt.Dimension(400, 55));
        panelSouthLeft.setName(""); // NOI18N
        panelSouthLeft.setPreferredSize(new java.awt.Dimension(400, 55));
        panelSouthLeft.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 20, 10));

        btnEliminar.setBorder(null);
        btnEliminar.setText("Eliminar");
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminar.setkEndColor(new java.awt.Color(51, 0, 51));
        btnEliminar.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        btnEliminar.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnEliminar.setkHoverStartColor(new java.awt.Color(51, 0, 51));
        btnEliminar.setkPressedColor(new java.awt.Color(255, 153, 204));
        btnEliminar.setkStartColor(new java.awt.Color(204, 0, 204));
        btnEliminar.setMinimumSize(new java.awt.Dimension(180, 35));
        btnEliminar.setName("btnEliminar"); // NOI18N
        btnEliminar.setNextFocusableComponent(btnCancelar);
        btnEliminar.setPreferredSize(new java.awt.Dimension(180, 35));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEliminarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEliminarMouseReleased(evt);
            }
        });
        panelSouthLeft.add(btnEliminar);

        panelSouth.add(panelSouthLeft);

        panelSouthRight.setBackground(new java.awt.Color(51, 51, 51));
        panelSouthRight.setMinimumSize(new java.awt.Dimension(400, 55));
        panelSouthRight.setName(""); // NOI18N
        panelSouthRight.setPreferredSize(new java.awt.Dimension(400, 55));
        panelSouthRight.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 20, 10));

        btnCancelar.setBorder(null);
        btnCancelar.setText("Cancelar");
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setkEndColor(new java.awt.Color(51, 0, 51));
        btnCancelar.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        btnCancelar.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnCancelar.setkHoverStartColor(new java.awt.Color(51, 0, 51));
        btnCancelar.setkPressedColor(new java.awt.Color(255, 153, 204));
        btnCancelar.setkStartColor(new java.awt.Color(204, 0, 204));
        btnCancelar.setMinimumSize(new java.awt.Dimension(180, 35));
        btnCancelar.setName("btnCancelar"); // NOI18N
        btnCancelar.setNextFocusableComponent(btnAnadir);
        btnCancelar.setPreferredSize(new java.awt.Dimension(180, 35));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCancelarMouseReleased(evt);
            }
        });
        panelSouthRight.add(btnCancelar);

        btnAnadir.setBorder(null);
        btnAnadir.setText("Añadir");
        btnAnadir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAnadir.setkEndColor(new java.awt.Color(51, 0, 51));
        btnAnadir.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        btnAnadir.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnAnadir.setkHoverStartColor(new java.awt.Color(51, 0, 51));
        btnAnadir.setkPressedColor(new java.awt.Color(255, 153, 204));
        btnAnadir.setkStartColor(new java.awt.Color(204, 0, 204));
        btnAnadir.setMinimumSize(new java.awt.Dimension(180, 35));
        btnAnadir.setName("btnAnadir"); // NOI18N
        btnAnadir.setNextFocusableComponent(tfNombre);
        btnAnadir.setPreferredSize(new java.awt.Dimension(180, 35));
        btnAnadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAnadirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAnadirMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAnadirMouseReleased(evt);
            }
        });
        panelSouthRight.add(btnAnadir);

        panelSouth.add(panelSouthRight);

        panel.add(panelSouth, java.awt.BorderLayout.PAGE_END);

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
        tfNombre.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 0, 204)));
    }//GEN-LAST:event_tfNombreFocusGained

    private void tfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusLost
        tfNombre.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
    }//GEN-LAST:event_tfNombreFocusLost

    private void tfApellidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfApellidosFocusGained
        tfApellidos.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 0, 204)));
    }//GEN-LAST:event_tfApellidosFocusGained

    private void tfApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfApellidosFocusLost
        tfApellidos.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
    }//GEN-LAST:event_tfApellidosFocusLost

    private void tfEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailFocusGained
        tfEmail.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 0, 204)));
    }//GEN-LAST:event_tfEmailFocusGained

    private void tfEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailFocusLost
        tfEmail.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
    }//GEN-LAST:event_tfEmailFocusLost

    private void tfCalleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCalleFocusGained
        tfCalle.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 0, 204)));
    }//GEN-LAST:event_tfCalleFocusGained

    private void tfCalleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCalleFocusLost
        tfCalle.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
    }//GEN-LAST:event_tfCalleFocusLost

    private void tfDNIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDNIFocusGained
        tfDNI.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 0, 204)));
    }//GEN-LAST:event_tfDNIFocusGained

    private void tfDNIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDNIFocusLost
        tfDNI.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
    }//GEN-LAST:event_tfDNIFocusLost

    private void tfTlfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTlfFocusGained
        tfTlf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 0, 204)));
    }//GEN-LAST:event_tfTlfFocusGained

    private void tfTlfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTlfFocusLost
        tfTlf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
    }//GEN-LAST:event_tfTlfFocusLost

    private void tfNumeroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNumeroFocusGained
        tfNumero.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 0, 204)));
    }//GEN-LAST:event_tfNumeroFocusGained

    private void tfNumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNumeroFocusLost
        tfNumero.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
    }//GEN-LAST:event_tfNumeroFocusLost

    private void tfPisoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPisoFocusGained
        tfPiso.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 0, 204)));
    }//GEN-LAST:event_tfPisoFocusGained

    private void tfPisoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPisoFocusLost
        tfPiso.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
    }//GEN-LAST:event_tfPisoFocusLost

    private void tfCodPostalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCodPostalFocusGained
        tfCodPostal.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 0, 204)));
    }//GEN-LAST:event_tfCodPostalFocusGained

    private void tfCodPostalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCodPostalFocusLost
        tfCodPostal.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
    }//GEN-LAST:event_tfCodPostalFocusLost

    private void tfLocalidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLocalidadFocusGained
        tfLocalidad.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 0, 204)));
    }//GEN-LAST:event_tfLocalidadFocusGained

    private void tfLocalidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLocalidadFocusLost
        tfLocalidad.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
    }//GEN-LAST:event_tfLocalidadFocusLost

    private void dcFechaNacimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dcFechaNacimientoMouseClicked
        tfNombre.setText(dcFechaNacimiento.getDateFormatString());
    }//GEN-LAST:event_dcFechaNacimientoMouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG % PNG Images","jpg","png");
        fc.setFileFilter(filter);
        
        int seleccion = fc.showOpenDialog(this);
        if(seleccion == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile();            
            try{
                String extension = Files.probeContentType(file.toPath());
                if(extension != null){
                    fotoSocio.setIcon(new ImageIcon(file.getAbsolutePath()));
                }else{
                    if(fotoSocio.getIcon() == null){
                        fotoSocio.setIcon(new ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\Imagenes\\socio.png"));
                        JOptionPane.showMessageDialog(this, "No se ha seleccionado"
                            + " una extensión de archivos válida. Por lo que se "
                            + "asignará una imagen por defecto", "Error",
                            JOptionPane.ERROR_MESSAGE); 
                    }else{
                        JOptionPane.showMessageDialog(this, "No se ha seleccionado"
                            + " una extensión de archivos válida.", "Error",
                            JOptionPane.ERROR_MESSAGE); 
                    }
                }              
            }catch (IOException ioException){
                System.out.println("Error: " + ioException.getMessage());
            }
        }
    }//GEN-LAST:event_editMouseClicked

    private void btnAnadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnadirMouseExited
        activarAnadir = false;
    }//GEN-LAST:event_btnAnadirMouseExited

    private void btnAnadirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnadirMousePressed
        activarAnadir = true;
    }//GEN-LAST:event_btnAnadirMousePressed

    private void btnAnadirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnadirMouseReleased
        
        
        
        if(activarAnadir){
            JTextFieldDateEditor dcEditor1 = ((JTextFieldDateEditor)dcFechaNacimiento.getDateEditor());    
            Date fechaNac = null;
            if(!dcEditor1.getText().equals(""))
                fechaNac = Date.valueOf(dcEditor1.getText());
            
            JTextFieldDateEditor dcEditor2 = ((JTextFieldDateEditor)dcFechaIngreso.getDateEditor());
            Date fechaIngreso = null;
            if(!dcEditor2.getText().equals(""))
                fechaIngreso = Date.valueOf(dcEditor2.getText());
            
            int tlf = Integer.parseInt(tfTlf.getText());
            
            Membresia m = (Membresia) cbMembresias.getSelectedItem();
            Socio s = new Socio(tfDNI.getText(), tfNombre.getText(), tfApellidos.getText(),
                tfEmail.getText(), fechaNac, direccion(), tlf, fechaIngreso,
                m.getId_membresia(), cbPagos.isSelected(), fotoSocio.getIcon().toString(), asociacion.getId());

            if(btnAnadir.getText().equals("Modificar")){
                if(cs.modificarSocio(s, socio.getDni())){
                    dispose();
                }
            }else if(btnAnadir.getText().equals("Añadir")){
                if(cs.insertarSocio(s)){
                    dispose();
                }
            }
        }
    }//GEN-LAST:event_btnAnadirMouseReleased

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        activarCancelar = false;
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        activarCancelar = true;
    }//GEN-LAST:event_btnCancelarMousePressed

    private void btnCancelarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseReleased
        if(activarCancelar){
            dispose();
        }
    }//GEN-LAST:event_btnCancelarMouseReleased

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        activarEliminar = false;
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMousePressed
        activarEliminar = true;
    }//GEN-LAST:event_btnEliminarMousePressed

    private void btnEliminarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseReleased
        if(activarEliminar){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog (null, "Estas seguro que desea elimnar?","Warning",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                if(cs.eliminarSocio(tfDNI.getText(), asociacion.getId())){
                    dispose();
                }
            }
        }
    }//GEN-LAST:event_btnEliminarMouseReleased
    
    public void dispose(){
        this.show(false);
        JPanel card = (JPanel) this.getParent();
        
        SociosPanel sp = new SociosPanel(asociacion);
        card.add(sp, "cardSP");
        
        CardLayout cardLayout = (CardLayout) card.getLayout();
        cardLayout.show(card, "cardSP");
    }
    
    public void rellenarCampos(){
        tfNombre.setText(socio.getNombre());
        tfApellidos.setText(socio.getApellidos());
        tfEmail.setText(socio.getEmail());
        dcFechaNacimiento.setDate(socio.getFechaNac());
        separarDireccion(socio.getDomicilio());
        tfTlf.setText(socio.getTelefono()+"");
        tfDNI.setText(socio.getDni());
        dcFechaIngreso.setDate(socio.getFechaIngreso());
        seleccionarMembresia(socio.getIdMembresia());
        cbPagos.setSelected(socio.isPagado());
        fotoSocio.setIcon(new ImageIcon(socio.getRutaImg()));
        
        btnAnadir.setText("Modificar");
    }
    
    //Rellena el combo box con los nombres de todas las membresias
    private void rellenarMembresias(){
        ControlMembresia cmem = new ControlMembresia();
        mems = cmem.obtenerMembresias(asociacion.getId());
        
        for(int i = 0 ; i < mems.size() ; i++){
            cbMembresias.addItem(mems.get(i));
        }
        cbMembresias.setSelectedItem(null);
    }
    
    //Selecciona la membresia correspondiente en el combobox
    private void seleccionarMembresia(int id_mem){
        for(int i = 0 ; i < mems.size() ; i++){
            if(id_mem == mems.get(i).getId_membresia()){
                cbMembresias.setSelectedIndex(i);
            }
        }
    }
    
    private String direccion(){
        String direccion;
        if(tfPiso.getText().equals("")){
            direccion =  "C/" + tfCalle.getText() + ", " + tfNumero.getText() +
                    ", " + tfCodPostal.getText() + ", " + tfLocalidad.getText()
                    + ", " + cbProvincia.getSelectedItem();
            
        }else{
            direccion =  "C/" + tfCalle.getText() + ", " + tfNumero.getText() +
                    ", " + tfPiso.getText() + ", " + tfCodPostal.getText() + ", "
                    + tfLocalidad.getText() + ", " + cbProvincia.getSelectedItem();
        }
        return direccion;
    }
    
    private void separarDireccion(String dir){
        String [] d = dir.split("/"); //Separar la C/
        String [] c = d[1].split(","); //Separar cada apartado
        tfCalle.setText(c[0].replaceFirst(" ", ""));
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
    
    private boolean activarCancelar;
    private boolean activarEliminar;
    private boolean activarAnadir;
    
    private final Asociacion asociacion;
    
    private final ControlSocio cs;
    private Socio socio;
    
    private ArrayList<Membresia> mems;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnAnadir;
    private keeptoo.KButton btnCancelar;
    private keeptoo.KButton btnEliminar;
    private javax.swing.JComboBox<Membresia> cbMembresias;
    private javax.swing.JCheckBox cbPagos;
    private javax.swing.JComboBox<String> cbProvincia;
    private com.toedter.calendar.JDateChooser dcFechaIngreso;
    private com.toedter.calendar.JDateChooser dcFechaNacimiento;
    private javax.swing.JLabel edit;
    private javax.swing.JLabel fotoSocio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblCodPostal;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblDatosContacto;
    private javax.swing.JLabel lblDatosPersonales;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFechaIngreso;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblLocalidad;
    private javax.swing.JLabel lblMembresia;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPiso;
    private javax.swing.JLabel lblProvincia;
    private javax.swing.JLabel lblTlf;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelImg;
    private javax.swing.JPanel panelSouth;
    private javax.swing.JPanel panelSouthLeft;
    private javax.swing.JPanel panelSouthRight;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfCalle;
    private javax.swing.JTextField tfCodPostal;
    private javax.swing.JTextField tfDNI;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfLocalidad;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfPiso;
    private javax.swing.JFormattedTextField tfTlf;
    // End of variables declaration//GEN-END:variables
}