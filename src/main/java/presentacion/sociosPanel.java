package presentacion;

import dominio.ControlSocio;
import dominio.Socio;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * @author angel
 **/
public class sociosPanel extends javax.swing.JPanel {

    public sociosPanel() {
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
        tfBuscarSocios = new javax.swing.JTextField();
        btnBuscarSocios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panelSouthSocios = new javax.swing.JPanel();
        btnAnadirSocios = new javax.swing.JButton();
        btnEliminarSocios = new javax.swing.JButton();
        panelCenterSocios = new javax.swing.JPanel();
        scrollPanelListSocios = new javax.swing.JScrollPane();
        listSocios = new javax.swing.JList<>();

        setLayout(new java.awt.BorderLayout());

        panelNorthSocios.setBackground(new java.awt.Color(51, 51, 51));
        panelNorthSocios.setName("panelNorthSocios"); // NOI18N
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5);
        flowLayout1.setAlignOnBaseline(true);
        panelNorthSocios.setLayout(flowLayout1);

        tfBuscarSocios.setBackground(new java.awt.Color(102, 102, 102));
        tfBuscarSocios.setForeground(new java.awt.Color(255, 255, 255));
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
        btnBuscarSocios.setName("btnBuscarSocios"); // NOI18N
        btnBuscarSocios.setPreferredSize(new java.awt.Dimension(100, 35));
        btnBuscarSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarSociosMouseClicked(evt);
            }
        });
        panelNorthSocios.add(btnBuscarSocios);

        jLabel1.setVisible(false);
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\cerrar(1).png")); // NOI18N
        jLabel1.setEnabled(false);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        panelNorthSocios.add(jLabel1);

        add(panelNorthSocios, java.awt.BorderLayout.PAGE_START);

        panelSouthSocios.setBackground(new java.awt.Color(51, 51, 51));
        panelSouthSocios.setName("panelSouthSocios"); // NOI18N
        panelSouthSocios.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        btnAnadirSocios.setBackground(new java.awt.Color(0, 204, 0));
        btnAnadirSocios.setText("Añadir");
        btnAnadirSocios.setName("btnAnadirSocios"); // NOI18N
        btnAnadirSocios.setPreferredSize(new java.awt.Dimension(180, 35));
        btnAnadirSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnadirSociosMouseClicked(evt);
            }
        });
        panelSouthSocios.add(btnAnadirSocios);

        btnEliminarSocios.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminarSocios.setText("Eliminar");
        btnEliminarSocios.setName("btnEliminarSocios"); // NOI18N
        btnEliminarSocios.setPreferredSize(new java.awt.Dimension(180, 35));
        btnEliminarSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarSociosMouseClicked(evt);
            }
        });
        panelSouthSocios.add(btnEliminarSocios);

        add(panelSouthSocios, java.awt.BorderLayout.PAGE_END);

        panelCenterSocios.setBackground(new java.awt.Color(51, 51, 51));
        panelCenterSocios.setName("panelCenterSocios"); // NOI18N

        scrollPanelListSocios.setBackground(new java.awt.Color(102, 102, 102));

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

        javax.swing.GroupLayout panelCenterSociosLayout = new javax.swing.GroupLayout(panelCenterSocios);
        panelCenterSocios.setLayout(panelCenterSociosLayout);
        panelCenterSociosLayout.setHorizontalGroup(
            panelCenterSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCenterSociosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanelListSocios, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCenterSociosLayout.setVerticalGroup(
            panelCenterSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPanelListSocios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        add(panelCenterSocios, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void tfBuscarSociosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBuscarSociosFocusGained
        tfBuscarSocios.setBackground(Color.black);
        tfBuscarSocios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));        
    }//GEN-LAST:event_tfBuscarSociosFocusGained

    private void tfBuscarSociosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBuscarSociosFocusLost
        tfBuscarSocios.setBackground(new java.awt.Color(102, 102, 102));
        tfBuscarSocios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfBuscarSociosFocusLost

    private void btnAnadirSociosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnadirSociosMouseClicked
        SocioFrame usuario = new SocioFrame();
        usuario.setVisible(true);
        usuario.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAnadirSociosMouseClicked

    private void btnEliminarSociosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarSociosMouseClicked
        int index = listSocios.getSelectedIndex();
        String socio = modeloListaSocios.getElementAt(index) + "";
        String [] s = socio.split(" ");
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Estas seguro que desea elimnar?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            if(cs.eliminarSocio(s[0])){
                modeloListaSocios.remove(listSocios.getSelectedIndex());
            }
        }
    }//GEN-LAST:event_btnEliminarSociosMouseClicked

    private void listSociosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listSociosMouseClicked
        if(evt.getClickCount() == 2){
            int index = listSocios.getSelectedIndex();
            String socioLista = modeloListaSocios.getElementAt(index) + "";
            String [] s = socioLista.split(" ");
            
            Socio socio = cs.obtenerSocio(s[0]);
            SocioFrame sf = new SocioFrame(socio);
            sf.rellenarCampos();
            sf.setVisible(true);
            sf.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_listSociosMouseClicked

    private void btnBuscarSociosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarSociosMouseClicked
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
            jLabel1.setEnabled(true);
        }
    }//GEN-LAST:event_btnBuscarSociosMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        actualizarListaSocios();
        jLabel1.setVisible(false);
        jLabel1.setEnabled(false);
        tfBuscarSocios.setText("");
    }//GEN-LAST:event_jLabel1MouseClicked

    public ArrayList<Socio> obtenerSocios(){
        ControlSocio csoc = new ControlSocio();
        return csoc.obtenerSocios();
    }
    
    public void actualizarListaSocios(){
        modeloListaSocios.removeAllElements();
        modeloListaSocios.addAll(0, obtenerSocios());
    }
    
    private DefaultListModel modeloListaSocios;    
    private final ControlSocio cs;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadirSocios;
    private javax.swing.JButton btnBuscarSocios;
    private javax.swing.JButton btnEliminarSocios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> listSocios;
    private javax.swing.JPanel panelCenterSocios;
    private javax.swing.JPanel panelNorthSocios;
    private javax.swing.JPanel panelSouthSocios;
    private javax.swing.JScrollPane scrollPanelListSocios;
    private javax.swing.JTextField tfBuscarSocios;
    // End of variables declaration//GEN-END:variables
}