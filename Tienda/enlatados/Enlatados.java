package enlatados;
import articulo.Articulos;

public class Enlatados extends Articulos {
	protected String marca;
	
	public Enlatados(){
		super();
		marca =  " ";
	}
	
	public String dameMarca(){
		return marca;
	}
	
	public void Marca(String marca){
		this.marca = marca;
	}
	
	
}
