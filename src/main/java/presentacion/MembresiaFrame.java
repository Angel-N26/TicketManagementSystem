package presentacion;

import dominio.Asociacion;
import dominio.Colores;
import dominio.ControlMembresia;
import dominio.Membresia;
import dominio.RegularExpresions;
import java.awt.Color;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author angel
 **/
public class MembresiaFrame extends javax.swing.JFrame implements Colores, RegularExpresions {

    public MembresiaFrame(Asociacion asociacion, Connection con) {
        this.asociacion = asociacion;
        
        cm = new ControlMembresia(con);
        mem = null;
        
        initComponents();
        
        guardar = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder = new javax.swing.JPanel();
        panelNorth = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        panelCenter = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        listMembresias = new javax.swing.JList<>();
        lblNombre = new javax.swing.JLabel();
        errorImgNombre = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        errorImgPrecio = new javax.swing.JLabel();
        tfPrecio = new javax.swing.JTextField();
        btnModificar = new keeptoo.KButton();
        kButton1 = new keeptoo.KButton();
        panelSouth = new javax.swing.JPanel();
        btnEliminar = new keeptoo.KButton();
        btnAnadir = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TicketManagementSystem");
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setUndecorated(true);
        setResizable(false);

        panelBorder.setBackground(new java.awt.Color(51, 51, 51));
        panelBorder.setMaximumSize(new java.awt.Dimension(400, 400));
        panelBorder.setMinimumSize(new java.awt.Dimension(400, 400));
        panelBorder.setName("panelBorder"); // NOI18N
        panelBorder.setPreferredSize(new java.awt.Dimension(400, 400));
        panelBorder.setLayout(new java.awt.BorderLayout());

        panelNorth.setBackground(new java.awt.Color(51, 51, 51));
        panelNorth.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(255, 255, 255)));
        panelNorth.setPreferredSize(new java.awt.Dimension(400, 40));
        panelNorth.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Membresias");
        lblTitulo.setName("lblTitulo"); // NOI18N
        panelNorth.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close-button.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.setMaximumSize(new java.awt.Dimension(16, 16));
        close.setMinimumSize(new java.awt.Dimension(16, 16));
        close.setName("close"); // NOI18N
        close.setPreferredSize(new java.awt.Dimension(16, 16));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                closeMouseReleased(evt);
            }
        });
        panelNorth.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 6, 24, 24));

        panelBorder.add(panelNorth, java.awt.BorderLayout.NORTH);

        panelCenter.setBackground(new java.awt.Color(51, 51, 51));
        panelCenter.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 2, new java.awt.Color(255, 255, 255)));
        panelCenter.setName("panelCenter"); // NOI18N
        panelCenter.setPreferredSize(new java.awt.Dimension(400, 285));
        panelCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        scrollPane.setName("scrollPane"); // NOI18N

        modeloLista = new DefaultListModel();
        listMembresias.setModel(modeloLista);
        ArrayList<Membresia> mems = obtenerMembresias();
        for(int i = 0 ; i < mems.size() ; i++){
            modeloLista.add(i, mems.get(i));
        }
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

        panelCenter.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 265));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre*");
        lblNombre.setName("lblNombre"); // NOI18N
        panelCenter.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 75, -1, -1));

        errorImgNombre.setVisible(false);
        errorImgNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorImgNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/error.png"))); // NOI18N
        panelCenter.add(errorImgNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 95, -1, -1));

        tfNombre.setBackground(new java.awt.Color(51, 51, 51));
        tfNombre.setForeground(new java.awt.Color(255, 255, 255));
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
        panelCenter.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 95, 180, -1));

        lblPrecio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio.setText("Precio*");
        lblPrecio.setName("lblPrecio"); // NOI18N
        panelCenter.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        errorImgPrecio.setVisible(false);
        errorImgPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorImgPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/error.png"))); // NOI18N
        panelCenter.add(errorImgPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        tfPrecio.setBackground(new java.awt.Color(51, 51, 51));
        tfPrecio.setForeground(new java.awt.Color(255, 255, 255));
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
        panelCenter.add(tfPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 180, -1));

        btnModificar.setBorder(null);
        btnModificar.setText("Modificar");
        btnModificar.setkEndColor(new java.awt.Color(51, 0, 51));
        btnModificar.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        btnModificar.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnModificar.setkHoverStartColor(new java.awt.Color(51, 0, 51));
        btnModificar.setkPressedColor(new java.awt.Color(255, 153, 204));
        btnModificar.setkStartColor(new java.awt.Color(204, 0, 204));
        btnModificar.setName("btnModificar"); // NOI18N
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnModificarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnModificarMouseReleased(evt);
            }
        });
        panelCenter.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 80, 20));

        kButton1.setBorder(null);
        kButton1.setText("Limpiar campos");
        kButton1.setkEndColor(new java.awt.Color(51, 0, 51));
        kButton1.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(51, 0, 51));
        kButton1.setkPressedColor(new java.awt.Color(255, 153, 204));
        kButton1.setkStartColor(new java.awt.Color(204, 0, 204));
        kButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kButton1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                kButton1MouseReleased(evt);
            }
        });
        panelCenter.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 90, 20));

        panelBorder.add(panelCenter, java.awt.BorderLayout.CENTER);

        panelSouth.setBackground(new java.awt.Color(51, 51, 51));
        panelSouth.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        panelSouth.setName("panelSouth"); // NOI18N
        panelSouth.setPreferredSize(new java.awt.Dimension(387, 75));
        panelSouth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 20));

        btnEliminar.setBorder(null);
        btnEliminar.setText("Eliminar");
        btnEliminar.setkEndColor(new java.awt.Color(51, 0, 51));
        btnEliminar.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        btnEliminar.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnEliminar.setkHoverStartColor(new java.awt.Color(51, 0, 51));
        btnEliminar.setkPressedColor(new java.awt.Color(255, 153, 204));
        btnEliminar.setkStartColor(new java.awt.Color(204, 0, 204));
        btnEliminar.setName("btnEliminar"); // NOI18N
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

        panelBorder.add(panelSouth, java.awt.BorderLayout.SOUTH);

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
        mem = cm.obtenerMembresia(listMembresias.getSelectedValue().getId_membresia(), asociacion.getId());
               
        tfNombre.setText(mem.getNombre());
        tfPrecio.setText(mem.getPrecio()+""); 
        btnModificar.setEnabled(true);
    }//GEN-LAST:event_listMembresiasMouseClicked

    private void tfNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusGained
        tfNombre.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 0, 204)));
        errorImgNombre.setVisible(false);
    }//GEN-LAST:event_tfNombreFocusGained

    private void tfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusLost
        tfNombre.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));                
    }//GEN-LAST:event_tfNombreFocusLost

    private void tfPrecioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPrecioFocusGained
        tfPrecio.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 0, 204)));
        errorImgPrecio.setVisible(false);
        guardar = true;
    }//GEN-LAST:event_tfPrecioFocusGained

    private void tfPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPrecioFocusLost
        tfPrecio.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
        Matcher matcher = DOUBLE.matcher(tfPrecio.getText());
        Matcher matcherNum = NUMERO.matcher(tfPrecio.getText());        
        if(!tfPrecio.getText().replace(" ","").equals("")){    
            if(!(matcher.matches() || matcherNum.matches())){
                tfPrecio.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
                errorImgPrecio.setVisible(true);
                guardar = false;  
            }
        }
    }//GEN-LAST:event_tfPrecioFocusLost

    private void btnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseExited
       activarMod = false;
    }//GEN-LAST:event_btnModificarMouseExited

    private void btnModificarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseReleased
        if(activarMod){
            if(listMembresias.isSelectionEmpty()){
                JOptionPane.showMessageDialog(this, "Selecciona una membresia", "Error", JOptionPane.ERROR_MESSAGE);
            }else{    
                Membresia m = listMembresias.getSelectedValue();
                if(guardar)
                if(!tfNombre.getText().replace(" ","").equals("")){
                    if(!tfPrecio.getText().replace(" ","").equals("")){
                        Membresia memb = new Membresia(m.getId_membresia(), tfNombre.getText(),
                            Double.parseDouble(tfPrecio.getText()), asociacion.getId());
                        if(cm.modificarMembresia(memb)){
                            actualizarListaMembresias();                   
                        }else{
                            JOptionPane.showMessageDialog(this,
                                "No se ha podido actualizar la membresia", "Error",
                                JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                        tfPrecio.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
                        errorImgPrecio.setVisible(true); 
                    }
                }else{
                    tfNombre.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));        
                    errorImgNombre.setVisible(true); 
                }
            }            
        }
    }//GEN-LAST:event_btnModificarMouseReleased

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        activarEliminar = false;
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnEliminarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseReleased
        if(activarEliminar){
            if(listMembresias.isSelectionEmpty()){
                JOptionPane.showMessageDialog(this, "Selecciona una membresia", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                int dialogResult = JOptionPane.showConfirmDialog (this, "Estas seguro que desea elimnar?",
                    "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if(dialogResult == JOptionPane.YES_OPTION){
                    if(cm.eliminarMembresia(listMembresias.getSelectedValue().getId_membresia(), asociacion.getId())){            
                        modeloLista.remove(listMembresias.getSelectedIndex());
                        tfNombre.setText("");
                        tfPrecio.setText("");
                    }
                }
            }            
        }
    }//GEN-LAST:event_btnEliminarMouseReleased

    private void btnAnadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnadirMouseExited
        activarAnadir = false;
    }//GEN-LAST:event_btnAnadirMouseExited

    private void btnAnadirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnadirMouseReleased
        if(activarAnadir){
            if(guardar)
            if(!tfNombre.getText().replace(" ","").equals("")){
                if(!tfPrecio.getText().replace(" ","").equals("")){                
                    Membresia memb = new Membresia(tfNombre.getText(),
                        Double.parseDouble(tfPrecio.getText()), asociacion.getId());
                    if(cm.insertarMembresia(memb)){
                        actualizarListaMembresias();                   
                    }else{
                        JOptionPane.showMessageDialog(this, 
                            "No se ha podido añadir la membresia", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    tfPrecio.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
                    errorImgPrecio.setVisible(true);
                }
            }else{
                tfNombre.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, WRONG));
                errorImgNombre.setVisible(true);
            } 
        }
    }//GEN-LAST:event_btnAnadirMouseReleased

    private void btnModificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMousePressed
        activarMod = true;
    }//GEN-LAST:event_btnModificarMousePressed

    private void btnEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMousePressed
        activarEliminar = true;
    }//GEN-LAST:event_btnEliminarMousePressed

    private void btnAnadirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnadirMousePressed
        activarAnadir = true;
    }//GEN-LAST:event_btnAnadirMousePressed

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setIcon(new ImageIcon(getClass().getResource("/close-button-red.png")));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        activarCerrar = false;
        close.setIcon(new ImageIcon(getClass().getResource("/close-button.png")));
    }//GEN-LAST:event_closeMouseExited

    private void kButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton1MouseExited
        activarLimpiar = false;
    }//GEN-LAST:event_kButton1MouseExited

    private void kButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton1MousePressed
        activarLimpiar = true;
    }//GEN-LAST:event_kButton1MousePressed

    private void kButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton1MouseReleased
        if(activarLimpiar){
            listMembresias.setSelectedValue(null, false);        
            tfNombre.setText("");
            tfPrecio.setText("");

            tfNombre.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
            errorImgNombre.setVisible(false);

            tfPrecio.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(102, 102, 102)));
            errorImgPrecio.setVisible(false);
        }
    }//GEN-LAST:event_kButton1MouseReleased

    private void closeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMousePressed
        activarCerrar = true;
    }//GEN-LAST:event_closeMousePressed

    private void closeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseReleased
        if(activarCerrar){
            dispose();
        }
    }//GEN-LAST:event_closeMouseReleased

    private ArrayList<Membresia> obtenerMembresias(){
        ArrayList<Membresia> mems = cm.obtenerMembresias(asociacion.getId());
        
        for(int i = 0 ; i < mems.size() ; i++){
            if(mems.get(i).getNombre().equals("Ninguna"))
                mems.remove(i);
        }
        
        return mems;
    }

    private void actualizarListaMembresias(){
        modeloLista.removeAllElements();
        ArrayList<Membresia> mems = obtenerMembresias();
        for(int i = 0 ; i < mems.size() ; i++){
            modeloLista.add(i, mems.get(i));
        }
        //modeloLista.addAll(0, obtenerMembresias());
    }   

    private boolean activarMod;
    private boolean activarEliminar;
    private boolean activarAnadir;
    private boolean activarLimpiar;
    private boolean activarCerrar;
    
    private final Asociacion asociacion;
    
    private final ControlMembresia cm;
    private Membresia mem;
    
    private DefaultListModel modeloLista;
    
    private boolean guardar;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnAnadir;
    private keeptoo.KButton btnEliminar;
    private keeptoo.KButton btnModificar;
    private javax.swing.JLabel close;
    private javax.swing.JLabel errorImgNombre;
    private javax.swing.JLabel errorImgPrecio;
    private keeptoo.KButton kButton1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<Membresia> listMembresias;
    private javax.swing.JPanel panelBorder;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelNorth;
    private javax.swing.JPanel panelSouth;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPrecio;
    // End of variables declaration//GEN-END:variables
}