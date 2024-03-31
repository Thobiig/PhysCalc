package vista;

import controlador.ControladorColor;
import java.awt.Color;

public class vistaMP extends javax.swing.JPanel {

    private ControladorColor color = new ControladorColor();
    
    public vistaMP() {
        initComponents();
        color.menuColorear(Menu);
        color.menuSeleccionar(btnVelocidadInicial, labelVelocidadInicial);
        mostrarVelocidadInicial();  
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVelocidadInicial = new javax.swing.JPanel();
        labelVelocidadInicial = new javax.swing.JLabel();
        btnVelocidadInicialX = new javax.swing.JPanel();
        labelVelocidadInicialX = new javax.swing.JLabel();
        btnVelocidadInicialY = new javax.swing.JPanel();
        labelVelocidadInicialY = new javax.swing.JLabel();
        btnAltura = new javax.swing.JPanel();
        labelAltura = new javax.swing.JLabel();
        btnDistancia = new javax.swing.JPanel();
        labelDistancia = new javax.swing.JLabel();
        btnAlcanceHorizontal = new javax.swing.JPanel();
        labelAlcanceHorizontal = new javax.swing.JLabel();
        btnTiempo = new javax.swing.JPanel();
        labelTiempo = new javax.swing.JLabel();
        btnTiempoVuelo = new javax.swing.JPanel();
        labelTiempoVuelo = new javax.swing.JLabel();
        labelCuadro = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        Menu.setBackground(new java.awt.Color(255, 255, 255));
        Menu.setMaximumSize(new java.awt.Dimension(144, 470));
        Menu.setMinimumSize(new java.awt.Dimension(144, 470));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calcular");
        Menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, 140, -1));

        btnVelocidadInicial.setBackground(new java.awt.Color(231, 231, 231));
        btnVelocidadInicial.setMaximumSize(new java.awt.Dimension(135, 40));
        btnVelocidadInicial.setMinimumSize(new java.awt.Dimension(135, 40));
        btnVelocidadInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVelocidadInicialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVelocidadInicialMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVelocidadInicialMousePressed(evt);
            }
        });
        btnVelocidadInicial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelVelocidadInicial.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelVelocidadInicial.setForeground(new java.awt.Color(0, 0, 0));
        labelVelocidadInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVelocidadInicial.setText("Velocidad inicial");
        btnVelocidadInicial.add(labelVelocidadInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 155, 40));

        Menu.add(btnVelocidadInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 70, 152, 40));

        btnVelocidadInicialX.setBackground(new java.awt.Color(231, 231, 231));
        btnVelocidadInicialX.setMaximumSize(new java.awt.Dimension(135, 40));
        btnVelocidadInicialX.setMinimumSize(new java.awt.Dimension(135, 40));
        btnVelocidadInicialX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVelocidadInicialXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVelocidadInicialXMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVelocidadInicialXMousePressed(evt);
            }
        });
        btnVelocidadInicialX.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelVelocidadInicialX.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelVelocidadInicialX.setForeground(new java.awt.Color(0, 0, 0));
        labelVelocidadInicialX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVelocidadInicialX.setText("Velocidad inicial x");
        btnVelocidadInicialX.add(labelVelocidadInicialX, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 155, 40));

        Menu.add(btnVelocidadInicialX, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 110, 152, 40));

        btnVelocidadInicialY.setBackground(new java.awt.Color(231, 231, 231));
        btnVelocidadInicialY.setMaximumSize(new java.awt.Dimension(135, 40));
        btnVelocidadInicialY.setMinimumSize(new java.awt.Dimension(135, 40));
        btnVelocidadInicialY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVelocidadInicialYMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVelocidadInicialYMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVelocidadInicialYMousePressed(evt);
            }
        });
        btnVelocidadInicialY.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelVelocidadInicialY.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelVelocidadInicialY.setForeground(new java.awt.Color(0, 0, 0));
        labelVelocidadInicialY.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVelocidadInicialY.setText("Velocidad inicial y");
        btnVelocidadInicialY.add(labelVelocidadInicialY, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 155, 40));

        Menu.add(btnVelocidadInicialY, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 150, 152, 40));

        btnAltura.setBackground(new java.awt.Color(231, 231, 231));
        btnAltura.setMaximumSize(new java.awt.Dimension(135, 40));
        btnAltura.setMinimumSize(new java.awt.Dimension(135, 40));
        btnAltura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAlturaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAlturaMousePressed(evt);
            }
        });
        btnAltura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAltura.setBackground(new java.awt.Color(231, 231, 231));
        labelAltura.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelAltura.setForeground(new java.awt.Color(0, 0, 0));
        labelAltura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAltura.setText("Altura");
        btnAltura.add(labelAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 155, 40));

        Menu.add(btnAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, 152, 40));

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

        Menu.add(btnDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 230, 152, 40));

        btnAlcanceHorizontal.setBackground(new java.awt.Color(231, 231, 231));
        btnAlcanceHorizontal.setMaximumSize(new java.awt.Dimension(135, 40));
        btnAlcanceHorizontal.setMinimumSize(new java.awt.Dimension(135, 40));
        btnAlcanceHorizontal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlcanceHorizontalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAlcanceHorizontalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAlcanceHorizontalMousePressed(evt);
            }
        });
        btnAlcanceHorizontal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAlcanceHorizontal.setBackground(new java.awt.Color(231, 231, 231));
        labelAlcanceHorizontal.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelAlcanceHorizontal.setForeground(new java.awt.Color(0, 0, 0));
        labelAlcanceHorizontal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAlcanceHorizontal.setText("Alcance horizontal");
        btnAlcanceHorizontal.add(labelAlcanceHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 155, 40));

        Menu.add(btnAlcanceHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 270, 152, 40));

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

        Menu.add(btnTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 310, 152, 40));

        btnTiempoVuelo.setBackground(new java.awt.Color(231, 231, 231));
        btnTiempoVuelo.setMaximumSize(new java.awt.Dimension(135, 40));
        btnTiempoVuelo.setMinimumSize(new java.awt.Dimension(135, 40));
        btnTiempoVuelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTiempoVueloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTiempoVueloMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTiempoVueloMousePressed(evt);
            }
        });
        btnTiempoVuelo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTiempoVuelo.setBackground(new java.awt.Color(231, 231, 231));
        labelTiempoVuelo.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelTiempoVuelo.setForeground(new java.awt.Color(0, 0, 0));
        labelTiempoVuelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTiempoVuelo.setText("Tiempo vuelo");
        btnTiempoVuelo.add(labelTiempoVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 155, 40));

        Menu.add(btnTiempoVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 350, 152, 40));

        labelCuadro.setBackground(new java.awt.Color(0, 0, 0));
        labelCuadro.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelCuadro.setForeground(new java.awt.Color(0, 0, 0));
        labelCuadro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCuadro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/menuMovParabolico.png"))); // NOI18N
        labelCuadro.setMaximumSize(new java.awt.Dimension(135, 40));
        labelCuadro.setMinimumSize(new java.awt.Dimension(135, 40));
        labelCuadro.setPreferredSize(new java.awt.Dimension(135, 40));
        Menu.add(labelCuadro, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 190, 510));

        contenido.setBackground(new java.awt.Color(51, 255, 255));
        contenido.setForeground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVelocidadInicialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadInicialMouseEntered
        if (labelVelocidadInicial.getForeground().getRGB() == color.getLetMenu().getRGB())
            color.menuEntra(labelVelocidadInicial);
    }//GEN-LAST:event_btnVelocidadInicialMouseEntered

    private void btnVelocidadInicialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadInicialMouseExited
        if (labelVelocidadInicialX.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelVelocidadInicialY.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelAltura.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelDistancia.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelAlcanceHorizontal.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelTiempo.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelTiempoVuelo.getForeground().getRGB() != color.getLetMenu().getRGB())
                color.menuSale(labelVelocidadInicial);
    }//GEN-LAST:event_btnVelocidadInicialMouseExited

    private void btnVelocidadInicialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadInicialMousePressed
        mostrarVelocidadInicial();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        color.menuSeleccionar(btnVelocidadInicial, labelVelocidadInicial);
    }//GEN-LAST:event_btnVelocidadInicialMousePressed

    private void btnAlturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlturaMouseEntered
        if (labelAltura.getForeground().getRGB() == color.getLetMenu().getRGB())
            color.menuEntra(labelAltura);
    }//GEN-LAST:event_btnAlturaMouseEntered

    private void btnAlturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlturaMouseExited
        if (labelVelocidadInicialX.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelVelocidadInicialY.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelVelocidadInicial.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelDistancia.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelAlcanceHorizontal.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelTiempo.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelTiempoVuelo.getForeground().getRGB() != color.getLetMenu().getRGB())
            color.menuRemover(btnAltura, labelAltura);
    }//GEN-LAST:event_btnAlturaMouseExited

    private void btnAlturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlturaMousePressed
        mostrarAltura();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        color.menuSeleccionar(btnAltura, labelAltura);
    }//GEN-LAST:event_btnAlturaMousePressed

    private void btnDistanciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDistanciaMouseEntered
        if (labelDistancia.getForeground().getRGB() == color.getLetMenu().getRGB())
            color.menuEntra(labelDistancia);
    }//GEN-LAST:event_btnDistanciaMouseEntered

    private void btnDistanciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDistanciaMouseExited
        if (labelVelocidadInicialX.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelVelocidadInicialY.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelAltura.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelVelocidadInicial.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelAlcanceHorizontal.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelTiempo.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelTiempoVuelo.getForeground().getRGB() != color.getLetMenu().getRGB())
            color.menuSale(labelDistancia);
    }//GEN-LAST:event_btnDistanciaMouseExited

    private void btnDistanciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDistanciaMousePressed
        mostrarDistancia();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        color.menuSeleccionar(btnDistancia, labelDistancia);
    }//GEN-LAST:event_btnDistanciaMousePressed

    private void btnAlcanceHorizontalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlcanceHorizontalMouseEntered
        if (labelAlcanceHorizontal.getForeground().getRGB() == color.getLetMenu().getRGB())
            color.menuEntra(labelAlcanceHorizontal);
    }//GEN-LAST:event_btnAlcanceHorizontalMouseEntered

    private void btnAlcanceHorizontalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlcanceHorizontalMouseExited
        if (labelVelocidadInicialX.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelVelocidadInicialY.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelAltura.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelDistancia.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelVelocidadInicial.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelTiempo.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelTiempoVuelo.getForeground().getRGB() != color.getLetMenu().getRGB())
           color.menuSale(labelAlcanceHorizontal);
    }//GEN-LAST:event_btnAlcanceHorizontalMouseExited

    private void btnAlcanceHorizontalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlcanceHorizontalMousePressed
        mostrarAlcHorizontal();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        color.menuSeleccionar(btnAlcanceHorizontal, labelAlcanceHorizontal);
    }//GEN-LAST:event_btnAlcanceHorizontalMousePressed

    private void btnVelocidadInicialYMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadInicialYMouseEntered
        if (labelVelocidadInicialY.getForeground().getRGB() == color.getLetMenu().getRGB())
            color.menuEntra(labelVelocidadInicialY);
    }//GEN-LAST:event_btnVelocidadInicialYMouseEntered

    private void btnVelocidadInicialYMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadInicialYMouseExited
        if (labelVelocidadInicialX.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelVelocidadInicial.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelAltura.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelDistancia.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelAlcanceHorizontal.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelTiempo.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelTiempoVuelo.getForeground().getRGB() != color.getLetMenu().getRGB())
            color.menuSale(labelVelocidadInicialY);
    }//GEN-LAST:event_btnVelocidadInicialYMouseExited

    private void btnVelocidadInicialYMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadInicialYMousePressed
        mostrarVelocidadInicialY();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        color.menuSeleccionar(btnVelocidadInicialY, labelVelocidadInicialY);
    }//GEN-LAST:event_btnVelocidadInicialYMousePressed

    private void btnVelocidadInicialXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadInicialXMouseEntered
        if (labelVelocidadInicialX.getForeground().getRGB() == color.getLetMenu().getRGB())
            color.menuEntra(labelVelocidadInicialX);
    }//GEN-LAST:event_btnVelocidadInicialXMouseEntered

    private void btnVelocidadInicialXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadInicialXMouseExited
        if (labelVelocidadInicial.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelVelocidadInicialY.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelAltura.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelDistancia.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelAlcanceHorizontal.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelTiempo.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelTiempoVuelo.getForeground().getRGB() != color.getLetMenu().getRGB())
            color.menuSale(labelVelocidadInicialX);
    }//GEN-LAST:event_btnVelocidadInicialXMouseExited

    private void btnVelocidadInicialXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadInicialXMousePressed
        mostrarVelocidadInicialX();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        color.menuSeleccionar(btnVelocidadInicialX, labelVelocidadInicialX);
    }//GEN-LAST:event_btnVelocidadInicialXMousePressed

    private void btnTiempoVueloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoVueloMouseEntered
        if (labelTiempoVuelo.getForeground().getRGB() == color.getLetMenu().getRGB())
            color.menuEntra(labelTiempoVuelo);
    }//GEN-LAST:event_btnTiempoVueloMouseEntered

    private void btnTiempoVueloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoVueloMouseExited
        if (labelVelocidadInicialX.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelVelocidadInicialY.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelAltura.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelDistancia.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelAlcanceHorizontal.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelTiempo.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelVelocidadInicial.getForeground().getRGB() != color.getLetMenu().getRGB())
            color.menuSale(labelTiempoVuelo);
    }//GEN-LAST:event_btnTiempoVueloMouseExited

    private void btnTiempoVueloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoVueloMousePressed
        mostrarTiempoVuelo();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        color.menuSeleccionar(btnTiempoVuelo, labelTiempoVuelo);
    }//GEN-LAST:event_btnTiempoVueloMousePressed

    private void btnTiempoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoMouseEntered
        if (labelTiempo.getForeground().getRGB() == color.getLetMenu().getRGB())
            color.menuEntra(labelTiempo);
    }//GEN-LAST:event_btnTiempoMouseEntered

    private void btnTiempoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoMouseExited
        if (labelVelocidadInicialX.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelVelocidadInicialY.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelAltura.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelDistancia.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelAlcanceHorizontal.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelVelocidadInicial.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelTiempoVuelo.getForeground().getRGB() != color.getLetMenu().getRGB())
            color.menuSale(labelTiempo);
    }//GEN-LAST:event_btnTiempoMouseExited

    private void btnTiempoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoMousePressed
        mostrarTiempo();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        color.menuSeleccionar(btnTiempo, labelTiempo);
    }//GEN-LAST:event_btnTiempoMousePressed

    //----- Rellenar paneles ------//
    private void mostrarVelocidadInicial() {
        contenido.setBackground(Color.red);
        /*vista.movParabolico.VelocidadInicial vista = new vista.movParabolico.VelocidadInicial();
        vista.setSize(720, 470);
        vista.setLocation(0, 0);
        contenido.removeAll();
        contenido.add(vista, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();*/
    }

    private void mostrarVelocidadInicialX() {

    }

    private void mostrarVelocidadInicialY() {

    }

    private void mostrarAltura() {

    }

    private void mostrarDistancia() {

    }

    private void mostrarAlcHorizontal() {

    }

    private void mostrarTiempo() {

    }

    private void mostrarTiempoVuelo() {

    }
    
    //----- Fin del relleno ------//

    //----- Métodos de utilidad -----//
    private void resetearTodo() {
        color.menuRemover(btnAlcanceHorizontal, labelAlcanceHorizontal);
        color.menuRemover(btnAltura, labelAltura);
        color.menuRemover(btnDistancia, labelDistancia);
        color.menuRemover(btnTiempo, labelTiempo);
        color.menuRemover(btnTiempoVuelo, labelTiempoVuelo);
        color.menuRemover(btnVelocidadInicial, labelVelocidadInicial);
        color.menuRemover(btnVelocidadInicialX, labelVelocidadInicialX);
        color.menuRemover(btnVelocidadInicialY, labelVelocidadInicialY);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel btnAlcanceHorizontal;
    private javax.swing.JPanel btnAltura;
    private javax.swing.JPanel btnDistancia;
    private javax.swing.JPanel btnTiempo;
    private javax.swing.JPanel btnTiempoVuelo;
    private javax.swing.JPanel btnVelocidadInicial;
    private javax.swing.JPanel btnVelocidadInicialX;
    private javax.swing.JPanel btnVelocidadInicialY;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelAlcanceHorizontal;
    private javax.swing.JLabel labelAltura;
    private javax.swing.JLabel labelCuadro;
    private javax.swing.JLabel labelDistancia;
    private javax.swing.JLabel labelTiempo;
    private javax.swing.JLabel labelTiempoVuelo;
    private javax.swing.JLabel labelVelocidadInicial;
    private javax.swing.JLabel labelVelocidadInicialX;
    private javax.swing.JLabel labelVelocidadInicialY;
    // End of variables declaration//GEN-END:variables
}
