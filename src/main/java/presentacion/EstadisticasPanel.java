package presentacion;

import dominio.Asociacion;
import dominio.ControlEntradas;
import dominio.ControlEvento;
import dominio.ControlSocio;
import dominio.Entrada;
import dominio.Evento;
import dominio.Socio;
import java.awt.Image;
import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 * @author angel
 **/
public class EstadisticasPanel extends javax.swing.JPanel {

    public EstadisticasPanel(Asociacion asociacion, Connection con) {
        this.asociacion = asociacion;
        
        initComponents();
        
        this.cs = new ControlSocio(con);
        this.cev = new ControlEvento(con);
        this.cen = new ControlEntradas(con);
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNorth = new javax.swing.JPanel();
        panelEast = new javax.swing.JPanel();
        panelWest = new javax.swing.JPanel();
        panelSouth = new javax.swing.JPanel();
        panelCenter = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(800, 550));
        setLayout(new java.awt.BorderLayout());

        panelNorth.setBackground(new java.awt.Color(51, 51, 51));
        panelNorth.setPreferredSize(new java.awt.Dimension(100, 20));
        add(panelNorth, java.awt.BorderLayout.NORTH);

        panelEast.setBackground(new java.awt.Color(51, 51, 51));
        panelEast.setPreferredSize(new java.awt.Dimension(20, 100));
        add(panelEast, java.awt.BorderLayout.EAST);

        panelWest.setBackground(new java.awt.Color(51, 51, 51));
        panelWest.setPreferredSize(new java.awt.Dimension(20, 100));
        add(panelWest, java.awt.BorderLayout.WEST);

        panelSouth.setBackground(new java.awt.Color(51, 51, 51));
        panelSouth.setPreferredSize(new java.awt.Dimension(100, 20));
        add(panelSouth, java.awt.BorderLayout.SOUTH);

