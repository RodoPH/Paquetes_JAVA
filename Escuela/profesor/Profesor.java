package profesor;

import javax.swing.JOptionPane;
import persona.Persona;
public class Profesor extends Persona{
	private String cedulaPro;

	public void datos(){
		 try {
			setNombre(JOptionPane.showInputDialog(null, "Por favor escriba su NOMBRE", "Obteniendo datos",
					JOptionPane.QUESTION_MESSAGE));

			setApellido(JOptionPane.showInputDialog(null, "Por favor escriba sus APELLIDOS", "Obteniendo datos del profesor",
					JOptionPane.QUESTION_MESSAGE));

			setEdad(JOptionPane.showInputDialog(null, "Por favor escriba su EDAD", "Obteniendo datos del profesor",
					JOptionPane.QUESTION_MESSAGE));

			setDireccion(JOptionPane.showInputDialog(null, "Por favor escriba su DIRECCIÓN", "Obteniendo datos del profesor",
					JOptionPane.QUESTION_MESSAGE));
			cedula(JOptionPane.showInputDialog("Por favor escriba el número de su matrícula","Oibteniendo datos del profesor"));
			

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error >>>>" + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
		} 
	}
		
		public void cedula(String cedula){
			this.cedulaPro = cedula; 
		}
		
		public String dameCedula(){
			return cedulaPro;
		}
		
	}
	

