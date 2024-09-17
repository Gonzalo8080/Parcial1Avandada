
public class Ingredientes {
	
	private String nombre, sabor;
	private int cant;
	
	public Ingredientes (String nombre, String sabor, int cant) {
		this.nombre=nombre;
		this.sabor=sabor;
		this.cant=cant;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	@Override
	public String toString() {
		return "Ingredientes [nombre=" + nombre + ", sabor=" + sabor + ", cant=" + cant + "]";
	}
	

}