        panelCenter.setBackground(new java.awt.Color(51, 51, 51));
        panelCenter.setMinimumSize(new java.awt.Dimension(760, 510));
        panelCenter.setName("panelCenter"); // NOI18N
        panelCenter.setPreferredSize(new java.awt.Dimension(760, 510));
        panelCenter.setLayout(new java.awt.GridLayout(4, 4, 20, 20));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMinimumSize(new java.awt.Dimension(370, 94));
        jPanel1.setPreferredSize(new java.awt.Dimension(370, 94));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jPanel5, java.awt.BorderLayout.WEST);

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jPanel6, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Socios totales: 25");
        jPanel2.add(jLabel11);

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparator1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Eventos totales: 2");
        jPanel2.add(jLabel1);

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparator2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Entradas totales: 100");
        jPanel2.add(jLabel3);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        panelCenter.add(jPanel1);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setMinimumSize(new java.awt.Dimension(370, 101));
        jPanel3.setName(""); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(370, 101));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel13.setBackground(new java.awt.Color(102, 102, 102));
        jPanel13.setMinimumSize(new java.awt.Dimension(370, 32));
        jPanel13.setPreferredSize(new java.awt.Dimension(370, 32));
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Próximo evento");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 0, 204)));
        jPanel13.add(jLabel4);

        jPanel3.add(jPanel13, java.awt.BorderLayout.PAGE_START);

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.add(jPanel10, java.awt.BorderLayout.LINE_END);

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.add(jPanel9, java.awt.BorderLayout.WEST);

        jPanel11.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.add(jPanel11, java.awt.BorderLayout.PAGE_END);

        jPanel15.setBackground(new java.awt.Color(102, 102, 102));
        jPanel15.setMinimumSize(new java.awt.Dimension(370, 80));
        jPanel15.setPreferredSize(new java.awt.Dimension(370, 80));
        jPanel15.setLayout(new javax.swing.BoxLayout(jPanel15, javax.swing.BoxLayout.X_AXIS));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Alterna");
        jLabel2.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel2.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel2.setPreferredSize(new java.awt.Dimension(60, 14));
        jPanel15.add(jLabel2);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fecha: 10/12/2021");
        jLabel12.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel12.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel12.setName(""); // NOI18N
        jLabel12.setPreferredSize(new java.awt.Dimension(100, 14));
        jPanel15.add(jLabel12);

        jPanel3.add(jPanel15, java.awt.BorderLayout.CENTER);

        panelCenter.add(jPanel3);

        jPanel50.setBackground(new java.awt.Color(102, 102, 102));
        jPanel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel50.setMinimumSize(new java.awt.Dimension(370, 101));
        jPanel50.setName(""); // NOI18N
        jPanel50.setPreferredSize(new java.awt.Dimension(370, 101));
        jPanel50.setLayout(new java.awt.BorderLayout());

        jPanel51.setBackground(new java.awt.Color(102, 102, 102));
        jPanel51.setMinimumSize(new java.awt.Dimension(370, 32));
        jPanel51.setPreferredSize(new java.awt.Dimension(370, 32));
        jPanel51.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Socio más antiguo");
        jLabel28.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 0, 204)));
        jPanel51.add(jLabel28);

        jPanel50.add(jPanel51, java.awt.BorderLayout.PAGE_START);

        jPanel52.setBackground(new java.awt.Color(102, 102, 102));
        jPanel50.add(jPanel52, java.awt.BorderLayout.LINE_END);

        jPanel53.setBackground(new java.awt.Color(102, 102, 102));
        jPanel50.add(jPanel53, java.awt.BorderLayout.WEST);

        jPanel54.setBackground(new java.awt.Color(102, 102, 102));
        jPanel50.add(jPanel54, java.awt.BorderLayout.PAGE_END);

        jPanel55.setBackground(new java.awt.Color(102, 102, 102));
        jPanel55.setMinimumSize(new java.awt.Dimension(370, 80));
        jPanel55.setPreferredSize(new java.awt.Dimension(370, 80));
        jPanel55.setLayout(new javax.swing.BoxLayout(jPanel55, javax.swing.BoxLayout.X_AXIS));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Angel");
        jLabel29.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel29.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel29.setPreferredSize(new java.awt.Dimension(60, 14));
        jPanel55.add(jLabel29);

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Fecha: 10/12/2021");
        jLabel30.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel30.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel30.setName(""); // NOI18N
        jLabel30.setPreferredSize(new java.awt.Dimension(100, 14));
        jPanel55.add(jLabel30);

        jPanel50.add(jPanel55, java.awt.BorderLayout.CENTER);

        panelCenter.add(jPanel50);

        jPanel43.setBackground(new java.awt.Color(102, 102, 102));
        jPanel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel43.setMinimumSize(new java.awt.Dimension(370, 101));
        jPanel43.setName(""); // NOI18N
        jPanel43.setPreferredSize(new java.awt.Dimension(370, 101));
        jPanel43.setLayout(new java.awt.BorderLayout());

        jPanel44.setBackground(new java.awt.Color(102, 102, 102));
        jPanel44.setMinimumSize(new java.awt.Dimension(370, 32));
        jPanel44.setPreferredSize(new java.awt.Dimension(370, 32));
        jPanel44.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Evento más entradas");
        jLabel25.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 0, 204)));
        jPanel44.add(jLabel25);

        jPanel43.add(jPanel44, java.awt.BorderLayout.PAGE_START);

        jPanel45.setBackground(new java.awt.Color(102, 102, 102));
        jPanel43.add(jPanel45, java.awt.BorderLayout.LINE_END);

        jPanel46.setBackground(new java.awt.Color(102, 102, 102));
        jPanel43.add(jPanel46, java.awt.BorderLayout.WEST);

        jPanel47.setBackground(new java.awt.Color(102, 102, 102));
        jPanel43.add(jPanel47, java.awt.BorderLayout.PAGE_END);

        jPanel48.setBackground(new java.awt.Color(102, 102, 102));
        jPanel48.setMinimumSize(new java.awt.Dimension(370, 80));
        jPanel48.setPreferredSize(new java.awt.Dimension(370, 80));
        jPanel48.setLayout(new javax.swing.BoxLayout(jPanel48, javax.swing.BoxLayout.X_AXIS));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Alterna");
        jLabel26.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel26.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel26.setPreferredSize(new java.awt.Dimension(60, 14));
        jPanel48.add(jLabel26);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Entradas: 100");
        jLabel27.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel27.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel27.setName(""); // NOI18N
        jLabel27.setPreferredSize(new java.awt.Dimension(100, 14));
        jPanel48.add(jLabel27);

        jPanel43.add(jPanel48, java.awt.BorderLayout.CENTER);

        panelCenter.add(jPanel43);

        jPanel36.setBackground(new java.awt.Color(102, 102, 102));
        jPanel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel36.setMinimumSize(new java.awt.Dimension(370, 101));
        jPanel36.setName(""); // NOI18N
        jPanel36.setPreferredSize(new java.awt.Dimension(370, 101));
        jPanel36.setLayout(new java.awt.BorderLayout());

        jPanel37.setBackground(new java.awt.Color(102, 102, 102));
        jPanel37.setMinimumSize(new java.awt.Dimension(370, 32));
        jPanel37.setPreferredSize(new java.awt.Dimension(370, 32));
        jPanel37.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Socio más nuevo");
        jLabel22.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 0, 204)));
        jPanel37.add(jLabel22);

        jPanel36.add(jPanel37, java.awt.BorderLayout.PAGE_START);

        jPanel38.setBackground(new java.awt.Color(102, 102, 102));
        jPanel36.add(jPanel38, java.awt.BorderLayout.LINE_END);

        jPanel39.setBackground(new java.awt.Color(102, 102, 102));
        jPanel36.add(jPanel39, java.awt.BorderLayout.WEST);

        jPanel40.setBackground(new java.awt.Color(102, 102, 102));
        jPanel36.add(jPanel40, java.awt.BorderLayout.PAGE_END);

        jPanel41.setBackground(new java.awt.Color(102, 102, 102));
        jPanel41.setMinimumSize(new java.awt.Dimension(370, 80));
        jPanel41.setPreferredSize(new java.awt.Dimension(370, 80));
        jPanel41.setLayout(new javax.swing.BoxLayout(jPanel41, javax.swing.BoxLayout.X_AXIS));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Angel");
        jLabel23.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel23.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel23.setPreferredSize(new java.awt.Dimension(60, 14));
        jPanel41.add(jLabel23);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Fecha: 10/12/2021");
        jLabel24.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel24.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel24.setName(""); // NOI18N
        jLabel24.setPreferredSize(new java.awt.Dimension(100, 14));
        jPanel41.add(jLabel24);

        jPanel36.add(jPanel41, java.awt.BorderLayout.CENTER);

        panelCenter.add(jPanel36);

        jPanel29.setBackground(new java.awt.Color(102, 102, 102));
        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel29.setMinimumSize(new java.awt.Dimension(370, 101));
        jPanel29.setName(""); // NOI18N
        jPanel29.setPreferredSize(new java.awt.Dimension(370, 101));
        jPanel29.setLayout(new java.awt.BorderLayout());

        jPanel30.setBackground(new java.awt.Color(102, 102, 102));
        jPanel30.setMinimumSize(new java.awt.Dimension(370, 32));
        jPanel30.setPreferredSize(new java.awt.Dimension(370, 32));
        jPanel30.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Evento menos entradas");
        jLabel19.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 0, 204)));
        jPanel30.add(jLabel19);

        jPanel29.add(jPanel30, java.awt.BorderLayout.PAGE_START);

        jPanel31.setBackground(new java.awt.Color(102, 102, 102));
        jPanel29.add(jPanel31, java.awt.BorderLayout.LINE_END);

        jPanel32.setBackground(new java.awt.Color(102, 102, 102));
        jPanel29.add(jPanel32, java.awt.BorderLayout.WEST);

        jPanel33.setBackground(new java.awt.Color(102, 102, 102));
        jPanel29.add(jPanel33, java.awt.BorderLayout.PAGE_END);

        jPanel34.setBackground(new java.awt.Color(102, 102, 102));
        jPanel34.setMinimumSize(new java.awt.Dimension(370, 80));
        jPanel34.setPreferredSize(new java.awt.Dimension(370, 80));
        jPanel34.setLayout(new javax.swing.BoxLayout(jPanel34, javax.swing.BoxLayout.X_AXIS));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Alterna");
        jLabel20.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel20.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel20.setPreferredSize(new java.awt.Dimension(60, 14));
        jPanel34.add(jLabel20);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Entradas: 10");
        jLabel21.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel21.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel21.setName(""); // NOI18N
        jLabel21.setPreferredSize(new java.awt.Dimension(100, 14));
        jPanel34.add(jLabel21);

        jPanel29.add(jPanel34, java.awt.BorderLayout.CENTER);

        panelCenter.add(jPanel29);

        jPanel22.setBackground(new java.awt.Color(102, 102, 102));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel22.setMinimumSize(new java.awt.Dimension(370, 101));
        jPanel22.setName(""); // NOI18N
        jPanel22.setPreferredSize(new java.awt.Dimension(370, 101));
        jPanel22.setLayout(new java.awt.BorderLayout());

        jPanel23.setBackground(new java.awt.Color(102, 102, 102));
        jPanel23.setMinimumSize(new java.awt.Dimension(370, 32));
        jPanel23.setPreferredSize(new java.awt.Dimension(370, 32));
        jPanel23.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Último Evento");
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 0, 204)));
        jPanel23.add(jLabel16);

        jPanel22.add(jPanel23, java.awt.BorderLayout.PAGE_START);

        jPanel24.setBackground(new java.awt.Color(102, 102, 102));
        jPanel22.add(jPanel24, java.awt.BorderLayout.LINE_END);

        jPanel25.setBackground(new java.awt.Color(102, 102, 102));
        jPanel22.add(jPanel25, java.awt.BorderLayout.WEST);

        jPanel26.setBackground(new java.awt.Color(102, 102, 102));
        jPanel22.add(jPanel26, java.awt.BorderLayout.PAGE_END);

        jPanel27.setBackground(new java.awt.Color(102, 102, 102));
        jPanel27.setMinimumSize(new java.awt.Dimension(370, 80));
        jPanel27.setPreferredSize(new java.awt.Dimension(370, 80));
        jPanel27.setLayout(new javax.swing.BoxLayout(jPanel27, javax.swing.BoxLayout.X_AXIS));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Alterna");
        jLabel17.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel17.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel17.setPreferredSize(new java.awt.Dimension(60, 14));
        jPanel27.add(jLabel17);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Fecha: 10/12/2021");
        jLabel18.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel18.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel18.setName(""); // NOI18N
        jLabel18.setPreferredSize(new java.awt.Dimension(100, 14));
        jPanel27.add(jLabel18);

        jPanel22.add(jPanel27, java.awt.BorderLayout.CENTER);

        panelCenter.add(jPanel22);

        jPanel12.setBackground(new java.awt.Color(102, 102, 102));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setMinimumSize(new java.awt.Dimension(370, 101));
        jPanel12.setName(""); // NOI18N
        jPanel12.setPreferredSize(new java.awt.Dimension(370, 101));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel16.setBackground(new java.awt.Color(102, 102, 102));
        jPanel16.setMinimumSize(new java.awt.Dimension(370, 32));
        jPanel16.setPreferredSize(new java.awt.Dimension(370, 32));
        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Evento más capacidad");
        jLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 0, 204)));
        jPanel16.add(jLabel13);

        jPanel12.add(jPanel16, java.awt.BorderLayout.PAGE_START);

        jPanel17.setBackground(new java.awt.Color(102, 102, 102));
        jPanel12.add(jPanel17, java.awt.BorderLayout.LINE_END);

        jPanel18.setBackground(new java.awt.Color(102, 102, 102));
        jPanel12.add(jPanel18, java.awt.BorderLayout.WEST);

        jPanel19.setBackground(new java.awt.Color(102, 102, 102));
        jPanel12.add(jPanel19, java.awt.BorderLayout.PAGE_END);

        jPanel20.setBackground(new java.awt.Color(102, 102, 102));
        jPanel20.setMinimumSize(new java.awt.Dimension(370, 80));
        jPanel20.setPreferredSize(new java.awt.Dimension(370, 80));
        jPanel20.setLayout(new javax.swing.BoxLayout(jPanel20, javax.swing.BoxLayout.X_AXIS));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Alterna");
        jLabel14.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel14.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel14.setPreferredSize(new java.awt.Dimension(60, 14));
        jPanel20.add(jLabel14);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Capacidad: 100");
        jLabel15.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel15.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel15.setName(""); // NOI18N
        jLabel15.setPreferredSize(new java.awt.Dimension(100, 14));
        jPanel20.add(jLabel15);

        jPanel12.add(jPanel20, java.awt.BorderLayout.CENTER);

        panelCenter.add(jPanel12);

        add(panelCenter, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    
    
    private ArrayList<Socio> obtenerSocios(){
        return cs.obtenerSocios(asociacion.getId());
    }
    
    private ArrayList<Evento> obtenerEventos(){
        return cev.obtenerEventos(asociacion.getId());
    }
    
    private ArrayList<Entrada> obtenerEntradas(){
        return cen.obtenerEntradas(asociacion.getId());
    }
    
    public void rellenar(){
        ArrayList<Socio> socios = obtenerSocios();
        ArrayList<Evento> eventos = obtenerEventos();
        ArrayList<Entrada> entradas = obtenerEntradas();
        
        jLabel11.setText("Socios totales: " + socios.size());
        jLabel1.setText("Eventos totales: " + eventos.size());
        jLabel3.setText("Entradas totales: " + entradas.size());
        
        Date fechaActual = Date.valueOf(LocalDate.now());
        
        socioMasMenosAntiguo(socios);
        
        eventoUltimo(eventos, fechaActual);
        
        eventoProximo(eventos, fechaActual);
        
        eventoMasMenosEntradas(eventos);
        
        eventoCapacidad(eventos);
    }
    
    private void socioMasMenosAntiguo(ArrayList<Socio> socios){
        Date masAntiguo = Date.valueOf("1900-01-01");
        Date menosAntiguo = Date.valueOf("2999-12-31");
        Socio socioMasAntiguo = null;
        Socio socioMenosAntiguo = null;
        
        for(Socio s : socios){
            if(s.getFechaIngreso() != null){
                if(masAntiguo.before(s.getFechaIngreso())){
                    socioMasAntiguo = s;
                    masAntiguo = s.getFechaIngreso();
                }
                if(menosAntiguo.after(s.getFechaIngreso())){
                    socioMenosAntiguo = s;
                    menosAntiguo = s.getFechaIngreso();
                }
            }
        }
        
        if(socioMasAntiguo != null){
            if(!socioMasAntiguo.getRutaImg().equals("")){
                //jLabel6.setIcon(new ImageIcon(socioMasAntiguo.getRutaImg()));
            }else{
                //jLabel6.setIcon(new ImageIcon(getClass().getResource("/socio.png")));
            }
            jLabel29.setText(socioMasAntiguo.getNombre());
            jLabel30.setText("Fecha: " + socioMasAntiguo.getFechaIngreso());
            jLabel30.setIcon(null);
        }else{
            jLabel29.setText("No hay socios");
            jLabel30.setText("");
            jLabel30.setIcon(new ImageIcon(getClass().getResource("/error.png")));
        }
        
        if(socioMenosAntiguo != null){
            if(!socioMenosAntiguo.getRutaImg().equals("")){
                //jLabel8.setIcon(new ImageIcon(socioMenosAntiguo.getRutaImg()));
            }else{
                //jLabel8.setIcon(new ImageIcon(getClass().getResource("/socio.png")));
            }
            jLabel23.setText(socioMenosAntiguo.getNombre());
            jLabel24.setText("Fecha: " + socioMenosAntiguo.getFechaIngreso());
            jLabel24.setIcon(null);
        }else{
            jLabel23.setText("No hay socios");
            jLabel24.setText("");
            jLabel24.setIcon(new ImageIcon(getClass().getResource("/error.png")));
        }
                
    }
    
    private void eventoUltimo(ArrayList<Evento> eventos, Date fecha){
        Date fechaUlt = Date.valueOf("1900-01-01");
        Evento eUlt = null;
        for(Evento e : eventos){
            if(e.getFecha() != null)
            if(fecha.after(e.getFecha())){
               if(fechaUlt.before(e.getFecha())){
                   eUlt = e;
                   fechaUlt = e.getFecha();
               }
           } 
        }
        
        if(eUlt != null){
            if(!eUlt.getRutaImg().equals("")){
                //jLabel10.setIcon(new ImageIcon(eUlt.getRutaImg()));
            }else{
                //jLabel10.setIcon(new ImageIcon(getClass().getResource("/socio.png")));
            }
            jLabel17.setText(eUlt.getNombre());
            jLabel18.setText("Fecha: " + eUlt.getFecha());
            jLabel18.setIcon(null);
        }else{
            jLabel17.setText("No hay eventos");
            jLabel18.setText("");
            jLabel18.setIcon(new ImageIcon(getClass().getResource("/error.png")));
        }
    }
    
    private void eventoProximo(ArrayList<Evento> eventos, Date fecha){
        Date fechaProx = Date.valueOf("2999-12-31");
        Evento eProx = null;
        for(Evento e : eventos){
            if(e.getFecha() != null)
            if(fecha.before(e.getFecha())){
                if(fechaProx.after(e.getFecha())){
                    eProx = e;
                    fechaProx = e.getFecha();
                }
            }
        }
        
        if(eProx != null){
            if(!eProx.getRutaImg().equals("")){
                //jLabel5.setIcon(new ImageIcon(eProx.getRutaImg()));
            }else{
                //jLabel5.setIcon(new ImageIcon(getClass().getResource("/socio.png")));
            }
            jLabel2.setText(eProx.getNombre());
            jLabel12.setText("Fecha: " + eProx.getFecha());
            jLabel12.setIcon(null);
        }else{
            jLabel2.setText("No hay eventos");
            jLabel12.setText("");
            jLabel12.setIcon(new ImageIcon(getClass().getResource("/error.png")));
        }
    }
    
    private void eventoMasMenosEntradas(ArrayList<Evento> eventos){
        int entradasMax = -1, entradasMin = 9999;
        Evento eMax = null;
        Evento eMin = null;
        for(Evento e : eventos){
            if(e.getEntradasVendidas() > entradasMax){
                eMax = e;
                entradasMax = e.getEntradasVendidas();
            }
            if(e.getEntradasVendidas() < entradasMin){
                eMin = e;
                entradasMin = e.getEntradasVendidas();
            }
        }
        if(eMax != null){
            if(!eMax.getRutaImg().equals("")){
                //jLabel7.setIcon(new ImageIcon(eMax.getRutaImg()));
            }else{
                //jLabel7.setIcon(new ImageIcon(getClass().getResource("/socio.png")));
            }
            jLabel26.setText(eMax.getNombre());
            jLabel27.setText("Entradas: " + eMax.getEntradasVendidas());
            jLabel27.setIcon(null);
        }else{
            jLabel26.setText("No hay eventos");
            jLabel27.setText("");
            jLabel27.setIcon(new ImageIcon(getClass().getResource("/error.png")));
        }
        
        if(eMin != null){
            if(!eMin.getRutaImg().equals("")){
                //jLabel9.setIcon(new ImageIcon(eMin.getRutaImg()));
            }else{
                //jLabel9.setIcon(new ImageIcon(getClass().getResource("/socio.png")));
            }
            jLabel20.setText(eMin.getNombre());
            jLabel21.setText("Entradas: " + eMin.getEntradasVendidas());
            jLabel21.setIcon(null);
        }else{
            jLabel20.setText("No hay eventos");
            jLabel21.setText("");
            jLabel21.setIcon(new ImageIcon(getClass().getResource("/error.png")));
        }
    }
    
    private void eventoCapacidad(ArrayList<Evento> eventos){
        int capacidadMax = 0;
        Evento eMax = null;
        for(Evento e : eventos){
            if(e.getEntradas() > capacidadMax){
                eMax = e;
                capacidadMax = e.getEntradas();
            }
        }
        
        if(eMax != null){
            if(!eMax.getRutaImg().equals("")){
                //jLabel31.setIcon(new ImageIcon(eMax.getRutaImg()));
            }else{
                //jLabel31.setIcon(new ImageIcon(getClass().getResource("/socio.png")));
            }
            jLabel14.setText(eMax.getNombre());
            jLabel15.setText("Capacidad: " + eMax.getEntradasVendidas());
            jLabel15.setIcon(null);
        }else{
            jLabel14.setText("No hay eventos");
            jLabel15.setText("");
            jLabel15.setIcon(new ImageIcon(getClass().getResource("/error.png")));
        }
    }
    
    private final Asociacion asociacion;
    
    private final ControlSocio cs;
    private final ControlEvento cev;
    private final ControlEntradas cen;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelEast;
    private javax.swing.JPanel panelNorth;
    private javax.swing.JPanel panelSouth;
    private javax.swing.JPanel panelWest;
    // End of variables declaration//GEN-END:variables
}