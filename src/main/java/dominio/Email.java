package dominio;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 * @author angel
 **/
public class Email {
    private String destinatario;
    private String asunto;
    private String cuerpo;  
    
    
    public Email(String destinatario, String asunto, String cuerpo){
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
    }
    
    
    public void enviarMail(Asociacion asociacion, String entrada)throws MessagingException{
        // Esto es lo que va delante de @gmail.com en tu cuenta de correo. Es el remitente también. 
        String [] correoAsoc = asociacion.getEmail().split("@");
        String remitente = correoAsoc[0];
        
        String clave = "";                                      
        JPasswordField pwd = new JPasswordField();
        int action = JOptionPane.showConfirmDialog(null, pwd,"Introduzaca la contraseña del correo de la asociacion",JOptionPane.OK_CANCEL_OPTION);
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
        
        
            texto.setText(this.cuerpo);
            adjunto.setDataHandler(new DataHandler(new FileDataSource(entrada)));
            adjunto.setFileName("entrada.png");
            cuerpoAdjunto.addBodyPart(texto);
            cuerpoAdjunto.addBodyPart(adjunto);
            
            message.setFrom(new InternetAddress(remitente));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(this.destinatario));
            message.setSubject(this.asunto);
            message.setContent(cuerpoAdjunto);
            
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com", remitente, clave);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        
    }
    
    public void enviarPass()throws MessagingException{
        String remitente = "angelsanchez2697";
        String clave = "mChoqso2";
        
        Properties props = System.getProperties();
        props.put("mail.smtp.host", "smtp.gmail.com");  //Servidor SMTP de Google
        props.put("mail.smtp.user", remitente);        
        props.put("mail.smtp.clave", clave);    //Clave de la cuenta        
        props.put("mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
        props.put("mail.smtp.starttls.enable", "true"); //Conectar de manera segura al servidor SMTP
        props.put("mail.smtp.port", "587"); //Puerto SMTP seguro de Google

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);
                           
        message.setFrom(new InternetAddress(remitente));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(this.destinatario));
        message.setSubject(this.asunto);
        message.setText(this.cuerpo);

        Transport transport = session.getTransport("smtp");
        transport.connect("smtp.gmail.com", remitente, clave);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }
}
