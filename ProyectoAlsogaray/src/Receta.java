
public class Receta {
	private int pasos;
	private Ingredientes ingre;
	
	public Receta (int pasos, Ingredientes ingre) {
		this.pasos=pasos;
		this.ingre=ingre;
	}

	public int getPasos() {
		return pasos;
	}

	public void setPasos(int pasos) {
		this.pasos = pasos;
	}

	public Ingredientes getIngre() {
		return ingre;
	}

	public void setIngre(Ingredientes ingre) {
		this.ingre = ingre;
	}
	

}
