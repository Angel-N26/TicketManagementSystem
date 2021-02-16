package presentacion;

import dominio.ControlEvento;
import dominio.Evento;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author angel
 **/
public class EventosPanel extends javax.swing.JPanel {

    public EventosPanel() {
        initComponents();
        ce = new ControlEvento();
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
        jLabel1 = new javax.swing.JLabel();
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
        btnBuscarEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarEventosMouseClicked(evt);
            }
        });
        panelNorthEventos.add(btnBuscarEventos);

        jLabel1.setVisible(false);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Documents\\NetBeansProjects\\TicketManagementSystem\\src\\main\\java\\recursos\\cerrar(1).png")); // NOI18N
        jLabel1.setEnabled(false);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        panelNorthEventos.add(jLabel1);

        add(panelNorthEventos, java.awt.BorderLayout.PAGE_START);

        panelSouthEventos.setBackground(new java.awt.Color(51, 51, 51));
        panelSouthEventos.setName("panelSouthEventos"); // NOI18N
        panelSouthEventos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        btnAnadirEventos.setBackground(new java.awt.Color(0, 204, 0));
        btnAnadirEventos.setText("Añadir");
        btnAnadirEventos.setName("btnAnadirEventos"); // NOI18N
        btnAnadirEventos.setPreferredSize(new java.awt.Dimension(180, 35));
        btnAnadirEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnadirEventosMouseClicked(evt);
            }
        });
        panelSouthEventos.add(btnAnadirEventos);

        btnEliminarEventos.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminarEventos.setText("Eliminar");
        btnEliminarEventos.setName("btnEliminarEventos"); // NOI18N
        btnEliminarEventos.setPreferredSize(new java.awt.Dimension(180, 35));
        btnEliminarEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarEventosMouseClicked(evt);
            }
        });
        panelSouthEventos.add(btnEliminarEventos);

        add(panelSouthEventos, java.awt.BorderLayout.PAGE_END);

        panelCenterEventos.setBackground(new java.awt.Color(51, 51, 51));
        panelCenterEventos.setName("panelCenterEventos"); // NOI18N

        modeloListaEventos = new DefaultListModel();
        listEventos.setModel(modeloListaEventos);
        modeloListaEventos.addAll(0,obtenerEventos());
        listEventos.setBackground(new java.awt.Color(102, 102, 102));
        listEventos.setForeground(new java.awt.Color(255, 255, 255));
        listEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listEventosMouseClicked(evt);
            }
        });
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

    private void btnBuscarEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarEventosMouseClicked
        String nombre = tfBuscarEventos.getText();
        ArrayList<Evento> eve = obtenerEventos();
        ArrayList<Evento> eveBusca = new ArrayList();      
        for(int i = 0 ; i < eve.size() ; i++){
            if(nombre.equals(eve.get(i).getNombre())){
                eveBusca.add(eve.get(i));
            }
        }
        
        if(!eveBusca.isEmpty()){
            modeloListaEventos.removeAllElements();
            modeloListaEventos.addAll(0, eveBusca);
            
            jLabel1.setVisible(true);
            jLabel1.setEnabled(true);
        }
    }//GEN-LAST:event_btnBuscarEventosMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        actualizarListaEventos();
        jLabel1.setVisible(false);
        jLabel1.setEnabled(false);
        tfBuscarEventos.setText("");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnAnadirEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnadirEventosMouseClicked
        JPanel card = (JPanel) this.getParent();
        EditEventoPanel editEP = new EditEventoPanel();
        card.add(editEP, "cardEditEP");
        CardLayout cardLayout = (CardLayout) card.getLayout();
        cardLayout.show(card, "cardEditEP");
    }//GEN-LAST:event_btnAnadirEventosMouseClicked

    private void btnEliminarEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarEventosMouseClicked
        int index = listEventos.getSelectedIndex();
        String evento = modeloListaEventos.getElementAt(index) + "";
        String [] e = evento.split(" ");
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Estas seguro que desea elimnar?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            if(ce.eliminarEvento(Integer.parseInt(e[0]))){
                modeloListaEventos.remove(listEventos.getSelectedIndex());
            }
        }
    }//GEN-LAST:event_btnEliminarEventosMouseClicked

    private void listEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listEventosMouseClicked
        if(evt.getClickCount() == 2){
            Evento evento = listEventos.getSelectedValue();
            
            JPanel card = (JPanel) this.getParent();
            EditEventoPanel editEP = new EditEventoPanel(evento);
            editEP.rellenarCampos();
            card.add(editEP, "cardEditEP");
            CardLayout cardLayout = (CardLayout) card.getLayout();
            cardLayout.show(card, "cardEditEP");
        }
    }//GEN-LAST:event_listEventosMouseClicked
    
    public ArrayList<Evento> obtenerEventos(){
        ControlEvento ceve = new ControlEvento();
        return ceve.obtenerEventos();
    }
    
    public void actualizarListaEventos(){
        modeloListaEventos.removeAllElements();
        modeloListaEventos.addAll(0, obtenerEventos());
    } 
    
    private DefaultListModel modeloListaEventos;
    private final ControlEvento ce;    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadirEventos;
    private javax.swing.JButton btnBuscarEventos;
    private javax.swing.JButton btnEliminarEventos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<Evento> listEventos;
    private javax.swing.JPanel panelCenterEventos;
    private javax.swing.JPanel panelNorthEventos;
    private javax.swing.JPanel panelSouthEventos;
    private javax.swing.JScrollPane scrollPanelListEventos;
    private javax.swing.JTextField tfBuscarEventos;
    // End of variables declaration//GEN-END:variables
}