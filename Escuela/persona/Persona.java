package persona;

public class Persona {
	protected String nombre, apellidos, edad, direccion;

	public Persona() { 
		nombre = "";
		apellidos = " ";
		edad = " ";
		direccion = " ";

	}

	public void datos(String nombre, String apellidos, String edad, String direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.direccion = direccion;

	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getEdad() {
		return edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	public void setApellido(String apellidos) {
		this.apellidos = apellidos;

	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion){
		this.direccion = direccion;
	}
}
