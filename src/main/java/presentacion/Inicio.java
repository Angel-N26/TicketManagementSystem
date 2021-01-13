package presentacion;

import java.awt.CardLayout;

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
        jLabel2 = new javax.swing.JLabel();
        asociacionPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        sociosPanel = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        eventosPanel = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        entradasPanel = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jPanel15 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel18 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
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

        panelCard.setName("panelCard"); // NOI18N
        panelCard.setPreferredSize(new java.awt.Dimension(800, 550));
        panelCard.setLayout(new java.awt.CardLayout());

        inicioPanel.setBackground(new java.awt.Color(51, 51, 51));
        inicioPanel.setName("inicioPanel"); // NOI18N
        inicioPanel.setPreferredSize(new java.awt.Dimension(800, 550));
        inicioPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INICIO");
        inicioPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 224, -1, -1));

        panelCard.add(inicioPanel, "card4");

        asociacionPanel.setName("asociacionPanel"); // NOI18N
        asociacionPanel.setPreferredSize(new java.awt.Dimension(800, 550));
        asociacionPanel.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("logo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 130;
        gridBagConstraints.ipady = 99;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 0, 0);
        jPanel6.add(jLabel14, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("RealJazz");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 92;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 0, 0);
        jPanel6.add(jLabel6, gridBagConstraints);

        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("JuntaDirectiva");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 81;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(62, 0, 0, 0);
        jPanel6.add(jLabel3, gridBagConstraints);

        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Membresia");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 99;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 220, 0);
        jPanel6.add(jLabel7, gridBagConstraints);

        asociacionPanel.add(jPanel6, java.awt.BorderLayout.WEST);

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        jButton2.setBackground(new java.awt.Color(204, 0, 204));
        jButton2.setText("Editar");
        jButton2.setBorder(null);
        jButton2.setMaximumSize(new java.awt.Dimension(170, 35));
        jButton2.setPreferredSize(new java.awt.Dimension(170, 35));
        jPanel7.add(jButton2);

        asociacionPanel.add(jPanel7, java.awt.BorderLayout.SOUTH);

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setLayout(new java.awt.GridLayout(8, 2, 10, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("jLabel5");
        jPanel8.add(jLabel8);

        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("jTextField1");
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jPanel8.add(jTextField1);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("jLabel6");
        jPanel8.add(jLabel9);

        jTextField2.setBackground(new java.awt.Color(102, 102, 102));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("jTextField2");
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jPanel8.add(jTextField2);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("jLabel7");
        jPanel8.add(jLabel10);

        jTextField3.setBackground(new java.awt.Color(102, 102, 102));
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("jTextField3");
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jPanel8.add(jTextField3);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("jLabel8");
        jPanel8.add(jLabel11);

        jTextField4.setBackground(new java.awt.Color(102, 102, 102));
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setText("jTextField4");
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jPanel8.add(jTextField4);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("jLabel9");
        jPanel8.add(jLabel12);

        jTextField5.setBackground(new java.awt.Color(102, 102, 102));
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setText("jTextField5");
        jTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jPanel8.add(jTextField5);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel13.setText("jLabel10");
        jPanel8.add(jLabel13);

        jTextField6.setBackground(new java.awt.Color(102, 102, 102));
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setText("jTextField6");
        jTextField6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jPanel8.add(jTextField6);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel15.setText("jLabel11");
        jPanel8.add(jLabel15);

        jTextField7.setBackground(new java.awt.Color(102, 102, 102));
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setText("jTextField7");
        jTextField7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jPanel8.add(jTextField7);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel16.setText("jLabel12");
        jPanel8.add(jLabel16);

        jTextField8.setBackground(new java.awt.Color(102, 102, 102));
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setText("jTextField8");
        jTextField8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jPanel8.add(jTextField8);

        asociacionPanel.add(jPanel8, java.awt.BorderLayout.CENTER);

        panelCard.add(asociacionPanel, "card5");

        sociosPanel.setName("sociosPanel"); // NOI18N
        sociosPanel.setPreferredSize(new java.awt.Dimension(800, 550));
        sociosPanel.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEADING);
        flowLayout1.setAlignOnBaseline(true);
        jPanel9.setLayout(flowLayout1);

        jTextField9.setBackground(new java.awt.Color(102, 102, 102));
        jTextField9.setText("Buscar...");
        jTextField9.setPreferredSize(new java.awt.Dimension(170, 35));
        jPanel9.add(jTextField9);

        jButton4.setText("Buscar");
        jButton4.setBorder(null);
        jButton4.setPreferredSize(new java.awt.Dimension(65, 35));
        jPanel9.add(jButton4);

        sociosPanel.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        jButton1.setBackground(new java.awt.Color(204, 0, 204));
        jButton1.setText("Añadir");
        jButton1.setBorder(null);
        jButton1.setPreferredSize(new java.awt.Dimension(170, 35));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jPanel10.add(jButton1);

        jButton3.setBackground(new java.awt.Color(204, 0, 204));
        jButton3.setText("Eliminar");
        jButton3.setBorder(null);
        jButton3.setPreferredSize(new java.awt.Dimension(170, 35));
        jPanel10.add(jButton3);

        sociosPanel.add(jPanel10, java.awt.BorderLayout.PAGE_END);

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));

        jScrollPane1.setBackground(new java.awt.Color(102, 102, 102));

        jList1.setBackground(new java.awt.Color(102, 102, 102));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Socios 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );

        sociosPanel.add(jPanel11, java.awt.BorderLayout.CENTER);

        panelCard.add(sociosPanel, "card6");

        eventosPanel.setName("eventosPanel"); // NOI18N
        eventosPanel.setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        jTextField10.setBackground(new java.awt.Color(102, 102, 102));
        jTextField10.setText("Buscar...");
        jTextField10.setToolTipText("");
        jTextField10.setPreferredSize(new java.awt.Dimension(170, 35));
        jPanel12.add(jTextField10);

        jButton5.setText("Buscar");
        jButton5.setBorder(null);
        jButton5.setPreferredSize(new java.awt.Dimension(65, 35));
        jPanel12.add(jButton5);

        eventosPanel.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        jButton6.setBackground(new java.awt.Color(204, 0, 204));
        jButton6.setText("Añadir");
        jButton6.setBorder(null);
        jButton6.setPreferredSize(new java.awt.Dimension(170, 35));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton6MousePressed(evt);
            }
        });
        jPanel13.add(jButton6);

        jButton7.setBackground(new java.awt.Color(204, 0, 204));
        jButton7.setText("Eliminar");
        jButton7.setBorder(null);
        jButton7.setPreferredSize(new java.awt.Dimension(170, 35));
        jPanel13.add(jButton7);

        eventosPanel.add(jPanel13, java.awt.BorderLayout.PAGE_END);

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));

        jList5.setBackground(new java.awt.Color(102, 102, 102));
        jList5.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList5);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );

        eventosPanel.add(jPanel14, java.awt.BorderLayout.CENTER);

        panelCard.add(eventosPanel, "card7");

        entradasPanel.setName("entradasPanel"); // NOI18N
        entradasPanel.setLayout(new java.awt.BorderLayout());

        jPanel26.setBackground(new java.awt.Color(51, 51, 51));
        jPanel26.setLayout(new java.awt.BorderLayout());

        jPanel24.setBackground(new java.awt.Color(51, 51, 51));
        jPanel24.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel18.setText("Numero de entradas:");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel18.setPreferredSize(new java.awt.Dimension(120, 14));
        jPanel24.add(jLabel18);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("10");
        jPanel24.add(jLabel19);

        jPanel26.add(jPanel24, java.awt.BorderLayout.PAGE_START);

        jPanel25.setBackground(new java.awt.Color(51, 51, 51));

        jList4.setBackground(new java.awt.Color(102, 102, 102));
        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList4);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel26.add(jPanel25, java.awt.BorderLayout.CENTER);

        entradasPanel.add(jPanel26, java.awt.BorderLayout.CENTER);

        jPanel15.setBackground(new java.awt.Color(51, 51, 51));
        jPanel15.setLayout(new java.awt.GridLayout(1, 0));

        jPanel17.setBackground(new java.awt.Color(51, 51, 51));
        jPanel17.setMinimumSize(new java.awt.Dimension(160, 30));
        jPanel17.setPreferredSize(new java.awt.Dimension(112, 60));
        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Selecciona un evento: ");
        jLabel17.setPreferredSize(new java.awt.Dimension(140, 35));
        jPanel17.add(jLabel17);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Evento 1", "Evento 2", "Evento 3", "Evento 4" }));
        jComboBox2.setPreferredSize(new java.awt.Dimension(180, 35));
        jPanel17.add(jComboBox2);

        jPanel15.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(51, 51, 51));
        jPanel18.setPreferredSize(new java.awt.Dimension(140, 60));
        jPanel18.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        jButton9.setBackground(new java.awt.Color(255, 204, 0));
        jButton9.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\entradas.png")); // NOI18N
        jButton9.setText("Generar Entradas");
        jButton9.setBorder(null);
        jButton9.setPreferredSize(new java.awt.Dimension(130, 35));
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton9MousePressed(evt);
            }
        });
        jPanel18.add(jButton9);

        jPanel15.add(jPanel18);

        entradasPanel.add(jPanel15, java.awt.BorderLayout.PAGE_START);

        panelCard.add(entradasPanel, "card8");

        menu.setBackground(new java.awt.Color(51, 51, 51));
        menu.setName("menu"); // NOI18N

        menuInicio.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\casa-icono-silueta.png")); // NOI18N
        menuInicio.setText("Inicio");
        menuInicio.setName("menuInicio"); // NOI18N
        menuInicio.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menuInicioMenuSelected(evt);
            }
        });
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
            .addComponent(panelCard, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
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

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        SocioFrame usuario = new SocioFrame();
        usuario.setExtendedState(MAXIMIZED_BOTH);
        usuario.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MousePressed
        SocioFrame usuario = new SocioFrame();
        usuario.setExtendedState(MAXIMIZED_BOTH);
        usuario.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6MousePressed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        SocioFrame usuario = new SocioFrame();
        usuario.setExtendedState(MAXIMIZED_BOTH);
        usuario.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6MouseClicked

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        JuntaDirectiva jd = new JuntaDirectiva();
        jd.setVisible(true);
        jd.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        Membresia mem = new Membresia();
        mem.setVisible(true);
        mem.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel7MousePressed

    private void jButton9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MousePressed
        GenerarEntradas ge = new GenerarEntradas();
        ge.setVisible(true);
        ge.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton9MousePressed

    private void menuInicioMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menuInicioMenuSelected
        
    }//GEN-LAST:event_menuInicioMenuSelected
 
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
    private javax.swing.JPanel entradasPanel;
    private javax.swing.JPanel eventosPanel;
    private javax.swing.JPanel inicioPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuAsociacion;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuEntradas;
    private javax.swing.JMenu menuEventos;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenu menuSocios;
    private javax.swing.JPanel panelCard;
    private javax.swing.JPanel sociosPanel;
    private javax.swing.JMenuItem submenuCerrarSesion;
    // End of variables declaration//GEN-END:variables
}