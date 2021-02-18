package presentacion;

import dominio.Asociacion;
import dominio.Colores;
import dominio.ControlAsociacion;
import java.awt.Color;
import java.sql.Date;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import com.toedter.calendar.JCalendar;

/**
 * @author angel
 **/
public class AsociacionPanel extends javax.swing.JPanel implements Colores {

    public AsociacionPanel() {
        initComponents();
        rellenarCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCenterAsoc = new javax.swing.JPanel();
        lblNameAsoc = new javax.swing.JLabel();
        tfNombreAsoc = new javax.swing.JTextField();
        lblTlfAsoc = new javax.swing.JLabel();
        tfTlfAsoc = new javax.swing.JTextField();
        lblCorreoAsoc = new javax.swing.JLabel();
        tfCorreoAsoc = new javax.swing.JTextField();
        lblDirAsoc = new javax.swing.JLabel();
        tfDirAsoc = new javax.swing.JTextField();
        lblPobAsoc = new javax.swing.JLabel();
        tfPobAsoc = new javax.swing.JTextField();
        lblCiuAsoc = new javax.swing.JLabel();
        tfCiuAsoc = new javax.swing.JTextField();
        lblCIFAsoc = new javax.swing.JLabel();
        tfCIFAsoc = new javax.swing.JTextField();
        lblNRegAsoc = new javax.swing.JLabel();
        tfNRegAsoc = new javax.swing.JTextField();
        panelEastAsoc = new javax.swing.JPanel();
        logoAsoc = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        kButton1 = new keeptoo.KButton();
        jLabel10 = new javax.swing.JLabel();

        panelCenterAsoc.setBackground(new java.awt.Color(51, 51, 51));
        panelCenterAsoc.setName("panelCenterAsoc"); // NOI18N
        panelCenterAsoc.setPreferredSize(new java.awt.Dimension(800, 550));
        panelCenterAsoc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNameAsoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNameAsoc.setForeground(new java.awt.Color(255, 255, 255));
        lblNameAsoc.setText("Nombre");
        lblNameAsoc.setName("lblNameAsoc"); // NOI18N
        panelCenterAsoc.add(lblNameAsoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 260, -1));

