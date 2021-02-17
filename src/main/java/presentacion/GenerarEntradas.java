package presentacion;

import com.google.zxing.WriterException;
import dominio.ControlEntradas;
import dominio.ControlSocio;
import dominio.CrearQR;
import dominio.Entrada;
import dominio.Evento;
import dominio.Socio;
import java.awt.Image;
import java.awt.Toolkit;
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

    public GenerarEntradas(Evento evento, ArrayList<Entrada> entradas) {
        this.evento = evento;
        this.entradas = entradas;
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
        btnGenerarEntradas = new javax.swing.JButton();
        panelCenter = new javax.swing.JPanel();
        lblSocios = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();

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
        panelNorth.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPregunta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPregunta.setForeground(new java.awt.Color(255, 255, 255));
        lblPregunta.setText("Generar Entradas");
        lblPregunta.setToolTipText("");
        lblPregunta.setName("lblPregunta"); // NOI18N
        panelNorth.add(lblPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, -1, -1));

        lblEvento.setText(evento.getNombre());
        lblEvento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEvento.setForeground(new java.awt.Color(255, 255, 255));
        lblEvento.setName("lblEvento"); // NOI18N
        panelNorth.add(lblEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 13, -1, -1));

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

        btnGenerarEntradas.setBackground(new java.awt.Color(255, 204, 0));
        btnGenerarEntradas.setText("Generar Entradas");
        btnGenerarEntradas.setBorder(null);
        btnGenerarEntradas.setName("btnGenerarEntradas"); // NOI18N
        btnGenerarEntradas.setPreferredSize(new java.awt.Dimension(180, 35));
        btnGenerarEntradas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarEntradasMouseClicked(evt);
            }
        });
        panelSouth.add(btnGenerarEntradas);

        panel.add(panelSouth, java.awt.BorderLayout.PAGE_END);

        panelCenter.setBackground(new java.awt.Color(51, 51, 51));
        panelCenter.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        panelCenter.setName("panelCenter"); // NOI18N
        panelCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSocios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSocios.setForeground(new java.awt.Color(255, 255, 255));
        lblSocios.setText("SOCIOS");
        lblSocios.setName("lblSocios"); // NOI18N
        panelCenter.add(lblSocios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(200, 270));

        modeloListaSociosSin = new DefaultListModel();
        jList1.setModel(modeloListaSociosSin);
        jList1.setBackground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(jList1);

        panelCenter.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 270));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(200, 270));

        modeloListaSociosCon = new DefaultListModel();
        jList2.setModel(modeloListaSociosCon);
        
        rellenarListas();
        jList2.setBackground(new java.awt.Color(102, 102, 102));
        jScrollPane2.setViewportView(jList2);

        panelCenter.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 0, 204));
        jButton2.setText(">>");
        jButton2.setBorder(null);
        jButton2.setPreferredSize(new java.awt.Dimension(30, 40));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        panelCenter.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 60, -1));

        panel.add(panelCenter, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        int i = jList1.getSelectedIndex();
        Socio socio = (Socio) modeloListaSociosSin.getElementAt(i);
        socioConEntrada.add(socio);
        modeloListaSociosSin.remove(i);
        modeloListaSociosCon.add(0, socio);        
    }//GEN-LAST:event_jButton2MouseClicked

    private void btnGenerarEntradasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarEntradasMouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Estas seguro que desea generar?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){        
            ControlEntradas ce = new ControlEntradas();
            if(!socioConEntrada.isEmpty()){
                for(int i = 0 ; i < socioConEntrada.size() ; i++){
                    Entrada entrada = new Entrada(evento.getId(), socioConEntrada.get(i).getDni());
                    ce.insertarEntrada(entrada);
                    
                    try{
                        CrearQR qr = new CrearQR();
                        BufferedImage imagen = qr.crearQR(entrada.getId_evento()
                                +entrada.getId_socio()+entrada.getNum_entrada(), 300, 300);
                        File outputfile = new File("C:\\Users\\angel\\Escritorio\\qr"+i+".png");
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
    }//GEN-LAST:event_btnGenerarEntradasMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        dispose();
    }//GEN-LAST:event_formWindowLostFocus
    
    private void rellenarListas(){
        ControlSocio cs = new ControlSocio();
        ArrayList<Socio> socios = cs.obtenerSocios();
        
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
    
   @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(
                "C:\\Users\\angel\\Documents\\NetBeansProjects\\TicketManagementSystem\\src\\main\\java\\recursos/logo(2).png");
        return retValue;
    }    
    
    private final Evento evento;
    private final ArrayList<Entrada> entradas;
    
    private ArrayList<Socio> socioConEntrada;
    
    private DefaultListModel modeloListaSociosSin;
    private DefaultListModel modeloListaSociosCon;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarEntradas;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEvento;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblSocios;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelNorth;
    private javax.swing.JPanel panelSouth;
    // End of variables declaration//GEN-END:variables
}