package controlador;

import javax.swing.JComboBox;

public class ControladorVelocidad {

    //----- Métodos de conversión -----//
    public double kilometroMetro(double dato) {
        return dato / 3.6;
    }
    
    public double millaMetro(double dato){
        return dato / 2.237;
    }

    //----- método condicional sistema internacional -----//
    public double convertirVelocidad(double dato, String unidad){
        return switch (unidad) {
            case "km/h" -> kilometroMetro(dato);
            case "mi/h" -> millaMetro(dato);
            default -> dato;
        };
    }
    
    //-----  Método para rellenar los combobox -----//
    public static void rellenarCombo(JComboBox<String> comboBox) {
        /* Iniciar los datos */
        String [] datos = {"m/s", "km/h", "mi/h"};
        /* Limpiar el JComboBox */
        comboBox.removeAllItems();

        /* Rellenar el JComboBox con los elementos del vector */
        for (String dato : datos) {
            comboBox.addItem(dato);
        }
    }
}
