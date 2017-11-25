package View;

import javax.swing.JOptionPane;

public class ViewCadastraModalidade {

	private int validador;

	public ViewCadastraModalidade() {

		validador = Integer
				.parseInt(JOptionPane.showInputDialog("Deseja cadastrar outra modalidade: \n 1 - SIM\n 2 - NÃO"));

	}

	public int getValidador() {
		return validador;
	}
}
