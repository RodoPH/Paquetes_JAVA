//realizado por RodoPH 

package principal;

import javax.swing.JOptionPane;
import operaciones.Operaciones;

public class Principal extends Operaciones {

	public static void main(String[] args) {
		

		int respuesta;

		
		do {
		try {
				respuesta = Integer.parseInt(JOptionPane.showInputDialog(null,"�Qu� desea calcular?  \n 1 = Diametro "
																								  + "\n 2 = Perimetro " 
																								  + " \n 3 = �rea "
																								  + " \n 4 = Salir", "Operaciones de rect�ngulo", JOptionPane.INFORMATION_MESSAGE));
				switch (respuesta) {
				case 1:
					JOptionPane.showMessageDialog(null, "El valor del di�metro es : " + DiametroRectangulo() + " cm",
							"Resultado", JOptionPane.INFORMATION_MESSAGE);

					break;
				case 2:
					JOptionPane.showMessageDialog(null, "El valor del per�metro es : " + PerimetroRectangulo() + " cm",
							"Resultado", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "El valor del �rea es : " + AreaRectangulo() + " cm",
							"Resultado", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Saliendo... ");
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Esa opci�n no est� disponible", "Informaci�n",
							JOptionPane.INFORMATION_MESSAGE);
				}
			

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Intenta teclear las opciones mostradas", "Error" , JOptionPane.ERROR_MESSAGE);
			respuesta = 0;
		}
		} while (respuesta != 4);
	}
}
