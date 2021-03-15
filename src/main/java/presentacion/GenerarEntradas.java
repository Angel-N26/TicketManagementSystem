package presentacion;

import com.google.zxing.WriterException;
import dominio.Asociacion;
import dominio.ControlEntradas;
import dominio.ControlSocio;
import dominio.CrearQR;
import dominio.Entrada;
import dominio.Evento;
import dominio.Socio;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * @author angel
 **/
public class GenerarEntradas extends javax.swing.JFrame {

    public GenerarEntradas(Evento evento, ArrayList<Entrada> entradas, Asociacion asociacion) {
        this.evento = evento;
        this.entradas = entradas;
        this.asociacion = asociacion;
        
        initComponents();       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        panel = new javax.swing.JPanel();
        panelNorth = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblEvento = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        panelCenter = new javax.swing.JPanel();
        lblSociosSin = new javax.swing.JLabel();
        scrollPaneSin = new javax.swing.JScrollPane();
        listSociosSin = new javax.swing.JList<>();
        lblSociosCon = new javax.swing.JLabel();
        scrollPaneCon = new javax.swing.JScrollPane();
        listSociosCon = new javax.swing.JList<>();
        panelSouth = new javax.swing.JPanel();
        btnGenerarEntradas = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TicketManagementSystem");
        setIconImage(getIconImage());
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        panel.setBackground(new java.awt.Color(51, 51, 51));
        panel.setName("panel"); // NOI18N
        panel.setLayout(new java.awt.BorderLayout());

        panelNorth.setBackground(new java.awt.Color(51, 51, 51));
        panelNorth.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        panelNorth.setName("panelNorth"); // NOI18N
        panelNorth.setPreferredSize(new java.awt.Dimension(511, 40));
        panelNorth.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Generar Entradas");
        lblTitulo.setName("lblTitulo"); // NOI18N
        panelNorth.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblEvento.setText(evento.getNombre());
        lblEvento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEvento.setForeground(new java.awt.Color(255, 255, 255));
        lblEvento.setName("lblEvento"); // NOI18N
        panelNorth.add(lblEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 17));

        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\close-button.png")); // NOI18N
        close.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        close.setName("close"); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        panelNorth.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 0, -1, -1));

        panel.add(panelNorth, java.awt.BorderLayout.NORTH);

        panelCenter.setBackground(new java.awt.Color(51, 51, 51));
        panelCenter.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        panelCenter.setName("panelCenter"); // NOI18N
        panelCenter.setPreferredSize(new java.awt.Dimension(490, 300));
        panelCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSociosSin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSociosSin.setForeground(new java.awt.Color(255, 255, 255));
        lblSociosSin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSociosSin.setText("SOCIOS SIN ENTRADA");
        lblSociosSin.setName("lblSociosSin"); // NOI18N
        panelCenter.add(lblSociosSin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 220, -1));

        scrollPaneSin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        scrollPaneSin.setName("scrollPaneSin"); // NOI18N
        scrollPaneSin.setPreferredSize(new java.awt.Dimension(200, 270));

        modeloListaSociosSin = new DefaultListModel();
        listSociosSin.setModel(modeloListaSociosSin);
        listSociosSin.setSelectionForeground(new Color(255,255,255));
        listSociosSin.setBackground(new java.awt.Color(102, 102, 102));
        listSociosSin.setForeground(new java.awt.Color(255, 255, 255));
        listSociosSin.setName("listSociosSin"); // NOI18N
        listSociosSin.setSelectionBackground(new java.awt.Color(31, 31, 31));
        scrollPaneSin.setViewportView(listSociosSin);

        panelCenter.add(scrollPaneSin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 220, 245));

        lblSociosCon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSociosCon.setForeground(new java.awt.Color(255, 255, 255));
        lblSociosCon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSociosCon.setText("SOCIOS CON ENTRADA");
        lblSociosCon.setName("lblSociosCon"); // NOI18N
        panelCenter.add(lblSociosCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 220, -1));

        scrollPaneCon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        scrollPaneCon.setName("scrollPaneCon"); // NOI18N
        scrollPaneCon.setPreferredSize(new java.awt.Dimension(200, 270));

        modeloListaSociosCon = new DefaultListModel();
        listSociosCon.setModel(modeloListaSociosCon);
        listSociosCon.setSelectionForeground(new Color(255,255,255));
        rellenarListas();
        listSociosCon.setBackground(new java.awt.Color(102, 102, 102));
        listSociosCon.setForeground(new java.awt.Color(255, 255, 255));
        listSociosCon.setName("listSociosCon"); // NOI18N
        listSociosCon.setSelectionBackground(new java.awt.Color(31, 31, 31));
        scrollPaneCon.setViewportView(listSociosCon);

        panelCenter.add(scrollPaneCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 220, 245));

        panel.add(panelCenter, java.awt.BorderLayout.CENTER);

        panelSouth.setBackground(new java.awt.Color(51, 51, 51));
        panelSouth.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        panelSouth.setName("panelSouth"); // NOI18N
        panelSouth.setPreferredSize(new java.awt.Dimension(192, 75));
        panelSouth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        btnGenerarEntradas.setBorder(null);
        btnGenerarEntradas.setText("Generar Entradas");
        btnGenerarEntradas.setkEndColor(new java.awt.Color(51, 0, 51));
        btnGenerarEntradas.setkHoverEndColor(new java.awt.Color(0, 0, 0));
        btnGenerarEntradas.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnGenerarEntradas.setkHoverStartColor(new java.awt.Color(51, 0, 51));
        btnGenerarEntradas.setkPressedColor(new java.awt.Color(255, 153, 204));
        btnGenerarEntradas.setkStartColor(new java.awt.Color(204, 0, 204));
        btnGenerarEntradas.setName("btnGenerarEntradas"); // NOI18N
        btnGenerarEntradas.setPreferredSize(new java.awt.Dimension(180, 35));
        btnGenerarEntradas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenerarEntradasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGenerarEntradasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnGenerarEntradasMouseReleased(evt);
            }
        });
        panelSouth.add(btnGenerarEntradas);

        panel.add(panelSouth, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        dispose();
    }//GEN-LAST:event_formWindowLostFocus

    private void btnGenerarEntradasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarEntradasMouseExited
        activar = false;
    }//GEN-LAST:event_btnGenerarEntradasMouseExited

    private void btnGenerarEntradasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarEntradasMousePressed
        activar = true;
    }//GEN-LAST:event_btnGenerarEntradasMousePressed

    private void btnGenerarEntradasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarEntradasMouseReleased
        if(activar){            
            //int dialogResult = JOptionPane.showConfirmDialog (this,
                //"Estas seguro que desea generar?", "Warning", JOptionPane.YES_NO_OPTION);
            //if(dialogResult == JOptionPane.YES_OPTION){        
                ControlEntradas ce = new ControlEntradas();
                List<Socio> socioConEntrada = listSociosSin.getSelectedValuesList();
                if(!listSociosSin.isSelectionEmpty()){
                    for(int i = 0 ; i < socioConEntrada.size() ; i++){
                        Entrada entrada = new Entrada(evento.getId(), socioConEntrada.get(i).getDni());
                        ce.insertarEntrada(entrada);
                        entrada = ce.obtenerEntrada(entrada.getId_evento(), entrada.getId_socio());
                        try{
                            CrearQR qr = new CrearQR();
                            BufferedImage imagen = qr.crearQR(entrada.getId_evento()
                                    +"-"+entrada.getId_socio()+"-"+entrada.getNum_entrada(), 300, 300);
                            File outputfile = new File("C:\\Users\\angel\\Desktop\\qr"+entrada.getNum_entrada()+".png");
                            ImageIO.write(imagen, "png", outputfile);
                            modeloListaSociosCon.add(modeloListaSociosCon.size(), socioConEntrada.get(i));
                            modeloListaSociosSin.removeElement(socioConEntrada.get(i));
                        }catch(WriterException e){
                            System.out.println(e.getMessage());
                        }catch (IOException ex) {
                            Logger.getLogger(GenerarEntradas.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                }else{
                    //Mensaje selecciona socio
                }                
            //}
        }
    }//GEN-LAST:event_btnGenerarEntradasMouseReleased
        
    
    private void rellenarListas(){
        modeloListaSociosCon.removeAllElements();
        modeloListaSociosSin.removeAllElements();
        
        ControlSocio cs = new ControlSocio();
        ArrayList<Socio> socios = cs.obtenerSocios(asociacion.getNombre());
        
        ArrayList<Socio> sociosSin = new ArrayList();
        ArrayList<Socio> sociosCon = new ArrayList();
        
        for(Entrada e : entradas){
            for(Socio s : socios){
                if(s.getDni().equals(e.getId_socio())){
                    sociosCon.add(s);
                }
            }
        }
        
        for(Socio soc : socios){
            if(!sociosCon.contains(soc)){
                sociosSin.add(soc);
            }
        }      
                       
        modeloListaSociosCon.addAll(0, sociosCon);
        modeloListaSociosSin.addAll(0, sociosSin);
    }     
    
    private boolean activar;
    
    private final Asociacion asociacion;
    
    private final Evento evento;
    private final ArrayList<Entrada> entradas;
    
    private DefaultListModel modeloListaSociosSin;
    private DefaultListModel modeloListaSociosCon;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnGenerarEntradas;
    private javax.swing.JLabel close;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel lblEvento;
    private javax.swing.JLabel lblSociosCon;
    private javax.swing.JLabel lblSociosSin;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> listSociosCon;
    private javax.swing.JList<Socio> listSociosSin;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelNorth;
    private javax.swing.JPanel panelSouth;
    private javax.swing.JScrollPane scrollPaneCon;
    private javax.swing.JScrollPane scrollPaneSin;
    // End of variables declaration//GEN-END:variables
}