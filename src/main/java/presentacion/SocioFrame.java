package presentacion;

import dominio.ControlMembresia;
import dominio.ControlSocio;
import dominio.Membresia;
import dominio.Socio;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.sql.Date;

import javax.swing.JOptionPane;

/**
 * @author angel
 **/
public class SocioFrame extends javax.swing.JFrame {

    public SocioFrame() {
        initComponents();
        this.cs = new ControlSocio();
    }

    public SocioFrame(Socio soc){
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
        panelSouth = new javax.swing.JPanel();
        PanelSouthLeft = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        panelSouthRight = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnAnadir = new javax.swing.JButton();
        panelCenter = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        lblObMembresia = new javax.swing.JLabel();
        tfTlf = new javax.swing.JFormattedTextField();
        tfFechaNacimiento = new javax.swing.JFormattedTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TicketManagementSystem");
        setIconImage(getIconImage());
        setResizable(false);

        panel.setBackground(new java.awt.Color(51, 51, 51));
        panel.setName("panel"); // NOI18N
        panel.setPreferredSize(new java.awt.Dimension(800, 550));
        panel.setLayout(new java.awt.BorderLayout());

        panelSouth.setBackground(new java.awt.Color(51, 51, 51));
        panelSouth.setName("panelSouth"); // NOI18N
        panelSouth.setPreferredSize(new java.awt.Dimension(215, 55));
        panelSouth.setLayout(new java.awt.GridLayout(1, 2));

        PanelSouthLeft.setBackground(new java.awt.Color(51, 51, 51));
        PanelSouthLeft.setName("PanelSouthLeft"); // NOI18N
        PanelSouthLeft.setPreferredSize(new java.awt.Dimension(400, 55));
        PanelSouthLeft.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 20, 5));

        btnEliminar.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setName("btnEliminar"); // NOI18N
        btnEliminar.setPreferredSize(new java.awt.Dimension(180, 35));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        PanelSouthLeft.add(btnEliminar);

        panelSouth.add(PanelSouthLeft);

        panelSouthRight.setBackground(new java.awt.Color(51, 51, 51));
        panelSouthRight.setName("panelSouthRight"); // NOI18N
        panelSouthRight.setPreferredSize(new java.awt.Dimension(400, 55));
        panelSouthRight.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        btnCancelar.setBackground(new java.awt.Color(204, 0, 204));
        btnCancelar.setText("Cancelar");
        btnCancelar.setName("btnCancelar"); // NOI18N
        btnCancelar.setPreferredSize(new java.awt.Dimension(180, 35));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelarMousePressed(evt);
            }
        });
        panelSouthRight.add(btnCancelar);

        btnAnadir.setBackground(new java.awt.Color(0, 204, 0));
        btnAnadir.setText("Añadir");
        btnAnadir.setName("btnAnadir"); // NOI18N
        btnAnadir.setPreferredSize(new java.awt.Dimension(180, 35));
        btnAnadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAnadirMousePressed(evt);
            }
        });
        panelSouthRight.add(btnAnadir);

        panelSouth.add(panelSouthRight);

        panel.add(panelSouth, java.awt.BorderLayout.PAGE_END);

        panelCenter.setBackground(new java.awt.Color(51, 51, 51));
        panelCenter.setName("panelCenter"); // NOI18N
        panelCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Documents\\NetBeansProjects\\TicketManagementSystem\\src\\main\\java\\recursos\\user(1).png")); // NOI18N
        panelCenter.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 140));

        lblDatosPersonales.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDatosPersonales.setForeground(new java.awt.Color(255, 255, 255));
        lblDatosPersonales.setText("Datos Personales");
        lblDatosPersonales.setName("lblDatosPersonales"); // NOI18N
        panelCenter.add(lblDatosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");
        lblNombre.setName("lblNombre"); // NOI18N
        panelCenter.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        lblApellidos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidos.setText("Apellidos");
        lblApellidos.setName("lblApellidos"); // NOI18N
        panelCenter.add(lblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        tfNombre.setBackground(new java.awt.Color(102, 102, 102));
        tfNombre.setForeground(new java.awt.Color(255, 255, 255));
        tfNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfNombre.setCaretColor(new java.awt.Color(204, 0, 204));
        tfNombre.setName("tfNombre"); // NOI18N
        tfNombre.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNombreFocusLost(evt);
            }
        });
        panelCenter.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 260, 25));

        tfApellidos.setBackground(new java.awt.Color(102, 102, 102));
        tfApellidos.setForeground(new java.awt.Color(255, 255, 255));
        tfApellidos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
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
        panelCenter.add(tfApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 260, 25));

        lblFechaNacimiento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaNacimiento.setText("Fecha Nacimiento");
        lblFechaNacimiento.setName("lblFechaNacimiento"); // NOI18N
        panelCenter.add(lblFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        lblMembresia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMembresia.setForeground(new java.awt.Color(255, 255, 255));
        lblMembresia.setText("Membresia");
        lblMembresia.setName("lblMembresia"); // NOI18N
        panelCenter.add(lblMembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        rellenarMembresias();
        cbMembresias.setName("cbMembresias"); // NOI18N
        panelCenter.add(cbMembresias, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 200, 25));

        cbPagos.setBackground(new java.awt.Color(51, 51, 51));
        cbPagos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbPagos.setForeground(new java.awt.Color(255, 255, 255));
        cbPagos.setText("Al dia de pagos");
        cbPagos.setName("cbPagos"); // NOI18N
        panelCenter.add(cbPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, -1, 25));

        lblDatosContacto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDatosContacto.setForeground(new java.awt.Color(255, 255, 255));
        lblDatosContacto.setText("Datos de Contacto");
        lblDatosContacto.setName("lblDatosContacto"); // NOI18N
        panelCenter.add(lblDatosContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");
        lblEmail.setName("lblEmail"); // NOI18N
        panelCenter.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        tfEmail.setBackground(new java.awt.Color(102, 102, 102));
        tfEmail.setForeground(new java.awt.Color(255, 255, 255));
        tfEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfEmail.setCaretColor(new java.awt.Color(204, 0, 204));
        tfEmail.setName("tfEmail"); // NOI18N
        tfEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfEmailFocusLost(evt);
            }
        });
        panelCenter.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 690, 25));

        lblDireccion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setText("Direccion");
        lblDireccion.setName("lblDireccion"); // NOI18N
        panelCenter.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        tfDireccion.setBackground(new java.awt.Color(102, 102, 102));
        tfDireccion.setForeground(new java.awt.Color(255, 255, 255));
        tfDireccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfDireccion.setCaretColor(new java.awt.Color(204, 0, 204));
        tfDireccion.setName("tfDireccion"); // NOI18N
        tfDireccion.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDireccionFocusLost(evt);
            }
        });
        panelCenter.add(tfDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 260, 25));

        lblTlf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTlf.setForeground(new java.awt.Color(255, 255, 255));
        lblTlf.setText("Teléfono");
        lblTlf.setName("lblTlf"); // NOI18N
        panelCenter.add(lblTlf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        lblDNI.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDNI.setForeground(new java.awt.Color(255, 255, 255));
        lblDNI.setText("DNI");
        lblDNI.setName("lblDNI"); // NOI18N
        panelCenter.add(lblDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        tfDNI.setBackground(new java.awt.Color(102, 102, 102));
        tfDNI.setForeground(new java.awt.Color(255, 255, 255));
        tfDNI.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfDNI.setCaretColor(new java.awt.Color(204, 0, 204));
        tfDNI.setName("tfDNI"); // NOI18N
        tfDNI.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfDNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDNIFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDNIFocusLost(evt);
            }
        });
        panelCenter.add(tfDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 190, 25));

        lblObDNI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblObDNI.setForeground(new java.awt.Color(255, 255, 255));
        lblObDNI.setText("*");
        lblObDNI.setName("lblObDNI"); // NOI18N
        panelCenter.add(lblObDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        lblObNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblObNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblObNombre.setText("*");
        lblObNombre.setName("lblObNombre"); // NOI18N
        panelCenter.add(lblObNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 50, -1, -1));

        lblObMembresia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblObMembresia.setForeground(new java.awt.Color(255, 255, 255));
        lblObMembresia.setText("*");
        lblObMembresia.setName("lblObMembresia"); // NOI18N
        panelCenter.add(lblObMembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 110, -1, -1));

        tfTlf.setBackground(new java.awt.Color(102, 102, 102));
        tfTlf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfTlf.setForeground(new java.awt.Color(255, 255, 255));
        tfTlf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        tfTlf.setCaretColor(new java.awt.Color(204, 0, 204));
        tfTlf.setName("tfTlf"); // NOI18N
        tfTlf.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfTlf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfTlfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfTlfFocusLost(evt);
            }
        });
        panelCenter.add(tfTlf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 170, 25));

        tfFechaNacimiento.setBackground(new java.awt.Color(102, 102, 102));
        tfFechaNacimiento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        tfFechaNacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        tfFechaNacimiento.setCaretColor(new java.awt.Color(204, 0, 204));
        tfFechaNacimiento.setName("tfFechaNacimiento"); // NOI18N
        tfFechaNacimiento.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfFechaNacimiento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfFechaNacimientoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfFechaNacimientoFocusLost(evt);
            }
        });
        panelCenter.add(tfFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 150, 25));

        tfNumero.setBackground(new java.awt.Color(102, 102, 102));
        tfNumero.setForeground(new java.awt.Color(255, 255, 255));
        tfNumero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfNumero.setCaretColor(new java.awt.Color(204, 0, 204));
        tfNumero.setName("tfNumero"); // NOI18N
        tfNumero.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNumeroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNumeroFocusLost(evt);
            }
        });
        panelCenter.add(tfNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 60, 25));

        tfPiso.setBackground(new java.awt.Color(102, 102, 102));
        tfPiso.setForeground(new java.awt.Color(255, 255, 255));
        tfPiso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
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
        panelCenter.add(tfPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 60, 25));

        tfPuerta.setBackground(new java.awt.Color(102, 102, 102));
        tfPuerta.setForeground(new java.awt.Color(255, 255, 255));
        tfPuerta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfPuerta.setCaretColor(new java.awt.Color(204, 0, 204));
        tfPuerta.setName("tfPuerta"); // NOI18N
        tfPuerta.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfPuerta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPuertaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPuertaFocusLost(evt);
            }
        });
        panelCenter.add(tfPuerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 60, 25));

        tfCodPostal.setBackground(new java.awt.Color(102, 102, 102));
        tfCodPostal.setForeground(new java.awt.Color(255, 255, 255));
        tfCodPostal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfCodPostal.setCaretColor(new java.awt.Color(204, 0, 204));
        tfCodPostal.setName("tfCodPostal"); // NOI18N
        tfCodPostal.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfCodPostal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCodPostalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCodPostalFocusLost(evt);
            }
        });
        panelCenter.add(tfCodPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 110, 25));

        tfLocalidad.setBackground(new java.awt.Color(102, 102, 102));
        tfLocalidad.setForeground(new java.awt.Color(255, 255, 255));
        tfLocalidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfLocalidad.setCaretColor(new java.awt.Color(204, 0, 204));
        tfLocalidad.setName("tfLocalidad"); // NOI18N
        tfLocalidad.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfLocalidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfLocalidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfLocalidadFocusLost(evt);
            }
        });
        panelCenter.add(tfLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 340, 25));

        lblCalle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCalle.setForeground(new java.awt.Color(255, 255, 255));
        lblCalle.setText("Calle");
        lblCalle.setName("lblCalle"); // NOI18N
        panelCenter.add(lblCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        lblNumero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero.setText("Numero");
        lblNumero.setName("lblNumero"); // NOI18N
        panelCenter.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, -1));

        cbProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Álava", "Albacete", "Alicante", "Almeria", "Asturias", "Ávila", "Badajoz", "Barcelona", "Burgos", "Cáceres", "Cádiz", "Cantabria", "Castellón", "Ciudad Real", "Córdoba", "La Coruña", "Cuenca", "Gerona", "Granada", "Guadalajara", "Guipúzcua", "Huelva", "Huesca", "Baleares", "Jaén", "León", "Lérida", "Lugo", "Madrid", "Málaga", "Murcia", "Navarra", "Orense", "Palencia", "Las Palmas", "Pontevedra", "La Rioja", "Salamanca", "Segovia", "Sevilla", "Soria", "Tarragona", "Santa Cruz de Tenerife", "Teruel", "Toledo", "Valencia", "Valladolid", "Vizcaya", "Zamora", "Zaragoza" }));
        cbProvincia.setName("cbProvincia"); // NOI18N
        panelCenter.add(cbProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 210, 25));

        lblPiso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPiso.setForeground(new java.awt.Color(255, 255, 255));
        lblPiso.setText("Piso");
        lblPiso.setName("lblPiso"); // NOI18N
        panelCenter.add(lblPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, -1, -1));

        lblPuerta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPuerta.setForeground(new java.awt.Color(255, 255, 255));
        lblPuerta.setText("Puerta");
        lblPuerta.setName("lblPuerta"); // NOI18N
        panelCenter.add(lblPuerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, -1, -1));

        lblCodPostal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCodPostal.setForeground(new java.awt.Color(255, 255, 255));
        lblCodPostal.setText("Codigo Postal");
        lblCodPostal.setName("lblCodPostal"); // NOI18N
        panelCenter.add(lblCodPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, -1, -1));

        lblLocalidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLocalidad.setForeground(new java.awt.Color(255, 255, 255));
        lblLocalidad.setText("Localidad");
        lblLocalidad.setName("lblLocalidad"); // NOI18N
        panelCenter.add(lblLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        lblProvincia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblProvincia.setForeground(new java.awt.Color(255, 255, 255));
        lblProvincia.setText("Provincia");
        lblProvincia.setName("lblProvincia"); // NOI18N
        panelCenter.add(lblProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, -1, -1));

        panel.add(panelCenter, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        dispose();
    }//GEN-LAST:event_btnCancelarMousePressed

    private void tfNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusGained
        tfNombre.setBackground(Color.black);
        tfNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfNombreFocusGained

    private void tfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusLost
        tfNombre.setBackground(new java.awt.Color(102, 102, 102));
        tfNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfNombreFocusLost

    private void tfApellidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfApellidosFocusGained
        tfApellidos.setBackground(Color.black);
        tfApellidos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfApellidosFocusGained

    private void tfApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfApellidosFocusLost
        tfApellidos.setBackground(new java.awt.Color(102, 102, 102));
        tfApellidos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfApellidosFocusLost

    private void tfEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailFocusGained
        tfEmail.setBackground(Color.black);
        tfEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfEmailFocusGained

    private void tfDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDireccionFocusGained
        tfDireccion.setBackground(Color.black);
        tfDireccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfDireccionFocusGained

    private void tfEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailFocusLost
        tfEmail.setBackground(new java.awt.Color(102, 102, 102));
        tfEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfEmailFocusLost

    private void tfDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDireccionFocusLost
        tfDireccion.setBackground(new java.awt.Color(102, 102, 102));
        tfDireccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfDireccionFocusLost

    private void btnAnadirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnadirMousePressed
        Membresia m = (Membresia) cbMembresias.getSelectedItem();
        Socio s = new Socio(tfDNI.getText(), tfNombre.getText(), tfApellidos.getText(), 
                tfEmail.getText(), Date.valueOf(tfFechaNacimiento.getText()),
                direccion(), Integer.parseInt(tfTlf.getText()), m.getId_membresia());
        
        if(btnAnadir.getText().equals("Modificar")){
            if(cs.modificarSocio(s, socio.getDni())){
                dispose();
            }
        }else if(btnAnadir.getText().equals("Añadir")){
            if(cs.insertarSocio(s)){
                dispose();
            }
        }
    }//GEN-LAST:event_btnAnadirMousePressed

    private void tfDNIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDNIFocusGained
        tfDNI.setBackground(Color.black);
        tfDNI.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfDNIFocusGained

    private void tfDNIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDNIFocusLost
        tfDNI.setBackground(new java.awt.Color(102, 102, 102));
        tfDNI.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfDNIFocusLost

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Estas seguro que desea elimnar?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            if(cs.eliminarSocio(tfDNI.getText())){
                dispose();
            }
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void tfTlfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTlfFocusGained
        tfTlf.setBackground(Color.black);
        tfTlf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfTlfFocusGained

    private void tfTlfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTlfFocusLost
        tfTlf.setBackground(new java.awt.Color(102, 102, 102));
        tfTlf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfTlfFocusLost

    private void tfFechaNacimientoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfFechaNacimientoFocusGained
        tfFechaNacimiento.setBackground(Color.black);
        tfFechaNacimiento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfFechaNacimientoFocusGained

    private void tfFechaNacimientoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfFechaNacimientoFocusLost
        tfFechaNacimiento.setBackground(new java.awt.Color(102, 102, 102));
        tfFechaNacimiento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfFechaNacimientoFocusLost

    private void tfNumeroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNumeroFocusGained
        tfNumero.setBackground(Color.black);
        tfNumero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfNumeroFocusGained

    private void tfNumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNumeroFocusLost
        tfNumero.setBackground(new java.awt.Color(102, 102, 102));
        tfNumero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfNumeroFocusLost

    private void tfPisoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPisoFocusGained
        tfPiso.setBackground(Color.black);
        tfPiso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfPisoFocusGained

    private void tfPisoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPisoFocusLost
        tfPiso.setBackground(new java.awt.Color(102, 102, 102));
        tfPiso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfPisoFocusLost

    private void tfPuertaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPuertaFocusGained
        tfPuerta.setBackground(Color.black);
        tfPuerta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfPuertaFocusGained

    private void tfPuertaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPuertaFocusLost
        tfPuerta.setBackground(new java.awt.Color(102, 102, 102));
        tfPuerta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfPuertaFocusLost

    private void tfCodPostalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCodPostalFocusGained
        tfCodPostal.setBackground(Color.black);
        tfCodPostal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfCodPostalFocusGained

    private void tfCodPostalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCodPostalFocusLost
        tfCodPostal.setBackground(new java.awt.Color(102, 102, 102));
        tfCodPostal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfCodPostalFocusLost

    private void tfLocalidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLocalidadFocusGained
        tfLocalidad.setBackground(Color.black);
        tfLocalidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfLocalidadFocusGained

    private void tfLocalidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLocalidadFocusLost
        tfLocalidad.setBackground(new java.awt.Color(102, 102, 102));
        tfLocalidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfLocalidadFocusLost

    public void rellenarCampos(){
        tfNombre.setText(socio.getNombre());
        tfApellidos.setText(socio.getApellidos());
        tfEmail.setText(socio.getEmail());
        tfFechaNacimiento.setText(socio.getFecha_nac()+"");
        separarDireccion(socio.getDomicilio());
        tfTlf.setText(socio.getTelefono()+"");
        tfDNI.setText(socio.getDni());
        seleccionarMembresia(socio.getId_membresia());
        //añadir pendiente de pagos
        
        btnAnadir.setText("Modificar");
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
        tfDireccion.setText(c[0]);
        tfNumero.setText(c[1]);
        if(c.length == 6){
            String [] p = c[2].split("º"); //Separar el piso y la puerta
            tfPiso.setText(p[0]);
            tfPuerta.setText(p[1]);

            tfCodPostal.setText(c[3]);
            tfLocalidad.setText(c[4]);
            cbProvincia.setSelectedItem(c[5].replaceFirst(" ", ""));
        }else{
            tfCodPostal.setText(c[2]);
            tfLocalidad.setText(c[3]);
            cbProvincia.setSelectedItem(c[4].replaceFirst(" ", ""));
        }
    }
    
   @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(
                "C:\\Users\\angel\\Documents\\NetBeansProjects\\TicketManagementSystem\\src\\main\\java\\recursos/logo(2).png");
        return retValue;
    }    
    
    private final ControlSocio cs;
    private Socio socio;
    
    private ArrayList<Membresia> mems;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelSouthLeft;
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<Membresia> cbMembresias;
    private javax.swing.JCheckBox cbPagos;
    private javax.swing.JComboBox<String> cbProvincia;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel lblObMembresia;
    private javax.swing.JLabel lblObNombre;
    private javax.swing.JLabel lblPiso;
    private javax.swing.JLabel lblProvincia;
    private javax.swing.JLabel lblPuerta;
    private javax.swing.JLabel lblTlf;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelSouth;
    private javax.swing.JPanel panelSouthRight;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfCodPostal;
    private javax.swing.JTextField tfDNI;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JFormattedTextField tfFechaNacimiento;
    private javax.swing.JTextField tfLocalidad;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfPiso;
    private javax.swing.JTextField tfPuerta;
    private javax.swing.JFormattedTextField tfTlf;
    // End of variables declaration//GEN-END:variables
}