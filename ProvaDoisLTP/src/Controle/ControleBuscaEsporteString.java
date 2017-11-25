// Quest�o 6:Crie um conjunto de classes e fun��es que receba do usu�rio uma palavra ou peda�o de palavra
//  como par�metro e retorne o nome de todos os esportes que possuem modalidades cujo o nome cont�m a palavra
//  ou peda�o de palavra informado.

package Controle;

import java.util.ArrayList;

import Model.BDSimulado;
import Model.Esporte;
import View.ViewExibeEsportes;
import View.ViewSolicitaString;

public class ControleBuscaEsporteString {

	private BDSimulado bds;

	public ControleBuscaEsporteString(BDSimulado bds) {
		this.bds = bds;
	}

	@SuppressWarnings("unused")
	public void BuscaEsportString() {

		ArrayList<Esporte> esportes = bds.getEsportes();

		ViewSolicitaString vss = new ViewSolicitaString();

		// Recupera letra/palavra passada por Usuario
		String nome = vss.getNome().toUpperCase();

		String a = "";
		for (int i = 0; i < esportes.size(); i++) {
			if (esportes.get(i).getModalidade().toUpperCase().contains(nome)) {
				a += esportes.get(i).getEsporte() + "n";

			}
		}
		ViewExibeEsportes es = new ViewExibeEsportes(a);
	}

}
