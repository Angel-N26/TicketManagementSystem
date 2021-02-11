package presentacion;

import dominio.ControlMembresia;
import dominio.Membresia;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * @author angel
 **/
public class MembresiaFrame extends javax.swing.JFrame {

    public MembresiaFrame() {
        initComponents();
        cm = new ControlMembresia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder = new javax.swing.JPanel();
        panelSouth = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnAnadir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelCenter = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        listMembresias = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TicketManagementSystem");
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        panelBorder.setBackground(new java.awt.Color(51, 51, 51));
        panelBorder.setName("panelBorder"); // NOI18N
        panelBorder.setPreferredSize(new java.awt.Dimension(400, 400));
        panelBorder.setLayout(new java.awt.BorderLayout());

        panelSouth.setBackground(new java.awt.Color(51, 51, 51));
        panelSouth.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        panelSouth.setName("panelSouth"); // NOI18N

        btnEliminar.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminar.setText("Eliminar membresia");
        btnEliminar.setToolTipText("");
        btnEliminar.setBorder(null);
        btnEliminar.setName("btnEliminar"); // NOI18N
        btnEliminar.setPreferredSize(new java.awt.Dimension(190, 35));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        panelSouth.add(btnEliminar);

        btnAnadir.setBackground(new java.awt.Color(0, 204, 0));
        btnAnadir.setText("Añadir membresia");
        btnAnadir.setBorder(null);
        btnAnadir.setName("btnAnadir"); // NOI18N
        btnAnadir.setPreferredSize(new java.awt.Dimension(190, 35));
        btnAnadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnadirMouseClicked(evt);
            }
        });
        panelSouth.add(btnAnadir);

        panelBorder.add(panelSouth, java.awt.BorderLayout.PAGE_END);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Membresias");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\close-button.png")); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 0, -1, -1));

        panelBorder.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        panelCenter.setBackground(new java.awt.Color(51, 51, 51));
        panelCenter.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        panelCenter.setName("panelCenter"); // NOI18N
        panelCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollPane.setName("scrollPane"); // NOI18N

        modeloLista = new DefaultListModel();
        listMembresias.setModel(modeloLista);
        modeloLista.addAll(0,obtenerMembresias());
        listMembresias.setBackground(new java.awt.Color(102, 102, 102));
        listMembresias.setName("listMembresias"); // NOI18N
        listMembresias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMembresiasMouseClicked(evt);
            }
        });
        scrollPane.setViewportView(listMembresias);

        panelCenter.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 17, 390, 220));

        panelBorder.add(panelCenter, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listMembresiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMembresiasMouseClicked
        if(evt.getClickCount() == 2){
            Membresia mem = cm.obtenerMembresia(listMembresias.getSelectedValue().getId_membresia());
            AnadirMembresia am = new AnadirMembresia(mem);
            am.rellenarCampos();
            am.setVisible(true);
            am.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_listMembresiasMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        actualizarLista();
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Estas seguro que desea elimnar?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            if(cm.eliminarMembresia(listMembresias.getSelectedValue().getId_membresia())){            
                modeloLista.remove(listMembresias.getSelectedIndex());
            }
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnAnadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnadirMouseClicked
        AnadirMembresia am = new AnadirMembresia();
        am.setVisible(true);
        am.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAnadirMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private ArrayList<Membresia> obtenerMembresias(){
        ControlMembresia cmem = new ControlMembresia();
        return cmem.obtenerMembresias();
    }      

    private void actualizarLista(){
        modeloLista.removeAllElements();
        modeloLista.addAll(0, obtenerMembresias());
    }
    
   @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(
                "C:\\Users\\angel\\Documents\\NetBeansProjects\\TicketManagementSystem\\src\\main\\java\\recursos/logo(2).png");
        return retValue;
    }    
    
    private final ControlMembresia cm;    
    private DefaultListModel modeloLista;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JList<Membresia> listMembresias;
    private javax.swing.JPanel panelBorder;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelSouth;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}