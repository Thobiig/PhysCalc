package controlador;

import javax.swing.JComboBox;

public class ControladorTiempo {
    
    public ControladorTiempo(){
        
    }
    
    //----- Métodos de conversión -----//
    public double minutoSegundo(double dato){
        return dato * 60;
    }
    
    public double horaSegundo(double dato){
        return dato * 3600;
    }
    
    //----- método condicional sistema internacional -----//
    public double convertirTiempo(double dato, String unidad){
        return switch (unidad) {
            case "min" -> minutoSegundo(dato);
            case "h" -> horaSegundo(dato);
            default -> dato;
        };
    }
    
    //-----  Método para rellenar los combobox -----//
    public static void rellenarCombo(JComboBox<String> comboBox) {
        /* Iniciar los datos */
        String [] datos = {"s", "min", "h"};
        /* Limpiar el JComboBox */
        comboBox.removeAllItems();

        /* Rellenar el JComboBox con los elementos del vector */
        for (String dato : datos) {
            comboBox.addItem(dato);
        }
    }
    
}
