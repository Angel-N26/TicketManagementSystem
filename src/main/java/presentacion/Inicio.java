package presentacion;

import java.awt.Component;
import java.awt.Container;

/**
 * @author angel
 */
public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuAsociacion = new javax.swing.JMenu();
        menuSocios = new javax.swing.JMenu();
        menuEventos = new javax.swing.JMenu();
        menuEntradas = new javax.swing.JMenu();
        menuAyuda = new javax.swing.JMenu();
        submenuCerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicketManagementSystem");
        setPreferredSize(new java.awt.Dimension(800, 550));

        panelCard.setName("panelCard"); // NOI18N
        panelCard.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("jLabel1");
        ultimoPanel = jLabel1;
        panelCard.add(jLabel1, java.awt.BorderLayout.CENTER);

        menu.setBackground(new java.awt.Color(51, 51, 51));
        menu.setName("menu"); // NOI18N
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });

        menuInicio.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\casa-icono-silueta.png")); // NOI18N
        menuInicio.setText("Inicio");
        menuInicio.setName("menuInicio"); // NOI18N
        menuInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuInicioMouseClicked(evt);
            }
        });
        menu.add(menuInicio);

        menuAsociacion.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\apreton-de-manos.png")); // NOI18N
        menuAsociacion.setText("Asociacion");
        menuAsociacion.setToolTipText("");
        menuAsociacion.setName("menuAsociacion"); // NOI18N
        menuAsociacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAsociacionMouseClicked(evt);
            }
        });
        menu.add(menuAsociacion);

        menuSocios.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\personas.png")); // NOI18N
        menuSocios.setText("Socios");
        menuSocios.setName("menuSocios"); // NOI18N
        menuSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSociosMouseClicked(evt);
            }
        });
        menu.add(menuSocios);

        menuEventos.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\evento.png")); // NOI18N
        menuEventos.setText("Eventos");
        menuEventos.setName("menuEventos"); // NOI18N
        menuEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEventosMouseClicked(evt);
            }
        });
        menu.add(menuEventos);

        menuEntradas.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\entradas.png")); // NOI18N
        menuEntradas.setText("Entradas");
        menuEntradas.setName("menuEntradas"); // NOI18N
        menuEntradas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEntradasMouseClicked(evt);
            }
        });
        menu.add(menuEntradas);

        menuAyuda.setText("Help me");
        menuAyuda.setName("menuAyuda"); // NOI18N

        submenuCerrarSesion.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\power-button.png")); // NOI18N
        submenuCerrarSesion.setText("Cerrar Sesion");
        submenuCerrarSesion.setName("submenuCerrarSesion"); // NOI18N
        submenuCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submenuCerrarSesionMouseClicked(evt);
            }
        });
        menuAyuda.add(submenuCerrarSesion);

        menu.add(menuAyuda);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCard, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submenuCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submenuCerrarSesionMouseClicked
        Login login = new Login();        
        login.setVisible(true);
        jLabel1.setText("He clicado en cerrar sesion");
        dispose();
    }//GEN-LAST:event_submenuCerrarSesionMouseClicked

    private void menuAsociacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAsociacionMouseClicked
        asocPanel = new AsociacionPanel();      
        panelCard.remove(ultimoPanel);
        panelCard.add(asocPanel);
        ultimoPanel = asocPanel;
        jLabel1.setText("He clicado en asociacion");       
    }//GEN-LAST:event_menuAsociacionMouseClicked

    private void menuSociosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSociosMouseClicked
        sociosPanel = new SociosPanel();
        panelCard.remove(ultimoPanel);
        panelCard.add(sociosPanel);
        ultimoPanel = sociosPanel;
        jLabel1.setText("He clicado en socios");
    }//GEN-LAST:event_menuSociosMouseClicked

    private void menuEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEventosMouseClicked
        eventosPanel = new EventosPanel();
        panelCard.remove(ultimoPanel);
        panelCard.add(eventosPanel);
        ultimoPanel = eventosPanel;
    }//GEN-LAST:event_menuEventosMouseClicked

    private void menuEntradasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEntradasMouseClicked
        entradasPanel = new EntradasPanel();
        panelCard.remove(ultimoPanel);
        panelCard.add(entradasPanel);
        ultimoPanel = entradasPanel;
    }//GEN-LAST:event_menuEntradasMouseClicked

    private void menuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInicioMouseClicked
        inicioPanel = new InicioPanel();
        panelCard.remove(ultimoPanel);
        panelCard.add(inicioPanel);
        ultimoPanel = inicioPanel;
    }//GEN-LAST:event_menuInicioMouseClicked

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        if(evt.getSource().equals(menuAsociacion)){
            asocPanel = new AsociacionPanel();
            panelCard.remove(this);
            panelCard.add(asocPanel);
        }else if(evt.getSource()==submenuCerrarSesion){
            Login login = new Login();        
            login.setVisible(true);
            jLabel1.setText("He clicado en cerrar sesion");
            dispose();
        }
    }//GEN-LAST:event_menuMouseClicked
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuAsociacion;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuEntradas;
    private javax.swing.JMenu menuEventos;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenu menuSocios;
    private javax.swing.JPanel panelCard;
    private javax.swing.JMenuItem submenuCerrarSesion;
    // End of variables declaration//GEN-END:variables
    private InicioPanel inicioPanel;
    private AsociacionPanel asocPanel;
    private SociosPanel sociosPanel;
    private EventosPanel eventosPanel;
    private EntradasPanel entradasPanel;
    private Container ultimoPanel;
}