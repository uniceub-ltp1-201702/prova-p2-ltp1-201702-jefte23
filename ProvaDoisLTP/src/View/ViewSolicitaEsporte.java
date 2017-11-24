package View;

import javax.swing.JOptionPane;

public class ViewSolicitaEsporte {

	private String esporte;

	public ViewSolicitaEsporte() {

		esporte = JOptionPane.showInputDialog("Infome o nome do Esporte: ");
	}

	public String getEsporte() {
		return esporte;
	}
}
