package presentacion;

import java.awt.CardLayout;
import java.awt.Color;

/**
 * @author angel
 */
public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelCard = new javax.swing.JPanel();
        inicioPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        asociacionPanel = new javax.swing.JPanel();
        panelEastAsoc = new javax.swing.JPanel();
        logoAsoc = new javax.swing.JLabel();
        lblNameTittle = new javax.swing.JLabel();
        lblJuntaDirectiva = new javax.swing.JLabel();
        lblMembresia = new javax.swing.JLabel();
        panelSouthAsoc = new javax.swing.JPanel();
        btnEditarAsoc = new javax.swing.JButton();
        panelCenterAsoc = new javax.swing.JPanel();
        lblNameAsoc = new javax.swing.JLabel();
        tfNombreAsoc = new javax.swing.JTextField();
        lblObNombre = new javax.swing.JLabel();
        lblTlfAsoc = new javax.swing.JLabel();
        tfTlfAsoc = new javax.swing.JTextField();
        lblObTlf = new javax.swing.JLabel();
        lblCorreoAsoc = new javax.swing.JLabel();
        tfCorreoAsoc = new javax.swing.JTextField();
        lblObCorreo = new javax.swing.JLabel();
        lblDirAsoc = new javax.swing.JLabel();
        tfDirAsoc = new javax.swing.JTextField();
        lblObDir = new javax.swing.JLabel();
        lblPobAsoc = new javax.swing.JLabel();
        tfPobAsoc = new javax.swing.JTextField();
        lblObPob = new javax.swing.JLabel();
        lblCiuAsoc = new javax.swing.JLabel();
        tfCiuAsoc = new javax.swing.JTextField();
        lblObCiu = new javax.swing.JLabel();
        lblCIFAsoc = new javax.swing.JLabel();
        tfCIFAsoc = new javax.swing.JTextField();
        lblObCIF = new javax.swing.JLabel();
        lblNRegAsoc = new javax.swing.JLabel();
        tfNRegAsoc = new javax.swing.JTextField();
        lblObNReg = new javax.swing.JLabel();
        sociosPanel = new javax.swing.JPanel();
        panelNorthSocios = new javax.swing.JPanel();
        tfBuscarSocios = new javax.swing.JTextField();
        btnBuscarSocios = new javax.swing.JButton();
        panelSouthSocios = new javax.swing.JPanel();
        btnAnadirSocios = new javax.swing.JButton();
        btnEliminarSocios = new javax.swing.JButton();
        panelCenterSocios = new javax.swing.JPanel();
        scrollPanelListSocios = new javax.swing.JScrollPane();
        listSocios = new javax.swing.JList<>();
        eventosPanel = new javax.swing.JPanel();
        panelNorthEventos = new javax.swing.JPanel();
        tfBuscarEventos = new javax.swing.JTextField();
        btnBuscarEventos = new javax.swing.JButton();
        panelSouthEventos = new javax.swing.JPanel();
        btnAnadirEventos = new javax.swing.JButton();
        btnEliminarEventos = new javax.swing.JButton();
        panelCenterEventos = new javax.swing.JPanel();
        scrollPanelListEventos = new javax.swing.JScrollPane();
        listEventos = new javax.swing.JList<>();
        entradasPanel = new javax.swing.JPanel();
        panelCenterEntradas = new javax.swing.JPanel();
        panelNumEntradas = new javax.swing.JPanel();
        lblNumEntradas = new javax.swing.JLabel();
        lblNum = new javax.swing.JLabel();
        panelListEntradas = new javax.swing.JPanel();
        scrollPanelListEntradas = new javax.swing.JScrollPane();
        listEntradas = new javax.swing.JList<>();
        panelNorthEntradas = new javax.swing.JPanel();
        panelSeleccionEvento = new javax.swing.JPanel();
        lblSeleccionEvento = new javax.swing.JLabel();
        cbSeleccionEvento = new javax.swing.JComboBox<>();
        panelGenerarEntradas = new javax.swing.JPanel();
        btnGenerarEntradas = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuAsociacion = new javax.swing.JMenu();
        menuSocios = new javax.swing.JMenu();
        menuEventos = new javax.swing.JMenu();
        menuEntradas = new javax.swing.JMenu();
        menuAyuda = new javax.swing.JMenu();
        submenuCerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicketManagementSystem");
        setResizable(false);

        panelCard.setName("panelCard"); // NOI18N
        panelCard.setPreferredSize(new java.awt.Dimension(800, 550));
        panelCard.setLayout(new java.awt.CardLayout());

        inicioPanel.setBackground(new java.awt.Color(51, 51, 51));
        inicioPanel.setName("inicioPanel"); // NOI18N
        inicioPanel.setPreferredSize(new java.awt.Dimension(800, 550));
        inicioPanel.setLayout(new java.awt.GridLayout(2, 2, 25, 25));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true), "Socios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 227, Short.MAX_VALUE)
        );

        inicioPanel.add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true), "Eventos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 227, Short.MAX_VALUE)
        );

        inicioPanel.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true), "Entradas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 227, Short.MAX_VALUE)
        );

        inicioPanel.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true), "Otros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 227, Short.MAX_VALUE)
        );

        inicioPanel.add(jPanel4);

        panelCard.add(inicioPanel, "card4");

        asociacionPanel.setName("asociacionPanel"); // NOI18N
        asociacionPanel.setPreferredSize(new java.awt.Dimension(800, 550));
        asociacionPanel.setLayout(new java.awt.BorderLayout());

        panelEastAsoc.setBackground(new java.awt.Color(51, 51, 51));
        panelEastAsoc.setName("panelEastAsoc"); // NOI18N
        panelEastAsoc.setLayout(new java.awt.GridBagLayout());

        logoAsoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoAsoc.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\logo(3).png")); // NOI18N
        logoAsoc.setName("logoAsoc"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 86;
        gridBagConstraints.ipady = 51;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panelEastAsoc.add(logoAsoc, gridBagConstraints);

        lblNameTittle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNameTittle.setForeground(new java.awt.Color(255, 255, 255));
        lblNameTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameTittle.setText("RealJazz");
        lblNameTittle.setName("lblNameTittle"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 46;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelEastAsoc.add(lblNameTittle, gridBagConstraints);

        lblJuntaDirectiva.setForeground(new java.awt.Color(51, 102, 255));
        lblJuntaDirectiva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJuntaDirectiva.setText("JuntaDirectiva");
        lblJuntaDirectiva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblJuntaDirectiva.setName("lblJuntaDirectiva"); // NOI18N
        lblJuntaDirectiva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblJuntaDirectivaMousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 81;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(61, 0, 0, 0);
        panelEastAsoc.add(lblJuntaDirectiva, gridBagConstraints);

        lblMembresia.setForeground(new java.awt.Color(51, 102, 255));
        lblMembresia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMembresia.setText("Membresia");
        lblMembresia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMembresia.setName("lblMembresia"); // NOI18N
        lblMembresia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMembresiaMousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 99;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 225, 0);
        panelEastAsoc.add(lblMembresia, gridBagConstraints);

        asociacionPanel.add(panelEastAsoc, java.awt.BorderLayout.WEST);

        panelSouthAsoc.setBackground(new java.awt.Color(51, 51, 51));
        panelSouthAsoc.setName("panelSouthAsoc"); // NOI18N
        panelSouthAsoc.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        btnEditarAsoc.setBackground(new java.awt.Color(204, 0, 204));
        btnEditarAsoc.setText("Editar");
        btnEditarAsoc.setBorder(null);
        btnEditarAsoc.setMaximumSize(new java.awt.Dimension(170, 35));
        btnEditarAsoc.setName("btnEditarAsoc"); // NOI18N
        btnEditarAsoc.setPreferredSize(new java.awt.Dimension(180, 35));
        panelSouthAsoc.add(btnEditarAsoc);

        asociacionPanel.add(panelSouthAsoc, java.awt.BorderLayout.SOUTH);

        panelCenterAsoc.setBackground(new java.awt.Color(51, 51, 51));
        panelCenterAsoc.setName("panelCenterAsoc"); // NOI18N
        panelCenterAsoc.setLayout(new java.awt.GridLayout(8, 3, 5, 35));

        lblNameAsoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNameAsoc.setForeground(new java.awt.Color(255, 255, 255));
        lblNameAsoc.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNameAsoc.setText("Nombre");
        lblNameAsoc.setName("lblNameAsoc"); // NOI18N
        panelCenterAsoc.add(lblNameAsoc);

        tfNombreAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfNombreAsoc.setForeground(new java.awt.Color(255, 255, 255));
        tfNombreAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
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
        panelCenterAsoc.add(tfNombreAsoc);

        lblObNombre.setVisible(false);
        lblObNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblObNombre.setForeground(new java.awt.Color(204, 0, 0));
        lblObNombre.setText("*");
        lblObNombre.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblObNombre.setName("lblObNombre"); // NOI18N
        panelCenterAsoc.add(lblObNombre);

        lblTlfAsoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTlfAsoc.setForeground(new java.awt.Color(255, 255, 255));
        lblTlfAsoc.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTlfAsoc.setText("Telefono");
        lblTlfAsoc.setName("lblTlfAsoc"); // NOI18N
        panelCenterAsoc.add(lblTlfAsoc);

        tfTlfAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfTlfAsoc.setForeground(new java.awt.Color(255, 255, 255));
        tfTlfAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfTlfAsoc.setCaretColor(new java.awt.Color(204, 0, 204));
        tfTlfAsoc.setName("tfTlfAsoc"); // NOI18N
        tfTlfAsoc.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfTlfAsoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfTlfAsocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfTlfAsocFocusLost(evt);
            }
        });
        panelCenterAsoc.add(tfTlfAsoc);

        lblObTlf.setVisible(false);
        lblObTlf.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblObTlf.setForeground(new java.awt.Color(204, 0, 0));
        lblObTlf.setText("*");
        lblObTlf.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblObTlf.setName("lblObTlf"); // NOI18N
        panelCenterAsoc.add(lblObTlf);

        lblCorreoAsoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCorreoAsoc.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreoAsoc.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCorreoAsoc.setText("Correo");
        lblCorreoAsoc.setName("lblCorreoAsoc"); // NOI18N
        panelCenterAsoc.add(lblCorreoAsoc);

        tfCorreoAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfCorreoAsoc.setForeground(new java.awt.Color(255, 255, 255));
        tfCorreoAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfCorreoAsoc.setCaretColor(new java.awt.Color(204, 0, 204));
        tfCorreoAsoc.setName("tfCorreoAsoc"); // NOI18N
        tfCorreoAsoc.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfCorreoAsoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCorreoAsocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCorreoAsocFocusLost(evt);
            }
        });
        panelCenterAsoc.add(tfCorreoAsoc);

        lblObCorreo.setVisible(false);
        lblObCorreo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblObCorreo.setForeground(new java.awt.Color(204, 0, 0));
        lblObCorreo.setText("*");
        lblObCorreo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblObCorreo.setName("lblObTlf"); // NOI18N
        panelCenterAsoc.add(lblObCorreo);

        lblDirAsoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDirAsoc.setForeground(new java.awt.Color(255, 255, 255));
        lblDirAsoc.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDirAsoc.setText("Dirección");
        lblDirAsoc.setName("lblDirAsoc"); // NOI18N
        panelCenterAsoc.add(lblDirAsoc);

        tfDirAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfDirAsoc.setForeground(new java.awt.Color(255, 255, 255));
        tfDirAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfDirAsoc.setCaretColor(new java.awt.Color(204, 0, 204));
        tfDirAsoc.setName("tfDirAsoc"); // NOI18N
        tfDirAsoc.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfDirAsoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDirAsocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDirAsocFocusLost(evt);
            }
        });
        panelCenterAsoc.add(tfDirAsoc);

        lblObDir.setVisible(false);
        lblObDir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblObDir.setForeground(new java.awt.Color(204, 0, 0));
        lblObDir.setText("*");
        lblObDir.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblObDir.setName("lblObDir"); // NOI18N
        panelCenterAsoc.add(lblObDir);

        lblPobAsoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPobAsoc.setForeground(new java.awt.Color(255, 255, 255));
        lblPobAsoc.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPobAsoc.setText("Poblacion");
        lblPobAsoc.setName("lblPobAsoc"); // NOI18N
        panelCenterAsoc.add(lblPobAsoc);

        tfPobAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfPobAsoc.setForeground(new java.awt.Color(255, 255, 255));
        tfPobAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfPobAsoc.setCaretColor(new java.awt.Color(204, 0, 204));
        tfPobAsoc.setName("tfPobAsoc"); // NOI18N
        tfPobAsoc.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfPobAsoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPobAsocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPobAsocFocusLost(evt);
            }
        });
        panelCenterAsoc.add(tfPobAsoc);

        lblObPob.setVisible(false);
        lblObPob.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblObPob.setForeground(new java.awt.Color(204, 0, 0));
        lblObPob.setText("*");
        lblObPob.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblObPob.setName("lblObPob"); // NOI18N
        panelCenterAsoc.add(lblObPob);

        lblCiuAsoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCiuAsoc.setForeground(new java.awt.Color(255, 255, 255));
        lblCiuAsoc.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCiuAsoc.setText("Ciudad");
        lblCiuAsoc.setName("lblCiuAsoc"); // NOI18N
        panelCenterAsoc.add(lblCiuAsoc);

        tfCiuAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfCiuAsoc.setForeground(new java.awt.Color(255, 255, 255));
        tfCiuAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfCiuAsoc.setCaretColor(new java.awt.Color(204, 0, 204));
        tfCiuAsoc.setName("tfCiuAsoc"); // NOI18N
        tfCiuAsoc.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfCiuAsoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCiuAsocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCiuAsocFocusLost(evt);
            }
        });
        panelCenterAsoc.add(tfCiuAsoc);

        lblObCiu.setVisible(false);
        lblObCiu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblObCiu.setForeground(new java.awt.Color(204, 0, 0));
        lblObCiu.setText("*");
        lblObCiu.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblObCiu.setName("lblObCiu"); // NOI18N
        panelCenterAsoc.add(lblObCiu);

        lblCIFAsoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCIFAsoc.setForeground(new java.awt.Color(255, 255, 255));
        lblCIFAsoc.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCIFAsoc.setText("C.I.F");
        lblCIFAsoc.setName("lblCIFAsoc"); // NOI18N
        panelCenterAsoc.add(lblCIFAsoc);

        tfCIFAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfCIFAsoc.setForeground(new java.awt.Color(255, 255, 255));
        tfCIFAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfCIFAsoc.setCaretColor(new java.awt.Color(204, 0, 204));
        tfCIFAsoc.setName("tfCIFAsoc"); // NOI18N
        tfCIFAsoc.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfCIFAsoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCIFAsocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCIFAsocFocusLost(evt);
            }
        });
        panelCenterAsoc.add(tfCIFAsoc);

        lblObCIF.setVisible(false);
        lblObCIF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblObCIF.setForeground(new java.awt.Color(204, 0, 0));
        lblObCIF.setText("*");
        lblObCIF.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblObCIF.setName("lblObCIF"); // NOI18N
        panelCenterAsoc.add(lblObCIF);

        lblNRegAsoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNRegAsoc.setForeground(new java.awt.Color(255, 255, 255));
        lblNRegAsoc.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNRegAsoc.setText("Nº Registro");
        lblNRegAsoc.setName("lblNRegAsoc"); // NOI18N
        panelCenterAsoc.add(lblNRegAsoc);

        tfNRegAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfNRegAsoc.setForeground(new java.awt.Color(255, 255, 255));
        tfNRegAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfNRegAsoc.setCaretColor(new java.awt.Color(204, 0, 204));
        tfNRegAsoc.setName("tfNRegAsoc"); // NOI18N
        tfNRegAsoc.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfNRegAsoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNRegAsocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNRegAsocFocusLost(evt);
            }
        });
        panelCenterAsoc.add(tfNRegAsoc);

        lblObNReg.setVisible(false);
        lblObNReg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblObNReg.setForeground(new java.awt.Color(204, 0, 0));
        lblObNReg.setText("*");
        lblObNReg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblObNReg.setName("lblObNReg"); // NOI18N
        panelCenterAsoc.add(lblObNReg);

        asociacionPanel.add(panelCenterAsoc, java.awt.BorderLayout.CENTER);

        panelCard.add(asociacionPanel, "card5");

        sociosPanel.setName("sociosPanel"); // NOI18N
        sociosPanel.setPreferredSize(new java.awt.Dimension(800, 550));
        sociosPanel.setLayout(new java.awt.BorderLayout());

        panelNorthSocios.setBackground(new java.awt.Color(51, 51, 51));
        panelNorthSocios.setName("panelNorthSocios"); // NOI18N
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5);
        flowLayout1.setAlignOnBaseline(true);
        panelNorthSocios.setLayout(flowLayout1);

        tfBuscarSocios.setBackground(new java.awt.Color(102, 102, 102));
        tfBuscarSocios.setForeground(new java.awt.Color(255, 255, 255));
        tfBuscarSocios.setText("Buscar...");
        tfBuscarSocios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfBuscarSocios.setCaretColor(new java.awt.Color(204, 0, 204));
        tfBuscarSocios.setName("tfBuscarSocios"); // NOI18N
        tfBuscarSocios.setPreferredSize(new java.awt.Dimension(170, 35));
        tfBuscarSocios.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfBuscarSocios.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfBuscarSociosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfBuscarSociosFocusLost(evt);
            }
        });
        panelNorthSocios.add(tfBuscarSocios);

        btnBuscarSocios.setBackground(new java.awt.Color(204, 0, 204));
        btnBuscarSocios.setText("Buscar");
        btnBuscarSocios.setBorder(null);
        btnBuscarSocios.setName("btnBuscarSocios"); // NOI18N
        btnBuscarSocios.setPreferredSize(new java.awt.Dimension(100, 35));
        panelNorthSocios.add(btnBuscarSocios);

        sociosPanel.add(panelNorthSocios, java.awt.BorderLayout.PAGE_START);

        panelSouthSocios.setBackground(new java.awt.Color(51, 51, 51));
        panelSouthSocios.setName("panelSouthSocios"); // NOI18N
        panelSouthSocios.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        btnAnadirSocios.setBackground(new java.awt.Color(0, 204, 0));
        btnAnadirSocios.setText("Añadir");
        btnAnadirSocios.setBorder(null);
        btnAnadirSocios.setName("btnAnadirSocios"); // NOI18N
        btnAnadirSocios.setPreferredSize(new java.awt.Dimension(180, 35));
        btnAnadirSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAnadirSociosMousePressed(evt);
            }
        });
        panelSouthSocios.add(btnAnadirSocios);

        btnEliminarSocios.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminarSocios.setText("Eliminar");
        btnEliminarSocios.setBorder(null);
        btnEliminarSocios.setName("btnEliminarSocios"); // NOI18N
        btnEliminarSocios.setPreferredSize(new java.awt.Dimension(180, 35));
        panelSouthSocios.add(btnEliminarSocios);

        sociosPanel.add(panelSouthSocios, java.awt.BorderLayout.PAGE_END);

        panelCenterSocios.setBackground(new java.awt.Color(51, 51, 51));
        panelCenterSocios.setName("panelCenterSocios"); // NOI18N

        scrollPanelListSocios.setBackground(new java.awt.Color(102, 102, 102));

        listSocios.setBackground(new java.awt.Color(102, 102, 102));
        listSocios.setForeground(new java.awt.Color(255, 255, 255));
        listSocios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Socios 1", "Socios 2", "Socios 3", "Socios 4", "Socios 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollPanelListSocios.setViewportView(listSocios);

        javax.swing.GroupLayout panelCenterSociosLayout = new javax.swing.GroupLayout(panelCenterSocios);
        panelCenterSocios.setLayout(panelCenterSociosLayout);
        panelCenterSociosLayout.setHorizontalGroup(
            panelCenterSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCenterSociosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanelListSocios, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCenterSociosLayout.setVerticalGroup(
            panelCenterSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPanelListSocios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );

        sociosPanel.add(panelCenterSocios, java.awt.BorderLayout.CENTER);

        panelCard.add(sociosPanel, "card6");

        eventosPanel.setName("eventosPanel"); // NOI18N
        eventosPanel.setLayout(new java.awt.BorderLayout());

        panelNorthEventos.setBackground(new java.awt.Color(51, 51, 51));
        panelNorthEventos.setName("panelNorthEventos"); // NOI18N
        panelNorthEventos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        tfBuscarEventos.setBackground(new java.awt.Color(102, 102, 102));
        tfBuscarEventos.setForeground(new java.awt.Color(255, 255, 255));
        tfBuscarEventos.setText("Buscar...");
        tfBuscarEventos.setToolTipText("");
        tfBuscarEventos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfBuscarEventos.setCaretColor(new java.awt.Color(204, 0, 204));
        tfBuscarEventos.setName("tfBuscarEventos"); // NOI18N
        tfBuscarEventos.setPreferredSize(new java.awt.Dimension(170, 35));
        tfBuscarEventos.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfBuscarEventos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfBuscarEventosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfBuscarEventosFocusLost(evt);
            }
        });
        panelNorthEventos.add(tfBuscarEventos);

        btnBuscarEventos.setBackground(new java.awt.Color(204, 0, 204));
        btnBuscarEventos.setText("Buscar");
        btnBuscarEventos.setBorder(null);
        btnBuscarEventos.setName("btnBuscarEventos"); // NOI18N
        btnBuscarEventos.setPreferredSize(new java.awt.Dimension(100, 35));
        panelNorthEventos.add(btnBuscarEventos);

        eventosPanel.add(panelNorthEventos, java.awt.BorderLayout.PAGE_START);

        panelSouthEventos.setBackground(new java.awt.Color(51, 51, 51));
        panelSouthEventos.setName("panelSouthEventos"); // NOI18N
        panelSouthEventos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        btnAnadirEventos.setBackground(new java.awt.Color(0, 204, 0));
        btnAnadirEventos.setText("Añadir");
        btnAnadirEventos.setBorder(null);
        btnAnadirEventos.setName("btnAnadirEventos"); // NOI18N
        btnAnadirEventos.setPreferredSize(new java.awt.Dimension(180, 35));
        btnAnadirEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAnadirEventosMousePressed(evt);
            }
        });
        panelSouthEventos.add(btnAnadirEventos);

        btnEliminarEventos.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminarEventos.setText("Eliminar");
        btnEliminarEventos.setBorder(null);
        btnEliminarEventos.setName("btnEliminarEventos"); // NOI18N
        btnEliminarEventos.setPreferredSize(new java.awt.Dimension(180, 35));
        panelSouthEventos.add(btnEliminarEventos);

        eventosPanel.add(panelSouthEventos, java.awt.BorderLayout.PAGE_END);

        panelCenterEventos.setBackground(new java.awt.Color(51, 51, 51));
        panelCenterEventos.setName("panelCenterEventos"); // NOI18N

        listEventos.setBackground(new java.awt.Color(102, 102, 102));
        listEventos.setForeground(new java.awt.Color(255, 255, 255));
        listEventos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Evento 1", "Evento 2", "Evento 3", "Evento 4", "Evento 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollPanelListEventos.setViewportView(listEventos);

        javax.swing.GroupLayout panelCenterEventosLayout = new javax.swing.GroupLayout(panelCenterEventos);
        panelCenterEventos.setLayout(panelCenterEventosLayout);
        panelCenterEventosLayout.setHorizontalGroup(
            panelCenterEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCenterEventosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanelListEventos, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCenterEventosLayout.setVerticalGroup(
            panelCenterEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPanelListEventos, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );

        eventosPanel.add(panelCenterEventos, java.awt.BorderLayout.CENTER);

        panelCard.add(eventosPanel, "card7");

        entradasPanel.setName("entradasPanel"); // NOI18N
        entradasPanel.setLayout(new java.awt.BorderLayout());

        panelCenterEntradas.setBackground(new java.awt.Color(51, 51, 51));
        panelCenterEntradas.setName("panelCenterEntradas"); // NOI18N
        panelCenterEntradas.setLayout(new java.awt.BorderLayout());

        panelNumEntradas.setBackground(new java.awt.Color(51, 51, 51));
        panelNumEntradas.setName("panelNumEntradas"); // NOI18N
        panelNumEntradas.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        lblNumEntradas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNumEntradas.setForeground(new java.awt.Color(255, 255, 255));
        lblNumEntradas.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNumEntradas.setText("Numero de entradas:");
        lblNumEntradas.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblNumEntradas.setName("lblNumEntradas"); // NOI18N
        lblNumEntradas.setPreferredSize(new java.awt.Dimension(120, 14));
        panelNumEntradas.add(lblNumEntradas);

        lblNum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNum.setForeground(new java.awt.Color(255, 255, 255));
        lblNum.setText("10");
        lblNum.setName("lblNum"); // NOI18N
        panelNumEntradas.add(lblNum);

        panelCenterEntradas.add(panelNumEntradas, java.awt.BorderLayout.PAGE_START);

        panelListEntradas.setBackground(new java.awt.Color(51, 51, 51));
        panelListEntradas.setName("panelListEntradas"); // NOI18N

        listEntradas.setBackground(new java.awt.Color(102, 102, 102));
        listEntradas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollPanelListEntradas.setViewportView(listEntradas);

        javax.swing.GroupLayout panelListEntradasLayout = new javax.swing.GroupLayout(panelListEntradas);
        panelListEntradas.setLayout(panelListEntradasLayout);
        panelListEntradasLayout.setHorizontalGroup(
            panelListEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListEntradasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanelListEntradas, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelListEntradasLayout.setVerticalGroup(
            panelListEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListEntradasLayout.createSequentialGroup()
                .addComponent(scrollPanelListEntradas, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelCenterEntradas.add(panelListEntradas, java.awt.BorderLayout.CENTER);

        entradasPanel.add(panelCenterEntradas, java.awt.BorderLayout.CENTER);

        panelNorthEntradas.setBackground(new java.awt.Color(51, 51, 51));
        panelNorthEntradas.setName("panelNorthEntradas"); // NOI18N
        panelNorthEntradas.setLayout(new java.awt.GridLayout(1, 0));

        panelSeleccionEvento.setBackground(new java.awt.Color(51, 51, 51));
        panelSeleccionEvento.setMinimumSize(new java.awt.Dimension(160, 30));
        panelSeleccionEvento.setName("panelSeleccionEvento"); // NOI18N
        panelSeleccionEvento.setPreferredSize(new java.awt.Dimension(112, 60));
        panelSeleccionEvento.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        lblSeleccionEvento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSeleccionEvento.setForeground(new java.awt.Color(255, 255, 255));
        lblSeleccionEvento.setText("Selecciona un evento: ");
        lblSeleccionEvento.setName("lblSeleccionEvento"); // NOI18N
        lblSeleccionEvento.setPreferredSize(new java.awt.Dimension(140, 35));
        panelSeleccionEvento.add(lblSeleccionEvento);

        cbSeleccionEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Evento 1", "Evento 2", "Evento 3", "Evento 4" }));
        cbSeleccionEvento.setName("cbSeleccionEvento"); // NOI18N
        cbSeleccionEvento.setPreferredSize(new java.awt.Dimension(180, 35));
        panelSeleccionEvento.add(cbSeleccionEvento);

        panelNorthEntradas.add(panelSeleccionEvento);

        panelGenerarEntradas.setBackground(new java.awt.Color(51, 51, 51));
        panelGenerarEntradas.setName("panelGenerarEntradas"); // NOI18N
        panelGenerarEntradas.setPreferredSize(new java.awt.Dimension(140, 60));
        panelGenerarEntradas.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        btnGenerarEntradas.setBackground(new java.awt.Color(255, 204, 0));
        btnGenerarEntradas.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\entradas.png")); // NOI18N
        btnGenerarEntradas.setText("Generar Entradas");
        btnGenerarEntradas.setBorder(null);
        btnGenerarEntradas.setName("btnGenerarEntradas"); // NOI18N
        btnGenerarEntradas.setPreferredSize(new java.awt.Dimension(180, 35));
        btnGenerarEntradas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGenerarEntradasMousePressed(evt);
            }
        });
        panelGenerarEntradas.add(btnGenerarEntradas);

        panelNorthEntradas.add(panelGenerarEntradas);

        entradasPanel.add(panelNorthEntradas, java.awt.BorderLayout.PAGE_START);

        panelCard.add(entradasPanel, "card8");

        menu.setBackground(new java.awt.Color(51, 51, 51));
        menu.setName("menu"); // NOI18N

        menuInicio.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\casa-icono-silueta.png")); // NOI18N
        menuInicio.setText("Inicio");
        menuInicio.setName("menuInicio"); // NOI18N
        menuInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuInicioMousePressed(evt);
            }
        });
        menu.add(menuInicio);

        menuAsociacion.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\apreton-de-manos.png")); // NOI18N
        menuAsociacion.setText("Asociacion");
        menuAsociacion.setToolTipText("");
        menuAsociacion.setName("menuAsociacion"); // NOI18N
        menuAsociacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuAsociacionMousePressed(evt);
            }
        });
        menu.add(menuAsociacion);

        menuSocios.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\personas.png")); // NOI18N
        menuSocios.setText("Socios");
        menuSocios.setName("menuSocios"); // NOI18N
        menuSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuSociosMousePressed(evt);
            }
        });
        menu.add(menuSocios);

        menuEventos.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\evento.png")); // NOI18N
        menuEventos.setText("Eventos");
        menuEventos.setName("menuEventos"); // NOI18N
        menuEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuEventosMousePressed(evt);
            }
        });
        menu.add(menuEventos);

        menuEntradas.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\entradas.png")); // NOI18N
        menuEntradas.setText("Entradas");
        menuEntradas.setName("menuEntradas"); // NOI18N
        menuEntradas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuEntradasMousePressed(evt);
            }
        });
        menu.add(menuEntradas);

        menuAyuda.setText("Help me");
        menuAyuda.setName("menuAyuda"); // NOI18N

        submenuCerrarSesion.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\power-button.png")); // NOI18N
        submenuCerrarSesion.setText("Cerrar Sesion");
        submenuCerrarSesion.setName("submenuCerrarSesion"); // NOI18N
        submenuCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                submenuCerrarSesionMousePressed(evt);
            }
        });
        menuAyuda.add(submenuCerrarSesion);

        menu.add(menuAyuda);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCard, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInicioMousePressed
        CardLayout cardLayout = (CardLayout) panelCard.getLayout();
        cardLayout.show(panelCard, "card4");       
        
    }//GEN-LAST:event_menuInicioMousePressed
    
    private void menuAsociacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAsociacionMousePressed
        CardLayout cardLayout = (CardLayout) panelCard.getLayout();
        cardLayout.show(panelCard, "card5");        
    }//GEN-LAST:event_menuAsociacionMousePressed

    private void menuSociosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSociosMousePressed
        CardLayout cardLayout = (CardLayout) panelCard.getLayout();
        cardLayout.show(panelCard, "card6");
    }//GEN-LAST:event_menuSociosMousePressed

    private void menuEventosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEventosMousePressed
        CardLayout cardLayout = (CardLayout) panelCard.getLayout();
        cardLayout.show(panelCard, "card7"); 
    }//GEN-LAST:event_menuEventosMousePressed

    private void menuEntradasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEntradasMousePressed
        CardLayout cardLayout = (CardLayout) panelCard.getLayout();
        cardLayout.show(panelCard, "card8"); 
    }//GEN-LAST:event_menuEntradasMousePressed

    private void submenuCerrarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submenuCerrarSesionMousePressed
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_submenuCerrarSesionMousePressed

    private void btnAnadirSociosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnadirSociosMousePressed
        SocioFrame usuario = new SocioFrame();
        usuario.setVisible(true);
        usuario.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnAnadirSociosMousePressed

    private void lblJuntaDirectivaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJuntaDirectivaMousePressed
        JuntaDirectiva jd = new JuntaDirectiva();
        jd.setVisible(true);
        jd.setLocationRelativeTo(null);
    }//GEN-LAST:event_lblJuntaDirectivaMousePressed

    private void lblMembresiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMembresiaMousePressed
        Membresia mem = new Membresia();
        mem.setVisible(true);
        mem.setLocationRelativeTo(null);
    }//GEN-LAST:event_lblMembresiaMousePressed

    private void btnGenerarEntradasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarEntradasMousePressed
        GenerarEntradas ge = new GenerarEntradas();
        ge.setVisible(true);
        ge.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnGenerarEntradasMousePressed

    private void tfNombreAsocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreAsocFocusGained
        tfNombreAsoc.setBackground(Color.black);
        tfNombreAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfNombreAsocFocusGained

    private void tfNombreAsocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreAsocFocusLost
        tfNombreAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfNombreAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfNombreAsocFocusLost

    private void tfTlfAsocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTlfAsocFocusGained
        tfTlfAsoc.setBackground(Color.black);
        tfTlfAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfTlfAsocFocusGained

    private void tfTlfAsocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTlfAsocFocusLost
        tfTlfAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfTlfAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfTlfAsocFocusLost

    private void tfCorreoAsocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCorreoAsocFocusGained
        tfCorreoAsoc.setBackground(Color.black);
        tfCorreoAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfCorreoAsocFocusGained

    private void tfCorreoAsocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCorreoAsocFocusLost
        tfCorreoAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfCorreoAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfCorreoAsocFocusLost

    private void tfDirAsocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDirAsocFocusGained
        tfDirAsoc.setBackground(Color.black);
        tfDirAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfDirAsocFocusGained

    private void tfDirAsocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDirAsocFocusLost
        tfDirAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfDirAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfDirAsocFocusLost

    private void tfPobAsocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPobAsocFocusGained
        tfPobAsoc.setBackground(Color.black);
        tfPobAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfPobAsocFocusGained

    private void tfPobAsocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPobAsocFocusLost
        tfPobAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfPobAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfPobAsocFocusLost

    private void tfCiuAsocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCiuAsocFocusGained
        tfCiuAsoc.setBackground(Color.black);
        tfCiuAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfCiuAsocFocusGained

    private void tfCiuAsocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCiuAsocFocusLost
        tfCiuAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfCiuAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfCiuAsocFocusLost

    private void tfCIFAsocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCIFAsocFocusGained
        tfCIFAsoc.setBackground(Color.black);
        tfCIFAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfCIFAsocFocusGained

    private void tfCIFAsocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCIFAsocFocusLost
        tfCIFAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfCIFAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfCIFAsocFocusLost

    private void tfNRegAsocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNRegAsocFocusGained
        tfNRegAsoc.setBackground(Color.black);
        tfNRegAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfNRegAsocFocusGained

    private void tfNRegAsocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNRegAsocFocusLost
        tfNRegAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfNRegAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfNRegAsocFocusLost

    private void tfBuscarSociosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBuscarSociosFocusGained
        tfBuscarSocios.setBackground(Color.black);
        tfBuscarSocios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfBuscarSociosFocusGained

    private void tfBuscarSociosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBuscarSociosFocusLost
        tfBuscarSocios.setBackground(new java.awt.Color(102, 102, 102));
        tfBuscarSocios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfBuscarSociosFocusLost

    private void tfBuscarEventosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBuscarEventosFocusGained
        tfBuscarEventos.setBackground(Color.black);
        tfBuscarEventos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfBuscarEventosFocusGained

    private void tfBuscarEventosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBuscarEventosFocusLost
        tfBuscarEventos.setBackground(new java.awt.Color(102, 102, 102));
        tfBuscarEventos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfBuscarEventosFocusLost

    private void btnAnadirEventosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnadirEventosMousePressed
        EventoFrame evento = new EventoFrame();
        evento.setVisible(true);
        evento.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnAnadirEventosMousePressed
 
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel asociacionPanel;
    private javax.swing.JButton btnAnadirEventos;
    private javax.swing.JButton btnAnadirSocios;
    private javax.swing.JButton btnBuscarEventos;
    private javax.swing.JButton btnBuscarSocios;
    private javax.swing.JButton btnEditarAsoc;
    private javax.swing.JButton btnEliminarEventos;
    private javax.swing.JButton btnEliminarSocios;
    private javax.swing.JButton btnGenerarEntradas;
    private javax.swing.JComboBox<String> cbSeleccionEvento;
    private javax.swing.JPanel entradasPanel;
    private javax.swing.JPanel eventosPanel;
    private javax.swing.JPanel inicioPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCIFAsoc;
    private javax.swing.JLabel lblCiuAsoc;
    private javax.swing.JLabel lblCorreoAsoc;
    private javax.swing.JLabel lblDirAsoc;
    private javax.swing.JLabel lblJuntaDirectiva;
    private javax.swing.JLabel lblMembresia;
    private javax.swing.JLabel lblNRegAsoc;
    private javax.swing.JLabel lblNameAsoc;
    private javax.swing.JLabel lblNameTittle;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblNumEntradas;
    private javax.swing.JLabel lblObCIF;
    private javax.swing.JLabel lblObCiu;
    private javax.swing.JLabel lblObCorreo;
    private javax.swing.JLabel lblObDir;
    private javax.swing.JLabel lblObNReg;
    private javax.swing.JLabel lblObNombre;
    private javax.swing.JLabel lblObPob;
    private javax.swing.JLabel lblObTlf;
    private javax.swing.JLabel lblPobAsoc;
    private javax.swing.JLabel lblSeleccionEvento;
    private javax.swing.JLabel lblTlfAsoc;
    private javax.swing.JList<String> listEntradas;
    private javax.swing.JList<String> listEventos;
    private javax.swing.JList<String> listSocios;
    private javax.swing.JLabel logoAsoc;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuAsociacion;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuEntradas;
    private javax.swing.JMenu menuEventos;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenu menuSocios;
    private javax.swing.JPanel panelCard;
    private javax.swing.JPanel panelCenterAsoc;
    private javax.swing.JPanel panelCenterEntradas;
    private javax.swing.JPanel panelCenterEventos;
    private javax.swing.JPanel panelCenterSocios;
    private javax.swing.JPanel panelEastAsoc;
    private javax.swing.JPanel panelGenerarEntradas;
    private javax.swing.JPanel panelListEntradas;
    private javax.swing.JPanel panelNorthEntradas;
    private javax.swing.JPanel panelNorthEventos;
    private javax.swing.JPanel panelNorthSocios;
    private javax.swing.JPanel panelNumEntradas;
    private javax.swing.JPanel panelSeleccionEvento;
    private javax.swing.JPanel panelSouthAsoc;
    private javax.swing.JPanel panelSouthEventos;
    private javax.swing.JPanel panelSouthSocios;
    private javax.swing.JScrollPane scrollPanelListEntradas;
    private javax.swing.JScrollPane scrollPanelListEventos;
    private javax.swing.JScrollPane scrollPanelListSocios;
    private javax.swing.JPanel sociosPanel;
    private javax.swing.JMenuItem submenuCerrarSesion;
    private javax.swing.JTextField tfBuscarEventos;
    private javax.swing.JTextField tfBuscarSocios;
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