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
        btnEliminar = new javax.swing.JButton();
        btnAnadir = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TicketManagementSystem");
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        panelBorder.setBackground(new java.awt.Color(51, 51, 51));
        panelBorder.setName("panelBorder"); // NOI18N
        panelBorder.setPreferredSize(new java.awt.Dimension(400, 400));
        panelBorder.setLayout(new java.awt.BorderLayout());

        panelSouth.setBackground(new java.awt.Color(51, 51, 51));
        panelSouth.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        panelSouth.setName("panelSouth"); // NOI18N

        btnEliminar.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminar.setText("Eliminar membresia");
        btnEliminar.setToolTipText("");
        btnEliminar.setBorder(null);
        btnEliminar.setName("btnEliminar"); // NOI18N
        btnEliminar.setPreferredSize(new java.awt.Dimension(190, 35));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        panelSouth.add(btnEliminar);

        btnAnadir.setBackground(new java.awt.Color(0, 204, 0));
        btnAnadir.setText("Añadir membresia");
        btnAnadir.setBorder(null);
        btnAnadir.setName("btnAnadir"); // NOI18N
        btnAnadir.setPreferredSize(new java.awt.Dimension(190, 35));
        btnAnadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnadirMouseClicked(evt);
            }
        });
        panelSouth.add(btnAnadir);

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
        panelCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollPane.setName("scrollPane"); // NOI18N

        modeloLista = new DefaultListModel();
        listMembresias.setModel(modeloLista);
        modeloLista.addAll(0,obtenerMembresias());
        listMembresias.setBackground(new java.awt.Color(102, 102, 102));
        listMembresias.setName("listMembresias"); // NOI18N
        listMembresias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMembresiasMouseClicked(evt);
            }
        });
        scrollPane.setViewportView(listMembresias);

        panelCenter.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 290));

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
        panelCenter.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 150, -1));

        lblPrecio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio.setText("Precio");
        lblPrecio.setName("lblPrecio"); // NOI18N
        panelCenter.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("*");
        jLabel3.setToolTipText("");
        panelCenter.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 10, -1));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");
        lblNombre.setName("lblNombre"); // NOI18N
        panelCenter.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

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
        panelCenter.add(tfPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 110, -1));

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
    }//GEN-LAST:event_listMembresiasMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Estas seguro que desea elimnar?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            if(cm.eliminarMembresia(listMembresias.getSelectedValue().getId_membresia())){            
                modeloLista.remove(listMembresias.getSelectedIndex());
                tfNombre.setText("");
                tfPrecio.setText("");
            }
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnAnadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnadirMouseClicked
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
    }//GEN-LAST:event_btnAnadirMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void tfNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusGained
        tfNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 0, 204)));
        //tfNombre.setBackground(new Color(0, 0, 0));
        //tfNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
        jLabel3.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_tfNombreFocusGained

    private void tfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusLost
        tfNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        //tfNombre.setBackground(new Color(102, 102, 102));
        //tfNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfNombreFocusLost

    private void tfPrecioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPrecioFocusGained
        tfPrecio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 0, 204)));
        //tfPrecio.setBackground(new Color(0, 0, 0));
        //tfPrecio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfPrecioFocusGained

    private void tfPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPrecioFocusLost
        tfPrecio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        //tfPrecio.setBackground(new Color(102, 102, 102));
        //tfPrecio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfPrecioFocusLost

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        dispose();
    }//GEN-LAST:event_formWindowLostFocus

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
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
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