        tfNombreAsoc.setEditable(false);
        tfNombreAsoc.setBackground(new java.awt.Color(51, 51, 51));
        tfNombreAsoc.setForeground(new java.awt.Color(153, 153, 153));
        tfNombreAsoc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfNombreAsoc.setCaretColor(new java.awt.Color(204, 0, 204));
        tfNombreAsoc.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        tfNombreAsoc.setName("tfNombreAsoc"); // NOI18N
        tfNombreAsoc.setOpaque(false);
        tfNombreAsoc.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfNombreAsoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNombreAsocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNombreAsocFocusLost(evt);
            }
        });
        panelCenterAsoc.add(tfNombreAsoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 260, 25));

        lblTlfAsoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTlfAsoc.setForeground(new java.awt.Color(255, 255, 255));
        lblTlfAsoc.setText("Telefono");
        lblTlfAsoc.setName("lblTlfAsoc"); // NOI18N
        panelCenterAsoc.add(lblTlfAsoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 240, -1));

        tfTlfAsoc.setEditable(false);
        tfTlfAsoc.setBackground(new java.awt.Color(51, 51, 51));
        tfTlfAsoc.setForeground(new java.awt.Color(153, 153, 153));
        tfTlfAsoc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfTlfAsoc.setCaretColor(new java.awt.Color(204, 0, 204));
        tfTlfAsoc.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        tfTlfAsoc.setName("tfTlfAsoc"); // NOI18N
        tfTlfAsoc.setOpaque(false);
        tfTlfAsoc.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfTlfAsoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfTlfAsocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfTlfAsocFocusLost(evt);
            }
        });
        panelCenterAsoc.add(tfTlfAsoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 240, 25));

        lblCorreoAsoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCorreoAsoc.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreoAsoc.setText("Correo");
        lblCorreoAsoc.setName("lblCorreoAsoc"); // NOI18N
        panelCenterAsoc.add(lblCorreoAsoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 530, -1));

        tfCorreoAsoc.setEditable(false);
        tfCorreoAsoc.setBackground(new java.awt.Color(51, 51, 51));
        tfCorreoAsoc.setForeground(new java.awt.Color(153, 153, 153));
        tfCorreoAsoc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfCorreoAsoc.setCaretColor(new java.awt.Color(204, 0, 204));
        tfCorreoAsoc.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        tfCorreoAsoc.setName("tfCorreoAsoc"); // NOI18N
        tfCorreoAsoc.setOpaque(false);
        tfCorreoAsoc.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfCorreoAsoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCorreoAsocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCorreoAsocFocusLost(evt);
            }
        });
        panelCenterAsoc.add(tfCorreoAsoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 530, 25));

        lblDirAsoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDirAsoc.setForeground(new java.awt.Color(255, 255, 255));
        lblDirAsoc.setText("Calle");
        lblDirAsoc.setName("lblDirAsoc"); // NOI18N
        panelCenterAsoc.add(lblDirAsoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 310, -1));

        tfDirAsoc.setEditable(false);
        tfDirAsoc.setBackground(new java.awt.Color(51, 51, 51));
        tfDirAsoc.setForeground(new java.awt.Color(153, 153, 153));
        tfDirAsoc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfDirAsoc.setCaretColor(new java.awt.Color(204, 0, 204));
        tfDirAsoc.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        tfDirAsoc.setName("tfDirAsoc"); // NOI18N
        tfDirAsoc.setOpaque(false);
        tfDirAsoc.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfDirAsoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDirAsocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDirAsocFocusLost(evt);
            }
        });
        panelCenterAsoc.add(tfDirAsoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 310, 25));

        lblPobAsoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPobAsoc.setForeground(new java.awt.Color(255, 255, 255));
        lblPobAsoc.setText("Localidad");
        lblPobAsoc.setName("lblPobAsoc"); // NOI18N
        panelCenterAsoc.add(lblPobAsoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 310, -1));

        tfPobAsoc.setEditable(false);
        tfPobAsoc.setBackground(new java.awt.Color(51, 51, 51));
        tfPobAsoc.setForeground(new java.awt.Color(153, 153, 153));
        tfPobAsoc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfPobAsoc.setCaretColor(new java.awt.Color(204, 0, 204));
        tfPobAsoc.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        tfPobAsoc.setName("tfPobAsoc"); // NOI18N
        tfPobAsoc.setOpaque(false);
        tfPobAsoc.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfPobAsoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPobAsocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPobAsocFocusLost(evt);
            }
        });
        panelCenterAsoc.add(tfPobAsoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 310, 25));

        lblCiuAsoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCiuAsoc.setForeground(new java.awt.Color(255, 255, 255));
        lblCiuAsoc.setText("Provincia");
        lblCiuAsoc.setName("lblCiuAsoc"); // NOI18N
        panelCenterAsoc.add(lblCiuAsoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 230, -1));

        tfCiuAsoc.setEditable(false);
        tfCiuAsoc.setBackground(new java.awt.Color(51, 51, 51));
        tfCiuAsoc.setForeground(new java.awt.Color(153, 153, 153));
        tfCiuAsoc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfCiuAsoc.setCaretColor(new java.awt.Color(204, 0, 204));
        tfCiuAsoc.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        tfCiuAsoc.setName("tfCiuAsoc"); // NOI18N
        tfCiuAsoc.setNextFocusableComponent(tfCIFAsoc);
        tfCiuAsoc.setOpaque(false);
        tfCiuAsoc.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfCiuAsoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCiuAsocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCiuAsocFocusLost(evt);
            }
        });
        panelCenterAsoc.add(tfCiuAsoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 230, 25));

        lblCIFAsoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCIFAsoc.setForeground(new java.awt.Color(255, 255, 255));
        lblCIFAsoc.setText("C.I.F");
        lblCIFAsoc.setName("lblCIFAsoc"); // NOI18N
        panelCenterAsoc.add(lblCIFAsoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 210, -1));

        tfCIFAsoc.setEditable(false);
        tfCIFAsoc.setBackground(new java.awt.Color(51, 51, 51));
        tfCIFAsoc.setForeground(new java.awt.Color(153, 153, 153));
        tfCIFAsoc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfCIFAsoc.setCaretColor(new java.awt.Color(204, 0, 204));
        tfCIFAsoc.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        tfCIFAsoc.setName("tfCIFAsoc"); // NOI18N
        tfCIFAsoc.setOpaque(false);
        tfCIFAsoc.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfCIFAsoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCIFAsocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCIFAsocFocusLost(evt);
            }
        });
        panelCenterAsoc.add(tfCIFAsoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 210, 25));

        lblNRegAsoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNRegAsoc.setForeground(new java.awt.Color(255, 255, 255));
        lblNRegAsoc.setText("Nº Registro");
        lblNRegAsoc.setName("lblNRegAsoc"); // NOI18N
        panelCenterAsoc.add(lblNRegAsoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 210, -1));

        tfNRegAsoc.setEditable(false);
        tfNRegAsoc.setBackground(new java.awt.Color(51, 51, 51));
        tfNRegAsoc.setForeground(new java.awt.Color(153, 153, 153));
        tfNRegAsoc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfNRegAsoc.setCaretColor(new java.awt.Color(204, 0, 204));
        tfNRegAsoc.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        tfNRegAsoc.setName("tfNRegAsoc"); // NOI18N
        tfNRegAsoc.setOpaque(false);
        tfNRegAsoc.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfNRegAsoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNRegAsocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNRegAsocFocusLost(evt);
            }
        });
        panelCenterAsoc.add(tfNRegAsoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 210, 25));

        panelEastAsoc.setBackground(new java.awt.Color(51, 51, 51));
        panelEastAsoc.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        panelEastAsoc.setName("panelEastAsoc"); // NOI18N
        panelEastAsoc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoAsoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoAsoc.setName("logoAsoc"); // NOI18N
        panelEastAsoc.add(logoAsoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 184, 184));

        jLabel1.setVisible(false);
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\editar.png")); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        panelEastAsoc.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        panelCenterAsoc.add(panelEastAsoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 190));

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelCenterAsoc.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 190, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha Creacion Asociacion");
        panelCenterAsoc.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 210, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        jTextField1.setCaretColor(new java.awt.Color(204, 0, 204));
        jTextField1.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextField1.setOpaque(false);
        jTextField1.setSelectionColor(new java.awt.Color(204, 0, 204));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        panelCenterAsoc.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 210, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo");
        panelCenterAsoc.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 240, -1));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(51, 51, 51));
        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        jTextField2.setCaretColor(new java.awt.Color(204, 0, 204));
        jTextField2.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextField2.setOpaque(false);
        jTextField2.setSelectionColor(new java.awt.Color(204, 0, 204));
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        panelCenterAsoc.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 240, 25));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\calendar.png")); // NOI18N
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setEnabled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        panelCenterAsoc.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 40, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numero");
        panelCenterAsoc.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 60, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Codigo Postal");
        panelCenterAsoc.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 130, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Piso");
        panelCenterAsoc.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 50, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Puerta");
        panelCenterAsoc.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 50, -1));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(51, 51, 51));
        jTextField3.setForeground(new java.awt.Color(153, 153, 153));
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        jTextField3.setCaretColor(new java.awt.Color(204, 0, 204));
        jTextField3.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextField3.setOpaque(false);
        jTextField3.setSelectionColor(new java.awt.Color(204, 0, 204));
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        panelCenterAsoc.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 60, 25));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(51, 51, 51));
        jTextField4.setForeground(new java.awt.Color(153, 153, 153));
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        jTextField4.setCaretColor(new java.awt.Color(204, 0, 204));
        jTextField4.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextField4.setOpaque(false);
        jTextField4.setSelectionColor(new java.awt.Color(204, 0, 204));
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        panelCenterAsoc.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 50, 25));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(51, 51, 51));
        jTextField5.setForeground(new java.awt.Color(153, 153, 153));
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        jTextField5.setCaretColor(new java.awt.Color(204, 0, 204));
        jTextField5.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextField5.setOpaque(false);
        jTextField5.setSelectionColor(new java.awt.Color(204, 0, 204));
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });
        panelCenterAsoc.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 50, 25));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(51, 51, 51));
        jTextField6.setForeground(new java.awt.Color(153, 153, 153));
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        jTextField6.setCaretColor(new java.awt.Color(204, 0, 204));
        jTextField6.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextField6.setOpaque(false);
        jTextField6.setSelectionColor(new java.awt.Color(204, 0, 204));
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField6FocusLost(evt);
            }
        });
        panelCenterAsoc.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 130, 25));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Datos Juridicos");
        panelCenterAsoc.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        kButton1.setText("Editar");
        kButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kButton1.setkBorderRadius(20);
        kButton1.setkEndColor(new java.awt.Color(51, 0, 51));
        kButton1.setkStartColor(new java.awt.Color(204, 0, 204));
        kButton1.setNextFocusableComponent(tfNombreAsoc);
        kButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton1MouseClicked(evt);
            }
        });
        panelCenterAsoc.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Dirección");
        panelCenterAsoc.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCenterAsoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCenterAsoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfNombreAsocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreAsocFocusGained
        if(tfNombreAsoc.isEditable())
            tfNombreAsoc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
    }//GEN-LAST:event_tfNombreAsocFocusGained

    private void tfNombreAsocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreAsocFocusLost
        tfNombreAsoc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
    }//GEN-LAST:event_tfNombreAsocFocusLost

    private void tfTlfAsocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTlfAsocFocusGained
        if(tfTlfAsoc.isEditable())
            tfTlfAsoc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
    }//GEN-LAST:event_tfTlfAsocFocusGained

    private void tfTlfAsocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTlfAsocFocusLost
        tfTlfAsoc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
    }//GEN-LAST:event_tfTlfAsocFocusLost

    private void tfCorreoAsocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCorreoAsocFocusGained
        if(tfCorreoAsoc.isEditable())
            tfCorreoAsoc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
    }//GEN-LAST:event_tfCorreoAsocFocusGained

    private void tfCorreoAsocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCorreoAsocFocusLost
        tfCorreoAsoc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
    }//GEN-LAST:event_tfCorreoAsocFocusLost

    private void tfDirAsocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDirAsocFocusGained
        if(tfDirAsoc.isEditable())
            tfDirAsoc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
    }//GEN-LAST:event_tfDirAsocFocusGained

    private void tfDirAsocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDirAsocFocusLost
        tfDirAsoc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
    }//GEN-LAST:event_tfDirAsocFocusLost

    private void tfPobAsocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPobAsocFocusGained
        if(tfPobAsoc.isEditable())
            tfPobAsoc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
    }//GEN-LAST:event_tfPobAsocFocusGained

    private void tfPobAsocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPobAsocFocusLost
        tfPobAsoc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
    }//GEN-LAST:event_tfPobAsocFocusLost

    private void tfCiuAsocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCiuAsocFocusGained
        if(tfCiuAsoc.isEditable())
            tfCiuAsoc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
    }//GEN-LAST:event_tfCiuAsocFocusGained

    private void tfCiuAsocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCiuAsocFocusLost
        tfCiuAsoc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
    }//GEN-LAST:event_tfCiuAsocFocusLost

    private void tfCIFAsocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCIFAsocFocusGained
        if(tfCIFAsoc.isEditable())
            tfCIFAsoc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
    }//GEN-LAST:event_tfCIFAsocFocusGained

    private void tfCIFAsocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCIFAsocFocusLost
        tfCIFAsoc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
    }//GEN-LAST:event_tfCIFAsocFocusLost

    private void tfNRegAsocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNRegAsocFocusGained
        if(tfNRegAsoc.isEditable())
            tfNRegAsoc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
    }//GEN-LAST:event_tfNRegAsocFocusGained

    private void tfNRegAsocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNRegAsocFocusLost
        tfNRegAsoc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
    }//GEN-LAST:event_tfNRegAsocFocusLost

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        if(jTextField2.isEditable())
            jTextField2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        jTextField2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        if(jTextField1.isEditable())
            jTextField1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        jTextField1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        if(jTextField3.isEditable())
            jTextField3.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        jTextField3.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        if(jTextField4.isEditable())
            jTextField4.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        jTextField4.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
    }//GEN-LAST:event_jTextField4FocusLost

    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusGained
        if(jTextField5.isEditable())
            jTextField5.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
    }//GEN-LAST:event_jTextField5FocusGained

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
        jTextField5.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
    }//GEN-LAST:event_jTextField5FocusLost

    private void jTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusGained
        if(jTextField6.isEditable())
            jTextField6.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, SELECTED));
    }//GEN-LAST:event_jTextField6FocusGained

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        jTextField6.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, NOSELECTED));
    }//GEN-LAST:event_jTextField6FocusLost

    private void kButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton1MouseClicked
        if(kButton1.getText().equals("Editar")){
            editable(true, WORDS_WHITE);
            kButton1.setText("Guardar");
        }else{
            ControlAsociacion ca = new ControlAsociacion();
            Asociacion asoc = new Asociacion(tfNombreAsoc.getText(),jTextField2.getText(),
                Date.valueOf(jTextField1.getText()), Integer.parseInt(tfTlfAsoc.getText()),
                tfCorreoAsoc.getText(), tfDirAsoc.getText(), tfCIFAsoc.getText(),
                Integer.parseInt(tfNRegAsoc.getText()), null);
            if(ca.modificarAsociacion(asoc)){
                editable(false, WORDS_GRAY);
                kButton1.setText("Editar");
            }
        }
    }//GEN-LAST:event_kButton1MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        JFileChooser fc = new JFileChooser();
        int seleccion = fc.showOpenDialog(this);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        JCalendar c = new JCalendar();
        c.setVisible(true);
        
    }//GEN-LAST:event_jButton1MouseClicked

    public void rellenarCampos(){
        ControlAsociacion ca = new ControlAsociacion();
        Asociacion asoc = ca.obtenerAsociacion("21");
        tfNombreAsoc.setText(asoc.getNombre());
        jLabel2.setText(asoc.getNombre());
        jTextField2.setText(asoc.getTipo());
        jTextField1.setText(asoc.getFecha()+"");
        tfTlfAsoc.setText(asoc.getTelefono()+"");
        tfCorreoAsoc.setText(asoc.getEmail());
        tfDirAsoc.setText(asoc.getDireccion());        
        tfCIFAsoc.setText(asoc.getCIF());
        tfNRegAsoc.setText(asoc.getnRegistro()+"");        
    }
    
    public void editable(boolean b, Color c){
        tfNombreAsoc.setEditable(b);
        tfNombreAsoc.setForeground(c);
        //tfNombreAsoc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, c2));        
        jTextField2.setEditable(b);
        jTextField2.setForeground(c);
        //jTextField2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, c2));        
        jTextField1.setEditable(b);
        jTextField1.setForeground(c);
        //jTextField1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, c2));        
        tfTlfAsoc.setEditable(b);
        tfTlfAsoc.setForeground(c);
        //tfTlfAsoc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, c2));        
        tfCorreoAsoc.setEditable(b);
        tfCorreoAsoc.setForeground(c);        
        //tfCorreoAsoc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, c2));        
        tfDirAsoc.setEditable(b);
        tfDirAsoc.setForeground(c);
        //tfDirAsoc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, c2));        
        jTextField3.setEditable(b);
        jTextField3.setForeground(c);
        //jTextField3.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, c2));        
        jTextField4.setEditable(b);
        jTextField4.setForeground(c);
        //jTextField4.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, c2));        
        jTextField5.setEditable(b);
        jTextField5.setForeground(c);
        //jTextField5.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, c2));        
        jTextField6.setEditable(b);
        jTextField6.setForeground(c);
        //jTextField6.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, c2));        
        tfPobAsoc.setEditable(b);
        tfPobAsoc.setForeground(c);
        //tfPobAsoc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, c2));        
        tfCiuAsoc.setEditable(b);
        tfCiuAsoc.setForeground(c);
        //tfCiuAsoc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, c2));        
        tfCIFAsoc.setEditable(b);
        tfCIFAsoc.setForeground(c);
        //tfCIFAsoc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, c2));        
        tfNRegAsoc.setEditable(b);
        tfNRegAsoc.setForeground(c);
        //tfNRegAsoc.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, c2));
        
        jLabel1.setVisible(b);
        jButton1.setEnabled(b);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private keeptoo.KButton kButton1;
    private javax.swing.JLabel lblCIFAsoc;
    private javax.swing.JLabel lblCiuAsoc;
    private javax.swing.JLabel lblCorreoAsoc;
    private javax.swing.JLabel lblDirAsoc;
    private javax.swing.JLabel lblNRegAsoc;
    private javax.swing.JLabel lblNameAsoc;
    private javax.swing.JLabel lblPobAsoc;
    private javax.swing.JLabel lblTlfAsoc;
    private javax.swing.JLabel logoAsoc;
    private javax.swing.JPanel panelCenterAsoc;
    private javax.swing.JPanel panelEastAsoc;
    private javax.swing.JTextField tfCIFAsoc;
    private javax.swing.JTextField tfCiuAsoc;
    private javax.swing.JTextField tfCorreoAsoc;
    private javax.swing.JTextField tfDirAsoc;
    private javax.swing.JTextField tfNRegAsoc;
    private javax.swing.JTextField tfNombreAsoc;
    private javax.swing.JTextField tfPobAsoc;
    private javax.swing.JTextField tfTlfAsoc;
    // End of variables declaration//GEN-END:variables
}