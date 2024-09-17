
public class Main implements Validaciones,Menu{

	public static void main(String[] args) {
		
		Usuario yo = new Usuario("Gonzalo", "Alsogaray", "gonzalo.alsogaray@gmail.com", "Gonza808",20, 888);
		yo.setNro();
		yo.MenuPrincipal();
		yo.login("", "", "");
	}
	
	@Override
	public void MenuPrincipal() {
		// TODO Auto-generated method stub
		
	}

}
