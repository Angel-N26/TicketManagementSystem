package presentacion;

import dominio.Asociacion;
import dominio.ControlSocio;
import dominio.Socio;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 * @author angel
 **/
public class SociosPanel extends javax.swing.JPanel {

    public SociosPanel(Asociacion asociacion) {
        this.asociacion = asociacion;        
        initComponents();
        cs = new ControlSocio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelNorth = new javax.swing.JPanel();
        panelBuscar = new javax.swing.JPanel();
        tfBuscar = new javax.swing.JTextField();
        buscar = new javax.swing.JLabel();
        clear = new javax.swing.JLabel();
        lblNoResultados = new javax.swing.JLabel();
        panelCenter = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        String[] titulos = {"DNI", "Nombre", "Apellidos", "Fecha", "Membresia","Pagado"};
        Object[][] datos = {};
        dtm = new DefaultTableModel(datos, titulos) {
            Class[] types = new Class [] {
                String.class, String.class, String.class, Object.class, Integer.class, Boolean.class
            };

            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        };
        actualizarTabla();
        table = new javax.swing.JTable();
        panelSouth = new javax.swing.JPanel();
        btnEliminar = new keeptoo.KButton();
        btnAnadir = new keeptoo.KButton();

        setFocusable(false);
        setLayout(new java.awt.BorderLayout());

        panelNorth.setBackground(new java.awt.Color(51, 51, 51));
        panelNorth.setFocusable(false);
        panelNorth.setName("panelNorth"); // NOI18N
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 20, 5);
        flowLayout1.setAlignOnBaseline(true);
        panelNorth.setLayout(flowLayout1);

