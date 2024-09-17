import javax.swing.JOptionPane;

public interface Validaciones {
	
	default int validaNum(String mensaje) {
		String num; 
		boolean flag;
		do {
			flag=true;
			num = JOptionPane.showInputDialog(mensaje);
			while (num.isEmpty()) {
				num = JOptionPane.showInputDialog("Error no puede estar vacio " +mensaje);
			}
			for (int i = 0; i < num.length(); i++) {
				if (!Character.isDigit(num.charAt(i))) {
					JOptionPane.showMessageDialog(null, "Error, no es un número ");
					flag=false;
					break;
				}
			}
		} while (!flag);
		return Integer.parseInt(num);
	}
	
	
}
