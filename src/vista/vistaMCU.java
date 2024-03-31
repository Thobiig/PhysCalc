package vista;

import controlador.ControladorColor;

public class vistaMCU extends javax.swing.JPanel {

    private ControladorColor color = new ControladorColor();

    public vistaMCU() {
        initComponents();
        color.menuColorear(menu);
        color.menuSeleccionar(btnAngular, labelAngular);
        mostrarAngular();
    }

    //----- seleccion del switch -----//
    private String seleccion = "";

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAngular = new javax.swing.JPanel();
        labelAngular = new javax.swing.JLabel();
        btnTangencial = new javax.swing.JPanel();
        labelTangencial = new javax.swing.JLabel();
        btnOtra = new javax.swing.JPanel();
        labelOtra = new javax.swing.JLabel();
        labelCuadro = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setMaximumSize(new java.awt.Dimension(144, 470));
        menu.setMinimumSize(new java.awt.Dimension(144, 470));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fórmulas");
        menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 35, 140, -1));

        btnAngular.setBackground(new java.awt.Color(231, 231, 231));
        btnAngular.setMaximumSize(new java.awt.Dimension(135, 40));
        btnAngular.setMinimumSize(new java.awt.Dimension(135, 40));
        btnAngular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAngularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAngularMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAngularMousePressed(evt);
            }
        });
        btnAngular.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAngular.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelAngular.setForeground(new java.awt.Color(0, 0, 0));
        labelAngular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAngular.setText("Angulares");
        btnAngular.add(labelAngular, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 155, 40));

        menu.add(btnAngular, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 80, 152, 40));

        btnTangencial.setBackground(new java.awt.Color(231, 231, 231));
        btnTangencial.setMaximumSize(new java.awt.Dimension(135, 40));
        btnTangencial.setMinimumSize(new java.awt.Dimension(135, 40));
        btnTangencial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTangencialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTangencialMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTangencialMousePressed(evt);
            }
        });
        btnTangencial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTangencial.setBackground(new java.awt.Color(231, 231, 231));
        labelTangencial.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelTangencial.setForeground(new java.awt.Color(0, 0, 0));
        labelTangencial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTangencial.setText("Tangenciales");
        btnTangencial.add(labelTangencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 155, 40));

        menu.add(btnTangencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 152, 40));

        btnOtra.setBackground(new java.awt.Color(231, 231, 231));
        btnOtra.setMaximumSize(new java.awt.Dimension(135, 40));
        btnOtra.setMinimumSize(new java.awt.Dimension(135, 40));
        btnOtra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOtraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOtraMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnOtraMousePressed(evt);
            }
        });
        btnOtra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelOtra.setBackground(new java.awt.Color(231, 231, 231));
        labelOtra.setFont(new java.awt.Font("Montserrat Medium", 0, 15)); // NOI18N
        labelOtra.setForeground(new java.awt.Color(0, 0, 0));
        labelOtra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOtra.setText("Otras");
        btnOtra.add(labelOtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 155, 40));

        menu.add(btnOtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, 152, 40));

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

        add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 720, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAngularMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAngularMousePressed
        mostrarAngular();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        color.menuSeleccionar(btnAngular, labelAngular);
    }//GEN-LAST:event_btnAngularMousePressed

    private void btnAngularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAngularMouseExited
        if (labelTangencial.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelOtra.getForeground().getRGB() != color.getLetMenu().getRGB())
            color.menuSale(labelAngular);
    }//GEN-LAST:event_btnAngularMouseExited

    private void btnAngularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAngularMouseEntered
        if (labelAngular.getForeground().getRGB() == color.getLetMenu().getRGB())
            color.menuEntra(labelAngular);
    }//GEN-LAST:event_btnAngularMouseEntered

    private void btnTangencialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTangencialMouseEntered
        if (labelTangencial.getForeground().getRGB() == color.getLetMenu().getRGB())
            color.menuEntra(labelTangencial);
    }//GEN-LAST:event_btnTangencialMouseEntered

    private void btnTangencialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTangencialMouseExited
        if (labelAngular.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelOtra.getForeground().getRGB() != color.getLetMenu().getRGB())
            color.menuSale(labelTangencial);
    }//GEN-LAST:event_btnTangencialMouseExited

    private void btnTangencialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTangencialMousePressed
        mostrarTangencial();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        color.menuSeleccionar(btnTangencial, labelTangencial);
    }//GEN-LAST:event_btnTangencialMousePressed

    private void btnOtraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOtraMousePressed
        mostrarOtra();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        color.menuSeleccionar(btnOtra, labelOtra);
    }//GEN-LAST:event_btnOtraMousePressed

    private void btnOtraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOtraMouseExited
        if (labelAngular.getForeground().getRGB() != color.getLetMenu().getRGB()
                || labelTangencial.getForeground().getRGB() != color.getLetMenu().getRGB())
            color.menuSale(labelOtra);
    }//GEN-LAST:event_btnOtraMouseExited

    private void btnOtraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOtraMouseEntered
        if (labelOtra.getForeground().getRGB() == color.getLetMenu().getRGB())
            color.menuEntra(labelOtra);
    }//GEN-LAST:event_btnOtraMouseEntered

    //----- Rellenar paneles ------//
    private void mostrarAngular() {

    }

    private void mostrarTangencial() {

    }

    private void mostrarOtra() {

    }
    //----- Fin del relleno ------//

    //----- Métodos de utilidad -----//
    private void resetearTodo() {
        color.menuRemover(btnAngular, labelAngular);
        color.menuRemover(btnTangencial, labelTangencial);
        color.menuRemover(btnOtra, labelOtra);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAngular;
    private javax.swing.JPanel btnOtra;
    private javax.swing.JPanel btnTangencial;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelAngular;
    private javax.swing.JLabel labelCuadro;
    private javax.swing.JLabel labelOtra;
    private javax.swing.JLabel labelTangencial;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}
