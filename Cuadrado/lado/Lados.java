package lado;

import javax.swing.*;

public class Lados {
	protected static double altura, base;

	public Lados() {
		altura = 0;
		base = 0;
	}

	public static double Altura() {
		try {
			altura = (Float.parseFloat(JOptionPane.showInputDialog(null, "Escribe el valor de la ALTURA", "Valores",JOptionPane.INFORMATION_MESSAGE)));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error ---->" + e.getMessage());
		}
				return altura;

	}

	public static double Base() {
		try {
			base = (Float.parseFloat(JOptionPane.showInputDialog(null, "Escribe el valor de la BASE", "Valores",	JOptionPane.INFORMATION_MESSAGE)));
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error ---->" + e.getMessage());
		}
		return base;
	}

}
