package presentacion;

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

    public SociosPanel() {
        initComponents();
        cs = new ControlSocio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNorthSocios = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tfBuscarSocios = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelSouthSocios = new javax.swing.JPanel();
        kButton1 = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        panelCenterSocios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
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
        jTable1 = new javax.swing.JTable();

        setFocusable(false);
        setLayout(new java.awt.BorderLayout());

        panelNorthSocios.setBackground(new java.awt.Color(51, 51, 51));
        panelNorthSocios.setFocusable(false);
        panelNorthSocios.setName("panelNorthSocios"); // NOI18N
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 20, 5);
        flowLayout1.setAlignOnBaseline(true);
        panelNorthSocios.setLayout(flowLayout1);

        jPanel1.setBackground(new java.awt.Color(31, 31, 31));
        jPanel1.setFocusable(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(205, 35));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 0, 0));

        tfBuscarSocios.setBackground(new java.awt.Color(31, 31, 31));
        tfBuscarSocios.setForeground(new java.awt.Color(153, 153, 153));
        tfBuscarSocios.setText("Buscar...");
        tfBuscarSocios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tfBuscarSocios.setCaretColor(new java.awt.Color(204, 0, 204));
        tfBuscarSocios.setName("tfBuscarSocios"); // NOI18N
        tfBuscarSocios.setNextFocusableComponent(jLabel2);
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
        jPanel1.add(tfBuscarSocios);

        jLabel2.setBackground(new java.awt.Color(31, 31, 31));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\search-gray.png")); // NOI18N
        jLabel2.setToolTipText("Buscar");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setNextFocusableComponent(kButton2);
        jLabel2.setPreferredSize(new java.awt.Dimension(35, 35));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel1.add(jLabel2);

        panelNorthSocios.add(jPanel1);

        jLabel1.setVisible(false);
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\cancelar24.png")); // NOI18N
        jLabel1.setToolTipText("Limpiar");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        panelNorthSocios.add(jLabel1);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        panelNorthSocios.add(jLabel3);

        add(panelNorthSocios, java.awt.BorderLayout.PAGE_START);

        panelSouthSocios.setBackground(new java.awt.Color(51, 51, 51));
        panelSouthSocios.setFocusable(false);
        panelSouthSocios.setName("panelSouthSocios"); // NOI18N
        panelSouthSocios.setPreferredSize(new java.awt.Dimension(648, 75));
        panelSouthSocios.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 20, 20));

        kButton1.setBorder(null);
        kButton1.setText("Eliminar");
        kButton1.setkEndColor(new java.awt.Color(51, 0, 51));
        kButton1.setkStartColor(new java.awt.Color(204, 0, 204));
        kButton1.setNextFocusableComponent(tfBuscarSocios);
        kButton1.setPreferredSize(new java.awt.Dimension(180, 35));
        kButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton1MouseClicked(evt);
            }
        });
        panelSouthSocios.add(kButton1);

        kButton2.setBorder(null);
        kButton2.setText("Añadir");
        kButton2.setkEndColor(new java.awt.Color(51, 0, 51));
        kButton2.setkStartColor(new java.awt.Color(204, 0, 204));
        kButton2.setNextFocusableComponent(kButton1);
        kButton2.setPreferredSize(new java.awt.Dimension(180, 35));
        kButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton2MouseClicked(evt);
            }
        });
        panelSouthSocios.add(kButton2);

        add(panelSouthSocios, java.awt.BorderLayout.PAGE_END);

        panelCenterSocios.setBackground(new java.awt.Color(51, 51, 51));
        panelCenterSocios.setFocusable(false);
        panelCenterSocios.setName("panelCenterSocios"); // NOI18N
        panelCenterSocios.setPreferredSize(new java.awt.Dimension(800, 430));
        panelCenterSocios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable1.setSelectionForeground(new Color(255,255,255));
        jTable1.setSelectionBackground(new Color(31,31,31));
        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(dtm);
        jTable1.setRowHeight(50);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowGrid(true);
        jTable1.setShowVerticalLines(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        panelCenterSocios.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 760, 390));

        add(panelCenterSocios, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void tfBuscarSociosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBuscarSociosFocusGained
        tfBuscarSocios.setBorder(BorderFactory.createLineBorder(new Color(204, 0, 204)));
        if(tfBuscarSocios.getText().equals("Buscar...")){
            tfBuscarSocios.setText("");
            tfBuscarSocios.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_tfBuscarSociosFocusGained

    private void tfBuscarSociosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBuscarSociosFocusLost
        tfBuscarSocios.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));        
    }//GEN-LAST:event_tfBuscarSociosFocusLost

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        actualizarTabla();
        jLabel1.setVisible(false);
        jLabel3.setText("");
               
        tfBuscarSocios.setText("Buscar...");
        tfBuscarSocios.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_jLabel1MouseClicked

    private void kButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton1MouseClicked
        int index = jTable1.getSelectedRow();

        Socio socio = cs.obtenerSocio((String)dtm.getValueAt(index, 0));
                        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Estas seguro que desea elimnar?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            if(cs.eliminarSocio(socio.getDni())){
                dtm.removeRow(index);
            }
        }
    }//GEN-LAST:event_kButton1MouseClicked

    private void kButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton2MouseClicked
        JPanel card = (JPanel) this.getParent();
        EditSocioPanel editSP = new EditSocioPanel();
        card.add(editSP, "cardEditSP");
        CardLayout cardLayout = (CardLayout) card.getLayout();
        cardLayout.show(card, "cardEditSP");
    }//GEN-LAST:event_kButton2MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        tfBuscarSocios.nextFocus();
        String nombre = tfBuscarSocios.getText();
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
            
            jLabel1.setVisible(true);
            jLabel3.setText("");
        }else{
            jLabel3.setText("No se ha encontrado ninguna coincidencia");
        }         
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\search-white.png"));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\search-gray.png"));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(evt.getClickCount() == 2){            
            int index = jTable1.getSelectedRow();
            Socio socio = cs.obtenerSocio((String)dtm.getValueAt(index, 0));
            
            JPanel card = (JPanel) this.getParent();
            EditSocioPanel editSP = new EditSocioPanel(socio);
            editSP.rellenarCampos();
            card.add(editSP, "cardEditSP");
            CardLayout cardLayout = (CardLayout) card.getLayout();
            cardLayout.show(card, "cardEditSP");        
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private ArrayList<Socio> obtenerSocios(){
        ControlSocio csoc = new ControlSocio();
        return csoc.obtenerSocios();
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
                socios.get(i).getApellidos(), socios.get(i).getFecha_ingreso(),
                socios.get(i).getId_membresia(), socios.get(i).isPagado()};
            dtm.addRow(newSocio);
        }
    }
    
    private DefaultTableModel dtm;   
    private final ControlSocio cs;        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private javax.swing.JPanel panelCenterSocios;
    private javax.swing.JPanel panelNorthSocios;
    private javax.swing.JPanel panelSouthSocios;
    private javax.swing.JTextField tfBuscarSocios;
    // End of variables declaration//GEN-END:variables
}