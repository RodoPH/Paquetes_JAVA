package main;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import clientes.Cliente;
import persona.*;

public class Principal {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();

		ArrayList<Persona> nuevoCliente = new ArrayList<Persona>();
		
		int respuesta;

		do {
			try {
				respuesta = (Integer.parseInt(JOptionPane.showInputDialog(null,
						"Elige una opción:" + "\n 1: Agregar cliente " + "\n 2: Ver clientes" + "\n 3: Salir",
						"Menú de clientes", 3)));

				switch (respuesta) {

				case 1:
					cliente.darDatos();
					nuevoCliente.add(cliente);
					break;

				case 2:
					for (Persona clientes : nuevoCliente) {

						System.out.println("\t Nombre: " + clientes.getNombre() + "\t Apellidos: "
								+ clientes.getApellidos() + "\t Edad: " + clientes.getEdad() + "\t Estatura: "
								+ clientes.getEstatura() + "\t Dirección: " + clientes.getDireccion());
					}
					break;

				case 3:
					JOptionPane.showMessageDialog(null, "Saliendo... ", "Salida", 1);
					System.exit(0);
					break;

				default:
					JOptionPane.showMessageDialog(null, "Esa opción no está disponible");
					break;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "ERROR---> " + e.getMessage());
				respuesta = 0;
			}
		} while (respuesta != 3);

	}

}
