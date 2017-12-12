package sv.com.pereira.gui;

import com.placeholder.PlaceHolder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_ENTER;
import java.math.BigInteger;
import java.util.List;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import static javax.persistence.Persistence.createEntityManagerFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import pojos.Nacimientos;

public class PartidasCRUD extends javax.swing.JInternalFrame {

    public PartidasCRUD() {
        initComponents();
        PlaceHolder holder = new PlaceHolder(campoBuscoNombre, "Digite nombre completo o parte y pulse <<ENTER>>");
        PlaceHolder holder1 = new PlaceHolder(campoNombre, "Digite nombre completo..");
        PlaceHolder holder2 = new PlaceHolder(campoNumLibro, "# LIBRO");
        PlaceHolder holder3 = new PlaceHolder(campoNumPagina, "# PAGINA");
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBotones = new javax.swing.ButtonGroup();
        AlcaldiasPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("AlcaldiasPU").createEntityManager();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        RadioButtonAgregar = new javax.swing.JRadioButton();
        RadioButtonModificar = new javax.swing.JRadioButton();
        RadioButtonEliminar = new javax.swing.JRadioButton();
        btnProcesar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        campoBuscoNombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaNacimientos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        campoNombre = new javax.swing.JTextField();
        campoNumPagina = new javax.swing.JTextField();
        campoNumLibro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Partidas de Nacimientos");
        setToolTipText("");
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Partidas de Nacimientos");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 0, 0))); // NOI18N

        GrupoBotones.add(RadioButtonAgregar);
        RadioButtonAgregar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RadioButtonAgregar.setSelected(true);
        RadioButtonAgregar.setText("Agregar");
        RadioButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonAgregarActionPerformed(evt);
            }
        });

        GrupoBotones.add(RadioButtonModificar);
        RadioButtonModificar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RadioButtonModificar.setText("Modificar");

        GrupoBotones.add(RadioButtonEliminar);
        RadioButtonEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RadioButtonEliminar.setText("Eliminar");

        btnProcesar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnProcesar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RadioButtonEliminar)
                    .addComponent(RadioButtonModificar)
                    .addComponent(RadioButtonAgregar))
                .addGap(126, 126, 126))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnProcesar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioButtonAgregar)
                .addGap(30, 30, 30)
                .addComponent(RadioButtonModificar)
                .addGap(30, 30, 30)
                .addComponent(RadioButtonEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        campoBuscoNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        campoBuscoNombre.setToolTipText("Ddigite y pulse enter");
        campoBuscoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoBuscoNombreKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoBuscoNombreKeyReleased(evt);
            }
        });

        tablaNacimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idNac", "Nombre", "# Libro", "Pagina"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaNacimientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaNacimientosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaNacimientos);
        if (tablaNacimientos.getColumnModel().getColumnCount() > 0) {
            tablaNacimientos.getColumnModel().getColumn(0).setMinWidth(60);
            tablaNacimientos.getColumnModel().getColumn(0).setPreferredWidth(60);
            tablaNacimientos.getColumnModel().getColumn(0).setMaxWidth(60);
            tablaNacimientos.getColumnModel().getColumn(2).setMinWidth(100);
            tablaNacimientos.getColumnModel().getColumn(2).setPreferredWidth(100);
            tablaNacimientos.getColumnModel().getColumn(2).setMaxWidth(100);
            tablaNacimientos.getColumnModel().getColumn(3).setMinWidth(100);
            tablaNacimientos.getColumnModel().getColumn(3).setPreferredWidth(100);
            tablaNacimientos.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Datos solicitados y encontrados");
        jLabel2.setToolTipText("");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 0, 0), null, null), "Ingreso o modificacion de datos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(204, 0, 0))); // NOI18N

        campoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoNombreKeyPressed(evt);
            }
        });

        campoNumPagina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoNumPaginaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoNumPaginaKeyTyped(evt);
            }
        });

        campoNumLibro.setToolTipText("");
        campoNumLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoNumLibroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoNumLibroKeyTyped(evt);
            }
        });

        jLabel3.setText("Nombre");

        jLabel4.setText("# Libro");

        jLabel5.setText("# Pag.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(campoNumLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNumPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 185, Short.MAX_VALUE))
            .addComponent(campoNombre)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNumLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNumPagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/partidasIMG.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoBuscoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(15, 15, 15)
                        .addComponent(campoBuscoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      
    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed
    // INICIA RUTINA FILTRADO DE DATA
   // TableRowSorter trs1 ;
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        EntityManagerFactory emf = createEntityManagerFactory("AlcaldiasPU");
        EntityManager em = emf.createEntityManager();
        int fila = tablaNacimientos.getSelectedRow();
        System.out.println("fila selecionada es "+fila);
        String idNacido = "";
        int idNacido1 = 0;
        if(RadioButtonModificar.isSelected()||(RadioButtonEliminar.isSelected())){
           if(fila==-1){
              JOptionPane.showMessageDialog(this, "seleccione Registro");
              return;
            } 
            idNacido = tablaNacimientos.getValueAt(fila, 0).toString();
            idNacido1 = Integer.parseInt(idNacido);
        }
        
        if(RadioButtonAgregar.isSelected())
            {
                 if(campoNombre.getText().equals("Digite nombre completo..")||campoNombre.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Falta Datos en nombres");
               campoNombre.requestFocus();
               return;
            }
            if(campoNumLibro.getText().isEmpty())
            {
               JOptionPane.showMessageDialog(this, "Ingrese # libro");
               campoNumLibro.requestFocus();
               return;
            }
            if(campoNumPagina.getText().isEmpty())
            {
               JOptionPane.showMessageDialog(this, "Ingrese # pagina");
               campoNumPagina.requestFocus();
               return;
            }
            
            Nacimientos nacidos = new Nacimientos();
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            try {
                nacidos.setNombre(campoNombre.getText().toUpperCase());
                nacidos.setLibro(new BigInteger(campoNumLibro.getText()));
                nacidos.setPagina(new BigInteger(campoNumPagina.getText()));
                em.persist(nacidos);
                tx.commit();
                } catch (Exception e) {
                    tx.rollback();
                }
             cargarDataTabla();
            limpiarCampos();
           // JOptionPane.showMessageDialog(this, "Registro grabado...");
           
        }// fin de Agregar
        if(RadioButtonModificar.isSelected())
        {
            if(campoNombre.getText().equals("Digite nombre completo..")||campoNombre.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Falta Datos en nombres");
               campoNombre.requestFocus();
               return;
            }
            if(campoNumLibro.getText().isEmpty())
            {
               JOptionPane.showMessageDialog(this, "Ingrese # libro");
               campoNumLibro.requestFocus();
               return;
            }
            if(campoNumPagina.getText().isEmpty())
            {
               JOptionPane.showMessageDialog(this, "Ingrese # pagina");
               campoNumPagina.requestFocus();
               return;
            }
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            try {
               Nacimientos nacidos = em.find(Nacimientos.class, idNacido1);
               nacidos.setNombre(campoNombre.getText().toUpperCase());
               nacidos.setLibro(new BigInteger(campoNumLibro.getText()));
               nacidos.setPagina(new BigInteger(campoNumPagina.getText()));
               em.persist(nacidos);
               tx.commit();
            } catch (Exception e) {
               tx.rollback();
            }
            limpiarCampos();
            JOptionPane.showMessageDialog(this, "Registro editado correctamente");
        }//fin de Modificar
        if(RadioButtonEliminar.isSelected())
        {
            if(campoNombre.getText().equals("Digite nombre completo..")||campoNombre.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Falta Datos en nombres");
                campoNombre.requestFocus();
                return;
            }
            if(campoNumLibro.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Ingrese # libro");
                campoNumLibro.requestFocus();
                return;
            }
            if(campoNumPagina.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Ingrese # pagina");
                campoNumPagina.requestFocus();
                return;
            }
            int respuesta=JOptionPane.showConfirmDialog(this, "Desea eliminar Registro seleccionado?");
            if(respuesta==1|| respuesta==2||respuesta==-1)
            {
                return;
            }else
            {
                EntityTransaction tx = em.getTransaction();
                tx.begin();
                try {
                Nacimientos nacidos = em.find(Nacimientos.class, idNacido1);
                em.remove(nacidos);
                tx.commit();
            } catch (Exception e){
                tx.rollback();
            }
            limpiarCampos();
            cargarDataTabla();
            JOptionPane.showMessageDialog(this, "Registro ELIMINADO");
            }// fin eliminar
            }
        em.close();
    }//GEN-LAST:event_btnProcesarActionPerformed
    TableRowSorter trs;
    private void RadioButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButtonAgregarActionPerformed

    private void campoBuscoNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscoNombreKeyReleased
        
    }//GEN-LAST:event_campoBuscoNombreKeyReleased

    private void campoBuscoNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscoNombreKeyPressed
        // TODO add your handling code here:
        EntityManagerFactory emf = createEntityManagerFactory("AlcaldiasPU");
        EntityManager em = emf.createEntityManager();
        DefaultTableModel tablaEncontrados = (DefaultTableModel) tablaNacimientos.getModel();// escribir data encontrada
        if(evt.getKeyCode()==VK_ENTER) 
        {
           DefaultTableModel temp = (DefaultTableModel) tablaNacimientos.getModel();// elimina data en jtable
           int a = temp.getRowCount();
           for (int i = 0; i < a; i++) {
                temp.removeRow(0);
           }
           List<Nacimientos> resultList = em.createNativeQuery("select * from nacimientos  WHERE nombre like '%"+campoBuscoNombre.getText().toUpperCase()+"%'", Nacimientos.class).getResultList();
           for (Nacimientos next : resultList) {
                Object FilaElemento[] = {next.getIdpda(), next.getNombre(), next.getLibro(), next.getPagina() };
                tablaEncontrados.addRow(FilaElemento);
            }
        }
        int lineasTablaData = tablaNacimientos.getRowCount();
        tablaNacimientos.getSelectionModel().setSelectionInterval(lineasTablaData-1,lineasTablaData-1);
    }//GEN-LAST:event_campoBuscoNombreKeyPressed

    private void tablaNacimientosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaNacimientosMouseClicked
        // TODO add your handling code here:
        int fila = tablaNacimientos.getSelectedRow();
        if(RadioButtonModificar.isSelected()|| (RadioButtonEliminar.isSelected()))
        {
            campoNombre.setText(tablaNacimientos.getValueAt(fila, 1).toString());
            campoNumLibro.setText(tablaNacimientos.getValueAt(fila, 2).toString());
            campoNumPagina.setText(tablaNacimientos.getValueAt(fila, 3).toString());
        }
    }//GEN-LAST:event_tablaNacimientosMouseClicked

    private void campoNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNombreKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==VK_ENTER) 
        {
            campoNumLibro.requestFocus();
        }
    }//GEN-LAST:event_campoNombreKeyPressed

    private void campoNumLibroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNumLibroKeyTyped
        // ingresa solo numeros enteros
        campoNumLibro.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped(KeyEvent e)
            {
              char caracter = e.getKeyChar();

              // Verificar si la tecla pulsada no es un digito
              if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
              {
                 e.consume();  // ignorar el evento de teclado
              }
            }
        });
    }//GEN-LAST:event_campoNumLibroKeyTyped

    private void campoNumPaginaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNumPaginaKeyTyped
        // ingresa solo numeros enteros
        campoNumPagina.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped(KeyEvent e)
            {
              char caracter = e.getKeyChar();

              // Verificar si la tecla pulsada no es un digito
              if(((caracter < '0') ||(caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
              {
                 e.consume();  // ignorar el evento de teclado
              }
            }
        });
    }//GEN-LAST:event_campoNumPaginaKeyTyped

    private void campoNumLibroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNumLibroKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==VK_ENTER) 
        {
            campoNumPagina.requestFocus();
        }
    }//GEN-LAST:event_campoNumLibroKeyPressed

    private void campoNumPaginaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNumPaginaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==VK_ENTER) 
        {
            btnProcesar.requestFocus();
        }
    }//GEN-LAST:event_campoNumPaginaKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager AlcaldiasPUEntityManager;
    private javax.swing.ButtonGroup GrupoBotones;
    private javax.swing.JRadioButton RadioButtonAgregar;
    private javax.swing.JRadioButton RadioButtonEliminar;
    private javax.swing.JRadioButton RadioButtonModificar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField campoBuscoNombre;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoNumLibro;
    private javax.swing.JTextField campoNumPagina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaNacimientos;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        campoNombre.setText("");
        campoNumLibro.setText("");
        campoNumPagina.setText("");
    }
    private static final Logger LOG = getLogger(PartidasCRUD.class.getName());

    private void cargarDataTabla() {
        EntityManagerFactory emf = createEntityManagerFactory("AlcaldiasPU");
        EntityManager em = emf.createEntityManager();
        DefaultTableModel tablaFactura = (DefaultTableModel) tablaNacimientos.getModel();
        List<Nacimientos> resultList = em.createQuery("Select n From Nacimientos n order by n.idpda asc", Nacimientos.class).getResultList();
        for (Nacimientos next : resultList) 
        {
            Object FilaElemento[] = {next.getIdpda(),next.getNombre(),next.getLibro(),next.getPagina()};
            tablaFactura.addRow(FilaElemento); 
        }  
        int lineasTablaData = tablaNacimientos.getRowCount();
        tablaNacimientos.getSelectionModel().setSelectionInterval(lineasTablaData-1,lineasTablaData-1);// selecciona ultimo registro
        tablaNacimientos.scrollRectToVisible(tablaNacimientos.getCellRect(tablaNacimientos.getRowCount()-1, 0, true));// va al ultimo registro
    }

    private void validarCampos() {
       
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
