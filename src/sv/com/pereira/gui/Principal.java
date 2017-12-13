
package sv.com.pereira.gui;

import static com.jtattoo.plaf.texture.TextureLookAndFeel.setTheme;
import java.awt.Desktop;
import static java.awt.Desktop.Action.BROWSE;
import static java.awt.Desktop.getDesktop;
import static java.awt.Desktop.isDesktopSupported;
import static java.awt.EventQueue.invokeLater;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.exit;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import static java.sql.DriverManager.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.HOUR_OF_DAY;
import static java.util.Calendar.MINUTE;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.SECOND;
import static java.util.Calendar.YEAR;
import static java.util.Calendar.getInstance;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import javax.swing.JFileChooser;
import static javax.swing.JFileChooser.APPROVE_OPTION;
import static javax.swing.JFileChooser.DIRECTORIES_ONLY;
import static javax.swing.JFileChooser.FILES_ONLY;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.UIManager.getInstalledLookAndFeels;
import static javax.swing.UIManager.setLookAndFeel;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.sf.jasperreports.engine.JRException;
import static net.sf.jasperreports.engine.JasperFillManager.fillReport;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import static net.sf.jasperreports.engine.util.JRLoader.loadObjectFromFile;
import net.sf.jasperreports.view.JasperViewer;

