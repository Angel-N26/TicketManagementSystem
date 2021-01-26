package presentacion;

import dominio.ControlEvento;
import dominio.Evento;
import java.awt.Color;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 * @author angel
 **/
public class EventoFrame extends javax.swing.JFrame {
   
    public EventoFrame() {
        initComponents();
        this.ce = new ControlEvento();
    }
    
    public EventoFrame(Evento e){
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

        panel = new javax.swing.JPanel();
        panelSouth = new javax.swing.JPanel();
        panelSouthLeft = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        panelSouthRigth = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnAnadir = new javax.swing.JButton();
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
        lblPrecio = new javax.swing.JLabel();
        tfPrecio = new javax.swing.JTextField();
        ftfFecha = new javax.swing.JFormattedTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicketManagementSystem");
        setResizable(false);

        panel.setBackground(new java.awt.Color(51, 51, 51));
        panel.setName("panel"); // NOI18N
        panel.setPreferredSize(new java.awt.Dimension(800, 550));
        panel.setLayout(new java.awt.BorderLayout());

        panelSouth.setBackground(new java.awt.Color(51, 51, 51));
        panelSouth.setName("panelSouth"); // NOI18N
        panelSouth.setPreferredSize(new java.awt.Dimension(215, 55));
        panelSouth.setLayout(new java.awt.GridLayout(1, 2));

        panelSouthLeft.setBackground(new java.awt.Color(51, 51, 51));
        panelSouthLeft.setName("panelSouthLeft"); // NOI18N
        panelSouthLeft.setPreferredSize(new java.awt.Dimension(400, 55));
        panelSouthLeft.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 20, 5));

        btnEliminar.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setName("btnEliminar"); // NOI18N
        btnEliminar.setPreferredSize(new java.awt.Dimension(180, 35));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        panelSouthLeft.add(btnEliminar);

        panelSouth.add(panelSouthLeft);

        panelSouthRigth.setBackground(new java.awt.Color(51, 51, 51));
        panelSouthRigth.setName("panelSouthRigth"); // NOI18N
        panelSouthRigth.setPreferredSize(new java.awt.Dimension(400, 55));
        panelSouthRigth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        btnCancelar.setBackground(new java.awt.Color(204, 0, 204));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setName("btnCancelar"); // NOI18N
        btnCancelar.setPreferredSize(new java.awt.Dimension(180, 35));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        panelSouthRigth.add(btnCancelar);

        btnAnadir.setBackground(new java.awt.Color(0, 204, 0));
        btnAnadir.setText("Añadir");
        btnAnadir.setBorder(null);
        btnAnadir.setName("btnAnadir"); // NOI18N
        btnAnadir.setPreferredSize(new java.awt.Dimension(180, 35));
        btnAnadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnadirMouseClicked(evt);
            }
        });
        panelSouthRigth.add(btnAnadir);

        panelSouth.add(panelSouthRigth);

        panel.add(panelSouth, java.awt.BorderLayout.PAGE_END);

        panelCenter.setBackground(new java.awt.Color(51, 51, 51));
        panelCenter.setName("panelCenter"); // NOI18N
        panelCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImg.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\music.png")); // NOI18N
        lblImg.setName("lblImg"); // NOI18N
        panelCenter.add(lblImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");
        lblNombre.setName("lblNombre"); // NOI18N
        panelCenter.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

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
        panelCenter.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 280, 25));

        lblTipo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo.setText("Tipo");
        lblTipo.setName("lblTipo"); // NOI18N
        panelCenter.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, -1));

        tfTipo.setBackground(new java.awt.Color(102, 102, 102));
        tfTipo.setForeground(new java.awt.Color(255, 255, 255));
        tfTipo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
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
        panelCenter.add(tfTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 280, 25));

        lblDireccion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setText("Direccion");
        lblDireccion.setName("lblDireccion"); // NOI18N
        panelCenter.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        tfNombreRecinto.setBackground(new java.awt.Color(102, 102, 102));
        tfNombreRecinto.setForeground(new java.awt.Color(255, 255, 255));
        tfNombreRecinto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
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
        panelCenter.add(tfNombreRecinto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 260, 25));

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Fecha");
        lblFecha.setName("lblFecha"); // NOI18N
        panelCenter.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        lblHora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("Hora");
        lblHora.setName("lblHora"); // NOI18N
        panelCenter.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, -1));

        tfHora.setBackground(new java.awt.Color(102, 102, 102));
        tfHora.setForeground(new java.awt.Color(255, 255, 255));
        tfHora.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
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
        panelCenter.add(tfHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 80, 25));

        lblCapacidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCapacidad.setForeground(new java.awt.Color(255, 255, 255));
        lblCapacidad.setText("Capacidad");
        lblCapacidad.setName("lblCapacidad"); // NOI18N
        panelCenter.add(lblCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, -1, -1));

        tfCapacidad.setBackground(new java.awt.Color(102, 102, 102));
        tfCapacidad.setForeground(new java.awt.Color(255, 255, 255));
        tfCapacidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
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
        panelCenter.add(tfCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 150, 25));

        lblPrecio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio.setText("Precio");
        lblPrecio.setName("lblPrecio"); // NOI18N
        panelCenter.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, -1, -1));

        tfPrecio.setBackground(new java.awt.Color(102, 102, 102));
        tfPrecio.setForeground(new java.awt.Color(255, 255, 255));
        tfPrecio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfPrecio.setCaretColor(new java.awt.Color(204, 0, 204));
        tfPrecio.setName("tfPrecio"); // NOI18N
        tfPrecio.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPrecioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPrecioFocusLost(evt);
            }
        });
        panelCenter.add(tfPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 140, 25));

        ftfFecha.setBackground(new java.awt.Color(102, 102, 102));
        ftfFecha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        ftfFecha.setForeground(new java.awt.Color(255, 255, 255));
        ftfFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        ftfFecha.setCaretColor(new java.awt.Color(204, 0, 204));
        ftfFecha.setName("ftfFecha"); // NOI18N
        ftfFecha.setSelectionColor(new java.awt.Color(204, 0, 204));
        ftfFecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ftfFechaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftfFechaFocusLost(evt);
            }
        });
        panelCenter.add(ftfFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 190, 25));

        lblNombreRecinto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombreRecinto.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreRecinto.setText("Nombre Recinto");
        lblNombreRecinto.setName("lblNombreRecinto"); // NOI18N
        panelCenter.add(lblNombreRecinto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

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
        panelCenter.add(tfLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 170, 25));

        cbProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Álava", "Albacete", "Alicante", "Almeria", "Asturias", "Ávila", "Badajoz", "Barcelona", "Burgos", "Cáceres", "Cádiz", "Cantabria", "Castellón", "Ciudad Real", "Córdoba", "La Coruña", "Cuenca", "Gerona", "Granada", "Guadalajara", "Guipúzcua", "Huelva", "Huesca", "Baleares", "Jaén", "León", "Lérida", "Lugo", "Madrid", "Málaga", "Murcia", "Navarra", "Orense", "Palencia", "Las Palmas", "Pontevedra", "La Rioja", "Salamanca", "Segovia", "Sevilla", "Soria", "Tarragona", "Santa Cruz de Tenerife", "Teruel", "Toledo", "Valencia", "Valladolid", "Vizcaya", "Zamora", "Zaragoza" }));
        cbProvincia.setName("cbProvincia"); // NOI18N
        panelCenter.add(cbProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 160, -1));

        tfCalle.setBackground(new java.awt.Color(102, 102, 102));
        tfCalle.setForeground(new java.awt.Color(255, 255, 255));
        tfCalle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
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
        panelCenter.add(tfCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 260, 25));

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
        panelCenter.add(tfNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 80, 25));

        lblCalle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCalle.setForeground(new java.awt.Color(255, 255, 255));
        lblCalle.setText("Calle");
        lblCalle.setName("lblCalle"); // NOI18N
        panelCenter.add(lblCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

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
        panelCenter.add(tfCodPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 100, 25));

        lblNumero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero.setText("Numero");
        lblNumero.setName("lblNumero"); // NOI18N
        panelCenter.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, -1, -1));

        lblCodPostal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCodPostal.setForeground(new java.awt.Color(255, 255, 255));
        lblCodPostal.setText("Codigo Postal");
        lblCodPostal.setName("lblCodPostal"); // NOI18N
        panelCenter.add(lblCodPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, -1, -1));

        lblLocalidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLocalidad.setForeground(new java.awt.Color(255, 255, 255));
        lblLocalidad.setText("Localidad");
        lblLocalidad.setName("lblLocalidad"); // NOI18N
        panelCenter.add(lblLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        lblProvincia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblProvincia.setForeground(new java.awt.Color(255, 255, 255));
        lblProvincia.setText("Provincia");
        lblProvincia.setName("lblProvincia"); // NOI18N
        panelCenter.add(lblProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        panel.add(panelCenter, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusGained
        tfNombre.setBackground(Color.black);
        tfNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfNombreFocusGained

    private void tfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusLost
        tfNombre.setBackground(new java.awt.Color(102, 102, 102));
        tfNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfNombreFocusLost

    private void tfTipoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTipoFocusGained
        tfTipo.setBackground(Color.black);
        tfTipo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfTipoFocusGained

    private void tfTipoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTipoFocusLost
        tfTipo.setBackground(new java.awt.Color(102, 102, 102));
        tfTipo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfTipoFocusLost

    private void tfNombreRecintoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreRecintoFocusGained
        tfNombreRecinto.setBackground(Color.black);
        tfNombreRecinto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfNombreRecintoFocusGained

    private void tfNombreRecintoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreRecintoFocusLost
        tfNombreRecinto.setBackground(new java.awt.Color(102, 102, 102));
        tfNombreRecinto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfNombreRecintoFocusLost

    private void tfHoraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfHoraFocusGained
        tfHora.setBackground(Color.black);
        tfHora.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfHoraFocusGained

    private void tfHoraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfHoraFocusLost
        tfHora.setBackground(new java.awt.Color(102, 102, 102));
        tfHora.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfHoraFocusLost

    private void tfCapacidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCapacidadFocusGained
        tfCapacidad.setBackground(Color.black);
        tfCapacidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfCapacidadFocusGained

    private void tfCapacidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCapacidadFocusLost
        tfCapacidad.setBackground(new java.awt.Color(102, 102, 102));
        tfCapacidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfCapacidadFocusLost

    private void tfPrecioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPrecioFocusGained
        tfPrecio.setBackground(Color.black);
        tfPrecio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfPrecioFocusGained

    private void tfPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPrecioFocusLost
        tfPrecio.setBackground(new java.awt.Color(102, 102, 102));
        tfPrecio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfPrecioFocusLost

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Estas seguro que desea elimnar?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            if(ce.eliminarEvento(eve.getId())){
                dispose();
            }
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnAnadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnadirMouseClicked
        Evento evento = new Evento(tfNombre.getText(), tfTipo.getText(),
                direccion(), Date.valueOf(ftfFecha.getText()),
                Integer.parseInt(tfCapacidad.getText()));
        
        
        if(btnAnadir.getText().equals("Modificar")){
            if(ce.modificarEvento(evento)){
                dispose();
            }
        }else if(btnAnadir.getText().equals("Añadir")){
            if(ce.insertarEvento(evento)){
                dispose();
            }
        }
    }//GEN-LAST:event_btnAnadirMouseClicked

    private void ftfFechaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftfFechaFocusGained
        ftfFecha.setBackground(Color.black);
        ftfFecha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_ftfFechaFocusGained

    private void ftfFechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftfFechaFocusLost
        ftfFecha.setBackground(new java.awt.Color(102, 102, 102));
        ftfFecha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_ftfFechaFocusLost

    private void tfCalleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCalleFocusGained
        tfCalle.setBackground(Color.black);
        tfCalle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfCalleFocusGained

    private void tfCalleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCalleFocusLost
        tfCalle.setBackground(new java.awt.Color(102, 102, 102));
        tfCalle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfCalleFocusLost

    private void tfNumeroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNumeroFocusGained
        tfNumero.setBackground(Color.black);
        tfNumero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfNumeroFocusGained

    private void tfNumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNumeroFocusLost
        tfNumero.setBackground(new java.awt.Color(102, 102, 102));
        tfNumero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfNumeroFocusLost

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
        tfNombre.setText(eve.getNombre());
        tfTipo.setText(eve.getTipo_evento());       
        separarDireccion(eve.getLugar_evento());
        ftfFecha.setText(eve.getFecha_evento()+"");
        tfCapacidad.setText(eve.getEntradas()+"");
                
        btnAnadir.setText("Modificar");
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
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbProvincia;
    private javax.swing.JFormattedTextField ftfFecha;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblCapacidad;
    private javax.swing.JLabel lblCodPostal;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblLocalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreRecinto;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProvincia;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelSouth;
    private javax.swing.JPanel panelSouthLeft;
    private javax.swing.JPanel panelSouthRigth;
    private javax.swing.JTextField tfCalle;
    private javax.swing.JTextField tfCapacidad;
    private javax.swing.JTextField tfCodPostal;
    private javax.swing.JTextField tfHora;
    private javax.swing.JTextField tfLocalidad;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNombreRecinto;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfPrecio;
    private javax.swing.JTextField tfTipo;
    // End of variables declaration//GEN-END:variables
}