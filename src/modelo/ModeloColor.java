package modelo;

import java.awt.Color;

public class ModeloColor {

    private static Color header = new Color (255, 0, 0);
    private static Color headerAlter = new Color (196, 12, 12);
    private static Color letHeaderBase = new Color(255, 255, 255);
    private static Color letHeaderAlter = new Color(0, 0, 0);
    
    private static Color menu = new Color (231,231,231);
    private static Color menuAlter = new Color (203,203,203);  
    private static Color letMenu = new Color(0, 0, 0);
    private static Color letMenuAlter = new Color(100, 5, 5);

    //------ getter's -------//
    public static Color getHeader() {
        return header;
    }

    public static Color getHeaderAlter() {
        return headerAlter;
    }

    public static Color getLetHeaderBase() {
        return letHeaderBase;
    }

    public static Color getLetHeaderAlter() {
        return letHeaderAlter;
    }

    public static Color getMenu() {
        return menu;
    }

    public static Color getMenuAlter() {
        return menuAlter;
    }

    public static Color getLetMenu() {
        return letMenu;
    }

    public static Color getLetMenuAlter() {
        return letMenuAlter;
    }

}