public class Principal extends javax.swing.JFrame {

   
    public Principal() {
        initComponents();
       
        this.setLocationRelativeTo(null); //centarando en pantalla
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoUsuarioActivo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Sistema = new javax.swing.JMenu();
        SistemaSalir = new javax.swing.JMenuItem();
        Nacimientos = new javax.swing.JMenu();
        NacimientosCrud = new javax.swing.JMenuItem();
        nacidosReporte = new javax.swing.JMenuItem();
        Matrimonios = new javax.swing.JMenu();
        MatrimoniosNuevos = new javax.swing.JMenuItem();
        MatrimoniosReporte = new javax.swing.JMenuItem();
        Historicos = new javax.swing.JMenu();
        defuncionesDef = new javax.swing.JMenuItem();
        DefuncionesReporte = new javax.swing.JMenuItem();
        DivorciosDivorcios = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        DivorciosReporte = new javax.swing.JMenuItem();
        Cedulas = new javax.swing.JMenu();
        CedulasCedulas = new javax.swing.JMenuItem();
        CedulasReporte = new javax.swing.JMenuItem();
        Administracion = new javax.swing.JMenu();
        AdminUsuarios = new javax.swing.JMenuItem();
        Respaldos = new javax.swing.JMenuItem();
        Restauracion = new javax.swing.JMenuItem();
        Skin = new javax.swing.JMenu();
        skin1 = new javax.swing.JMenuItem();
        skin2 = new javax.swing.JMenuItem();
        skin3 = new javax.swing.JMenuItem();
        skin4 = new javax.swing.JMenuItem();
        skin5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jDesktopPane1.setName(""); // NOI18N
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1050, 800));
        jDesktopPane1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REFAM-OSI");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/escudiOsicala.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Licencia concedida a:  Alcaldia Municipal de Osicala");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Localizanos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoGoogleMaps.jpg"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoFB.png"))); // NOI18N
        jLabel5.setToolTipText("");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        campoUsuarioActivo.setEditable(false);
        campoUsuarioActivo.setBackground(new java.awt.Color(102, 255, 102));
        campoUsuarioActivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoUsuarioActivo.setForeground(new java.awt.Color(0, 0, 255));
        campoUsuarioActivo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoUsuarioActivo.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Diseño & Codificación: Pereira Computer Services ** 2017 **");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoUsuarioActivo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addComponent(campoUsuarioActivo)
                                .addGap(231, 231, 231))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoUsuarioActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        Sistema.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Sistema.setText("Sistema");
        Sistema.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Sistema.setDelay(100);
        Sistema.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Sistema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sistema.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Sistema.setPreferredSize(new java.awt.Dimension(100, 30));

        SistemaSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        SistemaSalir.setText("Salir");
        SistemaSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SistemaSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SistemaSalir.setPreferredSize(new java.awt.Dimension(100, 25));
        SistemaSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SistemaSalirActionPerformed(evt);
            }
        });
        Sistema.add(SistemaSalir);

        jMenuBar1.add(Sistema);

        Nacimientos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Nacimientos.setText("Nacimientos");
        Nacimientos.setDelay(100);
        Nacimientos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Nacimientos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nacimientos.setPreferredSize(new java.awt.Dimension(100, 20));

        NacimientosCrud.setText("Nacidos");
        NacimientosCrud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NacimientosCrudActionPerformed(evt);
            }
        });
        Nacimientos.add(NacimientosCrud);

        nacidosReporte.setText("Reporte");
        nacidosReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacidosReporteActionPerformed(evt);
            }
        });
        Nacimientos.add(nacidosReporte);

        jMenuBar1.add(Nacimientos);

        Matrimonios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Matrimonios.setText("Matrimonios");
        Matrimonios.setDelay(100);
        Matrimonios.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Matrimonios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Matrimonios.setPreferredSize(new java.awt.Dimension(100, 20));

        MatrimoniosNuevos.setText("Matrimonios");
        MatrimoniosNuevos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MatrimoniosNuevos.setPreferredSize(new java.awt.Dimension(100, 25));
        MatrimoniosNuevos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatrimoniosNuevosActionPerformed(evt);
            }
        });
        Matrimonios.add(MatrimoniosNuevos);

        MatrimoniosReporte.setText("Reporte");
        MatrimoniosReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatrimoniosReporteActionPerformed(evt);
            }
        });
        Matrimonios.add(MatrimoniosReporte);

        jMenuBar1.add(Matrimonios);

        Historicos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Historicos.setText("Defunciones");
        Historicos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Historicos.setMaximumSize(new java.awt.Dimension(100, 32767));
        Historicos.setPreferredSize(new java.awt.Dimension(120, 20));

        defuncionesDef.setText("Defunciones");
        defuncionesDef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defuncionesDefActionPerformed(evt);
            }
        });
        Historicos.add(defuncionesDef);

        DefuncionesReporte.setText("Reporte");
        DefuncionesReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefuncionesReporteActionPerformed(evt);
            }
        });
        Historicos.add(DefuncionesReporte);

        jMenuBar1.add(Historicos);

        DivorciosDivorcios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DivorciosDivorcios.setText("Divorcios");
        DivorciosDivorcios.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DivorciosDivorcios.setMaximumSize(new java.awt.Dimension(100, 32767));

        jMenuItem1.setText("Divorcios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        DivorciosDivorcios.add(jMenuItem1);

        DivorciosReporte.setText("Reporte");
        DivorciosReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivorciosReporteActionPerformed(evt);
            }
        });
        DivorciosDivorcios.add(DivorciosReporte);

        jMenuBar1.add(DivorciosDivorcios);

        Cedulas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cedulas.setText("Cedulas");
        Cedulas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Cedulas.setMaximumSize(new java.awt.Dimension(100, 32767));

        CedulasCedulas.setText("Cedulas");
        CedulasCedulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulasCedulasActionPerformed(evt);
            }
        });
        Cedulas.add(CedulasCedulas);

        CedulasReporte.setText("Reporte");
        CedulasReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulasReporteActionPerformed(evt);
            }
        });
        Cedulas.add(CedulasReporte);

        jMenuBar1.add(Cedulas);

        Administracion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Administracion.setText("Configuracion");
        Administracion.setDelay(100);
        Administracion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Administracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Administracion.setMaximumSize(new java.awt.Dimension(110, 32767));
        Administracion.setPreferredSize(new java.awt.Dimension(120, 20));

        AdminUsuarios.setText("Usuarios");
        AdminUsuarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AdminUsuarios.setPreferredSize(new java.awt.Dimension(100, 25));
        AdminUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminUsuariosActionPerformed(evt);
            }
        });
        Administracion.add(AdminUsuarios);

        Respaldos.setText("Respaldos");
        Respaldos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Respaldos.setPreferredSize(new java.awt.Dimension(100, 25));
        Respaldos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RespaldosActionPerformed(evt);
            }
        });
        Administracion.add(Respaldos);

        Restauracion.setText("Restauracion");
        Restauracion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Restauracion.setPreferredSize(new java.awt.Dimension(100, 25));
        Restauracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestauracionActionPerformed(evt);
            }
        });
        Administracion.add(Restauracion);

        jMenuBar1.add(Administracion);

        Skin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Skin.setMnemonic('k');
        Skin.setText("Skin");
        Skin.setDelay(100);
        Skin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Skin.setMaximumSize(new java.awt.Dimension(100, 32767));
        Skin.setPreferredSize(new java.awt.Dimension(50, 42));

        skin1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        skin1.setText("Skin1");
        skin1.setPreferredSize(new java.awt.Dimension(215, 42));
        skin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skin1ActionPerformed(evt);
            }
        });
        Skin.add(skin1);

        skin2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        skin2.setText("Skin2");
        skin2.setPreferredSize(new java.awt.Dimension(215, 42));
        skin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skin2ActionPerformed(evt);
            }
        });
        Skin.add(skin2);

        skin3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        skin3.setText("Skin3");
        skin3.setPreferredSize(new java.awt.Dimension(215, 42));
        skin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skin3ActionPerformed(evt);
            }
        });
        Skin.add(skin3);

        skin4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        skin4.setText("Skin4");
        skin4.setPreferredSize(new java.awt.Dimension(215, 42));
        skin4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skin4ActionPerformed(evt);
            }
        });
        Skin.add(skin4);

        skin5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        skin5.setText("Skin5");
        skin5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skin5ActionPerformed(evt);
            }
        });
        Skin.add(skin5);

        jMenuBar1.add(Skin);

        jMenu3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu3.setText("Acerca de");
        jMenu3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenu3.setMaximumSize(new java.awt.Dimension(100, 32767));

        jMenuItem2.setText("Pereira Computer Services");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1082, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
        );

        jDesktopPane1.getAccessibleContext().setAccessibleName("");

        setBounds(0, 0, 1098, 730);
    }// </editor-fold>//GEN-END:initComponents

    private void SistemaSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SistemaSalirActionPerformed
        exit(0);
    }//GEN-LAST:event_SistemaSalirActionPerformed

    private void MatrimoniosNuevosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatrimoniosNuevosActionPerformed
        // TODO add your handling code here:
         MatrimonioCRUD matrimonioCRUD = new MatrimonioCRUD();
        jDesktopPane1.add(matrimonioCRUD);
        jDesktopPane1.getDesktopManager().maximizeFrame(matrimonioCRUD);
        matrimonioCRUD.setVisible(true);
        matrimonioCRUD.setIconifiable(true);
        matrimonioCRUD.setMaximizable(true);
        matrimonioCRUD.setClosable(true);
        matrimonioCRUD.setResizable(true);
        matrimonioCRUD.toFront();
    }//GEN-LAST:event_MatrimoniosNuevosActionPerformed

    private void AdminUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminUsuariosActionPerformed
        // TODO add your handling code here:
       UsuariosCrud usuariosCrud = new UsuariosCrud();
        jDesktopPane1.add(usuariosCrud);
        jDesktopPane1.getDesktopManager().maximizeFrame(usuariosCrud);
        usuariosCrud.setVisible(true);
        usuariosCrud.setIconifiable(true);
        usuariosCrud.setMaximizable(true);
        usuariosCrud.setClosable(true);
        usuariosCrud.setResizable(true);
        usuariosCrud.toFront();
      
    }//GEN-LAST:event_AdminUsuariosActionPerformed

    private void defuncionesDefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defuncionesDefActionPerformed
        // TODO add your handling code here:
         FallecidosCRUD fallecidosCRUD = new FallecidosCRUD();
        jDesktopPane1.add(fallecidosCRUD);
        jDesktopPane1.getDesktopManager().maximizeFrame(fallecidosCRUD);
        fallecidosCRUD.setVisible(true);
        fallecidosCRUD.setIconifiable(true);
        fallecidosCRUD.setMaximizable(true);
        fallecidosCRUD.setClosable(true);
        fallecidosCRUD.setResizable(true);
        fallecidosCRUD.toFront();
     
        
    }//GEN-LAST:event_defuncionesDefActionPerformed

    private void RespaldosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RespaldosActionPerformed
        // TODO add your handling code here:
         JFileChooser chooser = new JFileChooser();
        //chooser.setCurrentDirectory ( new java.io.File ( "." ) );
        chooser.setDialogTitle("Selección de dirección");
        chooser.setFileSelectionMode(DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(null) == APPROVE_OPTION) {
            List<String> comandos = new ArrayList<>();
            Calendar cal = getInstance();
            String file = "backup" + cal.get(DAY_OF_MONTH) + cal.get(MONTH + 1) + cal.get(YEAR)
                    + cal.get(HOUR_OF_DAY) + cal.get(MINUTE) + cal.get(SECOND) + ".sql";
            comandos.add("C:\\Program Files\\PostgreSQL\\9.5\\bin\\pg_dump.exe");
            //comandos.add("-i");
            comandos.add("-h");
            comandos.add("192.168.1.10");
            //comandos.add("192.168.0.25");
            comandos.add("-p");
            comandos.add("5432");
            comandos.add("-U");
            comandos.add("postgres");
            comandos.add("-F");
            comandos.add("c");
            comandos.add("-b");
            comandos.add("-v");
            comandos.add("-f");
            comandos.add(chooser.getSelectedFile().toString() + "\\" + file);
            comandos.add("alcaldiadb");
            ProcessBuilder pb = new ProcessBuilder(comandos);
            pb.environment().put("PGPASSWORD", "root");
            try {
                final Process process = pb.start();
                try (BufferedReader r = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {
                    String line = r.readLine();
                    while (line != null) {
                        line = r.readLine();
                    }
                }
                process.waitFor();
                process.destroy();
                showMessageDialog(null, "Respaldo exitoso!");
            } catch (IOException | InterruptedException e) {
            }
        }
    }//GEN-LAST:event_RespaldosActionPerformed

    private void RestauracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestauracionActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new javax.swing.JFileChooser();
        chooser.setFileSelectionMode(FILES_ONLY);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("SQL", "sql");
        chooser.setFileFilter(filtro);
        int res = chooser.showOpenDialog(this);
        if (res == APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            //aqui el restore:
            List<String> comandos = new ArrayList<>();
            comandos.add("C:\\Program Files\\PostgreSQL\\9.5\\bin\\pg_restore.exe");
            comandos.add("-h");
            comandos.add("192.168.1.10");
            comandos.add("-p");
            comandos.add("5432");
            comandos.add("-U");
            comandos.add("postgres");
            comandos.add("-c");
            comandos.add("-d");
            comandos.add("alcaldiadb");
            comandos.add("-v");
            comandos.add(file.getAbsolutePath());
            ProcessBuilder pb = new ProcessBuilder(comandos);
            pb.environment().put("PGPASSWORD", "root");
            try {
                final Process process = pb.start();
                try (BufferedReader r = new BufferedReader(
                        new InputStreamReader(process.getErrorStream()))) {
                    String line = r.readLine();
                    while (line != null) {
                        line = r.readLine();
                    }
                }
                process.waitFor();
                process.destroy();
                showMessageDialog(null, "Restauración exitosa");
            } catch (IOException | InterruptedException e) {
                showMessageDialog(null, "No se pudo encontrar el archivo","Error", ERROR_MESSAGE);
     
            }
        }
    }//GEN-LAST:event_RestauracionActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
       try {
        if (isDesktopSupported()) {
            Desktop desktop = getDesktop();
        if (desktop.isSupported(BROWSE)) {
            desktop.browse(new URI("https://www.facebook.com/pereiracomputerservices/"));
        }
        }
        } catch (IOException | URISyntaxException e) {
           showMessageDialog(null,"Error del Navegador");
        }
     
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        try {
        if (isDesktopSupported()) {
            Desktop desktop = getDesktop();
        if (desktop.isSupported(BROWSE)) {
            desktop.browse(new URI("https://www.google.com.sv/maps/place/Pereira+Computer+Services/@13.8040259,-88.1568606,16z/data=!4m12!1m6!3m5!1s0x0:0xa01accddfc546cef!2sPereira+Computer+Services!8m2!3d13.802213!4d-88.152451!3m4!1s0x0:0xa01accddfc546cef!8m2!3d13.802213!4d-88.152451"));
        }
        }
        } catch (IOException | URISyntaxException e) {
           showMessageDialog(null,"Error del Navegador");
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void DefuncionesReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DefuncionesReporteActionPerformed
  Connection conn = null;
        PreparedStatement prepSt = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = getConnection("jdbc:postgresql://192.168.1.10:5432/alcaldiadb", "postgres", "root");
        } catch (SQLException ex) {
            showMessageDialog(this, "No hay conexion a server\n");
        }
        try {
            JasperReport reporte = (JasperReport) loadObjectFromFile("Reportes\\Fallecidos.jasper");
            Map valores = new HashMap();
//        valores.put ( "MES" , mes );
//        valores.put ( "ANNO" , anno );
//        valores.put ( "IDEMPRESA" , idEmpresa1 );
        JasperPrint jasperPrint = fillReport(reporte, valores, conn);
        JasperViewer viewer = new JasperViewer(jasperPrint, false);
        viewer.toFront();
        viewer.setTitle("Reporte Partidas de Fallecidos");
        viewer.setSize(900, 600);
        viewer.setVisible(true);
        } catch (JRException ex) {
            showMessageDialog(this,"No encuentro archivo de Reporte");
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            showMessageDialog(this,"Error en Base de datos");
        }
        
    }//GEN-LAST:event_DefuncionesReporteActionPerformed

    private void skin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skin1ActionPerformed
