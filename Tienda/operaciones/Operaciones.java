package operaciones;


import fruta.Fruta;
import enlatados.Enlatados;
import javax.swing.*;

public class Operaciones {
	
	int respuesta;
	Fruta productoFruta = new Fruta();
	Enlatados productoEnlatado = new Enlatados();


	public void CompraEnlatado(){
		do{
			try{
				respuesta = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione: \n\t 1= Por pieza \t\n 2 = Por caja o reja \n 3 = Salir","ENLATADO",JOptionPane.QUESTION_MESSAGE));
				switch (respuesta) {
				case 1:
					productoEnlatado.Marca(JOptionPane.showInputDialog(null,"¿Qué marca es el producto","ENLATADO",JOptionPane.QUESTION_MESSAGE)); 
					productoEnlatado.SetCantidad(Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas piezas son?","ENLATADO",JOptionPane.QUESTION_MESSAGE)));
					productoEnlatado.setNombre(JOptionPane.showInputDialog(null,"Escribe el nombre del producto","ENLATADO",JOptionPane.QUESTION_MESSAGE));
					productoEnlatado.ObtieneDescuentoCantidad();
					respuesta = 3;
					break;
				case 2:
					productoEnlatado.Marca(JOptionPane.showInputDialog(null,"¿Qué marca es el producto","ENLATADO",JOptionPane.QUESTION_MESSAGE)); 
					productoEnlatado.SetBultos(Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas cajas o rejas son?","ENLATADO",JOptionPane.QUESTION_MESSAGE)));
					productoEnlatado.setNombre(JOptionPane.showInputDialog(null,"Escribe el nombre del producto","ENLATADO",JOptionPane.QUESTION_MESSAGE));
					productoEnlatado.ObtieneDescuentoBulto();
					respuesta = 3;
					break;
				case 3:
					System.exit(0);
					break;
					
				default:
					JOptionPane.showMessageDialog(null,"Opción no disponible");
					
					break;
				}
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null,"Error---> trate de escribir valores numéricos ","ERROR", JOptionPane.ERROR_MESSAGE );
				respuesta = 0;
			}
		}while(respuesta != 3);
	}

	
	public void CompraFruta() {
		do {
			try {

				 respuesta = Integer.parseInt(JOptionPane.showInputDialog(null,
						 "Seleccione \n 1 = POR PIEZA  \n 2 = POR BULTO \n 3 = POR CAJA O REJA \n 4 = Salir","FRUTA",JOptionPane.QUESTION_MESSAGE));
				 switch (respuesta) {
				case 1:
					productoFruta.SetCantidad(Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas piezas son?","FRUTA",JOptionPane.QUESTION_MESSAGE)));	
					productoFruta.SetPrecio(Float.parseFloat(JOptionPane.showInputDialog(null,"¿Cuál es el precio de la fruta?","FRUTA",JOptionPane.QUESTION_MESSAGE)));	
					productoFruta.setNombre(JOptionPane.showInputDialog(null,"Escribe el nombre de la fruta","FRUTA",JOptionPane.QUESTION_MESSAGE));
					productoFruta.ObtieneDescuentoCantidad();
					respuesta = 4;
					break;
				case 2:
					productoFruta.SetCantidadBultos(Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos bultos son?","FRUTA",JOptionPane.QUESTION_MESSAGE)));
					productoFruta.SetPrecio(Float.parseFloat(JOptionPane.showInputDialog(null,"¿Cuál es el precio de la fruta por bulto?","FRUTA",JOptionPane.QUESTION_MESSAGE)));
					productoFruta.setNombre(JOptionPane.showInputDialog(null,"Escribe el nombre de la fruta","FRUTA",JOptionPane.QUESTION_MESSAGE));
					productoFruta.ObtieneDescuentoBulto();
					respuesta = 4;
					break;
				case 3:
					productoFruta.SetCantidadCajas(Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas cajas o rejas son?","FRUTA",JOptionPane.QUESTION_MESSAGE)));
					productoFruta.SetPrecio(Float.parseFloat(JOptionPane.showInputDialog(null,"¿Cuál es el precio de la fruta por caja o reja ?","FRUTA",JOptionPane.QUESTION_MESSAGE)));
					productoFruta.setNombre(JOptionPane.showInputDialog(null,"Escribe el nombre de la fruta","FRUTA",JOptionPane.QUESTION_MESSAGE));
					productoFruta.ObtieneDescuentoCaja();
					respuesta = 4;
				case 4:
					System.exit(0);
					break;
				
				default:
					JOptionPane.showMessageDialog(null,"Opción no disponible");
					break;
				}

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,"Error---> trate de escribir valores numéricos ","ERROR", JOptionPane.ERROR_MESSAGE );
				respuesta = 0;
			}
		} while (respuesta != 4);	

	}
	
}
