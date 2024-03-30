package vista;

import controlador.ControladorColor;
import controlador.ControladorLongitud;
import controlador.ControladorMovRecUni;
import controlador.ControladorTiempo;
import controlador.ControladorUtilidades;
import controlador.ControladorVelocidad;
import java.awt.Color;
import javax.swing.JOptionPane;

public class vistaMRU extends javax.swing.JPanel {

    private ControladorColor color = new ControladorColor();
    private ControladorLongitud cl = new ControladorLongitud();
    private ControladorTiempo ct = new ControladorTiempo();
    private ControladorVelocidad cv = new ControladorVelocidad();
    private ControladorMovRecUni mru = new ControladorMovRecUni();
    private ControladorUtilidades ul = new ControladorUtilidades();

    public vistaMRU() {
        initComponents();
        color.menuColorear(menu);
        color.menuSeleccionar(btnVelocidad, labelVelocidad);
        rellenar();
        mostrarVelocidad();
    }

    //----- seleccion del switch -----//
    private String seleccion = "";
    //----- Paleta de colores -----//
    private Color letrasBase = color.getLetHeaderBase();
    private int numLetrasBase = letrasBase.getRGB();
    //----- variables -----//
    private double posInicial;
    private double posFinal;
    private double velocidad;
    private double tiempoFinal;
    private double tiempoInicial;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVelocidad = new javax.swing.JPanel();
        labelVelocidad = new javax.swing.JLabel();
        btnDistancia = new javax.swing.JPanel();
        labelDistancia = new javax.swing.JLabel();
        btnTiempo = new javax.swing.JPanel();
        labelTiempo = new javax.swing.JLabel();
        labelCuadro = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();
        cmbTiempoFinal = new javax.swing.JComboBox<>();
        txtTiempoFinal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbPosInicial = new javax.swing.JComboBox<>();
        txtPosInicial = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbVelocidad = new javax.swing.JComboBox<>();
        txtVelocidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbTiempoInicial = new javax.swing.JComboBox<>();
        txtTiempoInicial = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPosFinal = new javax.swing.JTextField();
        cmbPosFinal = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setMaximumSize(new java.awt.Dimension(144, 470));
        menu.setMinimumSize(new java.awt.Dimension(144, 470));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calcular");
        menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 35, 140, -1));

        btnVelocidad.setBackground(new java.awt.Color(231, 231, 231));
        btnVelocidad.setMaximumSize(new java.awt.Dimension(135, 40));
        btnVelocidad.setMinimumSize(new java.awt.Dimension(135, 40));
        btnVelocidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVelocidadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVelocidadMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVelocidadMousePressed(evt);
            }
        });
        btnVelocidad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelVelocidad.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelVelocidad.setForeground(new java.awt.Color(0, 0, 0));
        labelVelocidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVelocidad.setText("Velocidad");
        btnVelocidad.add(labelVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 155, 40));

        menu.add(btnVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 80, 152, 40));

        btnDistancia.setBackground(new java.awt.Color(231, 231, 231));
        btnDistancia.setMaximumSize(new java.awt.Dimension(135, 40));
        btnDistancia.setMinimumSize(new java.awt.Dimension(135, 40));
        btnDistancia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDistanciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDistanciaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDistanciaMousePressed(evt);
            }
        });
        btnDistancia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelDistancia.setBackground(new java.awt.Color(231, 231, 231));
        labelDistancia.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelDistancia.setForeground(new java.awt.Color(0, 0, 0));
        labelDistancia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDistancia.setText("Distancia");
        btnDistancia.add(labelDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 155, 40));

        menu.add(btnDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 152, 40));

        btnTiempo.setBackground(new java.awt.Color(231, 231, 231));
        btnTiempo.setMaximumSize(new java.awt.Dimension(135, 40));
        btnTiempo.setMinimumSize(new java.awt.Dimension(135, 40));
        btnTiempo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTiempoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTiempoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTiempoMousePressed(evt);
            }
        });
        btnTiempo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTiempo.setBackground(new java.awt.Color(231, 231, 231));
        labelTiempo.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelTiempo.setForeground(new java.awt.Color(0, 0, 0));
        labelTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTiempo.setText("Tiempo");
        btnTiempo.add(labelTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 155, 40));

        menu.add(btnTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, 152, 40));

        labelCuadro.setBackground(new java.awt.Color(0, 0, 0));
        labelCuadro.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelCuadro.setForeground(new java.awt.Color(0, 0, 0));
        labelCuadro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCuadro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/menuMRU.png"))); // NOI18N
        labelCuadro.setMaximumSize(new java.awt.Dimension(135, 40));
        labelCuadro.setMinimumSize(new java.awt.Dimension(135, 40));
        labelCuadro.setPreferredSize(new java.awt.Dimension(135, 40));
        menu.add(labelCuadro, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 190, 310));

        add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 170, 470));

        contenido.setBackground(new java.awt.Color(255, 255, 255));

        cmbTiempoFinal.setBackground(new java.awt.Color(255, 255, 255));
        cmbTiempoFinal.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbTiempoFinal.setForeground(new java.awt.Color(0, 0, 0));
        cmbTiempoFinal.setBorder(null);

        txtTiempoFinal.setBackground(new java.awt.Color(255, 255, 255));
        txtTiempoFinal.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtTiempoFinal.setForeground(new java.awt.Color(0, 0, 0));
        txtTiempoFinal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel4.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tiempo Final");

        btnCalcular.setBackground(new java.awt.Color(204, 204, 204));
        btnCalcular.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(0, 0, 0));
        btnCalcular.setText("Calcular");
        btnCalcular.setBorder(null);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 27)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Digite los datos");

        cmbPosInicial.setBackground(new java.awt.Color(255, 255, 255));
        cmbPosInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbPosInicial.setForeground(new java.awt.Color(0, 0, 0));
        cmbPosInicial.setBorder(null);

        txtPosInicial.setBackground(new java.awt.Color(255, 255, 255));
        txtPosInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtPosInicial.setForeground(new java.awt.Color(0, 0, 0));
        txtPosInicial.setText("0");
        txtPosInicial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtPosInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPosInicialMouseClicked(evt);
            }
        });
        txtPosInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosInicialActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Posición inicial");

        cmbVelocidad.setBackground(new java.awt.Color(255, 255, 255));
        cmbVelocidad.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbVelocidad.setForeground(new java.awt.Color(0, 0, 0));
        cmbVelocidad.setBorder(null);

        txtVelocidad.setBackground(new java.awt.Color(255, 255, 255));
        txtVelocidad.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtVelocidad.setForeground(new java.awt.Color(0, 0, 0));
        txtVelocidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Velocidad");

        cmbTiempoInicial.setBackground(new java.awt.Color(255, 255, 255));
        cmbTiempoInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbTiempoInicial.setForeground(new java.awt.Color(0, 0, 0));
        cmbTiempoInicial.setBorder(null);

        txtTiempoInicial.setBackground(new java.awt.Color(255, 255, 255));
        txtTiempoInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtTiempoInicial.setForeground(new java.awt.Color(0, 0, 0));
        txtTiempoInicial.setText("0");
        txtTiempoInicial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtTiempoInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTiempoInicialMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tiempo inicial");

        jLabel7.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Posición final");

        txtPosFinal.setBackground(new java.awt.Color(255, 255, 255));
        txtPosFinal.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtPosFinal.setForeground(new java.awt.Color(0, 0, 0));
        txtPosFinal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtPosFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPosFinalMouseClicked(evt);
            }
        });
        txtPosFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosFinalActionPerformed(evt);
            }
        });

        cmbPosFinal.setBackground(new java.awt.Color(255, 255, 255));
        cmbPosFinal.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        cmbPosFinal.setForeground(new java.awt.Color(0, 0, 0));
        cmbPosFinal.setBorder(null);

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addGroup(contenidoLayout.createSequentialGroup()
                                    .addComponent(txtTiempoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(cmbTiempoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(contenidoLayout.createSequentialGroup()
                                    .addComponent(txtPosInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(cmbPosInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(contenidoLayout.createSequentialGroup()
                                .addComponent(txtPosFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(cmbPosFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addGroup(contenidoLayout.createSequentialGroup()
                                .addComponent(txtTiempoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(cmbTiempoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(80, 80, 80))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(contenidoLayout.createSequentialGroup()
                                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(contenidoLayout.createSequentialGroup()
                                        .addComponent(txtVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(cmbVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel5)
                .addGap(37, 37, 37)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPosInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPosInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPosFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPosFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTiempoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTiempoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTiempoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTiempoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 720, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void btnVelocidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadMousePressed
        mostrarVelocidad();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        color.menuSeleccionar(btnVelocidad, labelVelocidad);
    }//GEN-LAST:event_btnVelocidadMousePressed

    private void btnVelocidadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadMouseExited
        if (labelDistancia.getForeground().getRGB() != numLetrasBase
                || labelTiempo.getForeground().getRGB() != numLetrasBase)
            color.menuSale(labelVelocidad);
    }//GEN-LAST:event_btnVelocidadMouseExited

    private void btnVelocidadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadMouseEntered
        if (labelVelocidad.getForeground().getRGB() == numLetrasBase)
            color.menuEntra(labelVelocidad);
    }//GEN-LAST:event_btnVelocidadMouseEntered

    private void btnDistanciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDistanciaMouseEntered
        if (labelDistancia.getForeground().getRGB() == numLetrasBase)
            color.menuEntra(labelDistancia);
    }//GEN-LAST:event_btnDistanciaMouseEntered

    private void btnDistanciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDistanciaMouseExited
        if (labelVelocidad.getForeground().getRGB() != numLetrasBase
                || labelTiempo.getForeground().getRGB() != numLetrasBase)
            color.menuSale(labelDistancia);
    }//GEN-LAST:event_btnDistanciaMouseExited

    private void btnDistanciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDistanciaMousePressed
        mostrarDistancia();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        color.menuSeleccionar(btnDistancia, labelDistancia);
    }//GEN-LAST:event_btnDistanciaMousePressed

    private void btnTiempoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoMousePressed
        mostrarTiempo();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        color.menuSeleccionar(btnTiempo, labelTiempo);
    }//GEN-LAST:event_btnTiempoMousePressed

    private void btnTiempoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoMouseExited
        if (labelVelocidad.getForeground().getRGB() != numLetrasBase
                || labelDistancia.getForeground().getRGB() != numLetrasBase)
            color.menuSale(labelTiempo);
    }//GEN-LAST:event_btnTiempoMouseExited

    private void btnTiempoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoMouseEntered
        if (labelTiempo.getForeground().getRGB() == numLetrasBase)
            color.menuEntra(labelTiempo);
    }//GEN-LAST:event_btnTiempoMouseEntered

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        switch (seleccion) {
            case "velocidad":
                calcularVelocidad();
                break;
            case "distancia":
                calcularDistancia();
                break;
            case "tiempo":
                calcularTiempo();
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        ul.limpiarCampo(contenido);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtPosInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPosInicialMouseClicked

    }//GEN-LAST:event_txtPosInicialMouseClicked

    private void txtPosInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosInicialActionPerformed

    }//GEN-LAST:event_txtPosInicialActionPerformed

    private void txtTiempoInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTiempoInicialMouseClicked

    }//GEN-LAST:event_txtTiempoInicialMouseClicked

    private void txtPosFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPosFinalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPosFinalMouseClicked

    private void txtPosFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPosFinalActionPerformed

    //----- Rellenar paneles ------//
    private void mostrarVelocidad() {
        ul.desbloquearCampo(contenido);
        txtVelocidad.setEnabled(false);
        cmbVelocidad.setEnabled(false);
        seleccion = "velocidad";
    }

    private void mostrarDistancia() {
        ul.desbloquearCampo(contenido);
        txtPosFinal.setEnabled(false);
        cmbPosFinal.setEnabled(false);
        seleccion = "distancia";
    }

    private void mostrarTiempo() {
        ul.desbloquearCampo(contenido);
        txtTiempoFinal.setEnabled(false);
        cmbTiempoFinal.setEnabled(false);
        txtTiempoInicial.setEnabled(false);
        cmbTiempoInicial.setEnabled(false);
        seleccion = "tiempo";
    }
    //----- Fin del relleno ------//

    //----- Métodos de utilidad -----//
    private void resetearTodo() {
        color.menuRemover(btnVelocidad, labelVelocidad);
        color.menuRemover(btnDistancia, labelDistancia);
        color.menuRemover(btnTiempo, labelTiempo);
    }

    private void rellenar() {
        cl.rellenarCombo(cmbPosInicial);
        cl.rellenarCombo(cmbPosFinal);
        cv.rellenarCombo(cmbVelocidad);
        ct.rellenarCombo(cmbTiempoInicial);
        ct.rellenarCombo(cmbTiempoFinal);
    }
    
    private void calcularVelocidad() {
        try {
            //----- Recoger datos y convertirlos en S.I. -----//
            tiempoInicial = ct.convertirTiempo(Double.parseDouble(txtTiempoInicial.getText()),
                    cmbTiempoInicial.getSelectedItem().toString());
            tiempoFinal = ct.convertirTiempo(Double.parseDouble(txtTiempoFinal.getText()),
                    cmbTiempoFinal.getSelectedItem().toString());
            posInicial = cl.convertirLongitud(Double.parseDouble(txtPosInicial.getText()),
                    cmbPosInicial.getSelectedItem().toString());
            posFinal = cl.convertirLongitud(Double.parseDouble(txtPosFinal.getText()),
                    cmbPosFinal.getSelectedItem().toString());
            //----- Guardar datos -----//
            mru = new ControladorMovRecUni(tiempoInicial, tiempoFinal, 0, posInicial, posFinal);
            //----- Condición para mostrar cálculos -----//
            if (tiempoFinal > tiempoInicial) {
                double diferenciaPosicion = posFinal - posInicial;
                double diferenciaTiempo = tiempoFinal - tiempoInicial;

                JOptionPane.showMessageDialog(this, "Velocidad calculada. \n" + mru.calcularVelocidad() + " m/s");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos "
                    + "los campos para continuar..", "Error", 0);
        }
    }

    private void calcularDistancia() {
        try {
            tiempoInicial = ct.convertirTiempo(Double.parseDouble(txtTiempoInicial.getText()),
                    cmbTiempoInicial.getSelectedItem().toString());
            tiempoFinal = ct.convertirTiempo(Double.parseDouble(txtTiempoFinal.getText()),
                    cmbTiempoFinal.getSelectedItem().toString());
            posInicial = cl.convertirLongitud(Double.parseDouble(txtPosInicial.getText()),
                    cmbPosInicial.getSelectedItem().toString());
            velocidad = cv.convertirVelocidad(Double.parseDouble(txtVelocidad.getText()),
                    cmbVelocidad.getSelectedItem().toString());
            //----- Guardar datos -----//
            mru = new ControladorMovRecUni(tiempoInicial, tiempoFinal, velocidad, posInicial, 0);
            JOptionPane.showMessageDialog(this,
                    "Distancia calculada. \n" + mru.calcularPosicion() + "m");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos "
                    + "los campos para continuar..", "Error", 0);
        }
    }
    
    private void calcularTiempo() {
        try {
            //----- Recoger datos y convertirlos en S.I. -----//
            posInicial = cl.convertirLongitud(Double.parseDouble(txtPosInicial.getText()),
                    cmbPosInicial.getSelectedItem().toString());
            posFinal = cl.convertirLongitud(Double.parseDouble(txtPosFinal.getText()),
                    cmbPosFinal.getSelectedItem().toString());
            velocidad = cv.convertirVelocidad(Double.parseDouble(txtVelocidad.getText()),
                    cmbVelocidad.getSelectedItem().toString());
            //----- Guardar datos -----//        
            mru = new ControladorMovRecUni(0, 0, velocidad, posInicial, posFinal);
            
            JOptionPane.showMessageDialog(this,
                    "Tiempo calculado. \n" + mru.calcularTiempo() + " s");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos "
                    + "los campos para continuar..", "Error", 0);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JPanel btnDistancia;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JPanel btnTiempo;
    private javax.swing.JPanel btnVelocidad;
    private javax.swing.JComboBox<String> cmbPosFinal;
    private javax.swing.JComboBox<String> cmbPosInicial;
    private javax.swing.JComboBox<String> cmbTiempoFinal;
    private javax.swing.JComboBox<String> cmbTiempoInicial;
    private javax.swing.JComboBox<String> cmbVelocidad;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelCuadro;
    private javax.swing.JLabel labelDistancia;
    private javax.swing.JLabel labelTiempo;
    private javax.swing.JLabel labelVelocidad;
    private javax.swing.JPanel menu;
    private javax.swing.JTextField txtPosFinal;
    private javax.swing.JTextField txtPosInicial;
    private javax.swing.JTextField txtTiempoFinal;
    private javax.swing.JTextField txtTiempoInicial;
    private javax.swing.JTextField txtVelocidad;
    // End of variables declaration//GEN-END:variables
}
