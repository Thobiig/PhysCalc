package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import controlador.ControladorColor;

public class Inicio extends javax.swing.JFrame {

    private ControladorColor color = new ControladorColor();

    public Inicio() {
        //color.cambiarColorPaquete(); // Cambiar color a los elementos gráficos
        initComponents();
        setLocationRelativeTo(null);
        color.headerColorear(header);
        resetearTodo();
        mostrarMRU();
        color.headerSeleccionar(btnMRU, labelMRU);
    }

    //----- Paleta de colores -----//
    private Color letrasBase = color.getLetHeaderBase();
    private int numLetrasBase = letrasBase.getRGB();


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        btnMRU = new javax.swing.JPanel();
        labelMRU = new javax.swing.JLabel();
        btnMRUA = new javax.swing.JPanel();
        labelMRUA = new javax.swing.JLabel();
        btnCaidaLibre = new javax.swing.JPanel();
        labelLibre = new javax.swing.JLabel();
        labelCaida = new javax.swing.JLabel();
        btnTiroVertical = new javax.swing.JPanel();
        labelVertical = new javax.swing.JLabel();
        labelDisparo = new javax.swing.JLabel();
        btnMovParabolico = new javax.swing.JPanel();
        labelMovimiento = new javax.swing.JLabel();
        labelParabolico = new javax.swing.JLabel();
        btnMCU = new javax.swing.JPanel();
        labelMCU = new javax.swing.JLabel();
        btnMCUA = new javax.swing.JPanel();
        labelMCUA = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(905, 570));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(255, 0, 0));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogo.setBackground(new java.awt.Color(0, 0, 0));
        labelLogo.setFont(new java.awt.Font("Montserrat Black", 1, 18)); // NOI18N
        labelLogo.setForeground(new java.awt.Color(255, 255, 255));
        labelLogo.setText("PhysiCalc");
        header.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 0, 110, 60));

        btnMRU.setBackground(new java.awt.Color(255, 0, 0));
        btnMRU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMRUMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMRUMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMRUMousePressed(evt);
            }
        });
        btnMRU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMRU.setFont(new java.awt.Font("Montserrat Medium", 0, 19)); // NOI18N
        labelMRU.setForeground(new java.awt.Color(0, 0, 0));
        labelMRU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMRU.setText("M.R.U.");
        btnMRU.add(labelMRU, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 100, 20));

        header.add(btnMRU, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, 60));

        btnMRUA.setBackground(new java.awt.Color(255, 0, 0));
        btnMRUA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMRUAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMRUAMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMRUAMousePressed(evt);
            }
        });
        btnMRUA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMRUA.setFont(new java.awt.Font("Montserrat Medium", 0, 19)); // NOI18N
        labelMRUA.setForeground(new java.awt.Color(0, 0, 0));
        labelMRUA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMRUA.setText("M.R.U.A.");
        btnMRUA.add(labelMRUA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 100, 20));

        header.add(btnMRUA, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, 60));

        btnCaidaLibre.setBackground(new java.awt.Color(255, 0, 0));
        btnCaidaLibre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCaidaLibreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCaidaLibreMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCaidaLibreMousePressed(evt);
            }
        });
        btnCaidaLibre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLibre.setFont(new java.awt.Font("Montserrat Medium", 0, 19)); // NOI18N
        labelLibre.setForeground(new java.awt.Color(0, 0, 0));
        labelLibre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLibre.setText("libre");
        btnCaidaLibre.add(labelLibre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 100, 20));

        labelCaida.setFont(new java.awt.Font("Montserrat Medium", 0, 19)); // NOI18N
        labelCaida.setForeground(new java.awt.Color(0, 0, 0));
        labelCaida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCaida.setText("Caída");
        btnCaidaLibre.add(labelCaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 100, 20));

        header.add(btnCaidaLibre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, 60));

        btnTiroVertical.setBackground(new java.awt.Color(255, 0, 0));
        btnTiroVertical.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTiroVerticalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTiroVerticalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTiroVerticalMousePressed(evt);
            }
        });
        btnTiroVertical.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelVertical.setFont(new java.awt.Font("Montserrat Medium", 0, 19)); // NOI18N
        labelVertical.setForeground(new java.awt.Color(0, 0, 0));
        labelVertical.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVertical.setText("vertical");
        btnTiroVertical.add(labelVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 100, 20));

        labelDisparo.setFont(new java.awt.Font("Montserrat Medium", 0, 19)); // NOI18N
        labelDisparo.setForeground(new java.awt.Color(0, 0, 0));
        labelDisparo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDisparo.setText("Disparo");
        btnTiroVertical.add(labelDisparo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 100, 20));

        header.add(btnTiroVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, 60));

        btnMovParabolico.setBackground(new java.awt.Color(255, 0, 0));
        btnMovParabolico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMovParabolicoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMovParabolicoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMovParabolicoMousePressed(evt);
            }
        });
        btnMovParabolico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMovimiento.setFont(new java.awt.Font("Montserrat Medium", 0, 19)); // NOI18N
        labelMovimiento.setForeground(new java.awt.Color(0, 0, 0));
        labelMovimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMovimiento.setText("parabólico");
        btnMovParabolico.add(labelMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 140, 20));

        labelParabolico.setFont(new java.awt.Font("Montserrat Medium", 0, 19)); // NOI18N
        labelParabolico.setForeground(new java.awt.Color(0, 0, 0));
        labelParabolico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelParabolico.setText("Movimiento");
        btnMovParabolico.add(labelParabolico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 140, 20));

        header.add(btnMovParabolico, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 140, 60));

        btnMCU.setBackground(new java.awt.Color(255, 0, 0));
        btnMCU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMCUMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMCUMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMCUMousePressed(evt);
            }
        });
        btnMCU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMCU.setFont(new java.awt.Font("Montserrat Medium", 0, 19)); // NOI18N
        labelMCU.setForeground(new java.awt.Color(0, 0, 0));
        labelMCU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMCU.setText("M.C.U.");
        btnMCU.add(labelMCU, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 100, 20));

        header.add(btnMCU, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, -1, 60));

        btnMCUA.setBackground(new java.awt.Color(255, 0, 0));
        btnMCUA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMCUAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMCUAMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMCUAMousePressed(evt);
            }
        });
        btnMCUA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMCUA.setFont(new java.awt.Font("Montserrat Medium", 0, 19)); // NOI18N
        labelMCUA.setForeground(new java.awt.Color(0, 0, 0));
        labelMCUA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMCUA.setText("M.C.U.A.");
        btnMCUA.add(labelMCUA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 100, 20));

        header.add(btnMCUA, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, -1, 60));

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 60));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMaximumSize(null);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 890, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMRUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMRUMouseEntered
        if (labelMRU.getForeground().getRGB() == numLetrasBase)
            color.headerEntra(labelMRU);
    }//GEN-LAST:event_btnMRUMouseEntered

    private void btnMRUMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMRUMouseExited
        if (labelMRUA.getForeground().getRGB() != numLetrasBase || labelCaida.getForeground().getRGB() != numLetrasBase
                || labelVertical.getForeground().getRGB() != numLetrasBase || labelParabolico.getForeground().getRGB() != numLetrasBase
                || labelMCU.getForeground().getRGB() != numLetrasBase || labelMCUA.getForeground().getRGB() != numLetrasBase)
            color.headerSale(labelMRU);
    }//GEN-LAST:event_btnMRUMouseExited

    private void btnMRUMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMRUMousePressed
        mostrarMRU();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        color.headerSeleccionar(btnMRU, labelMRU);
    }//GEN-LAST:event_btnMRUMousePressed

    private void btnMRUAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMRUAMousePressed
        mostrarMRUA();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        color.headerSeleccionar(btnMRUA, labelMRUA);
    }//GEN-LAST:event_btnMRUAMousePressed

    private void btnCaidaLibreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCaidaLibreMouseEntered
        if (labelCaida.getForeground().getRGB() == numLetrasBase) {
            color.headerEntra(labelCaida);
            color.headerEntra(labelLibre);
        }
    }//GEN-LAST:event_btnCaidaLibreMouseEntered

    private void btnCaidaLibreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCaidaLibreMouseExited
        if (labelMRU.getForeground().getRGB() != numLetrasBase || labelMRUA.getForeground().getRGB() != numLetrasBase
                || labelVertical.getForeground().getRGB() != numLetrasBase || labelParabolico.getForeground().getRGB() != numLetrasBase
                || labelMCU.getForeground().getRGB() != numLetrasBase || labelMCUA.getForeground().getRGB() != numLetrasBase) {
            color.headerSale(labelCaida);
            color.headerSale(labelLibre);
        }
    }//GEN-LAST:event_btnCaidaLibreMouseExited

    private void btnCaidaLibreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCaidaLibreMousePressed
        mostrarCaidaLibre();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        color.headerSeleccionar(btnCaidaLibre, labelCaida);
        color.headerEntra(labelLibre);
    }//GEN-LAST:event_btnCaidaLibreMousePressed

    private void btnTiroVerticalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiroVerticalMouseEntered
        if (labelVertical.getForeground().getRGB() == numLetrasBase) {
            color.headerEntra(labelDisparo);
            color.headerEntra(labelVertical);
        }
    }//GEN-LAST:event_btnTiroVerticalMouseEntered

    private void btnTiroVerticalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiroVerticalMouseExited
        if (labelMRUA.getForeground().getRGB() != numLetrasBase || labelCaida.getForeground().getRGB() != numLetrasBase
                || labelMRU.getForeground().getRGB() != numLetrasBase || labelParabolico.getForeground().getRGB() != numLetrasBase
                || labelMCU.getForeground().getRGB() != numLetrasBase || labelMCUA.getForeground().getRGB() != numLetrasBase) {
            color.headerSale(labelDisparo);
            color.headerSale(labelVertical);
        }

    }//GEN-LAST:event_btnTiroVerticalMouseExited

    private void btnTiroVerticalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiroVerticalMousePressed
        mostrarTiroVertical();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        color.headerSeleccionar(btnTiroVertical, labelDisparo);
        color.headerEntra(labelVertical);
    }//GEN-LAST:event_btnTiroVerticalMousePressed

    private void btnMovParabolicoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMovParabolicoMouseEntered
        if (labelParabolico.getForeground().getRGB() == numLetrasBase) {
            color.headerEntra(labelMovimiento);
            color.headerEntra(labelParabolico);
        }
    }//GEN-LAST:event_btnMovParabolicoMouseEntered

    private void btnMovParabolicoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMovParabolicoMouseExited
        if (labelMRUA.getForeground().getRGB() != numLetrasBase || labelCaida.getForeground().getRGB() != numLetrasBase
                || labelVertical.getForeground().getRGB() != numLetrasBase || labelMRU.getForeground().getRGB() != numLetrasBase
                || labelMCU.getForeground().getRGB() != numLetrasBase || labelMCUA.getForeground().getRGB() != numLetrasBase) {
            color.headerSale(labelMovimiento);
            color.headerSale(labelParabolico);
        }
    }//GEN-LAST:event_btnMovParabolicoMouseExited

    private void btnMovParabolicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMovParabolicoMousePressed
        mostrarMovParabolico();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        color.headerSeleccionar(btnMovParabolico, labelMovimiento);
        color.headerEntra(labelParabolico);
    }//GEN-LAST:event_btnMovParabolicoMousePressed

    private void btnMCUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMCUMouseEntered
        if (labelMCU.getForeground().getRGB() == numLetrasBase)
            color.headerEntra(labelMCU);
    }//GEN-LAST:event_btnMCUMouseEntered

    private void btnMCUMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMCUMouseExited
        if (labelMRUA.getForeground().getRGB() != numLetrasBase || labelCaida.getForeground().getRGB() != numLetrasBase
                || labelVertical.getForeground().getRGB() != numLetrasBase || labelParabolico.getForeground().getRGB() != numLetrasBase
                || labelMRU.getForeground().getRGB() != numLetrasBase || labelMCUA.getForeground().getRGB() != numLetrasBase)
            color.headerSale(labelMCU);
    }//GEN-LAST:event_btnMCUMouseExited

    private void btnMCUMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMCUMousePressed
        mostrarMCU();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        color.headerSeleccionar(btnMCU, labelMCU);
    }//GEN-LAST:event_btnMCUMousePressed

    private void btnMCUAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMCUAMouseEntered
        if (labelMCUA.getForeground().getRGB() == numLetrasBase)
            color.headerEntra(labelMCUA);
    }//GEN-LAST:event_btnMCUAMouseEntered

    private void btnMCUAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMCUAMouseExited
        if (labelMRUA.getForeground().getRGB() != numLetrasBase || labelCaida.getForeground().getRGB() != numLetrasBase
                || labelVertical.getForeground().getRGB() != numLetrasBase || labelParabolico.getForeground().getRGB() != numLetrasBase
                || labelMCU.getForeground().getRGB() != numLetrasBase || labelMRU.getForeground().getRGB() != numLetrasBase)
            color.headerSale(labelMCUA);
    }//GEN-LAST:event_btnMCUAMouseExited

    private void btnMCUAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMCUAMousePressed
        mostrarMCUA();
        //----- Colorear y descolorear botones -----//
        resetearTodo();
        color.headerSeleccionar(btnMCUA, labelMCUA);
    }//GEN-LAST:event_btnMCUAMousePressed

    private void btnMRUAMouseEntered(java.awt.event.MouseEvent evt) {
        if (labelMRUA.getForeground().getRGB() == numLetrasBase) {
            color.headerEntra(labelMRUA);
        }
    }

    private void btnMRUAMouseExited(java.awt.event.MouseEvent evt) {
        if (labelMRU.getForeground().getRGB() != numLetrasBase || labelCaida.getForeground().getRGB() != numLetrasBase
                || labelVertical.getForeground().getRGB() != numLetrasBase || labelParabolico.getForeground().getRGB() != numLetrasBase
                || labelMCU.getForeground().getRGB() != numLetrasBase || labelMCUA.getForeground().getRGB() != numLetrasBase) {
            color.headerSale(labelMRUA);
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    //----- Rellenar paneles ------//
    private void mostrarMRU() {
        vistaMRU vista = new vistaMRU();
        vista.setSize(890, 470);
        vista.setLocation(0, 0);
        bg.removeAll();
        bg.add(vista, BorderLayout.CENTER);
        bg.revalidate();
        bg.repaint();
    }

    private void mostrarMRUA() {
        vistaMRUA vista = new vistaMRUA();
        vista.setSize(890, 470);
        vista.setLocation(0, 0);
        bg.removeAll();
        bg.add(vista, BorderLayout.CENTER);
        bg.revalidate();
        bg.repaint();
    }

    private void mostrarCaidaLibre() {
        vistaCL vista = new vistaCL();
        vista.setSize(890, 470);
        vista.setLocation(0, 0);
        bg.removeAll();
        bg.add(vista, BorderLayout.CENTER);
        bg.revalidate();
        bg.repaint();
    }

    private void mostrarTiroVertical() {
        vistaTV vista = new vistaTV();
        vista.setSize(890, 470);
        vista.setLocation(0, 0);
        bg.removeAll();
        bg.add(vista, BorderLayout.CENTER);
        bg.revalidate();
        bg.repaint();
    }

    private void mostrarMovParabolico() {
        vistaMP vista = new vistaMP();
        vista.setSize(890, 470);
        vista.setLocation(0, 0);
        bg.removeAll();
        bg.add(vista, BorderLayout.CENTER);
        bg.revalidate();
        bg.repaint();
    }

    private void mostrarMCU() {
        vistaMCU vista = new vistaMCU();
        vista.setSize(890, 470);
        vista.setLocation(0, 0);
        bg.removeAll();
        bg.add(vista, BorderLayout.CENTER);
        bg.revalidate();
        bg.repaint();
    }

    private void mostrarMCUA() {
        vistaMCUA vista = new vistaMCUA();
        vista.setSize(890, 470);
        vista.setLocation(0, 0);
        bg.removeAll();
        bg.add(vista, BorderLayout.CENTER);
        bg.revalidate();
        bg.repaint();
    }
    //----- Fin del relleno ------//

    //----- Métodos de utilidad -----//
    private void resetearTodo() {
        color.headerRemover(btnMRU, labelMRU);
        color.headerRemover(btnMRUA, labelMRUA);
        color.headerRemover(btnCaidaLibre, labelCaida);
        color.headerSale(labelLibre);
        color.headerRemover(btnTiroVertical, labelDisparo);
        color.headerRemover(btnTiroVertical, labelVertical);
        color.headerRemover(btnMovParabolico, labelMovimiento);
        color.headerSale(labelParabolico);
        color.headerRemover(btnMCU, labelMCU);
        color.headerRemover(btnMCUA, labelMCUA);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnCaidaLibre;
    private javax.swing.JPanel btnMCU;
    private javax.swing.JPanel btnMCUA;
    private javax.swing.JPanel btnMRU;
    private javax.swing.JPanel btnMRUA;
    private javax.swing.JPanel btnMovParabolico;
    private javax.swing.JPanel btnTiroVertical;
    private javax.swing.JPanel header;
    private javax.swing.JLabel labelCaida;
    private javax.swing.JLabel labelDisparo;
    private javax.swing.JLabel labelLibre;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelMCU;
    private javax.swing.JLabel labelMCUA;
    private javax.swing.JLabel labelMRU;
    private javax.swing.JLabel labelMRUA;
    private javax.swing.JLabel labelMovimiento;
    private javax.swing.JLabel labelParabolico;
    private javax.swing.JLabel labelVertical;
    // End of variables declaration//GEN-END:variables
}
