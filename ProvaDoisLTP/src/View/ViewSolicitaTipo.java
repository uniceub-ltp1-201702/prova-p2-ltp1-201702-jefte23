package View;

import javax.swing.JOptionPane;

public class ViewSolicitaTipo {

	private int validador;

	public ViewSolicitaTipo() {

		validador = Integer
				.parseInt(JOptionPane.showInputDialog("Deseja visualizar Paises Associados: \n 1 - SIM\n 2 - NÃO"));
	}

	public int getValidador() {
		return validador;
	}

}
