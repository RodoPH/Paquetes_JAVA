package operaciones;

import lado.Lados;

public class Operaciones extends Lados {

	protected static double area;
	protected static double diametro;
	protected static double perimetro;

	public static double AreaRectangulo() {
		area = Base() * Altura();
		return area;
	}

	public static double DiametroRectangulo() {
		diametro = Math.sqrt((Math.pow(Base(), 2) + (Math.pow(Altura(), 2))));
		return diametro;
	}

	public static double PerimetroRectangulo() {
		perimetro = 2 * (Base() * Altura());
		return perimetro;
	}

}
