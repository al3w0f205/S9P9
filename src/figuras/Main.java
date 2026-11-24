package figuras;

public class Main {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(3.0);
        Circulo circuloCentro = new Circulo(2.5, 4.0, 7.0);
        Rectangulo rectangulo = new Rectangulo(4.0, 5.0);
        Triangulo triangulo = new Triangulo(6.0, 3.5);

        Lienzo lienzo = new Lienzo("Mi dibujo S9P9");
        lienzo.agregar(circulo);
        lienzo.agregar(circuloCentro);
        lienzo.agregar(rectangulo);
        lienzo.agregar(triangulo);

        System.out.println("===== TALLER SEMANA 9: UML A JAVA =====");
        lienzo.mostrarFiguras();
        System.out.println("Area total: " + String.format("%.2f", lienzo.calcularAreaTotal()));
    }

}
