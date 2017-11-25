package View;

import javax.swing.JOptionPane;

public class ViewPrincipal {

	// Atributo
	private String opcao;

	// Metodo para exibir a lista de opçoes
	public String getOpcao() {

		this.opcao = JOptionPane.showInputDialog("\t" + "<<<< Estolha uma opção >>>>\n" + " 1 - Busca Modalidade: \n"
				+ " 2 -  Diferença medalhas EUA\n" + " 3 - diferença medalha paises\n" + " 4 - Paises MERCOSUL\n"
				+ " 5 - Busca modalidade por Palavra\n" + " 6 - Cadastrar Esporte\n" + " 7 - sair\n");
		return this.opcao;
	}

}
