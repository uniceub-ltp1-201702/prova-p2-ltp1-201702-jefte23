package View;

import javax.swing.JOptionPane;

public class ViewSolicitaPais {

	private String pais;

	public ViewSolicitaPais() {
		pais = JOptionPane.showInputDialog("Infome o nome do Esporte: ");
	}

	public String getPais() {
		return pais;
	}
}
