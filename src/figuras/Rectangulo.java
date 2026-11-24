package figuras;

public class Rectangulo extends FiguraBase {

    private double base;

    private double altura;

    public Rectangulo(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("La base y la altura deben ser mayores que 0");
        }
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public void mostrarNombre() {
        System.out.println("Rectangulo (Base: " + base + ", Altura: " + altura + ")");
    }

}
