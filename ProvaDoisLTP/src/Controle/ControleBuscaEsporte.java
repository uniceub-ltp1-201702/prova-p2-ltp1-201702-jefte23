
// Questão 3:Concebaum conjunto de classes e funções quereceba do usuário o nome de um esporte
// e exiba uma coleção com todas as modalidades do esporte informado.

package Controle;

import java.util.ArrayList;

import Model.BDSimulado;
import Model.Esporte;
import View.ViewBuscaEsporte;
import View.ViewSolicitaEsporte;

public class ControleBuscaEsporte {

	private BDSimulado bds;

	public ControleBuscaEsporte(BDSimulado bds) {
		this.bds = bds;
	}

	@SuppressWarnings("unused")
	public void BuscaModalidade() {

		ArrayList<Esporte> esportes = bds.getEsportes();

		ViewSolicitaEsporte se = new ViewSolicitaEsporte();

		String nomeEsporte = se.getEsporte();

		String e = "";
		for (int i = 0; i < esportes.size(); i++) {

			if (esportes.get(i).getEsporte().equalsIgnoreCase(nomeEsporte)) {
				e += "Esporte: " + esportes.get(i).getEsporte() + " - " + "Modalidade: "
						+ esportes.get(i).getModalidade();
			}
		}
		ViewBuscaEsporte be = new ViewBuscaEsporte(e);

	}
}
