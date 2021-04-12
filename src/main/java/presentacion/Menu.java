package presentacion;

import dominio.Asociacion;
import dominio.ControlMembresia;
import dominio.ControlSocio;
import dominio.ControlUsuarios;
import dominio.Membresia;
import dominio.RegularExpresions;
import dominio.Socio;
import dominio.Usuario;
import java.awt.CardLayout;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import static java.awt.Frame.NORMAL;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.regex.Matcher;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import keeptoo.KButton;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

/**
 * @author angel
 **/
public class Menu extends javax.swing.JFrame implements RegularExpresions {

    public Menu(Asociacion asociacion, Usuario user) {
        this.asociacion = asociacion;
        this.user = user;
        
        ap = new AsociacionPanel(asociacion);
        sp = new SociosPanel(asociacion);
        evp = new EventosPanel(asociacion);
        enp = new EntradasPanel(asociacion);
        ip = new EstadisticasPanel();
        editSP = new EditSocioPanel(asociacion);
        editEP = new EditEventoPanel(asociacion);

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        panelNorth = new javax.swing.JPanel();
        panelNorthLeft = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        panelNorthRight = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();
        maximize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        panelWest = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnAsociacion = new keeptoo.KButton();
        panelSep1 = new javax.swing.JPanel();
        btnJuntaDirectiva = new keeptoo.KButton();
        panelSep2 = new javax.swing.JPanel();
        btnMembresia = new keeptoo.KButton();
        btnSocios = new keeptoo.KButton();
        panelSep3 = new javax.swing.JPanel();
        btnCargarSocios = new keeptoo.KButton();
        btnEventos = new keeptoo.KButton();
        btnEntradas = new keeptoo.KButton();
        btnEstadisticas = new keeptoo.KButton();
        jPanel1 = new javax.swing.JPanel();
        btnCambiarPass = new keeptoo.KButton();
        btnCerrarSesion = new keeptoo.KButton();
        jLabel1 = new javax.swing.JLabel();
        panelCenter = new javax.swing.JPanel();

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

        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel.setMinimumSize(new java.awt.Dimension(1000, 550));
        panel.setName("panel"); // NOI18N
        panel.setLayout(new java.awt.BorderLayout());

        panelNorth.setBackground(new java.awt.Color(255, 255, 255));
        panelNorth.setName("panelNorth"); // NOI18N
        panelNorth.setPreferredSize(new java.awt.Dimension(998, 40));
        panelNorth.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelNorthMouseDragged(evt);
            }
        });
        panelNorth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelNorthMousePressed(evt);
            }
        });
        panelNorth.setLayout(new javax.swing.BoxLayout(panelNorth, javax.swing.BoxLayout.LINE_AXIS));

        panelNorthLeft.setBackground(new java.awt.Color(51, 51, 51));
        panelNorthLeft.setMinimumSize(new java.awt.Dimension(499, 40));
        panelNorthLeft.setName("panelNorthLeft"); // NOI18N
        panelNorthLeft.setPreferredSize(new java.awt.Dimension(499, 40));
        panelNorthLeft.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\logo(1).png")); // NOI18N
        logo.setName("logo"); // NOI18N
        panelNorthLeft.add(logo);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("TicketManagementSystem");
        lblTitulo.setName("lblTitulo"); // NOI18N
        panelNorthLeft.add(lblTitulo);

        panelNorth.add(panelNorthLeft);

        panelNorthRight.setBackground(new java.awt.Color(51, 51, 51));
        panelNorthRight.setMinimumSize(new java.awt.Dimension(499, 40));
        panelNorthRight.setName("panelNorthRight"); // NOI18N
        panelNorthRight.setPreferredSize(new java.awt.Dimension(499, 40));
        panelNorthRight.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 0, 0));

        minimize.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\minimizar.png")); // NOI18N
        minimize.setName("minimize"); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });
        panelNorthRight.add(minimize);

        maximize.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\maximize-window.png")); // NOI18N
        maximize.setName("maximize"); // NOI18N
        maximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maximizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maximizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maximizeMouseExited(evt);
            }
        });
        panelNorthRight.add(maximize);

        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\close-button.png")); // NOI18N
        close.setName("close"); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        panelNorthRight.add(close);

        panelNorth.add(panelNorthRight);

        panel.add(panelNorth, java.awt.BorderLayout.NORTH);

        panelWest.setBackground(new java.awt.Color(51, 51, 51));
        panelWest.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(255, 255, 255)));
        panelWest.setMaximumSize(new java.awt.Dimension(200, 32767));
        panelWest.setMinimumSize(new java.awt.Dimension(200, 520));
        panelWest.setName("panelWest"); // NOI18N
        panelWest.setPreferredSize(new java.awt.Dimension(200, 520));
        panelWest.setLayout(new javax.swing.BoxLayout(panelWest, javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setMinimumSize(new java.awt.Dimension(190, 435));
        jPanel2.setPreferredSize(new java.awt.Dimension(190, 405));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        btnAsociacion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(204, 0, 204)));
        btnAsociacion.setText("Asociación   ");
        btnAsociacion.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnAsociacion.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        btnAsociacion.setkBorderRadius(0);
        btnAsociacion.setkEndColor(new java.awt.Color(51, 51, 51));
        btnAsociacion.setkHoverEndColor(new java.awt.Color(31, 31, 31));
        btnAsociacion.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnAsociacion.setkHoverStartColor(new java.awt.Color(31, 31, 31));
        btnAsociacion.setkPressedColor(new java.awt.Color(102, 0, 102));
        btnAsociacion.setkSelectedColor(new java.awt.Color(31, 31, 31));
        btnAsociacion.setkStartColor(new java.awt.Color(51, 51, 51));
        btnAsociacion.setName("btnAsociacion"); // NOI18N
        btnAsociacion.setPreferredSize(new java.awt.Dimension(190, 40));
        btnAsociacion.setSelected(true);
        btnAsociacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAsociacionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAsociacionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAsociacionMouseReleased(evt);
            }
        });
        jPanel2.add(btnAsociacion);

        panelSep1.setBackground(new java.awt.Color(51, 51, 51));
        panelSep1.setPreferredSize(new java.awt.Dimension(30, 40));

        javax.swing.GroupLayout panelSep1Layout = new javax.swing.GroupLayout(panelSep1);
        panelSep1.setLayout(panelSep1Layout);
        panelSep1Layout.setHorizontalGroup(
            panelSep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        panelSep1Layout.setVerticalGroup(
            panelSep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.add(panelSep1);

        btnJuntaDirectiva.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(153, 153, 153)));
        btnJuntaDirectiva.setText("            Junta Directiva");
        btnJuntaDirectiva.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnJuntaDirectiva.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        btnJuntaDirectiva.setkBorderRadius(0);
        btnJuntaDirectiva.setkEndColor(new java.awt.Color(51, 51, 51));
        btnJuntaDirectiva.setkForeGround(new java.awt.Color(153, 153, 153));
        btnJuntaDirectiva.setkHoverEndColor(new java.awt.Color(31, 31, 31));
        btnJuntaDirectiva.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnJuntaDirectiva.setkHoverStartColor(new java.awt.Color(31, 31, 31));
        btnJuntaDirectiva.setkPressedColor(new java.awt.Color(102, 0, 102));
        btnJuntaDirectiva.setkSelectedColor(new java.awt.Color(31, 31, 31));
        btnJuntaDirectiva.setkStartColor(new java.awt.Color(51, 51, 51));
        btnJuntaDirectiva.setName("btnJuntaDirectiva"); // NOI18N
        btnJuntaDirectiva.setPreferredSize(new java.awt.Dimension(150, 40));
        btnJuntaDirectiva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnJuntaDirectivaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnJuntaDirectivaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnJuntaDirectivaMouseReleased(evt);
            }
        });
        jPanel2.add(btnJuntaDirectiva);

        panelSep2.setBackground(new java.awt.Color(51, 51, 51));
        panelSep2.setPreferredSize(new java.awt.Dimension(30, 40));

        javax.swing.GroupLayout panelSep2Layout = new javax.swing.GroupLayout(panelSep2);
        panelSep2.setLayout(panelSep2Layout);
        panelSep2Layout.setHorizontalGroup(
            panelSep2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        panelSep2Layout.setVerticalGroup(
            panelSep2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.add(panelSep2);

        btnMembresia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(153, 153, 153)));
        btnMembresia.setText("    Membresia");
        btnMembresia.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnMembresia.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        btnMembresia.setkBorderRadius(0);
        btnMembresia.setkEndColor(new java.awt.Color(51, 51, 51));
        btnMembresia.setkForeGround(new java.awt.Color(153, 153, 153));
        btnMembresia.setkHoverEndColor(new java.awt.Color(31, 31, 31));
        btnMembresia.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnMembresia.setkHoverStartColor(new java.awt.Color(31, 31, 31));
        btnMembresia.setkPressedColor(new java.awt.Color(102, 0, 102));
        btnMembresia.setkSelectedColor(new java.awt.Color(31, 31, 31));
        btnMembresia.setkStartColor(new java.awt.Color(51, 51, 51));
        btnMembresia.setName("btnMembresia"); // NOI18N
        btnMembresia.setPreferredSize(new java.awt.Dimension(150, 40));
        btnMembresia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMembresiaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMembresiaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMembresiaMouseReleased(evt);
            }
        });
        jPanel2.add(btnMembresia);

        btnSocios.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(153, 153, 153)));
        btnSocios.setText("Socios       ");
        btnSocios.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnSocios.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        btnSocios.setkBorderRadius(0);
        btnSocios.setkEndColor(new java.awt.Color(51, 51, 51));
        btnSocios.setkForeGround(new java.awt.Color(153, 153, 153));
        btnSocios.setkHoverEndColor(new java.awt.Color(31, 31, 31));
        btnSocios.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSocios.setkHoverStartColor(new java.awt.Color(31, 31, 31));
        btnSocios.setkPressedColor(new java.awt.Color(102, 0, 102));
        btnSocios.setkSelectedColor(new java.awt.Color(31, 31, 31));
        btnSocios.setkStartColor(new java.awt.Color(51, 51, 51));
        btnSocios.setName("btnSocios"); // NOI18N
        btnSocios.setPreferredSize(new java.awt.Dimension(190, 40));
        btnSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSociosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSociosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSociosMouseReleased(evt);
            }
        });
        jPanel2.add(btnSocios);

        panelSep3.setBackground(new java.awt.Color(51, 51, 51));
        panelSep3.setPreferredSize(new java.awt.Dimension(30, 40));

        javax.swing.GroupLayout panelSep3Layout = new javax.swing.GroupLayout(panelSep3);
        panelSep3.setLayout(panelSep3Layout);
        panelSep3Layout.setHorizontalGroup(
            panelSep3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        panelSep3Layout.setVerticalGroup(
            panelSep3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.add(panelSep3);

        panelSep3.setVisible(false);
        btnCargarSocios.setVisible(false);
        btnCargarSocios.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(153, 153, 153)));
        btnCargarSocios.setText("Cargar Socios");
        btnCargarSocios.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnCargarSocios.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        btnCargarSocios.setkBorderRadius(0);
        btnCargarSocios.setkEndColor(new java.awt.Color(51, 51, 51));
        btnCargarSocios.setkForeGround(new java.awt.Color(153, 153, 153));
        btnCargarSocios.setkHoverEndColor(new java.awt.Color(31, 31, 31));
        btnCargarSocios.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnCargarSocios.setkHoverStartColor(new java.awt.Color(31, 31, 31));
        btnCargarSocios.setkPressedColor(new java.awt.Color(102, 0, 102));
        btnCargarSocios.setkSelectedColor(new java.awt.Color(31, 31, 31));
        btnCargarSocios.setkStartColor(new java.awt.Color(51, 51, 51));
        btnCargarSocios.setName("btnCargarSocios"); // NOI18N
        btnCargarSocios.setPreferredSize(new java.awt.Dimension(150, 40));
        btnCargarSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCargarSociosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCargarSociosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCargarSociosMouseReleased(evt);
            }
        });
        jPanel2.add(btnCargarSocios);

        btnEventos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(153, 153, 153)));
        btnEventos.setText("Eventos      ");
        btnEventos.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnEventos.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        btnEventos.setkBorderRadius(0);
        btnEventos.setkEndColor(new java.awt.Color(51, 51, 51));
        btnEventos.setkForeGround(new java.awt.Color(153, 153, 153));
        btnEventos.setkHoverEndColor(new java.awt.Color(31, 31, 31));
        btnEventos.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnEventos.setkHoverStartColor(new java.awt.Color(31, 31, 31));
        btnEventos.setkPressedColor(new java.awt.Color(102, 0, 102));
        btnEventos.setkSelectedColor(new java.awt.Color(31, 31, 31));
        btnEventos.setkStartColor(new java.awt.Color(51, 51, 51));
        btnEventos.setName("btnEventos"); // NOI18N
        btnEventos.setPreferredSize(new java.awt.Dimension(190, 40));
        btnEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEventosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEventosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEventosMouseReleased(evt);
            }
        });
        jPanel2.add(btnEventos);

        btnEntradas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(153, 153, 153)));
        btnEntradas.setText("Entradas     ");
        btnEntradas.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnEntradas.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        btnEntradas.setkBorderRadius(0);
        btnEntradas.setkEndColor(new java.awt.Color(51, 51, 51));
        btnEntradas.setkForeGround(new java.awt.Color(153, 153, 153));
        btnEntradas.setkHoverEndColor(new java.awt.Color(31, 31, 31));
        btnEntradas.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnEntradas.setkHoverStartColor(new java.awt.Color(31, 31, 31));
        btnEntradas.setkPressedColor(new java.awt.Color(102, 0, 102));
        btnEntradas.setkSelectedColor(new java.awt.Color(31, 31, 31));
        btnEntradas.setkStartColor(new java.awt.Color(51, 51, 51));
        btnEntradas.setName("btnEntradas"); // NOI18N
        btnEntradas.setPreferredSize(new java.awt.Dimension(190, 40));
        btnEntradas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntradasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEntradasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEntradasMouseReleased(evt);
            }
        });
        jPanel2.add(btnEntradas);

        btnEstadisticas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(153, 153, 153)));
        btnEstadisticas.setText("Estadísticas ");
        btnEstadisticas.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnEstadisticas.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        btnEstadisticas.setkBorderRadius(0);
        btnEstadisticas.setkEndColor(new java.awt.Color(51, 51, 51));
        btnEstadisticas.setkForeGround(new java.awt.Color(153, 153, 153));
        btnEstadisticas.setkHoverEndColor(new java.awt.Color(31, 31, 31));
        btnEstadisticas.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnEstadisticas.setkHoverStartColor(new java.awt.Color(31, 31, 31));
        btnEstadisticas.setkPressedColor(new java.awt.Color(102, 0, 102));
        btnEstadisticas.setkSelectedColor(new java.awt.Color(31, 31, 31));
        btnEstadisticas.setkStartColor(new java.awt.Color(51, 51, 51));
        btnEstadisticas.setName("btnEstadisticas"); // NOI18N
        btnEstadisticas.setPreferredSize(new java.awt.Dimension(190, 40));
        btnEstadisticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEstadisticasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEstadisticasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEstadisticasMouseReleased(evt);
            }
        });
        jPanel2.add(btnEstadisticas);

        panelWest.add(jPanel2);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(190, 50));
        jPanel1.setMinimumSize(new java.awt.Dimension(190, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(190, 115));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        btnCambiarPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(153, 153, 153)));
        btnCambiarPass.setText("Credenciales  ");
        btnCambiarPass.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnCambiarPass.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        btnCambiarPass.setkBorderRadius(0);
        btnCambiarPass.setkEndColor(new java.awt.Color(51, 51, 51));
        btnCambiarPass.setkForeGround(new java.awt.Color(153, 153, 153));
        btnCambiarPass.setkHoverEndColor(new java.awt.Color(31, 31, 31));
        btnCambiarPass.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnCambiarPass.setkHoverStartColor(new java.awt.Color(31, 31, 31));
        btnCambiarPass.setkPressedColor(new java.awt.Color(102, 0, 102));
        btnCambiarPass.setkSelectedColor(new java.awt.Color(31, 31, 31));
        btnCambiarPass.setkStartColor(new java.awt.Color(51, 51, 51));
        btnCambiarPass.setPreferredSize(new java.awt.Dimension(190, 40));
        btnCambiarPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCambiarPassMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCambiarPassMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCambiarPassMouseReleased(evt);
            }
        });
        jPanel1.add(btnCambiarPass);

        btnCerrarSesion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(153, 153, 153)));
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnCerrarSesion.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        btnCerrarSesion.setkBorderRadius(0);
        btnCerrarSesion.setkEndColor(new java.awt.Color(51, 51, 51));
        btnCerrarSesion.setkForeGround(new java.awt.Color(153, 153, 153));
        btnCerrarSesion.setkHoverEndColor(new java.awt.Color(31, 31, 31));
        btnCerrarSesion.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setkHoverStartColor(new java.awt.Color(31, 31, 31));
        btnCerrarSesion.setkPressedColor(new java.awt.Color(102, 0, 102));
        btnCerrarSesion.setkSelectedColor(new java.awt.Color(31, 31, 31));
        btnCerrarSesion.setkStartColor(new java.awt.Color(51, 51, 51));
        btnCerrarSesion.setName("btnCerrarSesion"); // NOI18N
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(190, 40));
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseReleased(evt);
            }
        });
        jPanel1.add(btnCerrarSesion);

        if(user.getUltimaConexion() != null){
            jLabel1.setText("Ultima conexión: " + user.getUltimaConexion());
        }
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setMinimumSize(new java.awt.Dimension(190, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(190, 20));
        jLabel1.setRequestFocusEnabled(false);
        jPanel1.add(jLabel1);

        panelWest.add(jPanel1);

        panel.add(panelWest, java.awt.BorderLayout.WEST);

        panelCenter.setMinimumSize(new java.awt.Dimension(800, 520));
        panelCenter.setName("panelCenter"); // NOI18N
        panelCenter.setPreferredSize(new java.awt.Dimension(800, 520));
        panelCenter.setLayout(new java.awt.CardLayout());
        panel.add(panelCenter, java.awt.BorderLayout.CENTER);
        panelCenter.add(ap, "cardAs");
        panelCenter.add(sp, "cardSo");
        panelCenter.add(evp, "cardEv");
        panelCenter.add(enp, "cardEn");
        panelCenter.add(ip, "cardEs");
        panelCenter.add(editSP, "cardEditSP");
        panelCenter.add(editEP, "cardEditEP");
        ap.rellenarCampos();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelNorthMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNorthMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_panelNorthMouseDragged

    private void panelNorthMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNorthMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_panelNorthMousePressed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\close-button-red.png"));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\close-button.png"));
    }//GEN-LAST:event_closeMouseExited

    private void maximizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeMouseClicked
        if(!maximized){
            setExtendedState(MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            setMaximizedBounds(env.getMaximumWindowBounds());
            maximized = true;            
        }else{
            setExtendedState(NORMAL);
            maximized = false;            
        }
    }//GEN-LAST:event_maximizeMouseClicked

    private void maximizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeMouseEntered
        maximize.setIcon(new ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\maximize-window-purple.png"));
    }//GEN-LAST:event_maximizeMouseEntered

    private void maximizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeMouseExited
        maximize.setIcon(new ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\maximize-window.png"));
    }//GEN-LAST:event_maximizeMouseExited

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setIcon(new ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\minimizar-purple.png"));
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setIcon(new ImageIcon("C:\\Users\\angel\\Downloads\\recursos\\minimizar.png"));
    }//GEN-LAST:event_minimizeMouseExited

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        enp.actualizarListaEntradas();
        
        no_selected(btnJuntaDirectiva);
        no_selected(btnMembresia);
        no_selected(btnCargarSocios);
        no_selected(btnCambiarPass);
        
        if(mem != null){
            mem.dispose();
        }
        if(jd != null){
            jd.dispose();
        }
        
        if(cp != null){
            cp.dispose();
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnAsociacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsociacionMouseExited
        activarAsoc = false;
    }//GEN-LAST:event_btnAsociacionMouseExited

    private void btnAsociacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsociacionMousePressed
        activarAsoc = true;
    }//GEN-LAST:event_btnAsociacionMousePressed

    private void btnAsociacionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsociacionMouseReleased
        if(activarAsoc){
            CardLayout cardLayout = (CardLayout) panelCenter.getLayout();
            cardLayout.show(panelCenter, "cardAs");

            ap.rellenarCampos();

            no_selected(btnSocios);
            no_selected(btnEventos);
            no_selected(btnEntradas);
            no_selected(btnEstadisticas);

            panelSep1.setVisible(true);
            panelSep2.setVisible(true);
            btnJuntaDirectiva.setVisible(true);
            btnMembresia.setVisible(true);

            panelSep3.setVisible(false);
            btnCargarSocios.setVisible(false);

            selected(btnAsociacion);
        }
            
    }//GEN-LAST:event_btnAsociacionMouseReleased

    private void btnJuntaDirectivaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJuntaDirectivaMouseExited
        activarJDir = false;
    }//GEN-LAST:event_btnJuntaDirectivaMouseExited

    private void btnJuntaDirectivaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJuntaDirectivaMousePressed
        activarJDir = true;
    }//GEN-LAST:event_btnJuntaDirectivaMousePressed

    private void btnJuntaDirectivaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJuntaDirectivaMouseReleased
        if(activarJDir){
            btnAsociacion.setSelected(true);
        
            selected(btnJuntaDirectiva);

            jd = new JuntaDirectiva(asociacion);
            jd.setVisible(true);
            jd.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnJuntaDirectivaMouseReleased

    private void btnMembresiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMembresiaMouseExited
        activarMem = false;
    }//GEN-LAST:event_btnMembresiaMouseExited

    private void btnMembresiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMembresiaMousePressed
        activarMem = true;
    }//GEN-LAST:event_btnMembresiaMousePressed

    private void btnMembresiaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMembresiaMouseReleased
        if(activarMem){
            btnAsociacion.setSelected(true);
        
            selected(btnMembresia);

            mem = new MembresiaFrame(asociacion);
            mem.setVisible(true);
            mem.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnMembresiaMouseReleased

    private void btnSociosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSociosMouseExited
        activarSocio = false;
    }//GEN-LAST:event_btnSociosMouseExited

    private void btnSociosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSociosMousePressed
        activarSocio = true;
    }//GEN-LAST:event_btnSociosMousePressed

    private void btnSociosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSociosMouseReleased
        if(activarSocio){
            CardLayout cardLayout = (CardLayout) panelCenter.getLayout();
            cardLayout.show(panelCenter, "cardSo");

            no_selected(btnAsociacion);
            no_selected(btnEventos);
            no_selected(btnEntradas);
            no_selected(btnEstadisticas);

            invisible();        

            panelSep3.setVisible(true);
            btnCargarSocios.setVisible(true);

            selected(btnSocios);

            sp.actualizarTabla();
        }
    }//GEN-LAST:event_btnSociosMouseReleased

    private void btnCargarSociosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarSociosMouseExited
        activarCargarSocios = false;
    }//GEN-LAST:event_btnCargarSociosMouseExited

    private void btnCargarSociosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarSociosMousePressed
        activarCargarSocios = true;
    }//GEN-LAST:event_btnCargarSociosMousePressed

    private void btnCargarSociosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarSociosMouseReleased
        if(activarCargarSocios){
            btnSocios.setSelected(true);
        
            selected(btnCargarSocios);

            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV Files","csv");
            fc.setFileFilter(filter);

            int seleccion = fc.showOpenDialog(this);
            if(seleccion == JFileChooser.APPROVE_OPTION){
                File file = fc.getSelectedFile();
                leerCSV(file.getAbsolutePath());
            }
        }
    }//GEN-LAST:event_btnCargarSociosMouseReleased

    private void btnEventosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEventosMouseExited
        activarEvento = false;
    }//GEN-LAST:event_btnEventosMouseExited

    private void btnEventosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEventosMousePressed
        activarEvento = true;
    }//GEN-LAST:event_btnEventosMousePressed

    private void btnEventosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEventosMouseReleased
        if(activarEvento){
            CardLayout cardLayout = (CardLayout) panelCenter.getLayout();
            cardLayout.show(panelCenter, "cardEv");

            no_selected(btnAsociacion);
            no_selected(btnSocios);
            no_selected(btnEntradas);
            no_selected(btnEstadisticas);

            invisible();
            panelSep3.setVisible(false);
            btnCargarSocios.setVisible(false);

            selected(btnEventos);

            evp.actualizarTabla();
        }
    }//GEN-LAST:event_btnEventosMouseReleased

    private void btnEntradasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntradasMouseExited
        activarEntrada = false;
    }//GEN-LAST:event_btnEntradasMouseExited

    private void btnEntradasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntradasMousePressed
        activarEntrada = true;
    }//GEN-LAST:event_btnEntradasMousePressed

    private void btnEntradasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntradasMouseReleased
        if(activarEntrada){
            CardLayout cardLayout = (CardLayout) panelCenter.getLayout();
            cardLayout.show(panelCenter, "cardEn");

            no_selected(btnAsociacion);
            no_selected(btnSocios);
            no_selected(btnEventos);
            no_selected(btnEstadisticas);

            invisible();
            panelSep3.setVisible(false);
            btnCargarSocios.setVisible(false);

            selected(btnEntradas);
        }
    }//GEN-LAST:event_btnEntradasMouseReleased

    private void btnEstadisticasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstadisticasMouseExited
        activarEstadistica = false;
    }//GEN-LAST:event_btnEstadisticasMouseExited

    private void btnEstadisticasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstadisticasMousePressed
        activarEstadistica = true;
    }//GEN-LAST:event_btnEstadisticasMousePressed

    private void btnEstadisticasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstadisticasMouseReleased
        if(activarEstadistica){
            CardLayout cardLayout = (CardLayout) panelCenter.getLayout();
            cardLayout.show(panelCenter, "cardEs");

            no_selected(btnAsociacion);
            no_selected(btnSocios);
            no_selected(btnEventos);
            no_selected(btnEntradas);

            invisible();
            panelSep3.setVisible(false);
            btnCargarSocios.setVisible(false);

            selected(btnEstadisticas);
        }
    }//GEN-LAST:event_btnEstadisticasMouseReleased

    private void btnCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseExited
        activarCerrarSesion = false;
    }//GEN-LAST:event_btnCerrarSesionMouseExited

    private void btnCerrarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMousePressed
        activarCerrarSesion = true;
    }//GEN-LAST:event_btnCerrarSesionMousePressed

    private void btnCerrarSesionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseReleased
        if(activarCerrarSesion){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog (null, "¿Quiere cerrar sesion?","Warning",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                Login login = new Login();
                login.setVisible(true);
                login.setLocationRelativeTo(null);
                dispose();
                
                Date d = Date.valueOf(LocalDate.now());              
                user.setUltimaConexion(d);
                ControlUsuarios cu = new ControlUsuarios();
                cu.modificarUsuario(user, user.getUsuario());
            }  
        }
    }//GEN-LAST:event_btnCerrarSesionMouseReleased

    private void btnCambiarPassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarPassMouseExited
        activarCambiarPass = false;
    }//GEN-LAST:event_btnCambiarPassMouseExited

    private void btnCambiarPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarPassMousePressed
        activarCambiarPass = true;
    }//GEN-LAST:event_btnCambiarPassMousePressed

    private void btnCambiarPassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarPassMouseReleased
        if(activarCambiarPass){
            selected(btnCambiarPass);

            cp = new CambiarPass(user);
            cp.setVisible(true);
            cp.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnCambiarPassMouseReleased
       
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
        panelSep1.setVisible(false);
        panelSep2.setVisible(false);
        btnJuntaDirectiva.setVisible(false);
        btnMembresia.setVisible(false);
    }                  
    
    private void leerCSV(String path){
        ControlSocio cs = new ControlSocio();
        try{
            Reader in = new FileReader(path);
            CSVParser parser = new CSVParser(in, CSVFormat.EXCEL.withDelimiter(';'));
            for (CSVRecord record : parser) {
                if(!record.get(0).equals("DNI")){
                    String dni = record.get(0);
                        Matcher matcherDNI = DNI.matcher(dni);
                    String nombre = record.get(1);
                    String apellidos = record.get(2);
                    String email = record.get(3);
                        Matcher matcherEMAIL = EMAIL.matcher(email);
                    Date fechaNac = null; 
                        try{
                            fechaNac = Date.valueOf(record.get(4));
                        }catch(Exception e){   
                        }
                    String direccion = record.get(5);
                        Matcher matcherDIR = DIRECCION.matcher(direccion);
                    int tlf = Integer.parseInt(record.get(6));
                        Matcher matcherTLF = TLF.matcher(tlf+"");
                    Date fechaIng = null;
                        try{
                            fechaIng = Date.valueOf(record.get(4));
                        }catch(Exception e){   
                        }

                    if(!matcherEMAIL.matches())
                        email = "";
                    if(!matcherTLF.matches())
                        tlf = 0;
                    if(!matcherDIR.matches())
                        direccion = "C/, , , , Álava";
                    
                    ControlMembresia cm = new ControlMembresia();
                    ArrayList<Membresia> mems = cm.obtenerMembresias(asociacion.getId());
                    int idMem = 0;
                    for(Membresia m : mems){
                        if(m.getNombre().equals("Ninguna"))
                            idMem = m.getId_membresia();
                    }
                    
                    if(matcherDNI.matches() && !dni.equals("") && !nombre.equals("")){
                        Socio s = new Socio(dni, nombre, apellidos, email, fechaNac,
                            direccion, tlf, fechaIng, idMem, false, null, asociacion.getId()); 

                        if(cs.insertarSocio(s)){
                            sp.actualizarTabla();
                        }
                    }  
                }
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }               
    }
    
    private final Asociacion asociacion;
    private final Usuario user;
    
    private boolean maximized = false;
    private int xx;
    private int xy;
    
    private final EstadisticasPanel ip;
    private final AsociacionPanel ap;
    private final SociosPanel sp;
    private final EventosPanel evp;
    private final EntradasPanel enp;   
    
    private final EditSocioPanel editSP;
    private final EditEventoPanel editEP;
    
    private MembresiaFrame mem;
    private JuntaDirectiva jd;
    private CambiarPass cp;
    
    private boolean activarAsoc;
    private boolean activarJDir;
    private boolean activarMem;
    private boolean activarSocio;
    private boolean activarCargarSocios;
    private boolean activarEvento;
    private boolean activarEntrada;
    private boolean activarEstadistica;
    private boolean activarCerrarSesion;
    private boolean activarCambiarPass;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnAsociacion;
    private keeptoo.KButton btnCambiarPass;
    private keeptoo.KButton btnCargarSocios;
    private keeptoo.KButton btnCerrarSesion;
    private keeptoo.KButton btnEntradas;
    private keeptoo.KButton btnEstadisticas;
    private keeptoo.KButton btnEventos;
    private keeptoo.KButton btnJuntaDirectiva;
    private keeptoo.KButton btnMembresia;
    private keeptoo.KButton btnSocios;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel maximize;
    private javax.swing.JLabel minimize;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelNorth;
    private javax.swing.JPanel panelNorthLeft;
    private javax.swing.JPanel panelNorthRight;
    private javax.swing.JPanel panelSep1;
    private javax.swing.JPanel panelSep2;
    private javax.swing.JPanel panelSep3;
    private javax.swing.JPanel panelWest;
    // End of variables declaration//GEN-END:variables
}