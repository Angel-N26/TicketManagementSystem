package presentacion;

import dominio.ControlEvento;
import dominio.Evento;
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
        jPanel1 = new javax.swing.JPanel();
        tfBuscarEventos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelSouthEventos = new javax.swing.JPanel();
        scrollPanelListEventos = new javax.swing.JScrollPane();
        listEventos = new javax.swing.JList<>();
        kButton2 = new keeptoo.KButton();
        kButton1 = new keeptoo.KButton();
        panelCenterEventos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        panelNorthEventos.setBackground(new java.awt.Color(51, 51, 51));
        panelNorthEventos.setName("panelNorthEventos"); // NOI18N
        panelNorthEventos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 20, 5));

        jPanel1.setBackground(new java.awt.Color(31, 31, 31));
        jPanel1.setPreferredSize(new java.awt.Dimension(205, 35));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 0, 0));

        tfBuscarEventos.setBackground(new java.awt.Color(31, 31, 31));
        tfBuscarEventos.setForeground(new java.awt.Color(153, 153, 153));
        tfBuscarEventos.setText("Buscar...");
        tfBuscarEventos.setToolTipText("");
        tfBuscarEventos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
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
        jPanel1.add(tfBuscarEventos);

        jLabel2.setBackground(new java.awt.Color(31, 31, 31));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\search-gray.png")); // NOI18N
        jLabel2.setToolTipText("Buscar");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        panelNorthEventos.add(jPanel1);

        jLabel1.setVisible(false);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\cancelar24.png")); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        panelNorthEventos.add(jLabel1);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        panelNorthEventos.add(jLabel3);

        add(panelNorthEventos, java.awt.BorderLayout.PAGE_START);

        panelSouthEventos.setBackground(new java.awt.Color(51, 51, 51));
        panelSouthEventos.setName("panelSouthEventos"); // NOI18N
        panelSouthEventos.setPreferredSize(new java.awt.Dimension(648, 75));
        panelSouthEventos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 20, 20));

        scrollPanelListEventos.setPreferredSize(new java.awt.Dimension(258, 35));

        modeloListaEventos = new DefaultListModel();
        listEventos.setModel(modeloListaEventos);
        modeloListaEventos.addAll(0,obtenerEventos());
        listEventos.setBackground(new java.awt.Color(102, 102, 102));
        listEventos.setForeground(new java.awt.Color(255, 255, 255));
        listEventos.setPreferredSize(new java.awt.Dimension(0, 35));
        listEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listEventosMouseClicked(evt);
            }
        });
        scrollPanelListEventos.setViewportView(listEventos);

        panelSouthEventos.add(scrollPanelListEventos);

        kButton2.setBorder(null);
        kButton2.setText("Añadir");
        kButton2.setkEndColor(new java.awt.Color(51, 0, 51));
        kButton2.setkStartColor(new java.awt.Color(204, 0, 204));
        kButton2.setPreferredSize(new java.awt.Dimension(180, 35));
        kButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton2MouseClicked(evt);
            }
        });
        panelSouthEventos.add(kButton2);

        kButton1.setBorder(null);
        kButton1.setText("Eliminar");
        kButton1.setkEndColor(new java.awt.Color(51, 0, 51));
        kButton1.setkStartColor(new java.awt.Color(204, 0, 204));
        kButton1.setPreferredSize(new java.awt.Dimension(180, 35));
        kButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton1MouseClicked(evt);
            }
        });
        panelSouthEventos.add(kButton1);

        add(panelSouthEventos, java.awt.BorderLayout.PAGE_END);

        panelCenterEventos.setBackground(new java.awt.Color(51, 51, 51));
        panelCenterEventos.setName("panelCenterEventos"); // NOI18N
        panelCenterEventos.setPreferredSize(new java.awt.Dimension(800, 430));
        panelCenterEventos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Evento", "Tipo", "Sala", "Fecha", "Entradas"
            }
        ));
        jTable1.setRowHeight(50);
        jTable1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1);

        panelCenterEventos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 760, 390));

        add(panelCenterEventos, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

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

    private void tfBuscarEventosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBuscarEventosFocusLost
        tfBuscarEventos.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
    }//GEN-LAST:event_tfBuscarEventosFocusLost

    private void tfBuscarEventosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBuscarEventosFocusGained
        tfBuscarEventos.setBorder(BorderFactory.createLineBorder(new Color(204, 0, 204)));
        if(tfBuscarEventos.getText().equals("Buscar...")){
            tfBuscarEventos.setText("");
            tfBuscarEventos.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_tfBuscarEventosFocusGained

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        actualizarListaEventos();
        jLabel1.setVisible(false);
        jLabel3.setText("");
        
        tfBuscarEventos.setText("Buscar...");
        tfBuscarEventos.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        tfBuscarEventos.nextFocus();
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
            jLabel3.setText("");
        }else{
            modeloListaEventos.removeAllElements();
            modeloListaEventos.addAll(0, eveBusca);

            jLabel1.setVisible(true);
            jLabel3.setText("No se ha encontrado ninguna coincidencia");
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void kButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton1MouseClicked
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
    }//GEN-LAST:event_kButton1MouseClicked

    private void kButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton2MouseClicked
        JPanel card = (JPanel) this.getParent();
        EditEventoPanel editEP = new EditEventoPanel();
        card.add(editEP, "cardEditEP");
        CardLayout cardLayout = (CardLayout) card.getLayout();
        cardLayout.show(card, "cardEditEP");
    }//GEN-LAST:event_kButton2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\search-white.png"));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\search-gray.png"));
    }//GEN-LAST:event_jLabel2MouseExited
    
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private javax.swing.JList<Evento> listEventos;
    private javax.swing.JPanel panelCenterEventos;
    private javax.swing.JPanel panelNorthEventos;
    private javax.swing.JPanel panelSouthEventos;
    private javax.swing.JScrollPane scrollPanelListEventos;
    private javax.swing.JTextField tfBuscarEventos;
    // End of variables declaration//GEN-END:variables
}