package figuras;

/**
 * Clase abstracta que implementa Figura. Deja calcularArea() y
 * mostrarNombre() a cada subclase y reutiliza mostrarArea().
 */
public abstract class FiguraBase implements Figura {

    protected FiguraBase() {
    }

    public abstract void mostrarNombre();

    public void mostrarArea() {
        mostrarNombre();
        System.out.println("Area: " + String.format("%.2f", calcularArea()));
    }

}
