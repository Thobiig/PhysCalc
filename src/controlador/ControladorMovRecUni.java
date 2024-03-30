package controlador;

public class ControladorMovRecUni extends modelo.ModeloMovHorizontal {

    public ControladorMovRecUni() {

    }

    public ControladorMovRecUni(double tiempoInicial, double tiempoFinal, double velocidad,
            double posInicial, double posFinal) {
        setTiempoInicial(tiempoInicial);
        setTiempoFinal(tiempoFinal);
        setPosInicial(posInicial);
        setPosFinal(posFinal);
        setVelocidad(velocidad);
    }

    public double calcularVelocidad() {

        return (getPosFinal() - getPosInicial()) / (getTiempoFinal() - getTiempoInicial());
    }

    public double calcularPosicion() {
        return (getVelocidad() * (getTiempoFinal() - getTiempoInicial())) + getPosInicial();
    }

    public double calcularTiempo() {
        return (getPosFinal() - getPosInicial()) / getVelocidad();
    }

}
