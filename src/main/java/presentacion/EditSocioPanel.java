package presentacion;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JTextFieldDateEditor;
import dominio.ControlMembresia;
import dominio.ControlSocio;
import dominio.Membresia;
import dominio.Socio;
import java.awt.CardLayout;
import java.awt.Color;
import java.io.File;
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

    public EditSocioPanel() {
        initComponents();
        this.cs = new ControlSocio();
    }

    public EditSocioPanel(Socio soc){
        this.socio = soc;
        initComponents();
        this.cs = new ControlSocio();
        kButton3.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelSouth = new javax.swing.JPanel();
        PanelSouthLeft = new javax.swing.JPanel();
        kButton3 = new keeptoo.KButton();
        panelSouthRight = new javax.swing.JPanel();
        kButton2 = new keeptoo.KButton();
        kButton1 = new keeptoo.KButton();
        panelCenter = new javax.swing.JPanel();
        lblDatosPersonales = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfApellidos = new javax.swing.JTextField();
        lblFechaNacimiento = new javax.swing.JLabel();
        lblMembresia = new javax.swing.JLabel();
        cbMembresias = new javax.swing.JComboBox<>();
        cbPagos = new javax.swing.JCheckBox();
        lblDatosContacto = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        tfDireccion = new javax.swing.JTextField();
        lblTlf = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        tfDNI = new javax.swing.JTextField();
        lblObDNI = new javax.swing.JLabel();
        lblObNombre = new javax.swing.JLabel();
        tfTlf = new javax.swing.JFormattedTextField();
        tfNumero = new javax.swing.JTextField();
        tfPiso = new javax.swing.JTextField();
        tfPuerta = new javax.swing.JTextField();
        tfCodPostal = new javax.swing.JTextField();
        tfLocalidad = new javax.swing.JTextField();
        lblCalle = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        cbProvincia = new javax.swing.JComboBox<>();
        lblPiso = new javax.swing.JLabel();
        lblPuerta = new javax.swing.JLabel();
        lblCodPostal = new javax.swing.JLabel();
        lblLocalidad = new javax.swing.JLabel();
        lblProvincia = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        jPanel1.setLayout(new java.awt.BorderLayout());

        panelSouth.setBackground(new java.awt.Color(51, 51, 51));
        panelSouth.setName("panelSouth"); // NOI18N
        panelSouth.setPreferredSize(new java.awt.Dimension(215, 75));
        panelSouth.setLayout(new java.awt.GridLayout(1, 2));

        PanelSouthLeft.setBackground(new java.awt.Color(51, 51, 51));
        PanelSouthLeft.setName("PanelSouthLeft"); // NOI18N
        PanelSouthLeft.setPreferredSize(new java.awt.Dimension(400, 55));
        PanelSouthLeft.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 20, 20));

        kButton3.setBorder(null);
        kButton3.setText("Eliminar");
        kButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kButton3.setkEndColor(new java.awt.Color(51, 0, 51));
        kButton3.setkStartColor(new java.awt.Color(204, 0, 204));
        kButton3.setNextFocusableComponent(kButton2);
        kButton3.setPreferredSize(new java.awt.Dimension(180, 35));
        kButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton3MouseClicked(evt);
            }
        });
        PanelSouthLeft.add(kButton3);

        panelSouth.add(PanelSouthLeft);

        panelSouthRight.setBackground(new java.awt.Color(51, 51, 51));
        panelSouthRight.setName("panelSouthRight"); // NOI18N
        panelSouthRight.setPreferredSize(new java.awt.Dimension(400, 55));
        panelSouthRight.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 20, 20));

        kButton2.setBorder(null);
        kButton2.setText("Cancelar");
        kButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kButton2.setkEndColor(new java.awt.Color(51, 0, 51));
        kButton2.setkStartColor(new java.awt.Color(204, 0, 204));
        kButton2.setNextFocusableComponent(kButton1);
        kButton2.setPreferredSize(new java.awt.Dimension(180, 35));
        kButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton2MouseClicked(evt);
            }
        });
        panelSouthRight.add(kButton2);

        kButton1.setBorder(null);
        kButton1.setText("Añadir");
        kButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kButton1.setkEndColor(new java.awt.Color(51, 0, 51));
        kButton1.setkStartColor(new java.awt.Color(204, 0, 204));
        kButton1.setNextFocusableComponent(tfNombre);
        kButton1.setPreferredSize(new java.awt.Dimension(180, 35));
        kButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton1MouseClicked(evt);
            }
        });
        panelSouthRight.add(kButton1);

        panelSouth.add(panelSouthRight);

        jPanel1.add(panelSouth, java.awt.BorderLayout.PAGE_END);

        panelCenter.setBackground(new java.awt.Color(51, 51, 51));
        panelCenter.setName("panelCenter"); // NOI18N
        panelCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDatosPersonales.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDatosPersonales.setForeground(new java.awt.Color(255, 255, 255));
        lblDatosPersonales.setText("Datos Personales");
        lblDatosPersonales.setFocusable(false);
        lblDatosPersonales.setName("lblDatosPersonales"); // NOI18N
        panelCenter.add(lblDatosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");
        lblNombre.setFocusable(false);
        lblNombre.setName("lblNombre"); // NOI18N
        panelCenter.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        lblApellidos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidos.setText("Apellidos");
        lblApellidos.setFocusable(false);
        lblApellidos.setName("lblApellidos"); // NOI18N
        panelCenter.add(lblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

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
        panelCenter.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 260, 25));

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
        panelCenter.add(tfApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 260, 25));

        lblFechaNacimiento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaNacimiento.setText("Fecha Nacimiento");
        lblFechaNacimiento.setFocusable(false);
        lblFechaNacimiento.setName("lblFechaNacimiento"); // NOI18N
        panelCenter.add(lblFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        lblMembresia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMembresia.setForeground(new java.awt.Color(255, 255, 255));
        lblMembresia.setText("Membresia");
        lblMembresia.setFocusable(false);
        lblMembresia.setName("lblMembresia"); // NOI18N
        panelCenter.add(lblMembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, -1, -1));

        rellenarMembresias();
        cbMembresias.setName("cbMembresias"); // NOI18N
        cbMembresias.setNextFocusableComponent(cbPagos);
        panelCenter.add(cbMembresias, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 200, 25));

        cbPagos.setBackground(new java.awt.Color(51, 51, 51));
        cbPagos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbPagos.setForeground(new java.awt.Color(255, 255, 255));
        cbPagos.setText("Al dia de pagos");
        cbPagos.setName("cbPagos"); // NOI18N
        cbPagos.setNextFocusableComponent(kButton3);
        panelCenter.add(cbPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, -1, 25));

        lblDatosContacto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDatosContacto.setForeground(new java.awt.Color(255, 255, 255));
        lblDatosContacto.setText("Datos de Contacto");
        lblDatosContacto.setFocusable(false);
        lblDatosContacto.setName("lblDatosContacto"); // NOI18N
        panelCenter.add(lblDatosContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");
        lblEmail.setFocusable(false);
        lblEmail.setName("lblEmail"); // NOI18N
        panelCenter.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        tfEmail.setBackground(new java.awt.Color(51, 51, 51));
        tfEmail.setForeground(new java.awt.Color(255, 255, 255));
        tfEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfEmail.setCaretColor(new java.awt.Color(204, 0, 204));
        tfEmail.setName("tfEmail"); // NOI18N
        tfEmail.setNextFocusableComponent(tfDireccion);
        tfEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfEmailFocusLost(evt);
            }
        });
        panelCenter.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 520, 25));

        lblDireccion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setText("Datos Asociacion");
        lblDireccion.setFocusable(false);
        lblDireccion.setName("lblDireccion"); // NOI18N
        panelCenter.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        tfDireccion.setBackground(new java.awt.Color(51, 51, 51));
        tfDireccion.setForeground(new java.awt.Color(255, 255, 255));
        tfDireccion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfDireccion.setCaretColor(new java.awt.Color(204, 0, 204));
        tfDireccion.setName("tfDireccion"); // NOI18N
        tfDireccion.setNextFocusableComponent(tfNumero);
        tfDireccion.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDireccionFocusLost(evt);
            }
        });
        panelCenter.add(tfDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 220, 25));

        lblTlf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTlf.setForeground(new java.awt.Color(255, 255, 255));
        lblTlf.setText("Teléfono");
        lblTlf.setFocusable(false);
        lblTlf.setName("lblTlf"); // NOI18N
        panelCenter.add(lblTlf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        lblDNI.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDNI.setForeground(new java.awt.Color(255, 255, 255));
        lblDNI.setText("DNI");
        lblDNI.setFocusable(false);
        lblDNI.setName("lblDNI"); // NOI18N
        panelCenter.add(lblDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

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
        panelCenter.add(tfDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 260, 25));

        lblObDNI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblObDNI.setForeground(new java.awt.Color(255, 255, 255));
        lblObDNI.setText("*");
        lblObDNI.setFocusable(false);
        lblObDNI.setName("lblObDNI"); // NOI18N
        panelCenter.add(lblObDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, -1, -1));

        lblObNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblObNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblObNombre.setText("*");
        lblObNombre.setFocusable(false);
        lblObNombre.setName("lblObNombre"); // NOI18N
        panelCenter.add(lblObNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

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
        panelCenter.add(tfTlf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 220, 25));

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
        panelCenter.add(tfNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 44, 25));

        tfPiso.setBackground(new java.awt.Color(51, 51, 51));
        tfPiso.setForeground(new java.awt.Color(255, 255, 255));
        tfPiso.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfPiso.setCaretColor(new java.awt.Color(204, 0, 204));
        tfPiso.setName("tfPiso"); // NOI18N
        tfPiso.setNextFocusableComponent(tfPuerta);
        tfPiso.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfPiso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPisoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPisoFocusLost(evt);
            }
        });
        panelCenter.add(tfPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 23, 25));

        tfPuerta.setBackground(new java.awt.Color(51, 51, 51));
        tfPuerta.setForeground(new java.awt.Color(255, 255, 255));
        tfPuerta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfPuerta.setCaretColor(new java.awt.Color(204, 0, 204));
        tfPuerta.setName("tfPuerta"); // NOI18N
        tfPuerta.setNextFocusableComponent(tfCodPostal);
        tfPuerta.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfPuerta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPuertaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPuertaFocusLost(evt);
            }
        });
        panelCenter.add(tfPuerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 38, 25));

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
        panelCenter.add(tfCodPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 76, 25));

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
        panelCenter.add(tfLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 160, 25));

        lblCalle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCalle.setForeground(new java.awt.Color(255, 255, 255));
        lblCalle.setText("Calle");
        lblCalle.setFocusable(false);
        lblCalle.setName("lblCalle"); // NOI18N
        panelCenter.add(lblCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        lblNumero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero.setText("Numero");
        lblNumero.setFocusable(false);
        lblNumero.setName("lblNumero"); // NOI18N
        panelCenter.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        cbProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Álava", "Albacete", "Alicante", "Almeria", "Asturias", "Ávila", "Badajoz", "Barcelona", "Burgos", "Cáceres", "Cádiz", "Cantabria", "Castellón", "Ciudad Real", "Córdoba", "La Coruña", "Cuenca", "Gerona", "Granada", "Guadalajara", "Guipúzcua", "Huelva", "Huesca", "Baleares", "Jaén", "León", "Lérida", "Lugo", "Madrid", "Málaga", "Murcia", "Navarra", "Orense", "Palencia", "Las Palmas", "Pontevedra", "La Rioja", "Salamanca", "Segovia", "Sevilla", "Soria", "Tarragona", "Santa Cruz de Tenerife", "Teruel", "Toledo", "Valencia", "Valladolid", "Vizcaya", "Zamora", "Zaragoza" }));
        cbProvincia.setName("cbProvincia"); // NOI18N
        panelCenter.add(cbProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 120, 25));

        lblPiso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPiso.setForeground(new java.awt.Color(255, 255, 255));
        lblPiso.setText("Piso");
        lblPiso.setFocusable(false);
        lblPiso.setName("lblPiso"); // NOI18N
        panelCenter.add(lblPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        lblPuerta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPuerta.setForeground(new java.awt.Color(255, 255, 255));
        lblPuerta.setText("Puerta");
        lblPuerta.setFocusable(false);
        lblPuerta.setName("lblPuerta"); // NOI18N
        panelCenter.add(lblPuerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        lblCodPostal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCodPostal.setForeground(new java.awt.Color(255, 255, 255));
        lblCodPostal.setText("Codigo Postal");
        lblCodPostal.setFocusable(false);
        lblCodPostal.setName("lblCodPostal"); // NOI18N
        panelCenter.add(lblCodPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        lblLocalidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLocalidad.setForeground(new java.awt.Color(255, 255, 255));
        lblLocalidad.setText("Localidad");
        lblLocalidad.setFocusable(false);
        lblLocalidad.setName("lblLocalidad"); // NOI18N
        panelCenter.add(lblLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, -1));

        lblProvincia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblProvincia.setForeground(new java.awt.Color(255, 255, 255));
        lblProvincia.setText("Provincia");
        lblProvincia.setFocusable(false);
        lblProvincia.setName("lblProvincia"); // NOI18N
        panelCenter.add(lblProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\editar.png")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 184, 184));

        panelCenter.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 190));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha de Ingreso");
        jLabel2.setFocusable(false);
        panelCenter.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        JTextFieldDateEditor dateChooserEditor1 = ((JTextFieldDateEditor)jDateChooser1.getDateEditor());
        dateChooserEditor1.setBackground(new Color(51, 51, 51));
        dateChooserEditor1.setForeground(new Color(255, 255, 255));
        dateChooserEditor1.setEditable(false);
        dateChooserEditor1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        jDateChooser1.getCalendarButton().setSize(25, 25);
        jDateChooser1.getCalendarButton().setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\calendario-white.png"));
        jDateChooser1.getCalendarButton().setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        jDateChooser1.getCalendarButton().setBackground(new Color(51,51,51));
        jDateChooser1.getCalendarButton().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jDateChooser1.setBackground(new java.awt.Color(51, 51, 51));
        jDateChooser1.setForeground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseClicked(evt);
            }
        });
        panelCenter.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 260, 25));

        JTextFieldDateEditor dateChooserEditor2 = ((JTextFieldDateEditor)jDateChooser2.getDateEditor());
        dateChooserEditor2.setBackground(new Color(51, 51, 51));
        dateChooserEditor2.setForeground(new Color(255, 255, 255));
        dateChooserEditor2.setEditable(false);
        dateChooserEditor2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        jDateChooser2.getCalendarButton().setSize(25, 25);
        jDateChooser2.getCalendarButton().setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\calendario-white.png"));
        jDateChooser2.getCalendarButton().setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        jDateChooser2.getCalendarButton().setBackground(new Color(51,51,51));
        jDateChooser2.getCalendarButton().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jDateChooser2.setDateFormatString("yyyy-MM-dd");
        panelCenter.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 260, 25));

        jPanel1.add(panelCenter, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void tfDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDireccionFocusGained
        tfDireccion.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 0, 204)));
    }//GEN-LAST:event_tfDireccionFocusGained

    private void tfDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDireccionFocusLost
        tfDireccion.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
    }//GEN-LAST:event_tfDireccionFocusLost

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

    private void tfPuertaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPuertaFocusGained
        tfPuerta.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 0, 204)));
    }//GEN-LAST:event_tfPuertaFocusGained

    private void tfPuertaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPuertaFocusLost
        tfPuerta.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
    }//GEN-LAST:event_tfPuertaFocusLost

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

    private void kButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton1MouseClicked
        JTextFieldDateEditor dateChooserEditor1 = ((JTextFieldDateEditor)jDateChooser1.getDateEditor());
        JTextFieldDateEditor dateChooserEditor2 = ((JTextFieldDateEditor)jDateChooser2.getDateEditor());
        System.out.println(dateChooserEditor2.getText());
        Membresia m = (Membresia) cbMembresias.getSelectedItem();
        Socio s = new Socio(tfDNI.getText(), tfNombre.getText(), tfApellidos.getText(),
            tfEmail.getText(), Date.valueOf(dateChooserEditor1.getText()),
            direccion(), Integer.parseInt(tfTlf.getText()), Date.valueOf(dateChooserEditor2.getText()),
            m.getId_membresia(), cbPagos.isSelected(), jLabel1.getIcon().toString());

        if(kButton1.getText().equals("Modificar")){
            if(cs.modificarSocio(s, socio.getDni())){
                dispose();
            }
        }else if(kButton1.getText().equals("Añadir")){
            if(cs.insertarSocio(s)){
                dispose();
            }
        }
    }//GEN-LAST:event_kButton1MouseClicked

    private void kButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton2MouseClicked
        dispose();
    }//GEN-LAST:event_kButton2MouseClicked

    private void kButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton3MouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Estas seguro que desea elimnar?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            if(cs.eliminarSocio(tfDNI.getText())){
                dispose();
            }
        }
    }//GEN-LAST:event_kButton3MouseClicked

    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked
        tfNombre.setText(jDateChooser1.getDateFormatString());
    }//GEN-LAST:event_jDateChooser1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG % PNG Images","jpg","png");
        fc.setFileFilter(filter);
        
        int seleccion = fc.showOpenDialog(this);
        if(seleccion == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile();
            jLabel1.setIcon(new ImageIcon(file.getAbsolutePath()));
        }
    }//GEN-LAST:event_jLabel4MouseClicked
    
    public void dispose(){
        this.show(false);
        JPanel card = (JPanel) this.getParent();
        
        SociosPanel sp = new SociosPanel();
        card.add(sp, "cardSP");
        
        CardLayout cardLayout = (CardLayout) card.getLayout();
        cardLayout.show(card, "cardSP");
    }
    
    public void rellenarCampos(){
        tfNombre.setText(socio.getNombre());
        tfApellidos.setText(socio.getApellidos());
        tfEmail.setText(socio.getEmail());
        jDateChooser1.setDate(socio.getFecha_nac());
        separarDireccion(socio.getDomicilio());
        tfTlf.setText(socio.getTelefono()+"");
        tfDNI.setText(socio.getDni());
        jDateChooser2.setDate(socio.getFecha_ingreso());
        seleccionarMembresia(socio.getId_membresia());
        cbPagos.setSelected(socio.isPagado());
        jLabel1.setIcon(new ImageIcon(socio.getRutaImg()));
        
        kButton1.setText("Modificar");
    }
    
    //Rellena el combo box con los nombres de todas las membresias
    private void rellenarMembresias(){
        ControlMembresia cmem = new ControlMembresia();
        mems = cmem.obtenerMembresias();
        
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
        if(tfPiso.getText().equals("") || tfPuerta.getText().equals("")){
            direccion =  "C/" + tfDireccion.getText() + ", " + tfNumero.getText()
                    + ", " + tfCodPostal.getText() + ", " + tfLocalidad.getText()
                    + ", " + cbProvincia.getSelectedItem();
            
        }else{
            direccion =  "C/" + tfDireccion.getText() + ", " + tfNumero.getText()
                    + ", " + tfPiso.getText() + "º" + tfPuerta.getText() + ", " +
                    tfCodPostal.getText() + ", " + tfLocalidad.getText() + ", " +
                    cbProvincia.getSelectedItem();
        }
        return direccion;
    }
    
    private void separarDireccion(String dir){
        String [] d = dir.split("/"); //Separar la C/
        String [] c = d[1].split(","); //Separar cada apartado
        tfDireccion.setText(c[0].replaceFirst(" ", ""));
        tfNumero.setText(c[1].replaceFirst(" ", ""));
        if(c.length == 6){
            String [] p = c[2].split("º"); //Separar el piso y la puerta
            tfPiso.setText(p[0].replaceFirst(" ", ""));
            tfPuerta.setText(p[1]);

            tfCodPostal.setText(c[3].replaceFirst(" ", ""));
            tfLocalidad.setText(c[4].replaceFirst(" ", ""));
            cbProvincia.setSelectedItem(c[5].replaceFirst(" ", ""));
        }else{
            tfCodPostal.setText(c[2].replaceFirst(" ", ""));
            tfLocalidad.setText(c[3].replaceFirst(" ", ""));
            cbProvincia.setSelectedItem(c[4].replaceFirst(" ", ""));
        }
    }        
    
    private final ControlSocio cs;
    private Socio socio;
    
    private ArrayList<Membresia> mems;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelSouthLeft;
    private javax.swing.JComboBox<Membresia> cbMembresias;
    private javax.swing.JCheckBox cbPagos;
    private javax.swing.JComboBox<String> cbProvincia;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private keeptoo.KButton kButton3;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblCodPostal;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblDatosContacto;
    private javax.swing.JLabel lblDatosPersonales;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblLocalidad;
    private javax.swing.JLabel lblMembresia;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblObDNI;
    private javax.swing.JLabel lblObNombre;
    private javax.swing.JLabel lblPiso;
    private javax.swing.JLabel lblProvincia;
    private javax.swing.JLabel lblPuerta;
    private javax.swing.JLabel lblTlf;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelSouth;
    private javax.swing.JPanel panelSouthRight;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfCodPostal;
    private javax.swing.JTextField tfDNI;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfLocalidad;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfPiso;
    private javax.swing.JTextField tfPuerta;
    private javax.swing.JFormattedTextField tfTlf;
    // End of variables declaration//GEN-END:variables
}