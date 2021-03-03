package presentacion;

import dominio.Asociacion;
import dominio.ControlEntradas;
import dominio.ControlEvento;
import dominio.Entrada;
import dominio.Evento;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 * @author angel
 **/
public class EntradasPanel extends javax.swing.JPanel {

    public EntradasPanel(Asociacion asociacion) {
        this.asociacion = asociacion;
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelNorth = new javax.swing.JPanel();
        panelSeleccionEvento = new javax.swing.JPanel();
        lblEvento = new javax.swing.JLabel();
        cbEvento = new javax.swing.JComboBox<>();
        panelGenerarEntradas = new javax.swing.JPanel();
        btnGenerarEntradas = new keeptoo.KButton();
        panelCenter = new javax.swing.JPanel();
        panelNumEntradas = new javax.swing.JPanel();
        lblNumEntradas = new javax.swing.JLabel();
        lblNum = new javax.swing.JLabel();
        panelListEntradas = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        listEntradas = new javax.swing.JList<>();

        setLayout(new java.awt.BorderLayout());

        panelNorth.setBackground(new java.awt.Color(51, 51, 51));
        panelNorth.setName("panelNorth"); // NOI18N
        panelNorth.setLayout(new java.awt.GridLayout());

        panelSeleccionEvento.setBackground(new java.awt.Color(51, 51, 51));
        panelSeleccionEvento.setMinimumSize(new java.awt.Dimension(160, 30));
        panelSeleccionEvento.setName("panelSeleccionEvento"); // NOI18N
        panelSeleccionEvento.setPreferredSize(new java.awt.Dimension(112, 60));
        panelSeleccionEvento.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 20, 10));

        lblEvento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEvento.setForeground(new java.awt.Color(255, 255, 255));
        lblEvento.setText("Evento");
        lblEvento.setName("lblEvento"); // NOI18N
        lblEvento.setPreferredSize(new java.awt.Dimension(45, 35));
        panelSeleccionEvento.add(lblEvento);

        rellenarComboBox();
        cbEvento.setName("cbEvento"); // NOI18N
        cbEvento.setPreferredSize(new java.awt.Dimension(180, 35));
        cbEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbEventoMouseClicked(evt);
            }
        });
        panelSeleccionEvento.add(cbEvento);

        panelNorth.add(panelSeleccionEvento);

        panelGenerarEntradas.setBackground(new java.awt.Color(51, 51, 51));
        panelGenerarEntradas.setName("panelGenerarEntradas"); // NOI18N
        panelGenerarEntradas.setPreferredSize(new java.awt.Dimension(140, 60));
        panelGenerarEntradas.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 20, 10));

        btnGenerarEntradas.setBorder(null);
        btnGenerarEntradas.setText("Generar Entradas");
        btnGenerarEntradas.setkEndColor(new java.awt.Color(51, 0, 51));
        btnGenerarEntradas.setkStartColor(new java.awt.Color(204, 0, 204));
        btnGenerarEntradas.setName("btnGenerarEntradas"); // NOI18N
        btnGenerarEntradas.setPreferredSize(new java.awt.Dimension(180, 35));
        btnGenerarEntradas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarEntradasMouseClicked(evt);
            }
        });
        panelGenerarEntradas.add(btnGenerarEntradas);

        panelNorth.add(panelGenerarEntradas);

        add(panelNorth, java.awt.BorderLayout.NORTH);

        panelCenter.setBackground(new java.awt.Color(51, 51, 51));
        panelCenter.setName("panelCenter"); // NOI18N
        panelCenter.setPreferredSize(new java.awt.Dimension(800, 490));
        panelCenter.setLayout(new java.awt.BorderLayout());

        panelNumEntradas.setBackground(new java.awt.Color(51, 51, 51));
        panelNumEntradas.setName("panelNumEntradas"); // NOI18N
        panelNumEntradas.setPreferredSize(new java.awt.Dimension(135, 30));
        panelNumEntradas.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 20, 5));

        lblNumEntradas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNumEntradas.setForeground(new java.awt.Color(255, 255, 255));
        lblNumEntradas.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNumEntradas.setText("Número de entradas:");
        lblNumEntradas.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblNumEntradas.setName("lblNumEntradas"); // NOI18N
        lblNumEntradas.setPreferredSize(new java.awt.Dimension(120, 14));
        panelNumEntradas.add(lblNumEntradas);

        lblNum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNum.setForeground(new java.awt.Color(255, 255, 255));
        lblNum.setName("lblNum"); // NOI18N
        panelNumEntradas.add(lblNum);

        panelCenter.add(panelNumEntradas, java.awt.BorderLayout.PAGE_START);

        panelListEntradas.setBackground(new java.awt.Color(51, 51, 51));
        panelListEntradas.setName("panelListEntradas"); // NOI18N
        panelListEntradas.setPreferredSize(new java.awt.Dimension(800, 460));
        panelListEntradas.setLayout(new java.awt.GridBagLayout());

        scrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        scrollPane.setName("scrollPane"); // NOI18N

        modeloListaEntradas = new DefaultListModel();
        listEntradas.setModel(modeloListaEntradas);
        listEntradas.setSelectionForeground(new Color(255,255,255));
        listEntradas.setBackground(new java.awt.Color(102, 102, 102));
        listEntradas.setForeground(new java.awt.Color(255, 255, 255));
        listEntradas.setName("listEntradas"); // NOI18N
        listEntradas.setSelectionBackground(new java.awt.Color(31, 31, 31));
        scrollPane.setViewportView(listEntradas);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 737;
        gridBagConstraints.ipady = 417;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 20);
        panelListEntradas.add(scrollPane, gridBagConstraints);

        panelCenter.add(panelListEntradas, java.awt.BorderLayout.CENTER);

        add(panelCenter, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void cbEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbEventoMouseClicked
        actualizarListaEntradas();
    }//GEN-LAST:event_cbEventoMouseClicked

    private void btnGenerarEntradasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarEntradasMouseClicked
        Evento evento = (Evento) cbEvento.getSelectedItem();
        if(evento != null){
            GenerarEntradas ge = new GenerarEntradas(evento, sacarEntradas(evento.getId()), asociacion);
            ge.setVisible(true);
            ge.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnGenerarEntradasMouseClicked

    public void actualizarListaEntradas(){
        if(cbEvento.getSelectedItem() != null){
            Evento evento = (Evento)cbEvento.getSelectedItem();
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
        ArrayList<Evento> evs = cev.obtenerEventos(asociacion.getNombre());
        
        for(int i = 0 ; i < evs.size() ; i++){
            cbEvento.addItem(evs.get(i));
        }
        cbEvento.setSelectedItem(null);
    }
    
    private ArrayList<Entrada> sacarEntradas(int id_evento){
        ControlEntradas cen = new ControlEntradas();
        ArrayList<Entrada> entradas = cen.obtenerEntradasEvento(id_evento);
        
        return entradas;
    }        
    
    private final Asociacion asociacion;
    
    private DefaultListModel modeloListaEntradas;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnGenerarEntradas;
    private javax.swing.JComboBox<Evento> cbEvento;
    private javax.swing.JLabel lblEvento;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblNumEntradas;
    private javax.swing.JList<String> listEntradas;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelGenerarEntradas;
    private javax.swing.JPanel panelListEntradas;
    private javax.swing.JPanel panelNorth;
    private javax.swing.JPanel panelNumEntradas;
    private javax.swing.JPanel panelSeleccionEvento;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}