/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

/**
 *
 * @author angel
 */
public class EventosPanel extends javax.swing.JPanel {

    /**
     * Creates new form EventosPanel
     */
    public EventosPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();

        setPreferredSize(new java.awt.Dimension(800, 550));
        setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        jTextField10.setBackground(new java.awt.Color(102, 102, 102));
        jTextField10.setText("Buscar...");
        jTextField10.setToolTipText("");
        jTextField10.setPreferredSize(new java.awt.Dimension(170, 35));
        jPanel12.add(jTextField10);

        jButton5.setText("Buscar");
        jButton5.setBorder(null);
        jButton5.setPreferredSize(new java.awt.Dimension(65, 35));
        jPanel12.add(jButton5);

        add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        jButton6.setBackground(new java.awt.Color(204, 0, 204));
        jButton6.setText("Añadir");
        jButton6.setBorder(null);
        jButton6.setPreferredSize(new java.awt.Dimension(170, 35));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jPanel13.add(jButton6);

        jButton7.setBackground(new java.awt.Color(204, 0, 204));
        jButton7.setText("Eliminar");
        jButton7.setBorder(null);
        jButton7.setPreferredSize(new java.awt.Dimension(170, 35));
        jPanel13.add(jButton7);

        add(jPanel13, java.awt.BorderLayout.PAGE_END);

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));

        jList4.setBackground(new java.awt.Color(102, 102, 102));
        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList4);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );

        add(jPanel14, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        Evento evento = new Evento();
        //evento.setExtendedState(MAXIMIZED_BOTH);
        evento.setVisible(true);
        //dispose();

    }//GEN-LAST:event_jButton6MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JList<String> jList4;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField10;
    // End of variables declaration//GEN-END:variables
}
