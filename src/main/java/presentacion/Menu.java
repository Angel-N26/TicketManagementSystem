package presentacion;

import java.awt.CardLayout;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import static java.awt.Frame.NORMAL;
import java.awt.GraphicsEnvironment;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import keeptoo.KButton;

/**
 * @author angel
 **/
public class Menu extends javax.swing.JFrame {

    public Menu() {
        ap = new AsociacionPanel();
        sp = new SociosPanel();
        evp = new EventosPanel();
        enp = new EntradasPanel();
        ip = new InicioPanel();
        editSP = new EditSocioPanel();
        editEP = new EditEventoPanel();
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        kButton3 = new keeptoo.KButton();
        jPanel4 = new javax.swing.JPanel();
        kButton4 = new keeptoo.KButton();
        jPanel5 = new javax.swing.JPanel();
        kButton5 = new keeptoo.KButton();
        kButton6 = new keeptoo.KButton();
        jPanel6 = new javax.swing.JPanel();
        kButton11 = new keeptoo.KButton();
        kButton7 = new keeptoo.KButton();
        kButton8 = new keeptoo.KButton();
        kButton9 = new keeptoo.KButton();
        kButton10 = new keeptoo.KButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 550));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(255, 255, 255)));
        jPanel2.setMaximumSize(new java.awt.Dimension(200, 32767));
        jPanel2.setMinimumSize(new java.awt.Dimension(200, 520));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 520));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        kButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(204, 0, 204)));
        kButton3.setText("Asociacion  ");
        kButton3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        kButton3.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        kButton3.setkBorderRadius(0);
        kButton3.setkEndColor(new java.awt.Color(51, 51, 51));
        kButton3.setkHoverEndColor(new java.awt.Color(31, 31, 31));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverStartColor(new java.awt.Color(31, 31, 31));
        kButton3.setkPressedColor(new java.awt.Color(102, 0, 102));
        kButton3.setkSelectedColor(new java.awt.Color(51, 51, 51));
        kButton3.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton3.setPreferredSize(new java.awt.Dimension(190, 40));
        kButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton3MouseClicked(evt);
            }
        });
        jPanel2.add(kButton3);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setPreferredSize(new java.awt.Dimension(30, 40));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4);

        kButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(153, 153, 153)));
        kButton4.setText("            Junta Directiva");
        kButton4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        kButton4.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        kButton4.setkBorderRadius(0);
        kButton4.setkEndColor(new java.awt.Color(51, 51, 51));
        kButton4.setkForeGround(new java.awt.Color(153, 153, 153));
        kButton4.setkHoverEndColor(new java.awt.Color(31, 31, 31));
        kButton4.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton4.setkHoverStartColor(new java.awt.Color(31, 31, 31));
        kButton4.setkPressedColor(new java.awt.Color(102, 0, 102));
        kButton4.setkSelectedColor(new java.awt.Color(51, 51, 51));
        kButton4.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton4.setPreferredSize(new java.awt.Dimension(150, 40));
        kButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton4MouseClicked(evt);
            }
        });
        jPanel2.add(kButton4);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setPreferredSize(new java.awt.Dimension(30, 40));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5);

        kButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(153, 153, 153)));
        kButton5.setText("    Membresia");
        kButton5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        kButton5.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        kButton5.setkBorderRadius(0);
        kButton5.setkEndColor(new java.awt.Color(51, 51, 51));
        kButton5.setkForeGround(new java.awt.Color(153, 153, 153));
        kButton5.setkHoverEndColor(new java.awt.Color(31, 31, 31));
        kButton5.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton5.setkHoverStartColor(new java.awt.Color(31, 31, 31));
        kButton5.setkPressedColor(new java.awt.Color(102, 0, 102));
        kButton5.setkSelectedColor(new java.awt.Color(51, 51, 51));
        kButton5.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton5.setPreferredSize(new java.awt.Dimension(150, 40));
        kButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton5MouseClicked(evt);
            }
        });
        jPanel2.add(kButton5);

        kButton6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(153, 153, 153)));
        kButton6.setText("Socios      ");
        kButton6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        kButton6.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        kButton6.setkBorderRadius(0);
        kButton6.setkEndColor(new java.awt.Color(51, 51, 51));
        kButton6.setkForeGround(new java.awt.Color(153, 153, 153));
        kButton6.setkHoverEndColor(new java.awt.Color(31, 31, 31));
        kButton6.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton6.setkHoverStartColor(new java.awt.Color(31, 31, 31));
        kButton6.setkPressedColor(new java.awt.Color(102, 0, 102));
        kButton6.setkSelectedColor(new java.awt.Color(51, 51, 51));
        kButton6.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton6.setPreferredSize(new java.awt.Dimension(190, 40));
        kButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton6MouseClicked(evt);
            }
        });
        jPanel2.add(kButton6);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setPreferredSize(new java.awt.Dimension(30, 40));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6);

        jPanel6.setVisible(false);
        kButton11.setVisible(false);
        kButton11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(153, 153, 153)));
        kButton11.setText("Cargar Socios");
        kButton11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        kButton11.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        kButton11.setkBorderRadius(0);
        kButton11.setkEndColor(new java.awt.Color(51, 51, 51));
        kButton11.setkForeGround(new java.awt.Color(153, 153, 153));
        kButton11.setkHoverEndColor(new java.awt.Color(31, 31, 31));
        kButton11.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton11.setkHoverStartColor(new java.awt.Color(31, 31, 31));
        kButton11.setkPressedColor(new java.awt.Color(102, 0, 102));
        kButton11.setkSelectedColor(new java.awt.Color(51, 51, 51));
        kButton11.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton11.setPreferredSize(new java.awt.Dimension(150, 40));
        kButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton11MouseClicked(evt);
            }
        });
        jPanel2.add(kButton11);

        kButton7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(153, 153, 153)));
        kButton7.setText("Eventos     ");
        kButton7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        kButton7.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        kButton7.setkBorderRadius(0);
        kButton7.setkEndColor(new java.awt.Color(51, 51, 51));
        kButton7.setkForeGround(new java.awt.Color(153, 153, 153));
        kButton7.setkHoverEndColor(new java.awt.Color(31, 31, 31));
        kButton7.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton7.setkHoverStartColor(new java.awt.Color(31, 31, 31));
        kButton7.setkPressedColor(new java.awt.Color(102, 0, 102));
        kButton7.setkSelectedColor(new java.awt.Color(51, 51, 51));
        kButton7.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton7.setPreferredSize(new java.awt.Dimension(190, 40));
        kButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton7MouseClicked(evt);
            }
        });
        jPanel2.add(kButton7);

        kButton8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(153, 153, 153)));
        kButton8.setText("Entradas    ");
        kButton8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        kButton8.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        kButton8.setkBorderRadius(0);
        kButton8.setkEndColor(new java.awt.Color(51, 51, 51));
        kButton8.setkForeGround(new java.awt.Color(153, 153, 153));
        kButton8.setkHoverEndColor(new java.awt.Color(31, 31, 31));
        kButton8.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton8.setkHoverStartColor(new java.awt.Color(31, 31, 31));
        kButton8.setkPressedColor(new java.awt.Color(102, 0, 102));
        kButton8.setkSelectedColor(new java.awt.Color(51, 51, 51));
        kButton8.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton8.setPreferredSize(new java.awt.Dimension(190, 40));
        kButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton8MouseClicked(evt);
            }
        });
        jPanel2.add(kButton8);

        kButton9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(153, 153, 153)));
        kButton9.setText("Estadisticas");
        kButton9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        kButton9.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        kButton9.setkBorderRadius(0);
        kButton9.setkEndColor(new java.awt.Color(51, 51, 51));
        kButton9.setkForeGround(new java.awt.Color(153, 153, 153));
        kButton9.setkHoverEndColor(new java.awt.Color(31, 31, 31));
        kButton9.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton9.setkHoverStartColor(new java.awt.Color(31, 31, 31));
        kButton9.setkPressedColor(new java.awt.Color(102, 0, 102));
        kButton9.setkSelectedColor(new java.awt.Color(51, 51, 51));
        kButton9.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton9.setPreferredSize(new java.awt.Dimension(190, 40));
        kButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton9MouseClicked(evt);
            }
        });
        jPanel2.add(kButton9);

        kButton10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(153, 153, 153)));
        kButton10.setText("CerrarSesion");
        kButton10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        kButton10.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        kButton10.setkBorderRadius(0);
        kButton10.setkEndColor(new java.awt.Color(51, 51, 51));
        kButton10.setkForeGround(new java.awt.Color(153, 153, 153));
        kButton10.setkHoverEndColor(new java.awt.Color(31, 31, 31));
        kButton10.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton10.setkHoverStartColor(new java.awt.Color(31, 31, 31));
        kButton10.setkPressedColor(new java.awt.Color(102, 0, 102));
        kButton10.setkSelectedColor(new java.awt.Color(51, 51, 51));
        kButton10.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton10.setPreferredSize(new java.awt.Dimension(190, 40));
        kButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton10MouseClicked(evt);
            }
        });
        jPanel2.add(kButton10);

        jPanel1.add(jPanel2, java.awt.BorderLayout.WEST);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(1000, 40));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\close-button.png")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(975, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\logo(1).png")); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TicketManagementSystem");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 9, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\maximize-window.png")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\minimizar.png")); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, -1, -1));

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel7.setPreferredSize(new java.awt.Dimension(800, 550));
        jPanel7.setLayout(new java.awt.CardLayout());
        jPanel1.add(jPanel7, java.awt.BorderLayout.CENTER);
        jPanel7.add(ap, "cardAs");
        jPanel7.add(sp, "cardSo");
        jPanel7.add(evp, "cardEv");
        jPanel7.add(enp, "cardEn");
        jPanel7.add(ip, "cardEs");
        jPanel7.add(editSP, "cardEditSP");
        jPanel7.add(editEP, "cardEditEP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\close-button-red.png"));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\close-button.png"));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if(!maximized){
            setExtendedState(MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            setMaximizedBounds(env.getMaximumWindowBounds());
            maximized = true;            
        }else{
            setExtendedState(NORMAL);
            maximized = false;            
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jLabel4.setIcon(new ImageIcon("C:\\Users\\angel\\Downloads\\maximize-window-purple.png"));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setIcon(new ImageIcon("C:\\Users\\angel\\Downloads\\maximize-window.png"));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setIcon(new ImageIcon("C:\\Users\\angel\\Downloads\\minimizar-purple.png"));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setIcon(new ImageIcon("C:\\Users\\angel\\Downloads\\minimizar.png"));
    }//GEN-LAST:event_jLabel5MouseExited

    private void kButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton3MouseClicked
        CardLayout cardLayout = (CardLayout) jPanel7.getLayout();
        cardLayout.show(jPanel7, "cardAs");
        
        no_selected(kButton6);
        no_selected(kButton7);
        no_selected(kButton8);
        no_selected(kButton9);
        
        jPanel4.setVisible(true);
        jPanel5.setVisible(true);
        kButton4.setVisible(true);
        kButton5.setVisible(true);
        
        jPanel6.setVisible(false);
        kButton11.setVisible(false);
        
        selected(kButton3);
    }//GEN-LAST:event_kButton3MouseClicked

    private void kButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton4MouseClicked
        kButton3.setSelected(true);
        
        selected(kButton4);
        
        jd = new JuntaDirectiva();
        jd.setVisible(true);
        jd.setLocationRelativeTo(null);       
    }//GEN-LAST:event_kButton4MouseClicked

    private void kButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton5MouseClicked
        kButton3.setSelected(true);
        
        selected(kButton5);
        
        mem = new MembresiaFrame();
        mem.setVisible(true);
        mem.setLocationRelativeTo(null);
    }//GEN-LAST:event_kButton5MouseClicked

    private void kButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton6MouseClicked
        CardLayout cardLayout = (CardLayout) jPanel7.getLayout();
        cardLayout.show(jPanel7, "cardSo");
        
        no_selected(kButton3);
        no_selected(kButton7);
        no_selected(kButton8);
        no_selected(kButton9);
        
        invisible();        
        
        jPanel6.setVisible(true);
        kButton11.setVisible(true);
        
        selected(kButton6);
    }//GEN-LAST:event_kButton6MouseClicked

    private void kButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton7MouseClicked
        CardLayout cardLayout = (CardLayout) jPanel7.getLayout();
        cardLayout.show(jPanel7, "cardEv");
        
        no_selected(kButton3);
        no_selected(kButton6);
        no_selected(kButton8);
        no_selected(kButton9);
        
        invisible();
        jPanel6.setVisible(false);
        kButton11.setVisible(false);
        
        selected(kButton7);
    }//GEN-LAST:event_kButton7MouseClicked

    private void kButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton8MouseClicked
        CardLayout cardLayout = (CardLayout) jPanel7.getLayout();
        cardLayout.show(jPanel7, "cardEn");
        
        no_selected(kButton3);
        no_selected(kButton6);
        no_selected(kButton7);
        no_selected(kButton9);
        
        invisible();
        jPanel6.setVisible(false);
        kButton11.setVisible(false);
        
        selected(kButton8);
    }//GEN-LAST:event_kButton8MouseClicked

    private void kButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton9MouseClicked
        CardLayout cardLayout = (CardLayout) jPanel7.getLayout();
        cardLayout.show(jPanel7, "cardEs");
                
        no_selected(kButton3);
        no_selected(kButton6);
        no_selected(kButton7);
        no_selected(kButton8);
        
        invisible();
        jPanel6.setVisible(false);
        kButton11.setVisible(false);
        
        selected(kButton9);
    }//GEN-LAST:event_kButton9MouseClicked

    private void kButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton10MouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "¿Quiere cerrar sesion?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            Login login = new Login();
            login.setVisible(true);
            login.setLocationRelativeTo(null);
            dispose();
        }        
    }//GEN-LAST:event_kButton10MouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        enp.actualizarListaEntradas();
        
        no_selected(kButton4);
        no_selected(kButton5);
        no_selected(kButton11);
        
        if(mem != null){
            mem.dispose();
        }
        if(jd != null){
            jd.dispose();
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void kButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton11MouseClicked
        kButton6.setSelected(true);
        
        selected(kButton11);
        
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV Files","csv");
        fc.setFileFilter(filter);
        
        int seleccion = fc.showOpenDialog(this);
        if(seleccion == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile();
        }
    }//GEN-LAST:event_kButton11MouseClicked
       
    private void no_selected(KButton btn){        
        btn.setSelected(false);
        btn.setkForeGround(new Color(153,153,153));
        btn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new Color(153, 153, 153)));
    }
    
    private void selected(KButton btn){
        btn.setSelected(true);
        btn.setkForeGround(new Color(255,255,255));
        btn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new Color(204, 0, 204)));
    }
    
    private void invisible(){
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        kButton4.setVisible(false);
        kButton5.setVisible(false);
    }                  
    
    private boolean maximized = false;
    private int xx;
    private int xy;
    
    private final InicioPanel ip;
    private final AsociacionPanel ap;
    private final SociosPanel sp;
    private final EventosPanel evp;
    private final EntradasPanel enp;   
    
    private final EditSocioPanel editSP;
    private final EditEventoPanel editEP;
    
    private MembresiaFrame mem;
    private JuntaDirectiva jd;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private keeptoo.KButton kButton10;
    private keeptoo.KButton kButton11;
    private keeptoo.KButton kButton3;
    private keeptoo.KButton kButton4;
    private keeptoo.KButton kButton5;
    private keeptoo.KButton kButton6;
    private keeptoo.KButton kButton7;
    private keeptoo.KButton kButton8;
    private keeptoo.KButton kButton9;
    // End of variables declaration//GEN-END:variables
}
