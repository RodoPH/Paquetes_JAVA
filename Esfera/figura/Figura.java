package figura;
import datos.tdaEsfera;
import javax.swing.JOptionPane;

public class Figura  {

	double radio;
	
	public void datos(){
		
		 radio = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el valor del radio de la esfera","Esfera",JOptionPane.QUESTION_MESSAGE));
		 tdaEsfera objEsfera = new tdaEsfera(radio);
		 
		 JOptionPane.showMessageDialog(null,"Resultados: \n"
					+ "La circunferencia es: "+ objEsfera.getCircunferencia()
					+"\n El volumen es: "+ objEsfera.getVolumen() 
					+"\n El diametro es: "+objEsfera.getDiametro()
					+"\n El área es: "+objEsfera.getArea(),"Resultados", JOptionPane.INFORMATION_MESSAGE);


		
	}
	
	
	


	

}
