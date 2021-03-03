package presentacion;

/**
 * @author angel
 **/
public class EstadisticasPanel extends javax.swing.JPanel {

    public EstadisticasPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelCenter = new javax.swing.JPanel();
        panelEntradas = new javax.swing.JPanel();
        sepEntradas = new javax.swing.JSeparator();
        lblEntradas = new javax.swing.JLabel();
        panelSocios = new javax.swing.JPanel();
        sepSocios = new javax.swing.JSeparator();
        lblSocios = new javax.swing.JLabel();
        panelEventos = new javax.swing.JPanel();
        sepEventos = new javax.swing.JSeparator();
        lblEventos = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(800, 550));
        setLayout(new java.awt.BorderLayout());

        panelCenter.setBackground(new java.awt.Color(51, 51, 51));
        panelCenter.setName("panelCenter"); // NOI18N
        panelCenter.setLayout(new java.awt.GridBagLayout());

        panelEntradas.setBackground(new java.awt.Color(102, 102, 102));
        panelEntradas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelEntradas.setName("panelEntradas"); // NOI18N
        panelEntradas.setPreferredSize(new java.awt.Dimension(370, 510));
        panelEntradas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sepEntradas.setBackground(new java.awt.Color(204, 0, 204));
        sepEntradas.setForeground(new java.awt.Color(204, 0, 204));
        sepEntradas.setName("sepEntradas"); // NOI18N
        sepEntradas.setPreferredSize(new java.awt.Dimension(350, 10));
        panelEntradas.add(sepEntradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        lblEntradas.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblEntradas.setForeground(new java.awt.Color(255, 255, 255));
        lblEntradas.setText("Entradas");
        lblEntradas.setName("lblEntradas"); // NOI18N
        lblEntradas.setPreferredSize(new java.awt.Dimension(34, 20));
        panelEntradas.add(lblEntradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 280;
        gridBagConstraints.ipady = 469;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 0);
        panelCenter.add(panelEntradas, gridBagConstraints);

        panelSocios.setBackground(new java.awt.Color(102, 102, 102));
        panelSocios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelSocios.setName("panelSocios"); // NOI18N
        panelSocios.setPreferredSize(new java.awt.Dimension(370, 180));
        panelSocios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sepSocios.setBackground(new java.awt.Color(204, 0, 204));
        sepSocios.setForeground(new java.awt.Color(204, 0, 204));
        sepSocios.setName("sepSocios"); // NOI18N
        sepSocios.setPreferredSize(new java.awt.Dimension(350, 10));
        panelSocios.add(sepSocios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        lblSocios.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblSocios.setForeground(new java.awt.Color(255, 255, 255));
        lblSocios.setText("Socios");
        lblSocios.setName("lblSocios"); // NOI18N
        lblSocios.setPreferredSize(new java.awt.Dimension(34, 20));
        panelSocios.add(lblSocios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 280;
        gridBagConstraints.ipady = 139;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 20);
        panelCenter.add(panelSocios, gridBagConstraints);

        panelEventos.setBackground(new java.awt.Color(102, 102, 102));
        panelEventos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelEventos.setName("panelEventos"); // NOI18N
        panelEventos.setPreferredSize(new java.awt.Dimension(370, 310));
        panelEventos.setRequestFocusEnabled(false);
        panelEventos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sepEventos.setBackground(new java.awt.Color(204, 0, 204));
        sepEventos.setForeground(new java.awt.Color(204, 0, 204));
        sepEventos.setName("sepEventos"); // NOI18N
        sepEventos.setPreferredSize(new java.awt.Dimension(350, 10));
        panelEventos.add(sepEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        lblEventos.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblEventos.setForeground(new java.awt.Color(255, 255, 255));
        lblEventos.setText("Eventos");
        lblEventos.setName("lblEventos"); // NOI18N
        lblEventos.setPreferredSize(new java.awt.Dimension(34, 20));
        panelEventos.add(lblEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 280;
        gridBagConstraints.ipady = 269;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        panelCenter.add(panelEventos, gridBagConstraints);

        add(panelCenter, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblEntradas;
    private javax.swing.JLabel lblEventos;
    private javax.swing.JLabel lblSocios;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelEntradas;
    private javax.swing.JPanel panelEventos;
    private javax.swing.JPanel panelSocios;
    private javax.swing.JSeparator sepEntradas;
    private javax.swing.JSeparator sepEventos;
    private javax.swing.JSeparator sepSocios;
    // End of variables declaration//GEN-END:variables
}