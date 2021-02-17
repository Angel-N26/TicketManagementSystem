package presentacion;

import dominio.ControlEntradas;
import dominio.ControlEvento;
import dominio.Entrada;
import dominio.Evento;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 * @author angel
 **/
public class EntradasPanel extends javax.swing.JPanel {

    public EntradasPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setLayout(new java.awt.BorderLayout());

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
        lblNum.setName("lblNum"); // NOI18N
        panelNumEntradas.add(lblNum);

        panelCenterEntradas.add(panelNumEntradas, java.awt.BorderLayout.PAGE_START);

        panelListEntradas.setBackground(new java.awt.Color(51, 51, 51));
        panelListEntradas.setName("panelListEntradas"); // NOI18N

        modeloListaEntradas = new DefaultListModel();
        listEntradas.setModel(modeloListaEntradas);
        listEntradas.setBackground(new java.awt.Color(102, 102, 102));
        scrollPanelListEntradas.setViewportView(listEntradas);

        javax.swing.GroupLayout panelListEntradasLayout = new javax.swing.GroupLayout(panelListEntradas);
        panelListEntradas.setLayout(panelListEntradasLayout);
        panelListEntradasLayout.setHorizontalGroup(
            panelListEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListEntradasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanelListEntradas, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelListEntradasLayout.setVerticalGroup(
            panelListEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListEntradasLayout.createSequentialGroup()
                .addComponent(scrollPanelListEntradas, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelCenterEntradas.add(panelListEntradas, java.awt.BorderLayout.CENTER);

        add(panelCenterEntradas, java.awt.BorderLayout.CENTER);

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

        rellenarComboBox();
        cbSeleccionEvento.setName("cbSeleccionEvento"); // NOI18N
        cbSeleccionEvento.setPreferredSize(new java.awt.Dimension(180, 35));
        cbSeleccionEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbSeleccionEventoMouseClicked(evt);
            }
        });
        panelSeleccionEvento.add(cbSeleccionEvento);

        panelNorthEntradas.add(panelSeleccionEvento);

        panelGenerarEntradas.setBackground(new java.awt.Color(51, 51, 51));
        panelGenerarEntradas.setName("panelGenerarEntradas"); // NOI18N
        panelGenerarEntradas.setPreferredSize(new java.awt.Dimension(140, 60));
        panelGenerarEntradas.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        btnGenerarEntradas.setBackground(new java.awt.Color(255, 204, 0));
        btnGenerarEntradas.setText("Generar Entradas");
        btnGenerarEntradas.setName("btnGenerarEntradas"); // NOI18N
        btnGenerarEntradas.setPreferredSize(new java.awt.Dimension(180, 35));
        btnGenerarEntradas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGenerarEntradasMousePressed(evt);
            }
        });
        panelGenerarEntradas.add(btnGenerarEntradas);

        panelNorthEntradas.add(panelGenerarEntradas);

        add(panelNorthEntradas, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarEntradasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarEntradasMousePressed
        Evento evento = (Evento) cbSeleccionEvento.getSelectedItem();
        if(evento != null){
            GenerarEntradas ge = new GenerarEntradas(evento, sacarEntradas(evento.getId()));
            ge.setVisible(true);
            ge.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnGenerarEntradasMousePressed

    private void cbSeleccionEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbSeleccionEventoMouseClicked
        actualizarListaEntradas();
    }//GEN-LAST:event_cbSeleccionEventoMouseClicked

    public void actualizarListaEntradas(){
        if(cbSeleccionEvento.getSelectedItem() != null){
            Evento evento = (Evento)cbSeleccionEvento.getSelectedItem();
            ArrayList<Entrada> ent = sacarEntradas(evento.getId());
            lblNum.setText(ent.size()+"");
            modeloListaEntradas.removeAllElements();
            modeloListaEntradas.addElement(ent);
        }else{
            modeloListaEntradas.removeAllElements();
            lblNum.setText("");
        }
    }
    
    private void rellenarComboBox(){
        ControlEvento cev = new ControlEvento();
        ArrayList<Evento> evs = cev.obtenerEventos();
        
        for(int i = 0 ; i < evs.size() ; i++){
            cbSeleccionEvento.addItem(evs.get(i));
        }
        cbSeleccionEvento.setSelectedItem(null);
    }
    
    private ArrayList<Entrada> sacarEntradas(int id_evento){
        ControlEntradas cen = new ControlEntradas();
        ArrayList<Entrada> entradas = cen.obtenerEntradasEvento(id_evento);
        
        return entradas;
    }        
    
    private DefaultListModel modeloListaEntradas;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarEntradas;
    private javax.swing.JComboBox<Evento> cbSeleccionEvento;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblNumEntradas;
    private javax.swing.JLabel lblSeleccionEvento;
    private javax.swing.JList<String> listEntradas;
    private javax.swing.JPanel panelCenterEntradas;
    private javax.swing.JPanel panelGenerarEntradas;
    private javax.swing.JPanel panelListEntradas;
    private javax.swing.JPanel panelNorthEntradas;
    private javax.swing.JPanel panelNumEntradas;
    private javax.swing.JPanel panelSeleccionEvento;
    private javax.swing.JScrollPane scrollPanelListEntradas;
    // End of variables declaration//GEN-END:variables
}