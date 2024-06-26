package controlador;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ControladorUtilidad {
    
    /*
        Acá se almacenan los métodos de utilidad que sirven dentro de las vistas,
        la idea de apartarlos es poder encontrarlos de manera más eficiente y
        poder agregar/cambiar cosas dentro de estos
    */
    
    //----- Método para limpiar todos los jTextField en un panel ----//
    public void limpiarCampo(Container container) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                JTextField textField = (JTextField) component;
                textField.setText("");
            }
        }
    }
    
    //----- Método para que los campos vacíos se conviertan en "0" ----//
    public static void aCero(JTextField campo) {
        if (campo.getText().isEmpty()) {
            campo.setText("0");
        }
    }
    
    //----- Método para limpiar todos los jTextField en un panel ----//
    public void desbloquearCampo(Container container) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                JTextField textField = (JTextField) component;
                textField.setEnabled(true);
            }
            if (component instanceof JComboBox) {
                JComboBox comboBox = (JComboBox) component;
                comboBox.setEnabled(true);
            }
        }
    }

}
