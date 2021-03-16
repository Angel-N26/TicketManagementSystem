package presentacion;

import dominio.Asociacion;
import dominio.Cargo;
import dominio.ControlJuntaDirectiva;
import dominio.ControlSocio;
import dominio.Socio;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 * @author angel
 **/
public class JuntaDirectiva extends javax.swing.JFrame {

    public JuntaDirectiva(Asociacion asociacion) {
        this.asociacion = asociacion;
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        panelNorth = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        panelCenter = new javax.swing.JPanel();
        lblPresidente = new javax.swing.JLabel();
        cbPresidente = new javax.swing.JComboBox<>();
        lblVicepresidente = new javax.swing.JLabel();
        cbVicepresidente = new javax.swing.JComboBox<>();
        lblSecretario = new javax.swing.JLabel();
        cbSecretario = new javax.swing.JComboBox<>();
        lblTesorero = new javax.swing.JLabel();
        cbTesorero = new javax.swing.JComboBox<>();
        lblVocal1 = new javax.swing.JLabel();
        cbVocal1 = new javax.swing.JComboBox<>();
        lblVocal2 = new javax.swing.JLabel();
        cbVocal2 = new javax.swing.JComboBox<>();
        panelSouth = new javax.swing.JPanel();
        btnEditar = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TicketManagementSystem");
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setUndecorated(true);
        setResizable(false);

        panel.setBackground(new java.awt.Color(51, 51, 51));
        panel.setMaximumSize(new java.awt.Dimension(400, 400));
        panel.setMinimumSize(new java.awt.Dimension(400, 400));
        panel.setName("panel"); // NOI18N
        panel.setPreferredSize(new java.awt.Dimension(400, 400));
        panel.setLayout(new java.awt.BorderLayout());

        panelNorth.setBackground(new java.awt.Color(51, 51, 51));
        panelNorth.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        panelNorth.setName("panelNorth"); // NOI18N
        panelNorth.setPreferredSize(new java.awt.Dimension(400, 40));
        panelNorth.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\cerrar.png")); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.setName("close"); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        panelNorth.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 2, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Junta Directiva");
        lblTitulo.setName("lblTitulo"); // NOI18N
        panelNorth.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        panel.add(panelNorth, java.awt.BorderLayout.NORTH);

