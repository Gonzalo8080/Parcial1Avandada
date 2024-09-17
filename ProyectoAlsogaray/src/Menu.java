
public interface Menu {
	
	void MenuPrincipal();
	
	default boolean login(String nombre, String email , String contrasena) {
		if (nombre.isEmpty() && contrasena.isEmpty() && email.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
	

}
