package principal;

import java.util.ArrayList;
import profesor.*;
import alumno.*;
import javax.swing.*;

public class Principal {

	public static void main(String[] args) {

		Alumno objAlumno = new Alumno();
		Profesor objProfesor = new Profesor();

		ArrayList<Alumno> newAlumno = new ArrayList<Alumno>();
		ArrayList<Profesor> newProfesor = new ArrayList<Profesor>();

		int respuesta;

		do {
			try {
				respuesta = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Seleccione... " + "\n 1 = Agregar Alumnno " + "\n 2 = Agregar profesor "
								+ "\n 3 = Mostrar Alumnado" + "\n 4 = Mostrar Profesores" + "\n 5 = salir",
						"Obteniendo datos", JOptionPane.QUESTION_MESSAGE));

				switch (respuesta) {
				case 1:

					objAlumno.datos();
					newAlumno.add(objAlumno);

					break;
				case 2:
					objProfesor.datos();
					newProfesor.add(objProfesor);
				case 3:
					if (!newAlumno.isEmpty()) {
						System.out.println("Datos de los alumnos");
						for (Alumno per : newAlumno) {
							System.out.println("\t Nombre: " +  per.getNombre().toUpperCase() + "\t Apellidos:" + per.getApellidos().toUpperCase()
									+ "\t Edad: " + per.getEdad() + "\t Dirección: " + per.getDireccion().toUpperCase()
									+ "\t Calificación: " + per.getCalificacion());
						}
					} else {
						JOptionPane.showMessageDialog(null, "No hay datos para mostrar", "Sin datos",
								JOptionPane.INFORMATION_MESSAGE);
					}

					break;
				case 4:
					if (!newProfesor.isEmpty()) {
						System.out.println("Datos de los profesores");
						for (Profesor prof : newProfesor) {
							System.out.println("\t Nombre:" + prof.getNombre().toUpperCase() + "\t Apellidos:" + prof.getApellidos().toUpperCase()
									+ "\t Edad: " + prof.getEdad() + "\t  Número de Cedula Profesional: "
									+ prof.dameCedula().toUpperCase());
						}
					} else {
						JOptionPane.showMessageDialog(null, "No hay datos para mostrar", "Sin datos",
								JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 5:
					System.exit(0);
					break;
				default:
					JOptionPane.showMessageDialog(null, "La opción elegida no está disponible");
					break;
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "ERRO--> " + e.getMessage());
				respuesta = 0;
			}
		} while (respuesta != 5);
	}

}
