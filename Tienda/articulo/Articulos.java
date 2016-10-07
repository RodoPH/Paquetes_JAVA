package articulo;

public class Articulos {

	protected int bulto, cajas;
	protected float precio, kilos;
	protected int cantidad;
	protected float descuento;
	protected String nombre;
	

	public Articulos() {
		nombre = "";
		bulto = 0;
		precio = 0;
		kilos = 0;
		cantidad = 0;
	}

	public double ObtieneDescuentoCantidad() {
		if (GetCantidad() > 20 && GetCantidad() < 40) {
			SetPrecio((float)(GetPrecio() / 1.10));
			System.out.println("Aplica un descuento del 10%");
			
		} else if (GetCantidad() > 40 && GetCantidad() <= 100 ) {
			SetPrecio((float)  (GetPrecio() / 1.17));
			System.out.println("Aplica un descuento del 17%");
		} else if(GetCantidad() > 100){
			SetPrecio((float) (GetPrecio() / 1.20));
			System.out.println("Aplica un descuento del 20 %");
		} else{
			System.out.println("No aplica descuento");
		}

		return precio;
	}
	
	public void ObtieneDescuentoBulto(){
		if(GetBultos() > 5 && GetCantidad() < 10){
			SetPrecio((float) (GetPrecio() / 1.15));
			System.out.println("Aplica un descuento del 15%");
		}else if(GetBultos() >= 10  && GetBultos() <= 200){
			SetPrecio((float) (GetPrecio() / 1.17));
			System.out.println("Aplica un descuento del 17%");
		}else if(GetBultos() > 200){
			SetPrecio((float) (GetBultos() / 1.20));
			System.out.println("Aplica un descuento del 20 %");
		}else{
			System.out.println("No aplica descuento");
		}
	}
	public void ObtieneDescuentoCaja(){
		if(GetCajas() > 5 && GetCajas() < 10){
			SetPrecio((float) (GetPrecio() / 1.05));
			System.out.println("Aplica un descuento del 5 %");
		}else if(GetBultos() >= 10  && GetBultos() <= 100){
			SetPrecio((float) (GetPrecio() / 1.17));
			System.out.println("Aplica un descuento del 17 %");
		}else if(GetBultos() >100){
			SetPrecio((float) (GetBultos() / 1.20) );
			System.out.println("Aplica un descuento del 20 %");
		}else{
			System.out.println("No aplica descuento");
		}
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int GetBultos() {
		return bulto;
	}

	public int GetCajas() {
		return cajas;
	}

	public double GetPrecio() {
		return precio;
	}

	public double GetKilos() {
		return kilos;
	}

	public int GetCantidad() {
		return cantidad;
	}

	public void SetPrecio(float d) {
		this.precio = d;
	}

	public void SetCantindadKilos(float kilos) {
		this.kilos = kilos;
	}

	public void SetCantidadBultos(int bulto) {
		this.bulto = bulto;
	}

	public void SetCantidadCajas(int cajas) {
		this.cajas = cajas;
	}

	public void SetCantidad(int cantidad) {
		this.cantidad = cantidad;

	}
	public void SetBultos(int bulto){
		this.bulto = bulto;
	}

}
