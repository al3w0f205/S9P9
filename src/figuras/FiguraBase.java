package figuras;

public abstract class FiguraBase implements Figura {

	protected FiguraBase() {

	}

	public abstract void mostrarNombre();

	public void mostrarArea() {

	}


	/**
	 * @see figuras.Figura#calcularArea()
	 */
	public double calcularArea() {
		return 0;
	}

}
