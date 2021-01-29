package presentacion;

import dominio.ControlMembresia;
import dominio.Membresia;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author angel
 **/
public class AnadirMembresia extends javax.swing.JFrame {

    public AnadirMembresia() {
        initComponents();
        cm = new ControlMembresia();
    }
    
    public AnadirMembresia(Membresia newMem){
        this.mem = newMem;
        initComponents();
        cm = new ControlMembresia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTextField4 = new javax.swing.JTextField();
        panelBorder = new javax.swing.JPanel();
        panelSouth = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnAnadir = new javax.swing.JButton();
        panelCenter = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        spnPrecio = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();

        jTextField4.setText("jTextField4");
        jTextField4.setPreferredSize(new java.awt.Dimension(60, 25));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Membresias");
        setBackground(new java.awt.Color(0, 0, 0));
        setIconImage(getIconImage());
        setResizable(false);

        panelBorder.setName("panelBorder"); // NOI18N
        panelBorder.setLayout(new java.awt.BorderLayout());

        panelSouth.setBackground(new java.awt.Color(51, 51, 51));
        panelSouth.setName("panelSouth"); // NOI18N
        panelSouth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        btnEliminar.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setName("btnEliminar"); // NOI18N
        btnEliminar.setPreferredSize(new java.awt.Dimension(140, 25));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        panelSouth.add(btnEliminar);

        btnAnadir.setBackground(new java.awt.Color(0, 204, 0));
        btnAnadir.setText("Añadir");
        btnAnadir.setName("btnAnadir"); // NOI18N
        btnAnadir.setPreferredSize(new java.awt.Dimension(140, 25));
        btnAnadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnadirMouseClicked(evt);
            }
        });
        panelSouth.add(btnAnadir);

        panelBorder.add(panelSouth, java.awt.BorderLayout.PAGE_END);

        panelCenter.setBackground(new java.awt.Color(51, 51, 51));
        panelCenter.setName("panelCenter"); // NOI18N
        panelCenter.setLayout(new java.awt.GridBagLayout());

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");
        lblNombre.setName("lblNombre"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 30, 0, 0);
        panelCenter.add(lblNombre, gridBagConstraints);

        lblPrecio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio.setText("Precio");
        lblPrecio.setName("lblPrecio"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 40, 0, 0);
        panelCenter.add(lblPrecio, gridBagConstraints);

        tfNombre.setBackground(new java.awt.Color(102, 102, 102));
        tfNombre.setForeground(new java.awt.Color(255, 255, 255));
        tfNombre.setToolTipText("");
        tfNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfNombre.setCaretColor(new java.awt.Color(204, 0, 204));
        tfNombre.setName("tfNombre"); // NOI18N
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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 165;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 30, 70, 0);
        panelCenter.add(tfNombre, gridBagConstraints);

        spnPrecio.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        spnPrecio.setMinimumSize(new java.awt.Dimension(30, 25));
        spnPrecio.setName("spnPrecio"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 40, 70, 30);
        panelCenter.add(spnPrecio, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("*");
        jLabel1.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 1, 0, 0);
        panelCenter.add(jLabel1, gridBagConstraints);

        panelBorder.add(panelCenter, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusGained
        tfNombre.setBackground(new Color(0, 0, 0));
        tfNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
        jLabel1.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_tfNombreFocusGained

    private void tfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusLost
        tfNombre.setBackground(new Color(102, 102, 102));
        tfNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfNombreFocusLost

    private void btnAnadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnadirMouseClicked
        if(btnAnadir.getText().equals("Modificar")){
            Membresia memb = new Membresia(mem.getId_membresia(), tfNombre.getText(), 
                    Double.parseDouble(spnPrecio.getValue().toString()));
            if(mem.getNombre().equals(tfNombre.getText())){               
               if(cm.modificarMembresia(memb)){
                    dispose();
                }  
            }else if(!tfNombre.getText().equals("") && comprobarMembresia(tfNombre.getText())){
                if(cm.modificarMembresia(memb)){
                    dispose();                    
                } 
            }else{
                tfNombre.setBackground(new Color(0,0,0));
                tfNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 2, true));
                jLabel1.setForeground(new Color(204, 0, 0));
            }
        }else if(btnAnadir.getText().equals("Añadir")){
            Membresia memb = new Membresia(tfNombre.getText(), Double.parseDouble(spnPrecio.getValue().toString()));
            if(!tfNombre.getText().equals("") && comprobarMembresia(tfNombre.getText())){           
                if(cm.insertarMembresia(memb)){
                    dispose();
                }            
            }else{
                tfNombre.setBackground(new Color(0,0,0));
                tfNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 2, true));
                jLabel1.setForeground(new Color(204, 0, 0));
            }
        }   
    }//GEN-LAST:event_btnAnadirMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Estas seguro que desea elimnar?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            if(cm.eliminarMembresia(mem.getId_membresia())){    
                dispose();            
            }
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    public void rellenarCampos(){
        tfNombre.setText(mem.getNombre());
        spnPrecio.setValue(mem.getPrecio());
        
        btnAnadir.setText("Modificar");
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
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(
                "C:\\Users\\angel\\Documents\\NetBeansProjects\\TicketManagementSystem\\src\\main\\java\\recursos/logo(2).png");
        return retValue;
    }
    
    private final ControlMembresia cm;
    private Membresia mem;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JPanel panelBorder;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelSouth;
    private javax.swing.JSpinner spnPrecio;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}