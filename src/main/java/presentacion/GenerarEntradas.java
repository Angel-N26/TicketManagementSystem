package presentacion;

import dominio.Evento;

/**
 * @author angel
 **/
public class GenerarEntradas extends javax.swing.JFrame {

    public GenerarEntradas(Evento evento) {
        this.evento = evento;
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
        lblPregunta = new javax.swing.JLabel();
        spNumEntradas = new javax.swing.JSpinner();
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

        panel.setBackground(new java.awt.Color(51, 51, 51));
        panel.setName("panel"); // NOI18N
        panel.setLayout(new java.awt.BorderLayout());

        panelNorth.setBackground(new java.awt.Color(51, 51, 51));
        panelNorth.setName("panelNorth"); // NOI18N
        panelNorth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        lblPregunta.setForeground(new java.awt.Color(255, 255, 255));
        lblPregunta.setText("¿Cuantas entradas quieres generar?");
        lblPregunta.setName("lblPregunta"); // NOI18N
        panelNorth.add(lblPregunta);

        spNumEntradas.setName("spNumEntradas"); // NOI18N
        spNumEntradas.setPreferredSize(new java.awt.Dimension(50, 25));
        panelNorth.add(spNumEntradas);

        panel.add(panelNorth, java.awt.BorderLayout.PAGE_START);

        panelSouth.setBackground(new java.awt.Color(51, 51, 51));
        panelSouth.setName("panelSouth"); // NOI18N

        btnGenerarEntradas.setBackground(new java.awt.Color(255, 204, 0));
        btnGenerarEntradas.setText("Generar Entradas");
        btnGenerarEntradas.setBorder(null);
        btnGenerarEntradas.setName("btnGenerarEntradas"); // NOI18N
        btnGenerarEntradas.setPreferredSize(new java.awt.Dimension(180, 35));
        panelSouth.add(btnGenerarEntradas);

        panel.add(panelSouth, java.awt.BorderLayout.PAGE_END);

        panelCenter.setBackground(new java.awt.Color(51, 51, 51));
        panelCenter.setName("panelCenter"); // NOI18N
        panelCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSocios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSocios.setForeground(new java.awt.Color(255, 255, 255));
        lblSocios.setText("SOCIOS");
        lblSocios.setName("lblSocios"); // NOI18N
        panelCenter.add(lblSocios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(200, 270));

        jList1.setBackground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(jList1);

        panelCenter.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 270));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(200, 270));

        jList2.setBackground(new java.awt.Color(102, 102, 102));
        jScrollPane2.setViewportView(jList2);

        panelCenter.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 0, 204));
        jButton2.setText(">>");
        jButton2.setBorder(null);
        jButton2.setPreferredSize(new java.awt.Dimension(30, 40));
        panelCenter.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 60, -1));

        panel.add(panelCenter, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Evento evento;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarEntradas;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblSocios;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelNorth;
    private javax.swing.JPanel panelSouth;
    private javax.swing.JSpinner spNumEntradas;
    // End of variables declaration//GEN-END:variables
}