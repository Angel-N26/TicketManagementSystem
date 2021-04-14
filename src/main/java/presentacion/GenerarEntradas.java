package presentacion;

import com.google.zxing.WriterException;
import dominio.Asociacion;
import dominio.Colores;
import dominio.ControlEntradas;
import dominio.ControlEvento;
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
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.imageio.ImageIO;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 * @author angel
 **/
public class GenerarEntradas extends javax.swing.JFrame implements Colores {

    public GenerarEntradas(Asociacion asociacion) {
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
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setUndecorated(true);

        panel.setBackground(new java.awt.Color(51, 51, 51));
        panel.setMaximumSize(new java.awt.Dimension(500, 400));
        panel.setMinimumSize(new java.awt.Dimension(500, 400));
        panel.setName("panel"); // NOI18N
        panel.setPreferredSize(new java.awt.Dimension(500, 400));
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

        lblEvento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEvento.setForeground(new java.awt.Color(255, 255, 255));
        lblEvento.setName("lblEvento"); // NOI18N
        panelNorth.add(lblEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 17));

        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\cerrar.png")); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.setName("close"); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        panelNorth.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 2, -1, -1));

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
        panelCenter.add(lblSociosCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 220, -1));

        scrollPaneCon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        scrollPaneCon.setName("scrollPaneCon"); // NOI18N
        scrollPaneCon.setPreferredSize(new java.awt.Dimension(200, 270));

        modeloListaSociosCon = new DefaultListModel();
        listSociosCon.setModel(modeloListaSociosCon);
        listSociosCon.setSelectionForeground(new Color(255,255,255));
        listSociosCon.setBackground(new java.awt.Color(102, 102, 102));
        listSociosCon.setForeground(new java.awt.Color(255, 255, 255));
        listSociosCon.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listSociosCon.setName("listSociosCon"); // NOI18N
        listSociosCon.setSelectionBackground(new java.awt.Color(31, 31, 31));
        scrollPaneCon.setViewportView(listSociosCon);

        panelCenter.add(scrollPaneCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 220, 245));

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

    private void btnGenerarEntradasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarEntradasMouseExited
        activar = false;
    }//GEN-LAST:event_btnGenerarEntradasMouseExited

    private void btnGenerarEntradasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarEntradasMousePressed
        activar = true;
    }//GEN-LAST:event_btnGenerarEntradasMousePressed

    private void btnGenerarEntradasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarEntradasMouseReleased
        if(activar){            
            ControlEntradas ce = new ControlEntradas();
            List<Socio> socioConEntrada = listSociosSin.getSelectedValuesList();
            int entradasTotales = socioConEntrada.size() + evento.getEntradasVendidas();
            if(!listSociosSin.isSelectionEmpty()){ 
                if(entradasTotales <= evento.getEntradas()){
                    int dialogResult = JOptionPane.showConfirmDialog (this,
                        "Estas seguro que desea generar?", "Warning", JOptionPane.YES_NO_OPTION);
                    if(dialogResult == JOptionPane.YES_OPTION){

                        for(int i = 0 ; i < socioConEntrada.size() ; i++){
                            Entrada entrada = new Entrada(evento.getId(), socioConEntrada.get(i).getDni(), asociacion.getId());
                            
                            ControlSocio cs = new ControlSocio();
                            Socio socio = cs.obtenerSocio(entrada.getIdSocio(), asociacion.getId());
                            
                            if(!socio.getEmail().equals("")){
                                ce.insertarEntrada(entrada);
                                entrada = ce.obtenerEntrada(entrada.getIdEvento(), entrada.getIdSocio(), asociacion.getId());
                                try{
                                    CrearQR qr = new CrearQR();
                                    BufferedImage imagen = qr.crearQR(entrada.getIdEvento()
                                            +"-"+entrada.getIdSocio()+"-"+entrada.getNumEntrada(), 300, 300);
                                    File outputfile = new File("C:\\Users\\angel\\Desktop\\qr"+entrada.getNumEntrada()+".png");
                                    ImageIO.write(imagen, "png", outputfile);
                                    modeloListaSociosCon.add(modeloListaSociosCon.size(), socioConEntrada.get(i));
                                    modeloListaSociosSin.removeElement(socioConEntrada.get(i));
                                    evento.setEntradasVendidas(evento.getEntradasVendidas()+1);
                                    mail(socio.getEmail(), outputfile.getPath());
                                }catch(WriterException e){
                                    System.out.println(e.getMessage());
                                }catch (IOException ex) {
                                    Logger.getLogger(GenerarEntradas.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }else{
                                JOptionPane.showMessageDialog(this, "No se pudo generar la entrada. Ya que el socio " + 
                                        socio.getNombre() + " no tiene correo.",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                            }           
                        }
                        ControlEvento cev = new ControlEvento();
                        if(cev.modificarEvento(evento)){                       
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Capacidad del evento superada",
                    "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "Selecciona por lo menos un socio que no tenga entrada.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }        
    }//GEN-LAST:event_btnGenerarEntradasMouseReleased
        
    
    public void rellenarListas(){
        modeloListaSociosCon.removeAllElements();
        modeloListaSociosSin.removeAllElements();
        
        ControlSocio cs = new ControlSocio();
        ArrayList<Socio> socios = cs.obtenerSocios(asociacion.getId());
        
        ArrayList<Socio> sociosSin = new ArrayList();
        ArrayList<Socio> sociosCon = new ArrayList();        
        
        for(Entrada e : entradas){
            for(Socio s : socios){
                if(s.getDni().equals(e.getIdSocio())){
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
    
    
    public void setEvento(Evento evento){
        this.evento = evento;
        lblEvento.setText(evento.getNombre());
    }
    
    public void setEntradas(ArrayList<Entrada> entradas){
        this.entradas = entradas;        
    }
    
    private void enviarMail(String destinatario, String asunto, String cuerpo, String entrada){
        // Esto es lo que va delante de @gmail.com en tu cuenta de correo. Es el remitente también.        
        String [] correoAsoc = asociacion.getEmail().split("@");
        String remitente = correoAsoc[0];
        
        String clave = "";                                      
        JPasswordField pwd = new JPasswordField();
        int action = JOptionPane.showConfirmDialog(null, pwd,"Enter Password",JOptionPane.OK_CANCEL_OPTION);
        if(action < 0);
        else clave = pwd.getText();
        
        Properties props = System.getProperties();
        props.put("mail.smtp.host", "smtp.gmail.com");  //Servidor SMTP de Google
        props.put("mail.smtp.user", remitente);        
        props.put("mail.smtp.clave", clave);    //Clave de la cuenta        
        props.put("mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
        props.put("mail.smtp.starttls.enable", "true"); //Conectar de manera segura al servidor SMTP
        props.put("mail.smtp.port", "587"); //Puerto SMTP seguro de Google

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);
        
        MimeMultipart cuerpoAdjunto = new MimeMultipart();
        BodyPart texto = new MimeBodyPart();
        BodyPart adjunto = new MimeBodyPart();
        
        try {
            texto.setText(cuerpo);
            adjunto.setDataHandler(new DataHandler(new FileDataSource(entrada)));
            adjunto.setFileName("entrada.png");
            cuerpoAdjunto.addBodyPart(texto);
            cuerpoAdjunto.addBodyPart(adjunto);
            
            message.setFrom(new InternetAddress(remitente));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            message.setSubject(asunto);
            message.setContent(cuerpoAdjunto);
            
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com", remitente, clave);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }catch (MessagingException me) {
            JOptionPane.showMessageDialog(this, "La entrada se ha generado, pero no se ha podido enviar el correo.",
                "Error", JOptionPane.ERROR_MESSAGE);
            me.printStackTrace();
        }
    }
    
    public void mail(String email, String entrada) {
        String destinatario = email;
        String asunto = "Entrada para " + evento.getNombre();
        String cuerpo = "Aqui tienes tu entrada para " + evento.getNombre() + " el dia " + evento.getFecha();

        enviarMail(destinatario, asunto, cuerpo, entrada);
    }
    
    private boolean activar;
    private boolean activarAceptar;
    
    private final Asociacion asociacion;
    
    private Evento evento;
    private ArrayList<Entrada> entradas;
    
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