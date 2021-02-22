package presentacion;

import dominio.ControlSocio;
import dominio.Socio;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
        scrollPanelListSocios = new javax.swing.JScrollPane();
        listSocios = new javax.swing.JList<>();
        kButton2 = new keeptoo.KButton();
        kButton1 = new keeptoo.KButton();
        panelCenterSocios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setFocusable(false);
        setLayout(new java.awt.BorderLayout());

        panelNorthSocios.setBackground(new java.awt.Color(51, 51, 51));
        panelNorthSocios.setFocusable(false);
        panelNorthSocios.setName("panelNorthSocios"); // NOI18N
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5);
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

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
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
        panelSouthSocios.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        scrollPanelListSocios.setBackground(new java.awt.Color(102, 102, 102));
        scrollPanelListSocios.setFocusable(false);
        scrollPanelListSocios.setPreferredSize(new java.awt.Dimension(258, 35));

        modeloListaSocios = new DefaultListModel();
        listSocios.setModel(modeloListaSocios);
        modeloListaSocios.addAll(0,obtenerSocios());
        listSocios.setBackground(new java.awt.Color(102, 102, 102));
        listSocios.setForeground(new java.awt.Color(255, 255, 255));
        listSocios.setSelectionBackground(new java.awt.Color(204, 0, 204));
        listSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listSociosMouseClicked(evt);
            }
        });
        scrollPanelListSocios.setViewportView(listSocios);

        panelSouthSocios.add(scrollPanelListSocios);

        kButton2.setBorder(null);
        kButton2.setText("Añadir");
        kButton2.setNextFocusableComponent(kButton1);
        kButton2.setPreferredSize(new java.awt.Dimension(185, 35));
        kButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton2MouseClicked(evt);
            }
        });
        panelSouthSocios.add(kButton2);

        kButton1.setBorder(null);
        kButton1.setText("Eliminar");
        kButton1.setNextFocusableComponent(tfBuscarSocios);
        kButton1.setPreferredSize(new java.awt.Dimension(185, 35));
        kButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton1MouseClicked(evt);
            }
        });
        panelSouthSocios.add(kButton1);

        add(panelSouthSocios, java.awt.BorderLayout.PAGE_END);

        panelCenterSocios.setBackground(new java.awt.Color(51, 51, 51));
        panelCenterSocios.setFocusable(false);
        panelCenterSocios.setName("panelCenterSocios"); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"asd", "asd", "das", "asd",  new Boolean(true)},
                {"asdasda", "asda", "asdasd", "asdasd",  new Boolean(false)}
            },
            new String [] {
                "Nombre", "Apellidos", "Fecha ", "Membresia", "Pagado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(50);
        jTable1.setSelectionBackground(new java.awt.Color(204, 0, 204));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowGrid(true);
        jTable1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout panelCenterSociosLayout = new javax.swing.GroupLayout(panelCenterSocios);
        panelCenterSocios.setLayout(panelCenterSociosLayout);
        panelCenterSociosLayout.setHorizontalGroup(
            panelCenterSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCenterSociosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCenterSociosLayout.setVerticalGroup(
            panelCenterSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCenterSociosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

    private void listSociosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listSociosMouseClicked
        if(evt.getClickCount() == 2){            
            Socio socio = listSocios.getSelectedValue();            
            
            JPanel card = (JPanel) this.getParent();
            EditSocioPanel editSP = new EditSocioPanel(socio);
            editSP.rellenarCampos();
            card.add(editSP, "cardEditSP");
            CardLayout cardLayout = (CardLayout) card.getLayout();
            cardLayout.show(card, "cardEditSP");        
        }
    }//GEN-LAST:event_listSociosMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        actualizarListaSocios();
        jLabel1.setVisible(false);
        jLabel3.setVisible(false);
               
        tfBuscarSocios.setText("Buscar...");
        tfBuscarSocios.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_jLabel1MouseClicked

    private void kButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton1MouseClicked
        int index = listSocios.getSelectedIndex();
        Socio socio =(Socio) modeloListaSocios.getElementAt(index);
                        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Estas seguro que desea elimnar?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            if(cs.eliminarSocio(socio.getDni())){
                modeloListaSocios.remove(listSocios.getSelectedIndex());
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
            modeloListaSocios.removeAllElements();
            modeloListaSocios.addAll(0, socBusca);
            
            jLabel1.setVisible(true);
            jLabel3.setText("");
        }else{
            modeloListaSocios.removeAllElements();
            modeloListaSocios.addAll(0, socBusca);
            
            jLabel1.setVisible(true);
            jLabel3.setText("No se ha encontrado ninguna coincidencia");
        }         
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        if(buscar)
            jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\search-white.png"));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        if(buscar)
            jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\search-gray.png"));
    }//GEN-LAST:event_jLabel2MouseExited

    public ArrayList<Socio> obtenerSocios(){
        ControlSocio csoc = new ControlSocio();
        return csoc.obtenerSocios();
    }
    
    public void actualizarTabla(){
        ArrayList<Socio> socios = obtenerSocios();
        //jTable1.
        
    }
    
    public void actualizarListaSocios(){
        modeloListaSocios.removeAllElements();
        modeloListaSocios.addAll(0, obtenerSocios());
    }
    
    private boolean buscar = true;
    
    private DefaultListModel modeloListaSocios;    
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
    private javax.swing.JList<Socio> listSocios;
    private javax.swing.JPanel panelCenterSocios;
    private javax.swing.JPanel panelNorthSocios;
    private javax.swing.JPanel panelSouthSocios;
    private javax.swing.JScrollPane scrollPanelListSocios;
    private javax.swing.JTextField tfBuscarSocios;
    // End of variables declaration//GEN-END:variables
}