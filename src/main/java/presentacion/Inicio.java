package presentacion;

import java.awt.CardLayout;

/**
 * @author angel
 **/
public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        ip = new inicioPaneL();
        ap = new asociacionPaneL();
        sp = new sociosPanel();
        evp = new eventosPanel();
        enp = new entradasPanel();
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCard = new javax.swing.JPanel();
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
        setResizable(false);

        panelCard.setName("panelCard"); // NOI18N
        panelCard.setPreferredSize(new java.awt.Dimension(800, 550));
        panelCard.setLayout(new java.awt.CardLayout());

        menu.setBackground(new java.awt.Color(51, 51, 51));
        menu.setName("menu"); // NOI18N

        panelCard.add(ip, "card4");
        menuInicio.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\casa-icono-silueta.png")); // NOI18N
        menuInicio.setText("Inicio");
        menuInicio.setName("menuInicio"); // NOI18N
        menuInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuInicioMousePressed(evt);
            }
        });
        menu.add(menuInicio);

        panelCard.add(ap, "card5");
        menuAsociacion.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\apreton-de-manos.png")); // NOI18N
        menuAsociacion.setText("Asociacion");
        menuAsociacion.setToolTipText("");
        menuAsociacion.setName("menuAsociacion"); // NOI18N
        menuAsociacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuAsociacionMousePressed(evt);
            }
        });
        menu.add(menuAsociacion);

        panelCard.add(sp, "card6");
        menuSocios.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\personas.png")); // NOI18N
        menuSocios.setText("Socios");
        menuSocios.setName("menuSocios"); // NOI18N
        menuSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuSociosMousePressed(evt);
            }
        });
        menu.add(menuSocios);

        panelCard.add(evp, "card7");
        menuEventos.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\evento.png")); // NOI18N
        menuEventos.setText("Eventos");
        menuEventos.setName("menuEventos"); // NOI18N
        menuEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuEventosMousePressed(evt);
            }
        });
        menu.add(menuEventos);

        panelCard.add(enp, "card8");
        menuEntradas.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\entradas.png")); // NOI18N
        menuEntradas.setText("Entradas");
        menuEntradas.setName("menuEntradas"); // NOI18N
        menuEntradas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuEntradasMousePressed(evt);
            }
        });
        menu.add(menuEntradas);

        menuAyuda.setText("Help me");
        menuAyuda.setName("menuAyuda"); // NOI18N

        submenuCerrarSesion.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\power-button.png")); // NOI18N
        submenuCerrarSesion.setText("Cerrar Sesion");
        submenuCerrarSesion.setName("submenuCerrarSesion"); // NOI18N
        submenuCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                submenuCerrarSesionMousePressed(evt);
            }
        });
        menuAyuda.add(submenuCerrarSesion);

        menu.add(menuAyuda);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCard, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInicioMousePressed
        CardLayout cardLayout = (CardLayout) panelCard.getLayout();
        cardLayout.show(panelCard, "card4");               
    }//GEN-LAST:event_menuInicioMousePressed
    
    private void menuAsociacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAsociacionMousePressed
        CardLayout cardLayout = (CardLayout) panelCard.getLayout();
        cardLayout.show(panelCard, "card5");        
    }//GEN-LAST:event_menuAsociacionMousePressed

    private void menuSociosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSociosMousePressed
        CardLayout cardLayout = (CardLayout) panelCard.getLayout();
        cardLayout.show(panelCard, "card6");
    }//GEN-LAST:event_menuSociosMousePressed

    private void menuEventosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEventosMousePressed
        CardLayout cardLayout = (CardLayout) panelCard.getLayout();
        cardLayout.show(panelCard, "card7"); 
    }//GEN-LAST:event_menuEventosMousePressed

    private void menuEntradasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEntradasMousePressed
        CardLayout cardLayout = (CardLayout) panelCard.getLayout();
        cardLayout.show(panelCard, "card8"); 
    }//GEN-LAST:event_menuEntradasMousePressed

    private void submenuCerrarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submenuCerrarSesionMousePressed
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_submenuCerrarSesionMousePressed
    
    private final inicioPaneL ip;
    private final asociacionPaneL ap;
    private final sociosPanel sp;
    private final eventosPanel evp;
    private final entradasPanel enp;    

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
}