        panelBuscar.setBackground(new java.awt.Color(31, 31, 31));
        panelBuscar.setFocusable(false);
        panelBuscar.setPreferredSize(new java.awt.Dimension(205, 35));
        panelBuscar.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 0, 0));

        tfBuscar.setBackground(new java.awt.Color(31, 31, 31));
        tfBuscar.setForeground(new java.awt.Color(153, 153, 153));
        tfBuscar.setText("Buscar...");
        tfBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tfBuscar.setCaretColor(new java.awt.Color(204, 0, 204));
        tfBuscar.setName("tfBuscar"); // NOI18N
        tfBuscar.setNextFocusableComponent(buscar);
        tfBuscar.setPreferredSize(new java.awt.Dimension(170, 35));
        tfBuscar.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfBuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfBuscarFocusLost(evt);
            }
        });
        panelBuscar.add(tfBuscar);

        buscar.setBackground(new java.awt.Color(31, 31, 31));
        buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\search-gray.png")); // NOI18N
        buscar.setToolTipText("Buscar");
        buscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buscar.setName("buscar"); // NOI18N
        buscar.setNextFocusableComponent(btnAnadir);
        buscar.setPreferredSize(new java.awt.Dimension(35, 35));
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarMouseExited(evt);
            }
        });
        panelBuscar.add(buscar);

        panelNorth.add(panelBuscar);

        clear.setVisible(false);
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\cancelar24.png")); // NOI18N
        clear.setToolTipText("Limpiar");
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clear.setName("clear"); // NOI18N
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        panelNorth.add(clear);

        lblNoResultados.setVisible(false);
        lblNoResultados.setForeground(new java.awt.Color(255, 255, 255));
        lblNoResultados.setText("No se ha encontrado ninguna coincidencia");
        panelNorth.add(lblNoResultados);

        add(panelNorth, java.awt.BorderLayout.NORTH);

        panelCenter.setBackground(new java.awt.Color(51, 51, 51));
        panelCenter.setFocusable(false);
        panelCenter.setName("panelCenter"); // NOI18N
        panelCenter.setPreferredSize(new java.awt.Dimension(800, 430));
        panelCenter.setLayout(new java.awt.GridBagLayout());

        scrollPane.setBackground(new java.awt.Color(51, 51, 51));
        scrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        scrollPane.setName("scrollPane"); // NOI18N
        scrollPane.setPreferredSize(new java.awt.Dimension(760, 390));
        scrollPane.setRequestFocusEnabled(false);

        table.setSelectionForeground(new Color(255,255,255));
        table.setSelectionBackground(new Color(31,31,31));
        table.setBackground(new java.awt.Color(51, 51, 51));
        table.setForeground(new java.awt.Color(255, 255, 255));
        table.setModel(dtm);
        table.setToolTipText("Doble Click para editar");
        table.setName("table"); // NOI18N
        table.setRowHeight(50);
        table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table.setShowGrid(true);
        table.setShowVerticalLines(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        scrollPane.setViewportView(table);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 737;
        gridBagConstraints.ipady = 363;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        panelCenter.add(scrollPane, gridBagConstraints);

        add(panelCenter, java.awt.BorderLayout.CENTER);

        panelSouth.setBackground(new java.awt.Color(51, 51, 51));
        panelSouth.setFocusable(false);
        panelSouth.setName("panelSouth"); // NOI18N
        panelSouth.setPreferredSize(new java.awt.Dimension(648, 75));
        panelSouth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 20, 20));

        btnEliminar.setBorder(null);
        btnEliminar.setText("Eliminar");
        btnEliminar.setkEndColor(new java.awt.Color(51, 0, 51));
        btnEliminar.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        btnEliminar.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnEliminar.setkHoverStartColor(new java.awt.Color(51, 0, 51));
        btnEliminar.setkPressedColor(new java.awt.Color(255, 153, 204));
        btnEliminar.setkStartColor(new java.awt.Color(204, 0, 204));
        btnEliminar.setName("btnEliminar"); // NOI18N
        btnEliminar.setNextFocusableComponent(tfBuscar);
        btnEliminar.setPreferredSize(new java.awt.Dimension(180, 35));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEliminarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEliminarMouseReleased(evt);
            }
        });
        panelSouth.add(btnEliminar);

        btnAnadir.setBorder(null);
        btnAnadir.setText("Añadir");
        btnAnadir.setkEndColor(new java.awt.Color(51, 0, 51));
        btnAnadir.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        btnAnadir.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnAnadir.setkHoverStartColor(new java.awt.Color(51, 0, 51));
        btnAnadir.setkPressedColor(new java.awt.Color(255, 153, 204));
        btnAnadir.setkStartColor(new java.awt.Color(204, 0, 204));
        btnAnadir.setName("btnAnadir"); // NOI18N
        btnAnadir.setNextFocusableComponent(btnEliminar);
        btnAnadir.setPreferredSize(new java.awt.Dimension(180, 35));
        btnAnadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAnadirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAnadirMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAnadirMouseReleased(evt);
            }
        });
        panelSouth.add(btnAnadir);

        add(panelSouth, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void tfBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBuscarFocusGained
        tfBuscar.setBorder(BorderFactory.createLineBorder(new Color(204, 0, 204)));
        if(tfBuscar.getText().equals("Buscar...")){
            tfBuscar.setText("");
            tfBuscar.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_tfBuscarFocusGained

    private void tfBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBuscarFocusLost
        tfBuscar.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));        
    }//GEN-LAST:event_tfBuscarFocusLost

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        actualizarTabla();
        clear.setVisible(false);
        lblNoResultados.setVisible(false);
               
        tfBuscar.setText("Buscar...");
        tfBuscar.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_clearMouseClicked

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        tfBuscar.nextFocus();
        String nombre = tfBuscar.getText();
        ArrayList<Socio> soc = obtenerSocios();
        ArrayList<Socio> socBusca = new ArrayList();      
        for(int i = 0 ; i < soc.size() ; i++){
            if(nombre.equals(soc.get(i).getNombre())){
                socBusca.add(soc.get(i));
            }
        }
        
        if(!socBusca.isEmpty()){
            removeTabla();
            addTabla(socBusca);
            
            clear.setVisible(true);
            lblNoResultados.setVisible(false);
        }else{
            lblNoResultados.setVisible(true);
        }         
    }//GEN-LAST:event_buscarMouseClicked

    private void buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseEntered
        buscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\search-white.png"));
    }//GEN-LAST:event_buscarMouseEntered

    private void buscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseExited
        buscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\search-gray.png"));
    }//GEN-LAST:event_buscarMouseExited

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if(evt.getClickCount() == 2){            
            int index = table.getSelectedRow();
            Socio socio = cs.obtenerSocio((String)dtm.getValueAt(index, 0), asociacion.getNombre());
            
            JPanel card = (JPanel) this.getParent();
            EditSocioPanel editSP = new EditSocioPanel(socio, asociacion);
            editSP.rellenarCampos();
            card.add(editSP, "cardEditSP");
            CardLayout cardLayout = (CardLayout) card.getLayout();
            cardLayout.show(card, "cardEditSP");        
        }
    }//GEN-LAST:event_tableMouseClicked

    private void btnAnadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnadirMouseExited
        activarAnadir = false;
    }//GEN-LAST:event_btnAnadirMouseExited

    private void btnAnadirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnadirMousePressed
        activarAnadir = true;
    }//GEN-LAST:event_btnAnadirMousePressed

    private void btnAnadirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnadirMouseReleased
        if(activarAnadir){
            JPanel card = (JPanel) this.getParent();
            EditSocioPanel editSP = new EditSocioPanel(asociacion);
            card.add(editSP, "cardEditSP");
            CardLayout cardLayout = (CardLayout) card.getLayout();
            cardLayout.show(card, "cardEditSP");
        }
    }//GEN-LAST:event_btnAnadirMouseReleased

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        activarEliminar = false;
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMousePressed
        activarEliminar = true;
    }//GEN-LAST:event_btnEliminarMousePressed

    private void btnEliminarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseReleased
        if(activarEliminar){
            if(table.getSelectedRow() != -1){
                int index = table.getSelectedRow();

                Socio socio = cs.obtenerSocio((String)dtm.getValueAt(index, 0), asociacion.getNombre());

                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog (null, 
                    "Estas seguro que desea elimnar?","Warning",dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION){
                    if(cs.eliminarSocio(socio.getDni())){
                        dtm.removeRow(index);
                    }
                }
            }else{
                JOptionPane.showMessageDialog(this, "Selecciona un socio.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEliminarMouseReleased

    private ArrayList<Socio> obtenerSocios(){
        ControlSocio csoc = new ControlSocio();
        return csoc.obtenerSocios(asociacion.getNombre());
    }
    
    public void actualizarTabla(){
        removeTabla();
        ArrayList<Socio> socios = obtenerSocios();
        addTabla(socios);
    }
    
    private void removeTabla(){
       while(dtm.getRowCount() > 0){
           dtm.removeRow(0);
       }
    }
    
    private void addTabla(ArrayList<Socio> socios){
        for(int i = 0 ; i < socios.size() ; i++){
            Object[] newSocio = {socios.get(i).getDni(), socios.get(i).getNombre(),
                socios.get(i).getApellidos(), socios.get(i).getFechaIngreso(),
                socios.get(i).getIdMembresia(), socios.get(i).isPagado()};
            dtm.addRow(newSocio);
        }
    }
    
    private boolean activarEliminar;
    private boolean activarAnadir;
    
    private final Asociacion asociacion;
    
    private DefaultTableModel dtm;   
    private final ControlSocio cs;        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnAnadir;
    private keeptoo.KButton btnEliminar;
    private javax.swing.JLabel buscar;
    private javax.swing.JLabel clear;
    private javax.swing.JLabel lblNoResultados;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelNorth;
    private javax.swing.JPanel panelSouth;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable table;
    private javax.swing.JTextField tfBuscar;
    // End of variables declaration//GEN-END:variables
}