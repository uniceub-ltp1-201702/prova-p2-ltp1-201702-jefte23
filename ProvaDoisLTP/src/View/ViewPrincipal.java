package View;

import javax.swing.JOptionPane;

public class ViewPrincipal {

	// Atributo
	private String opcao;

	// Metodo para exibir a lista de op�oes
	public String getOpcao() {

		this.opcao = JOptionPane.showInputDialog("\t" + "<<<< Estolha uma op��o >>>>\n" + " 1 - Busca Modalidade: \n"
				+ " 2 -  Diferen�a medalhas EUA\n" + " 3 - diferen�a medalha paises\n" + " 4 - Paises MERCOSUL\n"
				+ " 5 - Busca modalidade por Palavra\n" + " 6 - Cadastrar Esporte\n" + " 7 - sair\n");
		return this.opcao;
	}

}
