package View;

import javax.swing.JOptionPane;

public class ViewSolicitaModalidade {

	private String modalidade;

	public ViewSolicitaModalidade() {

		modalidade = JOptionPane.showInputDialog("Infome o nome do Modalidade: ");
	}

	public String getModalidade() {
		return modalidade;
	}
}