//        try {
//            // TODO add your handling code here:
//            skin1();
//        } catch (IllegalAccessException | UnsupportedLookAndFeelException ex) {
//            getLogger(Principal.class.getName()).log(SEVERE, null, ex);
//        }
    }//GEN-LAST:event_skin1ActionPerformed

    private void skin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skin2ActionPerformed
        try {
            // TODO add your handling code here:
            skin2();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            getLogger(Principal.class.getName()).log(SEVERE, null, ex);
        }
    }//GEN-LAST:event_skin2ActionPerformed

    private void skin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skin3ActionPerformed
        try {
            // TODO add your handling code here:
            skin3();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            getLogger(Principal.class.getName()).log(SEVERE, null, ex);
        }
    }//GEN-LAST:event_skin3ActionPerformed

    private void skin4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skin4ActionPerformed
        try {
            skin4();
            // TODO add your handling code here:
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            getLogger(Principal.class.getName()).log(SEVERE, null, ex);
        }
    }//GEN-LAST:event_skin4ActionPerformed

    private void skin5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skin5ActionPerformed
        try {
            // TODO add your handling code here:
            skin5();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            getLogger(Principal.class.getName()).log(SEVERE, null, ex);
        }
    }//GEN-LAST:event_skin5ActionPerformed

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        int HAND_CURSOR1 = HAND_CURSOR;
        
    }//GEN-LAST:event_jLabel5MouseEntered

    private void NacimientosCrudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NacimientosCrudActionPerformed
        // TODO add your handling code here:
        PartidasCRUD partidasCRUD = new PartidasCRUD();
        jDesktopPane1.add(partidasCRUD);
        jDesktopPane1.getDesktopManager().maximizeFrame(partidasCRUD);
        partidasCRUD.setVisible(true);
        partidasCRUD.setIconifiable(true);
        partidasCRUD.setMaximizable(true);
        partidasCRUD.setClosable(true);
        partidasCRUD.setResizable(true);
        partidasCRUD.toFront();
    }//GEN-LAST:event_NacimientosCrudActionPerformed

    private void nacidosReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacidosReporteActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        PreparedStatement prepSt = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = getConnection("jdbc:postgresql://192.168.1.10:5432/alcaldiadb", "postgres", "root");
        } catch (SQLException ex) {
            showMessageDialog(this, "No hay conexion a server\n");
        }
        try {
            JasperReport reporte = (JasperReport) loadObjectFromFile("Reportes\\Partidas.jasper");
            Map valores = new HashMap();
//        valores.put ( "MES" , mes );
//        valores.put ( "ANNO" , anno );
//        valores.put ( "IDEMPRESA" , idEmpresa1 );
        JasperPrint jasperPrint = fillReport(reporte, valores, conn);
        JasperViewer viewer = new JasperViewer(jasperPrint, false);
        viewer.toFront();
        viewer.setTitle("Reporte Partidas de Nacimiento");
        viewer.setSize(900, 600);
        viewer.setVisible(true);
        } catch (JRException ex) {
            showMessageDialog(this,"No encuentro archivo de Reporte");
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            showMessageDialog(this,"Error en Base de datos");
        }
    }//GEN-LAST:event_nacidosReporteActionPerformed

    private void MatrimoniosReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatrimoniosReporteActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        PreparedStatement prepSt = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = getConnection("jdbc:postgresql://192.168.1.10:5432/alcaldiadb", "postgres", "root");
        } catch (SQLException ex) {
            showMessageDialog(this, "No hay conexion a server\n");
        }
        try {
            JasperReport reporte = (JasperReport) loadObjectFromFile("Reportes\\Matrimonios.jasper");
            Map valores = new HashMap();
//        valores.put ( "MES" , mes );
//        valores.put ( "ANNO" , anno );
//        valores.put ( "IDEMPRESA" , idEmpresa1 );
        JasperPrint jasperPrint = fillReport(reporte, valores, conn);
        JasperViewer viewer = new JasperViewer(jasperPrint, false);
        viewer.toFront();
        viewer.setTitle("Reporte Partidas de Matrimonios");
        viewer.setSize(900, 600);
        viewer.setVisible(true);
        } catch (JRException ex) {
            showMessageDialog(this,"No encuentro archivo de Reporte");
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            showMessageDialog(this,"Error en Base de datos");
        }
    }//GEN-LAST:event_MatrimoniosReporteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         DivorciosCRUD divorciosCRUD = new DivorciosCRUD();
        jDesktopPane1.add(divorciosCRUD);
        jDesktopPane1.getDesktopManager().maximizeFrame(divorciosCRUD);
        divorciosCRUD.setVisible(true);
        divorciosCRUD.setIconifiable(true);
        divorciosCRUD.setMaximizable(true);
        divorciosCRUD.setClosable(true);
        divorciosCRUD.setResizable(true);
        divorciosCRUD.toFront();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void DivorciosReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivorciosReporteActionPerformed
        // TODO add your handling code here:
          Connection conn = null;
        PreparedStatement prepSt = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = getConnection("jdbc:postgresql://192.168.1.10:5432/alcaldiadb", "postgres", "root");
        } catch (SQLException ex) {
            showMessageDialog(this, "No hay conexion a server\n");
        }
        try {
            JasperReport reporte = (JasperReport) loadObjectFromFile("Reportes\\Divorcios.jasper");
            Map valores = new HashMap();
//        valores.put ( "MES" , mes );
//        valores.put ( "ANNO" , anno );
//        valores.put ( "IDEMPRESA" , idEmpresa1 );
        JasperPrint jasperPrint = fillReport(reporte, valores, conn);
        JasperViewer viewer = new JasperViewer(jasperPrint, false);
        viewer.toFront();
        viewer.setTitle("Reporte Partidas de Divorcios");
        viewer.setSize(900, 600);
        viewer.setVisible(true);
        } catch (JRException ex) {
            showMessageDialog(this,"No encuentro archivo de Reporte");
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            showMessageDialog(this,"Error en Base de datos");
        }
    }//GEN-LAST:event_DivorciosReporteActionPerformed

    private void CedulasCedulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulasCedulasActionPerformed
        // TODO add your handling code here:
         CedulasCRUD cedulasCRUD = new CedulasCRUD();
        jDesktopPane1.add(cedulasCRUD);
        jDesktopPane1.getDesktopManager().maximizeFrame(cedulasCRUD);
        cedulasCRUD.setVisible(true);
        cedulasCRUD.setIconifiable(true);
        cedulasCRUD.setMaximizable(true);
        cedulasCRUD.setClosable(true);
        cedulasCRUD.setResizable(true);
        cedulasCRUD.toFront();
    }//GEN-LAST:event_CedulasCedulasActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
         acercaDe AcercaDe = new acercaDe();
        jDesktopPane1.add(AcercaDe);
        //jDesktopPane1.getDesktopManager().maximizeFrame(AcercaDe);
        AcercaDe.setVisible(true);
        AcercaDe.setIconifiable(true);
        //AcercaDe.setMaximizable(true);
        AcercaDe.setClosable(true);
        //AcercaDe.setResizable(true);
        AcercaDe.toFront();
                
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void CedulasReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulasReporteActionPerformed
        // TODO add your handling code here:
              Connection conn = null;
        PreparedStatement prepSt = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = getConnection("jdbc:postgresql://192.168.1.10:5432/alcaldiadb", "postgres", "root");
        } catch (SQLException ex) {
            showMessageDialog(this, "No hay conexion a server\n");
        }
        try {
            JasperReport reporte = (JasperReport) loadObjectFromFile("Reportes\\Cedulas.jasper");
            Map valores = new HashMap();
        JasperPrint jasperPrint = fillReport(reporte, valores, conn);
        JasperViewer viewer = new JasperViewer(jasperPrint, false);
        viewer.toFront();
        viewer.setTitle("Reporte cedulas de Identidad");
        viewer.setSize(900, 600);
        viewer.setVisible(true);
        } catch (JRException ex) {
            showMessageDialog(this,"No encuentro archivo de Reporte");
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            showMessageDialog(this,"Error en Base de datos");
        }
    }//GEN-LAST:event_CedulasReporteActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            getLogger(Principal.class.getName()).log(SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AdminUsuarios;
    private javax.swing.JMenu Administracion;
    private javax.swing.JMenu Cedulas;
    private javax.swing.JMenuItem CedulasCedulas;
    private javax.swing.JMenuItem CedulasReporte;
    private javax.swing.JMenuItem DefuncionesReporte;
    private javax.swing.JMenu DivorciosDivorcios;
    private javax.swing.JMenuItem DivorciosReporte;
    private javax.swing.JMenu Historicos;
    private javax.swing.JMenu Matrimonios;
    private javax.swing.JMenuItem MatrimoniosNuevos;
    private javax.swing.JMenuItem MatrimoniosReporte;
    private javax.swing.JMenu Nacimientos;
    private javax.swing.JMenuItem NacimientosCrud;
    private javax.swing.JMenuItem Respaldos;
    private javax.swing.JMenuItem Restauracion;
    private javax.swing.JMenu Sistema;
    private javax.swing.JMenuItem SistemaSalir;
    public javax.swing.JMenu Skin;
    public static javax.swing.JTextField campoUsuarioActivo;
    private javax.swing.JMenuItem defuncionesDef;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem nacidosReporte;
    private javax.swing.JMenuItem skin1;
    private javax.swing.JMenuItem skin2;
    private javax.swing.JMenuItem skin3;
    private javax.swing.JMenuItem skin4;
    private javax.swing.JMenuItem skin5;
    // End of variables declaration//GEN-END:variables

       private void skin2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        // code look&feel
        setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
        setTheme("", "PCS", "PCS");
    }

    private void skin3() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        //code look&feel
        setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
          setTheme("", "PCS", "PCS");
         }

    private void skin4() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        //code look&feel
        setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
         setTheme("", "PCS", "PCS");
 }

    private void skin5() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
            setTheme("", "PCS", "PCS");
  }
    private static final Logger LOG = Logger.getLogger(Principal.class.getName());
}
