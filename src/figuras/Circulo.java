package figuras;

public class Circulo extends FiguraBase {

    private double radio;

    private Punto centro;

    public Circulo(double radio) {
        this(radio, 0.0, 0.0);
    }

    public Circulo(double radio, double centroX, double centroY) {
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser mayor que 0");
        }
        this.radio = radio;
        this.centro = new Punto(centroX, centroY);
    }

    public double getRadio() {
        return radio;
    }

    public Punto getCentro() {
        return centro;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public void mostrarNombre() {
        System.out.println("Circulo (Centro: " + centro + ", Radio: " + radio + ")");
    }

}
