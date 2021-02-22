package presentacion;

import dominio.Cargo;
import dominio.ControlJuntaDirectiva;
import dominio.ControlSocio;
import dominio.Socio;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

/**
 * @author angel
 **/
public class JuntaDirectiva extends javax.swing.JFrame {

    public JuntaDirectiva() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        panelSouth = new javax.swing.JPanel();
        kButton1 = new keeptoo.KButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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

        panel.setBackground(new java.awt.Color(51, 51, 51));
        panel.setName("panel"); // NOI18N
        panel.setPreferredSize(new java.awt.Dimension(400, 400));
        panel.setLayout(new java.awt.BorderLayout());

        panelSouth.setBackground(new java.awt.Color(51, 51, 51));
        panelSouth.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        panelSouth.setName("panelSouth"); // NOI18N
        panelSouth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        kButton1.setBorder(null);
        kButton1.setText("Editar");
        kButton1.setkBorderRadius(20);
        kButton1.setkEndColor(new java.awt.Color(51, 0, 51));
        kButton1.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverStartColor(new java.awt.Color(51, 0, 51));
        kButton1.setkPressedColor(new java.awt.Color(255, 102, 255));
        kButton1.setkStartColor(new java.awt.Color(204, 0, 204));
        kButton1.setPreferredSize(new java.awt.Dimension(185, 35));
        kButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton1MouseClicked(evt);
            }
        });
        panelSouth.add(kButton1);

        panel.add(panelSouth, java.awt.BorderLayout.PAGE_END);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 30));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\close-button.png")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Junta Directiva");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));

        panel.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        panelCenter.setBackground(new java.awt.Color(51, 51, 51));
        panelCenter.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        panelCenter.setName("panelCenter"); // NOI18N
        panelCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPresidente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPresidente.setForeground(new java.awt.Color(255, 255, 255));
        lblPresidente.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPresidente.setText("Presidente");
        lblPresidente.setName("lblPresidente"); // NOI18N
        panelCenter.add(lblPresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 80, 14));

        rellenarComboBox();
        seleccionarCargo();
        cbPresidente.setBackground(new java.awt.Color(51, 51, 51));
        cbPresidente.setForeground(new java.awt.Color(255, 255, 255));
        cbPresidente.setBorder(null);
        cbPresidente.setEnabled(false);
        cbPresidente.setName("cbPresidente"); // NOI18N
        panelCenter.add(cbPresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 204, 30));

        lblVicepresidente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblVicepresidente.setForeground(new java.awt.Color(255, 255, 255));
        lblVicepresidente.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVicepresidente.setText("Vicepresidente");
        lblVicepresidente.setName("lblVicepresidente"); // NOI18N
        panelCenter.add(lblVicepresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 90, 14));

        cbVicepresidente.setBackground(new java.awt.Color(51, 51, 51));
        cbVicepresidente.setForeground(new java.awt.Color(255, 255, 255));
        cbVicepresidente.setBorder(null);
        cbVicepresidente.setEnabled(false);
        cbVicepresidente.setName("cbVicepresidente"); // NOI18N
        panelCenter.add(cbVicepresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 204, 30));

        lblSecretario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSecretario.setForeground(new java.awt.Color(255, 255, 255));
        lblSecretario.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSecretario.setText("Secretario");
        lblSecretario.setName("lblSecretario"); // NOI18N
        panelCenter.add(lblSecretario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 70, 14));

        cbSecretario.setBackground(new java.awt.Color(51, 51, 51));
        cbSecretario.setForeground(new java.awt.Color(255, 255, 255));
        cbSecretario.setBorder(null);
        cbSecretario.setEnabled(false);
        cbSecretario.setName("cbSecretario"); // NOI18N
        panelCenter.add(cbSecretario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 204, 30));

        lblTesorero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTesorero.setForeground(new java.awt.Color(255, 255, 255));
        lblTesorero.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTesorero.setText("Tesorero");
        lblTesorero.setName("lblTesorero"); // NOI18N
        panelCenter.add(lblTesorero, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 60, 14));

        cbTesorero.setBackground(new java.awt.Color(51, 51, 51));
        cbTesorero.setForeground(new java.awt.Color(255, 255, 255));
        cbTesorero.setBorder(null);
        cbTesorero.setEnabled(false);
        cbTesorero.setName("cbTesorero"); // NOI18N
        panelCenter.add(cbTesorero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 204, 30));

        lblVocal1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblVocal1.setForeground(new java.awt.Color(255, 255, 255));
        lblVocal1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVocal1.setText("Vocal1");
        lblVocal1.setName("lblVocal1"); // NOI18N
        panelCenter.add(lblVocal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 50, 14));

        cbVocal1.setBackground(new java.awt.Color(51, 51, 51));
        cbVocal1.setForeground(new java.awt.Color(255, 255, 255));
        cbVocal1.setBorder(null);
        cbVocal1.setEnabled(false);
        cbVocal1.setName("cbVocal1"); // NOI18N
        panelCenter.add(cbVocal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 204, 30));

        lblVocal2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblVocal2.setForeground(new java.awt.Color(255, 255, 255));
        lblVocal2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVocal2.setText("Vocal2");
        lblVocal2.setName("lblVocal2"); // NOI18N
        panelCenter.add(lblVocal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 60, 14));

        cbVocal2.setBackground(new java.awt.Color(51, 51, 51));
        cbVocal2.setForeground(new java.awt.Color(255, 255, 255));
        cbVocal2.setBorder(null);
        cbVocal2.setEnabled(false);
        cbVocal2.setName("cbVocal2"); // NOI18N
        panelCenter.add(cbVocal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 204, 30));

        panel.add(panelCenter, java.awt.BorderLayout.CENTER);

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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        dispose();
    }//GEN-LAST:event_formWindowLostFocus

    private void kButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton1MouseClicked
        if(kButton1.getText().equals("Editar")){
            cbPresidente.setEnabled(true);
            cbVicepresidente.setEnabled(true);
            cbSecretario.setEnabled(true);
            cbTesorero.setEnabled(true);
            cbVocal1.setEnabled(true);
            cbVocal2.setEnabled(true);
            
            kButton1.setText("Guardar");
        }else{
            if(modificarCargo(lblPresidente.getText(), cbPresidente) &&
            modificarCargo(lblVicepresidente.getText(), cbVicepresidente) &&
            modificarCargo(lblSecretario.getText(), cbSecretario) &&
            modificarCargo(lblTesorero.getText(), cbTesorero) &&
            modificarCargo(lblVocal1.getText(), cbVocal1) &&
            modificarCargo(lblVocal2.getText(), cbVocal2)){
                dispose();
            }else{
                //aviso de no se ha podido modificar
            }
        }
    }//GEN-LAST:event_kButton1MouseClicked

    
    private boolean modificarCargo(String nombre, JComboBox cb){
        boolean modificado;
        ControlJuntaDirectiva cjd = new ControlJuntaDirectiva();
        Cargo cargo;        
        if(cb.getSelectedItem() != null){
            Socio socio = (Socio) cb.getSelectedItem();
            cargo = new Cargo(nombre, socio.getDni());
            modificado = cjd.modificarCargo(cargo);
        }else{
            cargo = new Cargo(nombre, null);
            modificado = cjd.modificarCargo(cargo);
        }
        return modificado;
    }
    
    //Selecciona el socio correspondiente en cada cargo
    private void seleccionarCargo(){        
        ControlJuntaDirectiva cjd = new ControlJuntaDirectiva();
        ArrayList<Cargo> cargos = cjd.obtenerCargos();
        
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
        return cs.obtenerSocio(dni);
    }       
    
    //Rellena el combo box con los nombres de todos los socios
    private void rellenarComboBox(){
        ControlSocio cs = new ControlSocio();
        soc = cs.obtenerSocios();
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
    
    private ArrayList<Socio> soc;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Socio> cbPresidente;
    private javax.swing.JComboBox<Socio> cbSecretario;
    private javax.swing.JComboBox<Socio> cbTesorero;
    private javax.swing.JComboBox<Socio> cbVicepresidente;
    private javax.swing.JComboBox<Socio> cbVocal1;
    private javax.swing.JComboBox<Socio> cbVocal2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KButton kButton1;
    private javax.swing.JLabel lblPresidente;
    private javax.swing.JLabel lblSecretario;
    private javax.swing.JLabel lblTesorero;
    private javax.swing.JLabel lblVicepresidente;
    private javax.swing.JLabel lblVocal1;
    private javax.swing.JLabel lblVocal2;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelSouth;
    // End of variables declaration//GEN-END:variables
}