package presentacion;

import dominio.ControlEvento;
import dominio.Evento;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 * @author angel
 **/
public class eventosPanel extends javax.swing.JPanel {

    public eventosPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNorthEventos = new javax.swing.JPanel();
        tfBuscarEventos = new javax.swing.JTextField();
        btnBuscarEventos = new javax.swing.JButton();
        panelSouthEventos = new javax.swing.JPanel();
        btnAnadirEventos = new javax.swing.JButton();
        btnEliminarEventos = new javax.swing.JButton();
        panelCenterEventos = new javax.swing.JPanel();
        scrollPanelListEventos = new javax.swing.JScrollPane();
        listEventos = new javax.swing.JList<>();

        setLayout(new java.awt.BorderLayout());

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
        btnBuscarEventos.setName("btnBuscarEventos"); // NOI18N
        btnBuscarEventos.setPreferredSize(new java.awt.Dimension(100, 35));
        panelNorthEventos.add(btnBuscarEventos);

        add(panelNorthEventos, java.awt.BorderLayout.PAGE_START);

        panelSouthEventos.setBackground(new java.awt.Color(51, 51, 51));
        panelSouthEventos.setName("panelSouthEventos"); // NOI18N
        panelSouthEventos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        btnAnadirEventos.setBackground(new java.awt.Color(0, 204, 0));
        btnAnadirEventos.setText("Añadir");
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
        btnEliminarEventos.setName("btnEliminarEventos"); // NOI18N
        btnEliminarEventos.setPreferredSize(new java.awt.Dimension(180, 35));
        panelSouthEventos.add(btnEliminarEventos);

        add(panelSouthEventos, java.awt.BorderLayout.PAGE_END);

        panelCenterEventos.setBackground(new java.awt.Color(51, 51, 51));
        panelCenterEventos.setName("panelCenterEventos"); // NOI18N

        modeloListaEventos = new DefaultListModel();
        listEventos.setModel(modeloListaEventos);
        modeloListaEventos.addAll(0,obtenerEventos());
        listEventos.setBackground(new java.awt.Color(102, 102, 102));
        listEventos.setForeground(new java.awt.Color(255, 255, 255));
        scrollPanelListEventos.setViewportView(listEventos);

        javax.swing.GroupLayout panelCenterEventosLayout = new javax.swing.GroupLayout(panelCenterEventos);
        panelCenterEventos.setLayout(panelCenterEventosLayout);
        panelCenterEventosLayout.setHorizontalGroup(
            panelCenterEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCenterEventosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanelListEventos, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCenterEventosLayout.setVerticalGroup(
            panelCenterEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPanelListEventos, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        add(panelCenterEventos, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

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
    }//GEN-LAST:event_btnAnadirEventosMousePressed
    
    public ArrayList<Evento> obtenerEventos(){
        ControlEvento ceve = new ControlEvento();
        return ceve.obtenerEventos();
    }
    
    public void actualizarListaEventos(){
        modeloListaEventos.removeAllElements();
        modeloListaEventos.addAll(0, obtenerEventos());
    } 
    
    private DefaultListModel modeloListaEventos;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadirEventos;
    private javax.swing.JButton btnBuscarEventos;
    private javax.swing.JButton btnEliminarEventos;
    private javax.swing.JList<String> listEventos;
    private javax.swing.JPanel panelCenterEventos;
    private javax.swing.JPanel panelNorthEventos;
    private javax.swing.JPanel panelSouthEventos;
    private javax.swing.JScrollPane scrollPanelListEventos;
    private javax.swing.JTextField tfBuscarEventos;
    // End of variables declaration//GEN-END:variables
}