package persona;

public class Persona {

	protected String nombre, apellidos, edad, direccion;

	protected float estatura;

	public Persona() { // Contrustor que inicializa las variables de la Clase
		nombre = "";
		apellidos = " ";
		edad = " ";
		estatura = 0;
	}

	// Contructor que recibe todos los datos
	public void datos(String nombre, String apellidos, String edad, float estatura) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.estatura = estatura;
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

	public float getEstatura() {
		return estatura;
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

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

	public String getDireccion() {
		return direccion;
	}
}
