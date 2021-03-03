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
        socioConEntrada = new ArrayList();
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
        lblPregunta = new javax.swing.JLabel();
        lblEvento = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelSouth = new javax.swing.JPanel();
        kButton1 = new keeptoo.KButton();
        panelCenter = new javax.swing.JPanel();
        lblSocios = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        lblSocios1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

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

        lblPregunta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPregunta.setForeground(new java.awt.Color(255, 255, 255));
        lblPregunta.setText("Generar Entradas");
        lblPregunta.setToolTipText("");
        lblPregunta.setName("lblPregunta"); // NOI18N
        panelNorth.add(lblPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblEvento.setText(evento.getNombre());
        lblEvento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEvento.setForeground(new java.awt.Color(255, 255, 255));
        lblEvento.setName("lblEvento"); // NOI18N
        panelNorth.add(lblEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 17));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\close-button.png")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        panelNorth.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 0, -1, -1));

        panel.add(panelNorth, java.awt.BorderLayout.PAGE_START);

        panelSouth.setBackground(new java.awt.Color(51, 51, 51));
        panelSouth.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        panelSouth.setName("panelSouth"); // NOI18N
        panelSouth.setPreferredSize(new java.awt.Dimension(192, 75));
        panelSouth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        kButton1.setBorder(null);
        kButton1.setText("Generar Entradas");
        kButton1.setkEndColor(new java.awt.Color(51, 0, 51));
        kButton1.setkStartColor(new java.awt.Color(204, 0, 204));
        kButton1.setPreferredSize(new java.awt.Dimension(180, 35));
        kButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton1MouseClicked(evt);
            }
        });
        panelSouth.add(kButton1);

        panel.add(panelSouth, java.awt.BorderLayout.PAGE_END);

        panelCenter.setBackground(new java.awt.Color(51, 51, 51));
        panelCenter.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        panelCenter.setName("panelCenter"); // NOI18N
        panelCenter.setPreferredSize(new java.awt.Dimension(490, 300));
        panelCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSocios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSocios.setForeground(new java.awt.Color(255, 255, 255));
        lblSocios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSocios.setText("SOCIOS CON ENTRADA");
        lblSocios.setName("lblSocios"); // NOI18N
        panelCenter.add(lblSocios, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 200, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(200, 270));

        modeloListaSociosSin = new DefaultListModel();
        jList1.setModel(modeloListaSociosSin);
        jList1.setSelectionForeground(new Color(255,255,255));
        jList1.setBackground(new java.awt.Color(102, 102, 102));
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setSelectionBackground(new java.awt.Color(31, 31, 31));
        jScrollPane1.setViewportView(jList1);

        panelCenter.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 245));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(200, 270));

        modeloListaSociosCon = new DefaultListModel();
        jList2.setModel(modeloListaSociosCon);
        jList2.setSelectionForeground(new Color(255,255,255));
        rellenarListas();
        jList2.setBackground(new java.awt.Color(102, 102, 102));
        jList2.setForeground(new java.awt.Color(255, 255, 255));
        jList2.setSelectionBackground(new java.awt.Color(31, 31, 31));
        jScrollPane2.setViewportView(jList2);

        panelCenter.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, 245));

        jButton2.setBackground(new java.awt.Color(31, 31, 31));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\flechas-izq-gray.png")); // NOI18N
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPreferredSize(new java.awt.Dimension(30, 40));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        panelCenter.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 50, -1));

        lblSocios1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSocios1.setForeground(new java.awt.Color(255, 255, 255));
        lblSocios1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSocios1.setText("SOCIOS SIN ENTRADA");
        lblSocios1.setName("lblSocios"); // NOI18N
        panelCenter.add(lblSocios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, -1));

        jButton3.setBackground(new java.awt.Color(31, 31, 31));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\flechas-dch-gray.png")); // NOI18N
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setPreferredSize(new java.awt.Dimension(30, 40));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        panelCenter.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 105, 50, -1));

        panel.add(panelCenter, java.awt.BorderLayout.CENTER);

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

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
                
    }//GEN-LAST:event_jButton2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        dispose();
    }//GEN-LAST:event_formWindowLostFocus

    private void kButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton1MouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Estas seguro que desea generar?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){        
            ControlEntradas ce = new ControlEntradas();
            if(!socioConEntrada.isEmpty()){
                for(int i = 0 ; i < socioConEntrada.size() ; i++){
                    Entrada entrada = new Entrada(evento.getId(), socioConEntrada.get(i).getDni());
                    ce.insertarEntrada(entrada);
                    entrada = ce.obtenerEntrada(entrada.getId_evento(), entrada.getId_socio());
                    try{
                        CrearQR qr = new CrearQR();
                        BufferedImage imagen = qr.crearQR(entrada.getId_evento()
                                +"-"+entrada.getId_socio()+"-"+entrada.getNum_entrada(), 300, 300);
                        File outputfile = new File("C:\\Users\\angel\\Escritorio\\qr"+entrada.getNum_entrada()+".png");
                        ImageIO.write(imagen, "png", outputfile);
                    }catch(WriterException e){
                        System.out.println(e.getMessage());
                    }catch (IOException ex) {
                        Logger.getLogger(GenerarEntradas.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
            }
            dispose();
        }
    }//GEN-LAST:event_kButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        int i = jList1.getSelectedIndex();
        Socio socio = (Socio) modeloListaSociosSin.getElementAt(i);
        socioConEntrada.add(socio);
        modeloListaSociosSin.remove(i);
        modeloListaSociosCon.add(0, socio);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\flechas-dch-white.png"));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\flechas-dch-gray.png"));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\flechas-izq-white.png"));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\flechas-izq-gray.png"));
    }//GEN-LAST:event_jButton2MouseExited
    
    private void rellenarListas(){
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
    
    private Asociacion asociacion;
    
    private final Evento evento;
    private final ArrayList<Entrada> entradas;
    
    private ArrayList<Socio> socioConEntrada;
    
    private DefaultListModel modeloListaSociosSin;
    private DefaultListModel modeloListaSociosCon;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KButton kButton1;
    private javax.swing.JLabel lblEvento;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblSocios;
    private javax.swing.JLabel lblSocios1;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelNorth;
    private javax.swing.JPanel panelSouth;
    // End of variables declaration//GEN-END:variables
}