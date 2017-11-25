package View;

import javax.swing.JOptionPane;

public class ViewSolicitaString {

	private String nome;

	public ViewSolicitaString() {
		nome = JOptionPane.showInputDialog("Infome a palavra ou trecho de palavra para busca: ");
	}

	public String getNome() {
		return nome;
	}

}
