package View;

import javax.swing.JOptionPane;

public class ViewDiferença {

	public ViewDiferença(String diferenca) {

		if (diferenca != "") {
			JOptionPane.showMessageDialog(null, diferenca);
		} else {
			JOptionPane.showMessageDialog(null, "País não encontrado");
		}

	}

}
