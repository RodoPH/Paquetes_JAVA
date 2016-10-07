
// REALIZADO POR RodoPH

package clientes;

import javax.swing.JOptionPane;

import persona.*;

public class Cliente extends Persona {

	
	public void darDatos() {

		try {
			nombre = JOptionPane.showInputDialog(null, "Por favor escriba su NOMBRE", "Obteniendo datos", JOptionPane.QUESTION_MESSAGE);

			apellidos = JOptionPane.showInputDialog(null, "Por favor escriba sus APELLIDOS", "Obteniendo datos", JOptionPane.QUESTION_MESSAGE);

			edad = JOptionPane.showInputDialog(null, "Por favor escriba su EDAD", "Obteniendo datos", JOptionPane.QUESTION_MESSAGE);

			estatura = Float.parseFloat(JOptionPane.showInputDialog(null, "Por favor escriba su ESTATURA", "Obteniendo datos", JOptionPane.QUESTION_MESSAGE));

			direccion = JOptionPane.showInputDialog(null, "Por favor escriba su DIRECCIÓN", "Obteniendo datos", JOptionPane.QUESTION_MESSAGE);


		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error >>>>" + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDireccion() {

		if (!direccion.equals("")) {
			return  direccion;
		} else
			return "Aún no tenemos la dirección del cliente";
	}
}
