package controlador;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.ModeloColor;

public class ControladorColor extends ModeloColor {

    public ControladorColor() {

    }

    //----- métodos header ------//
    public void headerColorear(Container container) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            if (component instanceof JLabel) {
                JLabel texto = (JLabel) component;
                texto.setForeground(getLetHeaderBase());
            }
            if (component instanceof JPanel) {
                JPanel bg = (JPanel) component;
                bg.setBackground(getHeader());
            }
        }
    }

    public void headerEntra(JLabel texto) {
        texto.setForeground(getLetHeaderAlter());
    }

    public void headerSale(JLabel texto) {
        texto.setForeground(getLetHeaderBase());
    }

    public void headerRemover(JPanel bg, JLabel texto) {
        bg.setBackground(getHeader());
        texto.setForeground(getLetHeaderBase());
    }

    public void headerSeleccionar(JPanel bg, JLabel texto) {
        bg.setBackground(getHeaderAlter());
        texto.setForeground(getLetHeaderAlter());
    }

    //----- métodos menú -----//
    public void menuColorear(Container container) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            if (component instanceof JLabel) {
                JLabel texto = (JLabel) component;
                menuSale(texto);
            }
            if (component instanceof JPanel) {
                JPanel bg = (JPanel) component;
                bg.setBackground(getMenu());
            }
        }
    }

    public void menuEntra(JLabel texto) {
        texto.setForeground(getLetMenuAlter());
    }

    public void menuSale(JLabel texto) {
        texto.setForeground(getLetMenu());
    }

    public void menuSeleccionar(JPanel bg, JLabel texto) {
        bg.setBackground(getMenuAlter());
        menuEntra(texto);
    }

    public void menuRemover(JPanel bg, JLabel texto) {
        bg.setBackground(getMenu());
        menuSale(texto);
    }

    //------ Métodos cambiar color imagenes ------//
    public void cambiarColorPaquete() {
        // Ruta del paquete
        String paquete = "C:/Users/gguti/OneDrive/Documentos/Proyecto/PhysCalc/src/imagenes/utiliarios";
        // Archivos dentro del paquete
        File rutaPaquete = new File(paquete);
        File[] files = rutaPaquete.listFiles();
        // Cambiar color a las imagenes
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    try {
                        // Cargar imagen original
                        BufferedImage imagenOriginal = ImageIO.read(file);
                        BufferedImage imagenCambiada = new BufferedImage(imagenOriginal.getWidth(),
                                imagenOriginal.getHeight(), BufferedImage.TYPE_INT_ARGB);
                        Graphics2D g2d = imagenCambiada.createGraphics();
                        g2d.drawImage(imagenOriginal, 0, 0, null);
                        g2d.dispose();
                        // Cambiar color de la imagen
                        cambiarColor(imagenCambiada);
                        // Guardar imagen modificada
                        ImageIO.write(imagenCambiada, "png", file);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private static void cambiarColor(BufferedImage imagen) {
        int width = imagen.getWidth();
        int height = imagen.getHeight();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int rgba = imagen.getRGB(x, y);
                Color color = new Color(rgba, true);
                if (color.getAlpha() > 0) {
                    imagen.setRGB(x, y, getMenu().getRGB());
                }
            }
        }
    }

}
