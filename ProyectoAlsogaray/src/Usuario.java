import javax.swing.JOptionPane;

public  class Usuario implements Validaciones, Menu {
	
	private String nombre, apellido;
	private String email, contraseña;
	private int edad;
	private int nro;
	
	public Usuario(String nombre, String apellido, String email, String contraseña, int edad, int nro) {
		super();
		this.nombre=nombre;
		this.apellido=apellido;
		this.email=email;
		this.contraseña=contraseña;
		this.edad=edad;
		this.nro=nro;
		}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getNro() {
		return nro;
	}
	
	public void setNro() {
		this.nro = validaNum("Ingresar nro usuario");
	}


	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", contraseña="
				+ contraseña + ", edad=" + edad + ", nro=" + nro + "]";
	}
	
	@Override
	public void MenuPrincipal() {
		
JOptionPane.showMessageDialog(null, "Menu usuario");
	}


}
