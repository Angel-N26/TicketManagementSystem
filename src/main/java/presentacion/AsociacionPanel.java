package presentacion;

import java.awt.Color;

/**
 * @author angel
 **/
public class AsociacionPanel extends javax.swing.JPanel {

    public AsociacionPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelEastAsoc = new javax.swing.JPanel();
        logoAsoc = new javax.swing.JLabel();
        lblNameTittle = new javax.swing.JLabel();
        panelSouthAsoc = new javax.swing.JPanel();
        btnEditarAsoc = new javax.swing.JButton();
        panelCenterAsoc = new javax.swing.JPanel();
        lblNameAsoc = new javax.swing.JLabel();
        tfNombreAsoc = new javax.swing.JTextField();
        lblObNombre = new javax.swing.JLabel();
        lblTlfAsoc = new javax.swing.JLabel();
        tfTlfAsoc = new javax.swing.JTextField();
        lblObTlf = new javax.swing.JLabel();
        lblCorreoAsoc = new javax.swing.JLabel();
        tfCorreoAsoc = new javax.swing.JTextField();
        lblObCorreo = new javax.swing.JLabel();
        lblDirAsoc = new javax.swing.JLabel();
        tfDirAsoc = new javax.swing.JTextField();
        lblObDir = new javax.swing.JLabel();
        lblPobAsoc = new javax.swing.JLabel();
        tfPobAsoc = new javax.swing.JTextField();
        lblObPob = new javax.swing.JLabel();
        lblCiuAsoc = new javax.swing.JLabel();
        tfCiuAsoc = new javax.swing.JTextField();
        lblObCiu = new javax.swing.JLabel();
        lblCIFAsoc = new javax.swing.JLabel();
        tfCIFAsoc = new javax.swing.JTextField();
        lblObCIF = new javax.swing.JLabel();
        lblNRegAsoc = new javax.swing.JLabel();
        tfNRegAsoc = new javax.swing.JTextField();
        lblObNReg = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        panelEastAsoc.setBackground(new java.awt.Color(51, 51, 51));
        panelEastAsoc.setName("panelEastAsoc"); // NOI18N
        panelEastAsoc.setLayout(new java.awt.GridBagLayout());

        logoAsoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoAsoc.setName("logoAsoc"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 86;
        gridBagConstraints.ipady = 51;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panelEastAsoc.add(logoAsoc, gridBagConstraints);

        lblNameTittle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNameTittle.setForeground(new java.awt.Color(255, 255, 255));
        lblNameTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameTittle.setText("RealJazz");
        lblNameTittle.setName("lblNameTittle"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 46;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelEastAsoc.add(lblNameTittle, gridBagConstraints);

        add(panelEastAsoc, java.awt.BorderLayout.WEST);

        panelSouthAsoc.setBackground(new java.awt.Color(51, 51, 51));
        panelSouthAsoc.setName("panelSouthAsoc"); // NOI18N
        panelSouthAsoc.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        btnEditarAsoc.setBackground(new java.awt.Color(204, 0, 204));
        btnEditarAsoc.setText("Editar");
        btnEditarAsoc.setMaximumSize(new java.awt.Dimension(170, 35));
        btnEditarAsoc.setName("btnEditarAsoc"); // NOI18N
        btnEditarAsoc.setPreferredSize(new java.awt.Dimension(180, 35));
        panelSouthAsoc.add(btnEditarAsoc);

        add(panelSouthAsoc, java.awt.BorderLayout.SOUTH);

        panelCenterAsoc.setBackground(new java.awt.Color(51, 51, 51));
        panelCenterAsoc.setName("panelCenterAsoc"); // NOI18N
        panelCenterAsoc.setLayout(new java.awt.GridLayout(8, 3, 5, 35));

        lblNameAsoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNameAsoc.setForeground(new java.awt.Color(255, 255, 255));
        lblNameAsoc.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNameAsoc.setText("Nombre");
        lblNameAsoc.setName("lblNameAsoc"); // NOI18N
        panelCenterAsoc.add(lblNameAsoc);

        tfNombreAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfNombreAsoc.setForeground(new java.awt.Color(255, 255, 255));
        tfNombreAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfNombreAsoc.setCaretColor(new java.awt.Color(204, 0, 204));
        tfNombreAsoc.setName("tfNombreAsoc"); // NOI18N
        tfNombreAsoc.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfNombreAsoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNombreAsocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNombreAsocFocusLost(evt);
            }
        });
        panelCenterAsoc.add(tfNombreAsoc);

        lblObNombre.setVisible(false);
        lblObNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblObNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblObNombre.setText("*");
        lblObNombre.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblObNombre.setName("lblObNombre"); // NOI18N
        panelCenterAsoc.add(lblObNombre);

        lblTlfAsoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTlfAsoc.setForeground(new java.awt.Color(255, 255, 255));
        lblTlfAsoc.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTlfAsoc.setText("Telefono");
        lblTlfAsoc.setName("lblTlfAsoc"); // NOI18N
        panelCenterAsoc.add(lblTlfAsoc);

        tfTlfAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfTlfAsoc.setForeground(new java.awt.Color(255, 255, 255));
        tfTlfAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfTlfAsoc.setCaretColor(new java.awt.Color(204, 0, 204));
        tfTlfAsoc.setName("tfTlfAsoc"); // NOI18N
        tfTlfAsoc.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfTlfAsoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfTlfAsocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfTlfAsocFocusLost(evt);
            }
        });
        panelCenterAsoc.add(tfTlfAsoc);

        lblObTlf.setVisible(false);
        lblObTlf.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblObTlf.setForeground(new java.awt.Color(255, 255, 255));
        lblObTlf.setText("*");
        lblObTlf.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblObTlf.setName("lblObTlf"); // NOI18N
        panelCenterAsoc.add(lblObTlf);

        lblCorreoAsoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCorreoAsoc.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreoAsoc.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCorreoAsoc.setText("Correo");
        lblCorreoAsoc.setName("lblCorreoAsoc"); // NOI18N
        panelCenterAsoc.add(lblCorreoAsoc);

        tfCorreoAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfCorreoAsoc.setForeground(new java.awt.Color(255, 255, 255));
        tfCorreoAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfCorreoAsoc.setCaretColor(new java.awt.Color(204, 0, 204));
        tfCorreoAsoc.setName("tfCorreoAsoc"); // NOI18N
        tfCorreoAsoc.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfCorreoAsoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCorreoAsocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCorreoAsocFocusLost(evt);
            }
        });
        panelCenterAsoc.add(tfCorreoAsoc);

        lblObCorreo.setVisible(false);
        lblObCorreo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblObCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblObCorreo.setText("*");
        lblObCorreo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblObCorreo.setName("lblObTlf"); // NOI18N
        panelCenterAsoc.add(lblObCorreo);

        lblDirAsoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDirAsoc.setForeground(new java.awt.Color(255, 255, 255));
        lblDirAsoc.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDirAsoc.setText("Dirección");
        lblDirAsoc.setName("lblDirAsoc"); // NOI18N
        panelCenterAsoc.add(lblDirAsoc);

        tfDirAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfDirAsoc.setForeground(new java.awt.Color(255, 255, 255));
        tfDirAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfDirAsoc.setCaretColor(new java.awt.Color(204, 0, 204));
        tfDirAsoc.setName("tfDirAsoc"); // NOI18N
        tfDirAsoc.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfDirAsoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDirAsocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDirAsocFocusLost(evt);
            }
        });
        panelCenterAsoc.add(tfDirAsoc);

        lblObDir.setVisible(false);
        lblObDir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblObDir.setForeground(new java.awt.Color(255, 255, 255));
        lblObDir.setText("*");
        lblObDir.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblObDir.setName("lblObDir"); // NOI18N
        panelCenterAsoc.add(lblObDir);

        lblPobAsoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPobAsoc.setForeground(new java.awt.Color(255, 255, 255));
        lblPobAsoc.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPobAsoc.setText("Poblacion");
        lblPobAsoc.setName("lblPobAsoc"); // NOI18N
        panelCenterAsoc.add(lblPobAsoc);

        tfPobAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfPobAsoc.setForeground(new java.awt.Color(255, 255, 255));
        tfPobAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfPobAsoc.setCaretColor(new java.awt.Color(204, 0, 204));
        tfPobAsoc.setName("tfPobAsoc"); // NOI18N
        tfPobAsoc.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfPobAsoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPobAsocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPobAsocFocusLost(evt);
            }
        });
        panelCenterAsoc.add(tfPobAsoc);

        lblObPob.setVisible(false);
        lblObPob.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblObPob.setForeground(new java.awt.Color(255, 255, 255));
        lblObPob.setText("*");
        lblObPob.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblObPob.setName("lblObPob"); // NOI18N
        panelCenterAsoc.add(lblObPob);

        lblCiuAsoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCiuAsoc.setForeground(new java.awt.Color(255, 255, 255));
        lblCiuAsoc.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCiuAsoc.setText("Ciudad");
        lblCiuAsoc.setName("lblCiuAsoc"); // NOI18N
        panelCenterAsoc.add(lblCiuAsoc);

        tfCiuAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfCiuAsoc.setForeground(new java.awt.Color(255, 255, 255));
        tfCiuAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfCiuAsoc.setCaretColor(new java.awt.Color(204, 0, 204));
        tfCiuAsoc.setName("tfCiuAsoc"); // NOI18N
        tfCiuAsoc.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfCiuAsoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCiuAsocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCiuAsocFocusLost(evt);
            }
        });
        panelCenterAsoc.add(tfCiuAsoc);

        lblObCiu.setVisible(false);
        lblObCiu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblObCiu.setForeground(new java.awt.Color(255, 255, 255));
        lblObCiu.setText("*");
        lblObCiu.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblObCiu.setName("lblObCiu"); // NOI18N
        panelCenterAsoc.add(lblObCiu);

        lblCIFAsoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCIFAsoc.setForeground(new java.awt.Color(255, 255, 255));
        lblCIFAsoc.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCIFAsoc.setText("C.I.F");
        lblCIFAsoc.setName("lblCIFAsoc"); // NOI18N
        panelCenterAsoc.add(lblCIFAsoc);

        tfCIFAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfCIFAsoc.setForeground(new java.awt.Color(255, 255, 255));
        tfCIFAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfCIFAsoc.setCaretColor(new java.awt.Color(204, 0, 204));
        tfCIFAsoc.setName("tfCIFAsoc"); // NOI18N
        tfCIFAsoc.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfCIFAsoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCIFAsocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCIFAsocFocusLost(evt);
            }
        });
        panelCenterAsoc.add(tfCIFAsoc);

        lblObCIF.setVisible(false);
        lblObCIF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblObCIF.setForeground(new java.awt.Color(255, 255, 255));
        lblObCIF.setText("*");
        lblObCIF.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblObCIF.setName("lblObCIF"); // NOI18N
        panelCenterAsoc.add(lblObCIF);

        lblNRegAsoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNRegAsoc.setForeground(new java.awt.Color(255, 255, 255));
        lblNRegAsoc.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNRegAsoc.setText("Nº Registro");
        lblNRegAsoc.setName("lblNRegAsoc"); // NOI18N
        panelCenterAsoc.add(lblNRegAsoc);

        tfNRegAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfNRegAsoc.setForeground(new java.awt.Color(255, 255, 255));
        tfNRegAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        tfNRegAsoc.setCaretColor(new java.awt.Color(204, 0, 204));
        tfNRegAsoc.setName("tfNRegAsoc"); // NOI18N
        tfNRegAsoc.setSelectionColor(new java.awt.Color(204, 0, 204));
        tfNRegAsoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNRegAsocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNRegAsocFocusLost(evt);
            }
        });
        panelCenterAsoc.add(tfNRegAsoc);

        lblObNReg.setVisible(false);
        lblObNReg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblObNReg.setForeground(new java.awt.Color(255, 255, 255));
        lblObNReg.setText("*");
        lblObNReg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblObNReg.setName("lblObNReg"); // NOI18N
        panelCenterAsoc.add(lblObNReg);

        add(panelCenterAsoc, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void tfNombreAsocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreAsocFocusGained
        tfNombreAsoc.setBackground(Color.black);
        tfNombreAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfNombreAsocFocusGained

    private void tfNombreAsocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreAsocFocusLost
        tfNombreAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfNombreAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfNombreAsocFocusLost

    private void tfTlfAsocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTlfAsocFocusGained
        tfTlfAsoc.setBackground(Color.black);
        tfTlfAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfTlfAsocFocusGained

    private void tfTlfAsocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTlfAsocFocusLost
        tfTlfAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfTlfAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfTlfAsocFocusLost

    private void tfCorreoAsocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCorreoAsocFocusGained
        tfCorreoAsoc.setBackground(Color.black);
        tfCorreoAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfCorreoAsocFocusGained

    private void tfCorreoAsocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCorreoAsocFocusLost
        tfCorreoAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfCorreoAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfCorreoAsocFocusLost

    private void tfDirAsocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDirAsocFocusGained
        tfDirAsoc.setBackground(Color.black);
        tfDirAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfDirAsocFocusGained

    private void tfDirAsocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDirAsocFocusLost
        tfDirAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfDirAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfDirAsocFocusLost

    private void tfPobAsocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPobAsocFocusGained
        tfPobAsoc.setBackground(Color.black);
        tfPobAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfPobAsocFocusGained

    private void tfPobAsocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPobAsocFocusLost
        tfPobAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfPobAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfPobAsocFocusLost

    private void tfCiuAsocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCiuAsocFocusGained
        tfCiuAsoc.setBackground(Color.black);
        tfCiuAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfCiuAsocFocusGained

    private void tfCiuAsocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCiuAsocFocusLost
        tfCiuAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfCiuAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfCiuAsocFocusLost

    private void tfCIFAsocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCIFAsocFocusGained
        tfCIFAsoc.setBackground(Color.black);
        tfCIFAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfCIFAsocFocusGained

    private void tfCIFAsocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCIFAsocFocusLost
        tfCIFAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfCIFAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfCIFAsocFocusLost

    private void tfNRegAsocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNRegAsocFocusGained
        tfNRegAsoc.setBackground(Color.black);
        tfNRegAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 204), 2, true));
    }//GEN-LAST:event_tfNRegAsocFocusGained

    private void tfNRegAsocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNRegAsocFocusLost
        tfNRegAsoc.setBackground(new java.awt.Color(102, 102, 102));
        tfNRegAsoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
    }//GEN-LAST:event_tfNRegAsocFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarAsoc;
    private javax.swing.JLabel lblCIFAsoc;
    private javax.swing.JLabel lblCiuAsoc;
    private javax.swing.JLabel lblCorreoAsoc;
    private javax.swing.JLabel lblDirAsoc;
    private javax.swing.JLabel lblNRegAsoc;
    private javax.swing.JLabel lblNameAsoc;
    private javax.swing.JLabel lblNameTittle;
    private javax.swing.JLabel lblObCIF;
    private javax.swing.JLabel lblObCiu;
    private javax.swing.JLabel lblObCorreo;
    private javax.swing.JLabel lblObDir;
    private javax.swing.JLabel lblObNReg;
    private javax.swing.JLabel lblObNombre;
    private javax.swing.JLabel lblObPob;
    private javax.swing.JLabel lblObTlf;
    private javax.swing.JLabel lblPobAsoc;
    private javax.swing.JLabel lblTlfAsoc;
    private javax.swing.JLabel logoAsoc;
    private javax.swing.JPanel panelCenterAsoc;
    private javax.swing.JPanel panelEastAsoc;
    private javax.swing.JPanel panelSouthAsoc;
    private javax.swing.JTextField tfCIFAsoc;
    private javax.swing.JTextField tfCiuAsoc;
    private javax.swing.JTextField tfCorreoAsoc;
    private javax.swing.JTextField tfDirAsoc;
    private javax.swing.JTextField tfNRegAsoc;
    private javax.swing.JTextField tfNombreAsoc;
    private javax.swing.JTextField tfPobAsoc;
    private javax.swing.JTextField tfTlfAsoc;
    // End of variables declaration//GEN-END:variables
}