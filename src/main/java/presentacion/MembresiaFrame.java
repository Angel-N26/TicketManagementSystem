package presentacion;

import dominio.ControlMembresia;
import dominio.Membresia;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * @author angel
 **/
public class MembresiaFrame extends javax.swing.JFrame {

    public MembresiaFrame() {
        initComponents();
        cm = new ControlMembresia();
        mem = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder = new javax.swing.JPanel();
        panelSouth = new javax.swing.JPanel();
        kButton2 = new keeptoo.KButton();
        kButton1 = new keeptoo.KButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelCenter = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        listMembresias = new javax.swing.JList<>();
        tfNombre = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        tfPrecio = new javax.swing.JTextField();
        kButton3 = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TicketManagementSystem");
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);

        panelBorder.setBackground(new java.awt.Color(51, 51, 51));
        panelBorder.setName("panelBorder"); // NOI18N
        panelBorder.setPreferredSize(new java.awt.Dimension(400, 400));
        panelBorder.setLayout(new java.awt.BorderLayout());

        panelSouth.setBackground(new java.awt.Color(51, 51, 51));
        panelSouth.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        panelSouth.setName("panelSouth"); // NOI18N
        panelSouth.setPreferredSize(new java.awt.Dimension(387, 75));
        panelSouth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 20));

        kButton2.setBorder(null);
        kButton2.setText("Eliminar");
        kButton2.setkEndColor(new java.awt.Color(51, 0, 51));
        kButton2.setkStartColor(new java.awt.Color(204, 0, 204));
        kButton2.setPreferredSize(new java.awt.Dimension(180, 35));
        kButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton2MouseClicked(evt);
            }
        });
        panelSouth.add(kButton2);

        kButton1.setBorder(null);
        kButton1.setText("Añadir");
        kButton1.setkEndColor(new java.awt.Color(51, 0, 51));
        kButton1.setkStartColor(new java.awt.Color(204, 0, 204));
        kButton1.setPreferredSize(new java.awt.Dimension(180, 35));
        kButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton1MouseClicked(evt);
            }
        });
        panelSouth.add(kButton1);

        panelBorder.add(panelSouth, java.awt.BorderLayout.PAGE_END);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Membresias");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\close-button.png")); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 0, -1, -1));

        panelBorder.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        panelCenter.setBackground(new java.awt.Color(51, 51, 51));
        panelCenter.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        panelCenter.setName("panelCenter"); // NOI18N
        panelCenter.setPreferredSize(new java.awt.Dimension(400, 285));
        panelCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        scrollPane.setName("scrollPane"); // NOI18N

        modeloLista = new DefaultListModel();
        listMembresias.setModel(modeloLista);
        modeloLista.addAll(0,obtenerMembresias());
        listMembresias.setSelectionForeground(new Color(255,255,255));
        listMembresias.setBackground(new java.awt.Color(102, 102, 102));
        listMembresias.setForeground(new java.awt.Color(255, 255, 255));
        listMembresias.setName("listMembresias"); // NOI18N
        listMembresias.setSelectionBackground(new java.awt.Color(51, 51, 51));
        listMembresias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMembresiasMouseClicked(evt);
            }
        });
        scrollPane.setViewportView(listMembresias);

        panelCenter.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, 265));

        tfNombre.setBackground(new java.awt.Color(51, 51, 51));
        tfNombre.setForeground(new java.awt.Color(255, 255, 255));
        tfNombre.setToolTipText("");
        tfNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfNombre.setCaretColor(new java.awt.Color(204, 0, 204));
        tfNombre.setName("tfNombre"); // NOI18N
        tfNombre.setOpaque(false);
        tfNombre.setPreferredSize(new java.awt.Dimension(60, 25));
        tfNombre.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNombreFocusLost(evt);
            }
        });
        panelCenter.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 95, 130, -1));

        lblPrecio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio.setText("Precio");
        lblPrecio.setName("lblPrecio"); // NOI18N
        panelCenter.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("*");
        jLabel3.setToolTipText("");
        panelCenter.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 75, 10, -1));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");
        lblNombre.setName("lblNombre"); // NOI18N
        panelCenter.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 75, -1, -1));

        tfPrecio.setBackground(new java.awt.Color(51, 51, 51));
        tfPrecio.setForeground(new java.awt.Color(255, 255, 255));
        tfPrecio.setToolTipText("");
        tfPrecio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        tfPrecio.setCaretColor(new java.awt.Color(204, 0, 204));
        tfPrecio.setName("tfPrecio"); // NOI18N
        tfPrecio.setOpaque(false);
        tfPrecio.setPreferredSize(new java.awt.Dimension(60, 25));
        tfPrecio.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPrecioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPrecioFocusLost(evt);
            }
        });
        panelCenter.add(tfPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 130, -1));

        kButton3.setBorder(null);
        kButton3.setText("Modificar");
        kButton3.setkEndColor(new java.awt.Color(51, 0, 51));
        kButton3.setkStartColor(new java.awt.Color(204, 0, 204));
        kButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton3MouseClicked(evt);
            }
        });
        panelCenter.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 90, 20));

        panelBorder.add(panelCenter, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listMembresiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMembresiasMouseClicked
        mem = cm.obtenerMembresia(listMembresias.getSelectedValue().getId_membresia());
               
        tfNombre.setText(mem.getNombre());
        tfPrecio.setText(mem.getPrecio()+""); 
        kButton3.setEnabled(true);
    }//GEN-LAST:event_listMembresiasMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void tfNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusGained
        tfNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 0, 204)));
        jLabel3.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_tfNombreFocusGained

    private void tfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusLost
        tfNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
    }//GEN-LAST:event_tfNombreFocusLost

    private void tfPrecioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPrecioFocusGained
        tfPrecio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 0, 204)));
    }//GEN-LAST:event_tfPrecioFocusGained

    private void tfPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPrecioFocusLost
        tfPrecio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
    }//GEN-LAST:event_tfPrecioFocusLost

    private void kButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton1MouseClicked
        if(!tfNombre.getText().equals("")){
            Membresia memb = new Membresia(tfNombre.getText(),
                Double.parseDouble(tfPrecio.getText()));
            if(cm.insertarMembresia(memb)){
                actualizarListaMembresias();                   
            } 
        }else{            
            tfNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 0, 0)));
            jLabel3.setForeground(new Color(204, 0, 0));
        } 
    }//GEN-LAST:event_kButton1MouseClicked

    private void kButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton2MouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Estas seguro que desea elimnar?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            if(cm.eliminarMembresia(listMembresias.getSelectedValue().getId_membresia())){            
                modeloLista.remove(listMembresias.getSelectedIndex());
                tfNombre.setText("");
                tfPrecio.setText("");
            }
        }
    }//GEN-LAST:event_kButton2MouseClicked

    private void kButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton3MouseClicked
        Membresia m = listMembresias.getSelectedValue();
        if(!tfNombre.getText().equals("")){
            Membresia memb = new Membresia(m.getId_membresia(), tfNombre.getText(),
                Double.parseDouble(tfPrecio.getText()));
            if(cm.modificarMembresia(memb)){
                actualizarListaMembresias();                   
            } 
        }else{            
            tfNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 0, 0)));
            jLabel3.setForeground(new Color(204, 0, 0));
        }
    }//GEN-LAST:event_kButton3MouseClicked

    private ArrayList<Membresia> obtenerMembresias(){
        ControlMembresia cmem = new ControlMembresia();
        return cmem.obtenerMembresias();
    }

    private void actualizarListaMembresias(){
        modeloLista.removeAllElements();
        modeloLista.addAll(0, obtenerMembresias());
    }
    
    private boolean comprobarMembresia(String nombre){
        boolean validar = true;
        ControlMembresia cmem = new ControlMembresia();
        ArrayList<Membresia> mems = cmem.obtenerMembresias();        
        for(int i = 0 ; i < mems.size() ; i++){
            if(mems.get(i).getNombre().equals(nombre)){
                validar = false;
            }
        }
        return validar;
    }    

    private final ControlMembresia cm;
    private Membresia mem;
    
    private DefaultListModel modeloLista;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private keeptoo.KButton kButton3;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JList<Membresia> listMembresias;
    private javax.swing.JPanel panelBorder;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelSouth;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPrecio;
    // End of variables declaration//GEN-END:variables
}