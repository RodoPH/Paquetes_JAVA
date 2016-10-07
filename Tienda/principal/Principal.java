package principal;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import articulo.Articulos;

import operaciones.Operaciones;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Articulos> nuevoProducto = new ArrayList<Articulos>();
		
		String respuesta;
		Operaciones objOpera = new Operaciones();
		
		String[] producto  = {"Seleccione...","Fruta" , "Enlatado", "Salir"};

		JOptionPane.showMessageDialog(null, "BIENVENIDO","Saludo",JOptionPane.INFORMATION_MESSAGE);
		
		do{
		try{
			
		respuesta = (String) JOptionPane.showInputDialog(null,"¿qué poducto es su compra? ","BIENVENIDO",JOptionPane.QUESTION_MESSAGE,null,producto,producto[0]);
			
		if(respuesta.equals(producto[1])){
			
			objOpera.CompraFruta();
		
		}else if (respuesta.equals(producto[2])){
			
			objOpera.CompraEnlatado();
			
		}else if (respuesta.equals(producto[3])){
			System.exit(0);
		}
		
		}catch (Exception e) {
			System.out.println("Error---> " + e.toString());
			respuesta = "";
		}
		}while(respuesta != producto[3]);
	}

}
