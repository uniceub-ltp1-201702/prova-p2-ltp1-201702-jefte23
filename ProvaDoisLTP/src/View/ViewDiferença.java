package View;

import javax.swing.JOptionPane;

public class ViewDiferen�a {

	public ViewDiferen�a(String diferenca) {

		if (diferenca != "") {
			JOptionPane.showMessageDialog(null, diferenca);
		} else {
			JOptionPane.showMessageDialog(null, "Pa�s n�o encontrado");
		}

	}

}
