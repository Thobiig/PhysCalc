package controlador;

public class ControladorMovRecUni extends modelo.ModeloMovHorizontal {

    /*
        Todas las variables son heredadas de la clase modelo de esta misma
     */
    public ControladorMovRecUni() {

    }

    //------ Constructor con todas las variables ------//
    public ControladorMovRecUni(double tiempoInicial, double tiempoFinal, double velocidad,
            double posInicial, double posFinal) {
        setTiempoInicial(tiempoInicial);
        setTiempoFinal(tiempoFinal);
        setPosInicial(posInicial);
        setPosFinal(posFinal);
        setVelocidad(velocidad);
    }

    //----- Método para calcular la velocidad -----//
    public double calcularVelocidad() {
        return (getPosFinal() - getPosInicial()) / (getTiempoFinal() - getTiempoInicial());
    }

    //----- Método para calcular la posición -----//
    public double calcularPosicion() {
        return (getVelocidad() * (getTiempoFinal() - getTiempoInicial())) + getPosInicial();
    }

    //----- Método para calcular el tiempo -----//
    public double calcularTiempo() {
        return (getPosFinal() - getPosInicial()) / getVelocidad();
    }

}