        panelCenter.setBackground(new java.awt.Color(51, 51, 51));
        panelCenter.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        panelCenter.setName("panelCenter"); // NOI18N
        panelCenter.setPreferredSize(new java.awt.Dimension(364, 285));
        panelCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPresidente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPresidente.setForeground(new java.awt.Color(255, 255, 255));
        lblPresidente.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPresidente.setText("Presidente");
        lblPresidente.setName("lblPresidente"); // NOI18N
        panelCenter.add(lblPresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 15, 80, 30));

        rellenarComboBox();
        seleccionarCargos();
        cbPresidente.setBorder(null);
        cbPresidente.setEnabled(false);
        cbPresidente.setName("cbPresidente"); // NOI18N
        panelCenter.add(cbPresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 15, 204, 30));

        lblVicepresidente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblVicepresidente.setForeground(new java.awt.Color(255, 255, 255));
        lblVicepresidente.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVicepresidente.setText("Vicepresidente");
        lblVicepresidente.setName("lblVicepresidente"); // NOI18N
        panelCenter.add(lblVicepresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 90, 30));

        cbVicepresidente.setBorder(null);
        cbVicepresidente.setEnabled(false);
        cbVicepresidente.setName("cbVicepresidente"); // NOI18N
        panelCenter.add(cbVicepresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 204, 30));

        lblSecretario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSecretario.setForeground(new java.awt.Color(255, 255, 255));
        lblSecretario.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSecretario.setText("Secretario");
        lblSecretario.setName("lblSecretario"); // NOI18N
        panelCenter.add(lblSecretario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 105, 70, 30));

        cbSecretario.setBorder(null);
        cbSecretario.setEnabled(false);
        cbSecretario.setName("cbSecretario"); // NOI18N
        panelCenter.add(cbSecretario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 105, 204, 30));

        lblTesorero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTesorero.setForeground(new java.awt.Color(255, 255, 255));
        lblTesorero.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTesorero.setText("Tesorero");
        lblTesorero.setName("lblTesorero"); // NOI18N
        panelCenter.add(lblTesorero, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 60, 30));

        cbTesorero.setBorder(null);
        cbTesorero.setEnabled(false);
        cbTesorero.setName("cbTesorero"); // NOI18N
        panelCenter.add(cbTesorero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 204, 30));

        lblVocal1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblVocal1.setForeground(new java.awt.Color(255, 255, 255));
        lblVocal1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVocal1.setText("Vocal1");
        lblVocal1.setName("lblVocal1"); // NOI18N
        panelCenter.add(lblVocal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 195, 50, 30));

        cbVocal1.setBorder(null);
        cbVocal1.setEnabled(false);
        cbVocal1.setName("cbVocal1"); // NOI18N
        panelCenter.add(cbVocal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 195, 204, 30));

        lblVocal2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblVocal2.setForeground(new java.awt.Color(255, 255, 255));
        lblVocal2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVocal2.setText("Vocal2");
        lblVocal2.setName("lblVocal2"); // NOI18N
        panelCenter.add(lblVocal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 60, 30));

        cbVocal2.setBorder(null);
        cbVocal2.setEnabled(false);
        cbVocal2.setName("cbVocal2"); // NOI18N
        panelCenter.add(cbVocal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 204, 30));

        panel.add(panelCenter, java.awt.BorderLayout.CENTER);

        panelSouth.setBackground(new java.awt.Color(51, 51, 51));
        panelSouth.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        panelSouth.setName("panelSouth"); // NOI18N
        panelSouth.setPreferredSize(new java.awt.Dimension(197, 75));
        panelSouth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        btnEditar.setBorder(null);
        btnEditar.setText("Editar");
        btnEditar.setkEndColor(new java.awt.Color(51, 0, 51));
        btnEditar.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        btnEditar.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnEditar.setkHoverStartColor(new java.awt.Color(51, 0, 51));
        btnEditar.setkPressedColor(new java.awt.Color(255, 153, 204));
        btnEditar.setkStartColor(new java.awt.Color(204, 0, 204));
        btnEditar.setName("btnEditar"); // NOI18N
        btnEditar.setPreferredSize(new java.awt.Dimension(185, 35));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEditarMouseReleased(evt);
            }
        });
        panelSouth.add(btnEditar);

        panel.add(panelSouth, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        activar = false;
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEditarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseReleased
        if(activar){
            if(btnEditar.getText().equals("Editar")){
                cbPresidente.setEnabled(true);
                cbVicepresidente.setEnabled(true);
                cbSecretario.setEnabled(true);
                cbTesorero.setEnabled(true);
                cbVocal1.setEnabled(true);
                cbVocal2.setEnabled(true);

                btnEditar.setText("Guardar");
            }else if(btnEditar.getText().equals("Guardar")){
                if(modificarCargo(lblPresidente.getText(), cbPresidente) && 
                        modificarCargo(lblVicepresidente.getText(), cbVicepresidente) &&
                        modificarCargo(lblSecretario.getText(), cbSecretario) &&
                        modificarCargo(lblTesorero.getText(), cbTesorero) &&
                        modificarCargo(lblVocal1.getText(), cbVocal1) &&
                        modificarCargo(lblVocal2.getText(), cbVocal2)){

                    cbPresidente.setEnabled(false);
                    cbVicepresidente.setEnabled(false);
                    cbSecretario.setEnabled(false);
                    cbTesorero.setEnabled(false);
                    cbVocal1.setEnabled(false);
                    cbVocal2.setEnabled(false);

                    JOptionPane.showMessageDialog(this, "Junta Directiva actualizada",
                        "Valido", JOptionPane.PLAIN_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this,  
                        "No se ha podido actualizar los miembros de la JuntaDirectiva",
                        "Error", JOptionPane.ERROR_MESSAGE);
                }

                btnEditar.setText("Editar");
            } 
        }        
    }//GEN-LAST:event_btnEditarMouseReleased

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        activar = true;
    }//GEN-LAST:event_btnEditarMouseEntered
    
    private boolean modificarCargo(String nombre, JComboBox cb){
        boolean modificado;
        ControlJuntaDirectiva cjd = new ControlJuntaDirectiva();
        Cargo cargo;        
        if(cb.getSelectedItem() != null){
            Socio socio = (Socio) cb.getSelectedItem();
            cargo = new Cargo(nombre, socio.getDni(), asociacion.getId());
            modificado = cjd.modificarCargo(cargo);
        }else{
            cargo = new Cargo(nombre, null, asociacion.getId());
            modificado = cjd.modificarCargo(cargo);
        }
        return modificado;
    }
    
    //Selecciona el socio correspondiente en cada cargo
    private void seleccionarCargos(){        
        ControlJuntaDirectiva cjd = new ControlJuntaDirectiva();
        ArrayList<Cargo> cargos = cjd.obtenerCargos(asociacion.getId());
        
        for(int i = 0 ; i < cargos.size() ; i++){
            switch(cargos.get(i).getNombre()){
                case "Presidente":
                    seleccionarCargo(cbPresidente, cargos.get(i));
                    break;
                case "Vicepresidente":
                    seleccionarCargo(cbVicepresidente, cargos.get(i));
                    break;
                case "Secretario":
                    seleccionarCargo(cbSecretario, cargos.get(i));
                    break;
                case "Tesorero":
                    seleccionarCargo(cbTesorero, cargos.get(i));
                    break;
                case "Vocal1":
                    seleccionarCargo(cbVocal1, cargos.get(i));
                    break;
                case "Vocal2":
                    seleccionarCargo(cbVocal2, cargos.get(i));
                    break;
            }          
        }
    }
    
    private void seleccionarCargo(JComboBox cb, Cargo cargo){
        if(cargo.getIdSocio() != null){
            Socio socio = obtenerSocio(cargo.getIdSocio());
            for(int i = 0 ; i < soc.size() ; i++){
                if(socio.getDni().equals(soc.get(i).getDni())){
                    cb.setSelectedIndex(i+1);
                }
            }
        }else{
            cb.setSelectedItem(null);
        }
    }
    
    //Obtiene un socio dado su dni
    private Socio obtenerSocio(String dni){
        ControlSocio cs = new ControlSocio();
        return cs.obtenerSocio(dni, asociacion.getId());
    }       
    
    //Rellena el combo box con los nombres de todos los socios
    private void rellenarComboBox(){
        ControlSocio cs = new ControlSocio();
        soc = cs.obtenerSocios(asociacion.getId());
        cbPresidente.addItem(null);
        cbVicepresidente.addItem(null);
        cbSecretario.addItem(null);
        cbTesorero.addItem(null);
        cbVocal1.addItem(null);
        cbVocal2.addItem(null);
        for(int i = 0 ; i < soc.size() ; i++){
            cbPresidente.addItem(soc.get(i));
            cbVicepresidente.addItem(soc.get(i));
            cbSecretario.addItem(soc.get(i));
            cbTesorero.addItem(soc.get(i));
            cbVocal1.addItem(soc.get(i));
            cbVocal2.addItem(soc.get(i));
        }        
    }           
    
    private boolean activar;
    
    private final Asociacion asociacion;
    
    private ArrayList<Socio> soc;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnEditar;
    private javax.swing.JComboBox<Socio> cbPresidente;
    private javax.swing.JComboBox<Socio> cbSecretario;
    private javax.swing.JComboBox<Socio> cbTesorero;
    private javax.swing.JComboBox<Socio> cbVicepresidente;
    private javax.swing.JComboBox<Socio> cbVocal1;
    private javax.swing.JComboBox<Socio> cbVocal2;
    private javax.swing.JLabel close;
    private javax.swing.JLabel lblPresidente;
    private javax.swing.JLabel lblSecretario;
    private javax.swing.JLabel lblTesorero;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVicepresidente;
    private javax.swing.JLabel lblVocal1;
    private javax.swing.JLabel lblVocal2;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelNorth;
    private javax.swing.JPanel panelSouth;
    // End of variables declaration//GEN-END:variables
}