package vista;

import controlador.ControladorColor;
import java.awt.BorderLayout;

public class vistaCL extends javax.swing.JPanel {

    private ControladorColor color = new ControladorColor();
    
    public vistaCL() {
        initComponents();
        color.menuSeleccionar(btnVelocidadInicial, labelVelocidadInicial);
        mostrarVelocidadInicial();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVelocidadInicial = new javax.swing.JPanel();
        labelVelocidadInicial = new javax.swing.JLabel();
        btnVelocidadFinal = new javax.swing.JPanel();
        labelVelocidadFinal = new javax.swing.JLabel();
        btnAltura = new javax.swing.JPanel();
        labelAltura = new javax.swing.JLabel();
        btnTiempo = new javax.swing.JPanel();
        labelTiempo = new javax.swing.JLabel();
        btnGravedad = new javax.swing.JPanel();
        labelGravedad = new javax.swing.JLabel();
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

        btnVelocidadFinal.setBackground(new java.awt.Color(231, 231, 231));
        btnVelocidadFinal.setMaximumSize(new java.awt.Dimension(135, 40));
        btnVelocidadFinal.setMinimumSize(new java.awt.Dimension(135, 40));
        btnVelocidadFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVelocidadFinalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVelocidadFinalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVelocidadFinalMousePressed(evt);
            }
        });
        btnVelocidadFinal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelVelocidadFinal.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelVelocidadFinal.setForeground(new java.awt.Color(0, 0, 0));
        labelVelocidadFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVelocidadFinal.setText("Velocidad final");
        btnVelocidadFinal.add(labelVelocidadFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 155, 40));

        Menu.add(btnVelocidadFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 110, 152, 40));

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

        Menu.add(btnAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 150, 152, 40));

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

        Menu.add(btnTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, 152, 40));

        btnGravedad.setBackground(new java.awt.Color(231, 231, 231));
        btnGravedad.setMaximumSize(new java.awt.Dimension(135, 40));
        btnGravedad.setMinimumSize(new java.awt.Dimension(135, 40));
        btnGravedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGravedadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGravedadMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGravedadMousePressed(evt);
            }
        });
        btnGravedad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelGravedad.setBackground(new java.awt.Color(231, 231, 231));
        labelGravedad.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelGravedad.setForeground(new java.awt.Color(0, 0, 0));
        labelGravedad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGravedad.setText("Aceleración");
        btnGravedad.add(labelGravedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 155, 40));

        Menu.add(btnGravedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 230, 152, 40));

        labelCuadro.setBackground(new java.awt.Color(0, 0, 0));
        labelCuadro.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelCuadro.setForeground(new java.awt.Color(0, 0, 0));
        labelCuadro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCuadro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utiliarios/menuMRUA.png"))); // NOI18N
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
        if (labelAltura.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelTiempo.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelGravedad.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelVelocidadFinal.getForeground().getRGB() != color.getLetMenu().getRGB())
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
        if (labelVelocidadInicial.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelTiempo.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelGravedad.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelVelocidadFinal.getForeground().getRGB() != color.getLetMenu().getRGB())
            color.menuSale(labelAltura);
    }//GEN-LAST:event_btnAlturaMouseExited

    private void btnAlturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlturaMousePressed
        mostrarDistancia();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        color.menuSeleccionar(btnAltura, labelAltura);
    }//GEN-LAST:event_btnAlturaMousePressed

    private void btnTiempoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoMouseEntered
        if (labelTiempo.getForeground().getRGB() == color.getLetMenu().getRGB())
            color.menuEntra(labelTiempo);
    }//GEN-LAST:event_btnTiempoMouseEntered

    private void btnTiempoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoMouseExited
        if (labelVelocidadInicial.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelAltura.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelGravedad.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelVelocidadFinal.getForeground().getRGB() != color.getLetMenu().getRGB())
            color.menuSale(labelTiempo);
    }//GEN-LAST:event_btnTiempoMouseExited

    private void btnTiempoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiempoMousePressed
        mostrarTiempo();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        color.menuSeleccionar(btnTiempo, labelTiempo);
    }//GEN-LAST:event_btnTiempoMousePressed

    private void btnGravedadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGravedadMouseEntered
        if (labelGravedad.getForeground().getRGB() == color.getLetMenu().getRGB())
            color.menuEntra(labelGravedad);
    }//GEN-LAST:event_btnGravedadMouseEntered

    private void btnGravedadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGravedadMouseExited
        if (labelVelocidadInicial.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelAltura.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelTiempo.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelVelocidadFinal.getForeground().getRGB() != color.getLetMenu().getRGB())
            color.menuSale(labelGravedad);
    }//GEN-LAST:event_btnGravedadMouseExited

    private void btnGravedadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGravedadMousePressed
        mostrarAceleracion();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        color.menuSeleccionar(btnGravedad, labelGravedad);
    }//GEN-LAST:event_btnGravedadMousePressed

    private void btnVelocidadFinalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadFinalMouseEntered
        if (labelVelocidadFinal.getForeground().getRGB() == color.getLetMenu().getRGB())
            color.menuEntra(labelVelocidadFinal);
    }//GEN-LAST:event_btnVelocidadFinalMouseEntered

    private void btnVelocidadFinalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadFinalMouseExited
        if (labelVelocidadInicial.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelAltura.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelTiempo.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelGravedad.getForeground().getRGB() != color.getLetMenu().getRGB())
            color.menuSale(labelVelocidadFinal);
    }//GEN-LAST:event_btnVelocidadFinalMouseExited

    private void btnVelocidadFinalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadFinalMousePressed
        mostrarVelocidadFinal();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        color.menuSeleccionar(btnVelocidadFinal, labelVelocidadFinal);
    }//GEN-LAST:event_btnVelocidadFinalMousePressed

    //----- Rellenar paneles ------//
    private void mostrarVelocidadInicial() {
        /*vista.mrua.VelocidadInicial vista = new vista.mrua.VelocidadInicial();
        vista.setSize(720, 470);
        vista.setLocation(0, 0);
        contenido.removeAll();
        contenido.add(vista, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();*/
    }
    
    private void mostrarVelocidadFinal() {

    }

    private void mostrarDistancia() {
        
    }

    private void mostrarTiempo() {
        
    }
    
    private void mostrarAceleracion() {
        
    }

    private void resetearTodo() {
        color.menuRemover(btnVelocidadInicial, labelVelocidadInicial);
        color.menuRemover(btnVelocidadFinal, labelVelocidadFinal);
        color.menuRemover(btnAltura, labelAltura);
        color.menuRemover(btnTiempo, labelTiempo);
        color.menuRemover(btnGravedad, labelGravedad);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel btnAltura;
    private javax.swing.JPanel btnGravedad;
    private javax.swing.JPanel btnTiempo;
    private javax.swing.JPanel btnVelocidadFinal;
    private javax.swing.JPanel btnVelocidadInicial;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelAltura;
    private javax.swing.JLabel labelCuadro;
    private javax.swing.JLabel labelGravedad;
    private javax.swing.JLabel labelTiempo;
    private javax.swing.JLabel labelVelocidadFinal;
    private javax.swing.JLabel labelVelocidadInicial;
    // End of variables declaration//GEN-END:variables
}
