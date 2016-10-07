package alumno;
import javax.swing.*;

import persona.Persona;

public class Alumno extends Persona{
	protected float calificacion;
	
	public void datos(){
		try {
			setNombre(JOptionPane.showInputDialog(null, "Por favor escriba su NOMBRE", "Obteniendo datos",
					JOptionPane.QUESTION_MESSAGE));

			setApellido(JOptionPane.showInputDialog(null, "Por favor escriba sus APELLIDOS", "Obteniendo datos",
					JOptionPane.QUESTION_MESSAGE));

			setEdad(JOptionPane.showInputDialog(null, "Por favor escriba su EDAD", "Obteniendo datos",
					JOptionPane.QUESTION_MESSAGE));

		setCalificacion( Float.parseFloat(JOptionPane.showInputDialog(null, "Por favor escriba su calificación",
					"Obteniendo datos", JOptionPane.QUESTION_MESSAGE)));

			setDireccion(JOptionPane.showInputDialog(null, "Por favor escriba su DIRECCIÓN", "Obteniendo datos",
					JOptionPane.QUESTION_MESSAGE));

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error >>>>" + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
		} 
		
	}
	
	public void setCalificacion(float calificacion){
		this.calificacion =calificacion;
	}
	
	public float getCalificacion(){
		return calificacion;
	}

}
