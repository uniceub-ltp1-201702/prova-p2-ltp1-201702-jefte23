// Questão 4b: Crie uma funcionalidade que solicita do usuário o nome de dois países
// e exiba a diferença total de medalhas entre eles.
package Controle;

import java.util.ArrayList;

import Model.BDSimulado;
import Model.Medalha;
import View.ViewDiferença;
import View.ViewSolicitaPais;

public class ControleDiferencaPaises {

	private BDSimulado bds;

	public ControleDiferencaPaises(BDSimulado bds) {
		this.bds = bds;
	}

	@SuppressWarnings("unused")
	public void DiferencaPaises() {

		int diferençaOuroPais1 = 0;
		int diferençaPrataPais1 = 0;
		int diferençaBronzePais1 = 0;
		// -------------------------
		int diferençaOuroPais2 = 0;
		int diferençaPrataPais2 = 0;
		int diferençaBronzePais2 = 0;
		// -------------------------

		ArrayList<Medalha> medalhas = bds.getMedalhas();

		// SOlicita nome do primeiro Pais
		ViewSolicitaPais sp1 = new ViewSolicitaPais();
		String pais1 = sp1.getPais();

		// Solicita nome do Segundo Pais
		ViewSolicitaPais sp2 = new ViewSolicitaPais();
		String pais2 = sp2.getPais();

		String q = "";
		for (int i = 0; i < medalhas.size(); i++) {
			if (medalhas.get(i).getPais().equals(pais1)) {
				diferençaOuroPais1 = medalhas.get(i).getQtdOuro();
				diferençaPrataPais1 = medalhas.get(i).getQtdPrata();
				diferençaBronzePais1 = medalhas.get(i).getQtdBronze();
			}

			if (medalhas.get(i).getPais().equals(pais1)) {
				diferençaOuroPais2 = medalhas.get(i).getQtdOuro();
				diferençaPrataPais2 = medalhas.get(i).getQtdPrata();
				diferençaBronzePais2 = medalhas.get(i).getQtdBronze();
			}

		}

		diferençaOuroPais2 = diferençaOuroPais2 - diferençaOuroPais1;
		diferençaPrataPais2 = diferençaPrataPais1 - diferençaPrataPais2;

		q += "A diferença de Medalha entre " + pais1 + " e " + pais2 + "\n - Qtd Medalhas de Ouro: "
				+ diferençaOuroPais2 + "\n - Qtd Medalhas de Prata: " + diferençaPrataPais2
				+ "\n - Qtd Medalhas de Bronze: " + diferençaBronzePais2;

		ViewDiferença vde = new ViewDiferença(q);
	}

}
