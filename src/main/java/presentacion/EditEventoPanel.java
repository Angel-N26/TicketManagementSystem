package presentacion;

import com.toedter.calendar.JTextFieldDateEditor;
import dominio.ControlEvento;
import dominio.Evento;
import java.awt.CardLayout;
import java.awt.Color;
import java.sql.Date;
import java.sql.Time;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author angel
 **/
public class EditEventoPanel extends javax.swing.JPanel {

    public EditEventoPanel() {
        initComponents();
        this.ce = new ControlEvento();
    }
    
    public EditEventoPanel(Evento e){
        this.eve = e;
        initComponents();
        this.ce = new ControlEvento();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelSouth = new javax.swing.JPanel();
        panelSouthLeft = new javax.swing.JPanel();
        kButton3 = new keeptoo.KButton();
        panelSouthRigth = new javax.swing.JPanel();
        kButton2 = new keeptoo.KButton();
        kButton1 = new keeptoo.KButton();
        panelCenter = new javax.swing.JPanel();
        lblImg = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        tfTipo = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        tfNombreRecinto = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        tfHora = new javax.swing.JTextField();
        lblCapacidad = new javax.swing.JLabel();
        tfCapacidad = new javax.swing.JTextField();
        lblEntradasVendidas = new javax.swing.JLabel();
        tfEntradasVendidas = new javax.swing.JTextField();
        lblNombreRecinto = new javax.swing.JLabel();
        tfLocalidad = new javax.swing.JTextField();
        cbProvincia = new javax.swing.JComboBox<>();
        tfCalle = new javax.swing.JTextField();
        tfNumero = new javax.swing.JTextField();
        lblCalle = new javax.swing.JLabel();
        tfCodPostal = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        lblCodPostal = new javax.swing.JLabel();
        lblLocalidad = new javax.swing.JLabel();
        lblProvincia = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lblDireccion1 = new javax.swing.JLabel();

        jPanel1.setPreferredSize(new java.awt.Dimension(770, 550));
        jPanel1.setLayout(new java.awt.BorderLayout());

        panelSouth.setBackground(new java.awt.Color(51, 51, 51));
        panelSouth.setName("panelSouth"); // NOI18N
        panelSouth.setPreferredSize(new java.awt.Dimension(215, 75));
        panelSouth.setLayout(new java.awt.GridLayout(1, 2));

        panelSouthLeft.setBackground(new java.awt.Color(51, 51, 51));
        panelSouthLeft.setName("panelSouthLeft"); // NOI18N
        panelSouthLeft.setPreferredSize(new java.awt.Dimension(400, 75));
        panelSouthLeft.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 20, 20));

        kButton3.setBorder(null);
        kButton3.setText("Eliminar");
        kButton3.setkEndColor(new java.awt.Color(51, 0, 51));
        kButton3.setkStartColor(new java.awt.Color(204, 0, 204));
        kButton3.setPreferredSize(new java.awt.Dimension(180, 35));
        kButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton3MouseClicked(evt);
            }
        });
        panelSouthLeft.add(kButton3);

        panelSouth.add(panelSouthLeft);

        panelSouthRigth.setBackground(new java.awt.Color(51, 51, 51));
        panelSouthRigth.setName("panelSouthRigth"); // NOI18N
        panelSouthRigth.setPreferredSize(new java.awt.Dimension(400, 75));
        panelSouthRigth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 20, 20));

        kButton2.setBorder(null);
        kButton2.setText("Cancelar");
        kButton2.setkEndColor(new java.awt.Color(51, 0, 51));
        kButton2.setkStartColor(new java.awt.Color(204, 0, 204));
        kButton2.setPreferredSize(new java.awt.Dimension(180, 35));
        kButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton2MouseClicked(evt);
            }
        });
        panelSouthRigth.add(kButton2);

        kButton1.setBorder(null);
        kButton1.setText("Añadir");
        kButton1.setkEndColor(new java.awt.Color(51, 0, 51));
        kButton1.setkStartColor(new java.awt.Color(204, 0, 204));
        kButton1.setPreferredSize(new java.awt.Dimension(180, 35));
        kButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton1MouseClicked(evt);
            }
        });
        panelSouthRigth.add(kButton1);

        panelSouth.add(panelSouthRigth);

        jPanel1.add(panelSouth, java.awt.BorderLayout.PAGE_END);

        panelCenter.setBackground(new java.awt.Color(51, 51, 51));
        panelCenter.setName("panelCenter"); // NOI18N
        panelCenter.setPreferredSize(new java.awt.Dimension(770, 475));
        panelCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImg.setName("lblImg"); // NOI18N
        panelCenter.add(lblImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");
        lblNombre.setName("lblNombre"); // NOI18N
        panelCenter.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        tfNombre.setBackground(new java.awt.Color(51, 51, 51));
        tfNombre.setForeground(new java.awt.Color(255, 255, 255));
        tfNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
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
        panelCenter.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 270, 25));

        lblTipo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo.setText("Tipo");
        lblTipo.setName("lblTipo"); // NOI18N
        panelCenter.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

        tfTipo.setBackground(new java.awt.Color(51, 51, 51));
        tfTipo.setForeground(new java.awt.Color(255, 255, 255));
        tfTipo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfTipo.setCaretColor(new java.awt.Color(204, 0, 204));
        tfTipo.setName("tfTipo"); // NOI18N
        tfTipo.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfTipo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfTipoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfTipoFocusLost(evt);
            }
        });
        panelCenter.add(tfTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 250, 25));

        lblDireccion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setText("Direccion & Fecha");
        lblDireccion.setName("lblDireccion"); // NOI18N
        panelCenter.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        tfNombreRecinto.setBackground(new java.awt.Color(51, 51, 51));
        tfNombreRecinto.setForeground(new java.awt.Color(255, 255, 255));
        tfNombreRecinto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfNombreRecinto.setCaretColor(new java.awt.Color(204, 0, 204));
        tfNombreRecinto.setName("tfNombreRecinto"); // NOI18N
        tfNombreRecinto.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfNombreRecinto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNombreRecintoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNombreRecintoFocusLost(evt);
            }
        });
        panelCenter.add(tfNombreRecinto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 260, 25));

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Fecha");
        lblFecha.setName("lblFecha"); // NOI18N
        panelCenter.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        lblHora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("Hora");
        lblHora.setName("lblHora"); // NOI18N
        panelCenter.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, -1));

        tfHora.setBackground(new java.awt.Color(51, 51, 51));
        tfHora.setForeground(new java.awt.Color(255, 255, 255));
        tfHora.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfHora.setCaretColor(new java.awt.Color(204, 0, 204));
        tfHora.setName("tfHora"); // NOI18N
        tfHora.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfHora.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfHoraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfHoraFocusLost(evt);
            }
        });
        panelCenter.add(tfHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 60, 25));

        lblCapacidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCapacidad.setForeground(new java.awt.Color(255, 255, 255));
        lblCapacidad.setText("Capacidad");
        lblCapacidad.setName("lblCapacidad"); // NOI18N
        panelCenter.add(lblCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        tfCapacidad.setBackground(new java.awt.Color(51, 51, 51));
        tfCapacidad.setForeground(new java.awt.Color(255, 255, 255));
        tfCapacidad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfCapacidad.setCaretColor(new java.awt.Color(204, 0, 204));
        tfCapacidad.setName("tfCapacidad"); // NOI18N
        tfCapacidad.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfCapacidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCapacidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCapacidadFocusLost(evt);
            }
        });
        panelCenter.add(tfCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 125, 25));

        lblEntradasVendidas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEntradasVendidas.setForeground(new java.awt.Color(255, 255, 255));
        lblEntradasVendidas.setText("Entradas vendidas");
        lblEntradasVendidas.setName("lblEntradasVendidas"); // NOI18N
        panelCenter.add(lblEntradasVendidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 160, 110, -1));

        tfEntradasVendidas.setBackground(new java.awt.Color(51, 51, 51));
        tfEntradasVendidas.setForeground(new java.awt.Color(255, 255, 255));
        tfEntradasVendidas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfEntradasVendidas.setCaretColor(new java.awt.Color(204, 0, 204));
        tfEntradasVendidas.setName("tfEntradasVendidas"); // NOI18N
        tfEntradasVendidas.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfEntradasVendidas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfEntradasVendidasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfEntradasVendidasFocusLost(evt);
            }
        });
        panelCenter.add(tfEntradasVendidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 180, 125, 25));

        lblNombreRecinto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombreRecinto.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreRecinto.setText("Nombre Recinto");
        lblNombreRecinto.setName("lblNombreRecinto"); // NOI18N
        panelCenter.add(lblNombreRecinto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        tfLocalidad.setBackground(new java.awt.Color(51, 51, 51));
        tfLocalidad.setForeground(new java.awt.Color(255, 255, 255));
        tfLocalidad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
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
        panelCenter.add(tfLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 260, 25));

        cbProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Álava", "Albacete", "Alicante", "Almeria", "Asturias", "Ávila", "Badajoz", "Barcelona", "Burgos", "Cáceres", "Cádiz", "Cantabria", "Castellón", "Ciudad Real", "Córdoba", "La Coruña", "Cuenca", "Gerona", "Granada", "Guadalajara", "Guipúzcua", "Huelva", "Huesca", "Baleares", "Jaén", "León", "Lérida", "Lugo", "Madrid", "Málaga", "Murcia", "Navarra", "Orense", "Palencia", "Las Palmas", "Pontevedra", "La Rioja", "Salamanca", "Segovia", "Sevilla", "Soria", "Tarragona", "Santa Cruz de Tenerife", "Teruel", "Toledo", "Valencia", "Valladolid", "Vizcaya", "Zamora", "Zaragoza" }));
        cbProvincia.setName("cbProvincia"); // NOI18N
        panelCenter.add(cbProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 270, 25));

        tfCalle.setBackground(new java.awt.Color(51, 51, 51));
        tfCalle.setForeground(new java.awt.Color(255, 255, 255));
        tfCalle.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfCalle.setCaretColor(new java.awt.Color(204, 0, 204));
        tfCalle.setName("tfCalle"); // NOI18N
        tfCalle.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfCalle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCalleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCalleFocusLost(evt);
            }
        });
        panelCenter.add(tfCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 270, 25));

        tfNumero.setBackground(new java.awt.Color(51, 51, 51));
        tfNumero.setForeground(new java.awt.Color(255, 255, 255));
        tfNumero.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
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
        panelCenter.add(tfNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 80, 25));

        lblCalle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCalle.setForeground(new java.awt.Color(255, 255, 255));
        lblCalle.setText("Calle");
        lblCalle.setName("lblCalle"); // NOI18N
        panelCenter.add(lblCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        tfCodPostal.setBackground(new java.awt.Color(51, 51, 51));
        tfCodPostal.setForeground(new java.awt.Color(255, 255, 255));
        tfCodPostal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
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
        panelCenter.add(tfCodPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 80, 25));

        lblNumero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero.setText("Numero");
        lblNumero.setName("lblNumero"); // NOI18N
        panelCenter.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, -1, -1));

        lblCodPostal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCodPostal.setForeground(new java.awt.Color(255, 255, 255));
        lblCodPostal.setText("Codigo Postal");
        lblCodPostal.setName("lblCodPostal"); // NOI18N
        panelCenter.add(lblCodPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, -1, -1));

        lblLocalidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLocalidad.setForeground(new java.awt.Color(255, 255, 255));
        lblLocalidad.setText("Localidad");
        lblLocalidad.setName("lblLocalidad"); // NOI18N
        panelCenter.add(lblLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        lblProvincia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblProvincia.setForeground(new java.awt.Color(255, 255, 255));
        lblProvincia.setText("Provincia");
        lblProvincia.setName("lblProvincia"); // NOI18N
        panelCenter.add(lblProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 184, 184));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\editar.png")); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        panelCenter.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 190));

        JTextFieldDateEditor dateChooserEditor1 = ((JTextFieldDateEditor)jDateChooser1.getDateEditor());
        dateChooserEditor1.setBackground(new Color(51, 51, 51));
        dateChooserEditor1.setForeground(new Color(255, 255, 255));
        dateChooserEditor1.setEditable(false);
        dateChooserEditor1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        jDateChooser1.getCalendarButton().setSize(25, 25);
        jDateChooser1.getCalendarButton().setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\calendario-white.png"));
        jDateChooser1.getCalendarButton().setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jDateChooser1.getCalendarButton().setBackground(new Color(51,51,51));
        jDateChooser1.getCalendarButton().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCenter.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 180, 25));

        lblDireccion1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDireccion1.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion1.setText("Datos del Evento");
        lblDireccion1.setName("lblDireccion"); // NOI18N
        panelCenter.add(lblDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jPanel1.add(panelCenter, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void tfTipoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTipoFocusGained
        tfTipo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 0, 204)));
    }//GEN-LAST:event_tfTipoFocusGained

    private void tfTipoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTipoFocusLost
        tfTipo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
    }//GEN-LAST:event_tfTipoFocusLost

    private void tfNombreRecintoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreRecintoFocusGained
        tfNombreRecinto.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 0, 204)));
    }//GEN-LAST:event_tfNombreRecintoFocusGained

    private void tfNombreRecintoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreRecintoFocusLost
        tfNombreRecinto.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
    }//GEN-LAST:event_tfNombreRecintoFocusLost

    private void tfHoraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfHoraFocusGained
        tfHora.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 0, 204)));
    }//GEN-LAST:event_tfHoraFocusGained

    private void tfHoraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfHoraFocusLost
        tfHora.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
    }//GEN-LAST:event_tfHoraFocusLost

    private void tfCapacidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCapacidadFocusGained
        tfCapacidad.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 0, 204)));
    }//GEN-LAST:event_tfCapacidadFocusGained

    private void tfCapacidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCapacidadFocusLost
        tfCapacidad.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
    }//GEN-LAST:event_tfCapacidadFocusLost

    private void tfEntradasVendidasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEntradasVendidasFocusGained
        tfEntradasVendidas.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 0, 204)));
    }//GEN-LAST:event_tfEntradasVendidasFocusGained

    private void tfEntradasVendidasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEntradasVendidasFocusLost
        tfEntradasVendidas.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
    }//GEN-LAST:event_tfEntradasVendidasFocusLost

    private void tfLocalidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLocalidadFocusGained
        tfLocalidad.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 0, 204)));
    }//GEN-LAST:event_tfLocalidadFocusGained

    private void tfLocalidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLocalidadFocusLost
        tfLocalidad.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
    }//GEN-LAST:event_tfLocalidadFocusLost

    private void tfCalleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCalleFocusGained
        tfCalle.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 0, 204)));
    }//GEN-LAST:event_tfCalleFocusGained

    private void tfCalleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCalleFocusLost
        tfCalle.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
    }//GEN-LAST:event_tfCalleFocusLost

    private void tfNumeroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNumeroFocusGained
        tfNumero.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 0, 204)));
    }//GEN-LAST:event_tfNumeroFocusGained

    private void tfNumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNumeroFocusLost
        tfNumero.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
    }//GEN-LAST:event_tfNumeroFocusLost

    private void tfCodPostalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCodPostalFocusGained
        tfCodPostal.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 0, 204)));
    }//GEN-LAST:event_tfCodPostalFocusGained

    private void tfCodPostalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCodPostalFocusLost
        tfCodPostal.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
    }//GEN-LAST:event_tfCodPostalFocusLost

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void kButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton1MouseClicked
        Evento evento = new Evento(eve.getId(), tfNombre.getText(), tfTipo.getText(),
            direccion(), Date.valueOf(jDateChooser1.getDateFormatString()), Time.valueOf(tfHora.getText()),
            Integer.parseInt(tfCapacidad.getText()), Integer.parseInt(tfEntradasVendidas.getText()));

        if(kButton1.getText().equals("Modificar")){
            if(ce.modificarEvento(evento)){
                dispose();
            }
        }else if(kButton1.getText().equals("Añadir")){
            if(ce.insertarEvento(evento)){
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
            if(ce.eliminarEvento(eve.getId())){
                dispose();
            }
        }
    }//GEN-LAST:event_kButton3MouseClicked

    public void dispose(){
        this.show(false);
        JPanel card = (JPanel) this.getParent();
        
        EventosPanel ep = new EventosPanel();
        card.add(ep, "cardEP");
        
        CardLayout cardLayout = (CardLayout) card.getLayout();
        cardLayout.show(card, "cardEP");
    }
    
    public void rellenarCampos(){
        tfNombre.setText(eve.getNombre());
        tfTipo.setText(eve.getTipo_evento());       
        separarDireccion(eve.getLugar_evento());
        jDateChooser1.setDate(eve.getFecha_evento());
        tfHora.setText(eve.getHora_evento()+"");
        tfCapacidad.setText(eve.getEntradas()+"");
        tfEntradasVendidas.setText(eve.getEntradas_vendidas()+"");
                
        kButton1.setText("Modificar");
    }
    
    public String direccion(){
        return tfNombreRecinto.getText() + ", C/" + tfCalle.getText() + ", " 
                + tfNumero.getText() + ", " + tfCodPostal.getText() + ", " 
                + tfLocalidad.getText() + ", " + cbProvincia.getSelectedItem();
    }
    
    public void separarDireccion(String dir){
        String [] d = dir.split(","); //Separar los componentes por las ,        
        tfNombreRecinto.setText(d[0]);
        String [] c = d[1].split("/"); //Separar la C/ 
        tfCalle.setText(c[1]);
        tfNumero.setText(d[2]);                                
        tfCodPostal.setText(d[3]);
        tfLocalidad.setText(d[4]);
        cbProvincia.setSelectedItem(d[5].replaceFirst(" ", ""));                                   
    }    
    
    private final ControlEvento ce;
    private  Evento eve;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbProvincia;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private keeptoo.KButton kButton3;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblCapacidad;
    private javax.swing.JLabel lblCodPostal;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDireccion1;
    private javax.swing.JLabel lblEntradasVendidas;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblLocalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreRecinto;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblProvincia;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelSouth;
    private javax.swing.JPanel panelSouthLeft;
    private javax.swing.JPanel panelSouthRigth;
    private javax.swing.JTextField tfCalle;
    private javax.swing.JTextField tfCapacidad;
    private javax.swing.JTextField tfCodPostal;
    private javax.swing.JTextField tfEntradasVendidas;
    private javax.swing.JTextField tfHora;
    private javax.swing.JTextField tfLocalidad;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNombreRecinto;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfTipo;
    // End of variables declaration//GEN-END:variables
}
