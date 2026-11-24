package figuras;

import java.util.ArrayList;

/**
 * Agrupa figuras (agregacion 0..*): las figuras existen aunque el lienzo no.
 */
public class Lienzo {

    private String titulo;

    private ArrayList<FiguraBase> figuras;

    public Lienzo(String titulo) {
        this.titulo = titulo;
        this.figuras = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void agregar(FiguraBase figura) {
        if (figura != null) {
            figuras.add(figura);
        }
    }

    public double calcularAreaTotal() {
        double total = 0;
        for (FiguraBase f : figuras) {
            total += f.calcularArea();
        }
        return total;
    }

    public void mostrarFiguras() {
        System.out.println("Lienzo: " + titulo + " (" + figuras.size() + " figuras)");
        for (FiguraBase f : figuras) {
            f.mostrarArea();
            System.out.println("---------------------");
        }
    }

}
