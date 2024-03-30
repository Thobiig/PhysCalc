package controlador;

import javax.swing.JComboBox;

public class ControladorAngulo {

    //----- Métodos de conversión -----//
    public double gradoRadian(double dato) {
        return dato * (Math.PI / 180);
    }

    public double radianGrado(double dato) {
        return dato * (180 / Math.PI);
    }

    //----- Método condicional sistema internacional -----//
    public double convertirAngulo(double dato, String unidad){
        return switch (unidad) {
            case "grados" -> radianGrado(dato);
            default -> dato;
        };
    }
    
    //-----  Método para rellenar los combobox -----//
    public static void rellenarCombo(JComboBox<String> comboBox) {
        // Iniciar los datos
        String [] datos = {"rad", "grados"};
        // Limpiar el JComboBox
        comboBox.removeAllItems();

        // Rellenar el JComboBox con los elementos del vector
        for (String dato : datos) {
            comboBox.addItem(dato);
        }
    }
    
}
