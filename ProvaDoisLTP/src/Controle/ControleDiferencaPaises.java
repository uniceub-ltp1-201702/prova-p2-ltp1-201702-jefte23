// Quest�o 4b: Crie uma funcionalidade que solicita do usu�rio o nome de dois pa�ses
// e exiba a diferen�a total de medalhas entre eles.
package Controle;

import java.util.ArrayList;

import Model.BDSimulado;
import Model.Medalha;
import View.ViewDiferen�a;
import View.ViewSolicitaPais;

public class ControleDiferencaPaises {

	private BDSimulado bds;

	public ControleDiferencaPaises(BDSimulado bds) {
		this.bds = bds;
	}

	@SuppressWarnings("unused")
	public void DiferencaPaises() {

		int diferen�aOuroPais1 = 0;
		int diferen�aPrataPais1 = 0;
		int diferen�aBronzePais1 = 0;
		// -------------------------
		int diferen�aOuroPais2 = 0;
		int diferen�aPrataPais2 = 0;
		int diferen�aBronzePais2 = 0;
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
				diferen�aOuroPais1 = medalhas.get(i).getQtdOuro();
				diferen�aPrataPais1 = medalhas.get(i).getQtdPrata();
				diferen�aBronzePais1 = medalhas.get(i).getQtdBronze();
			}

			if (medalhas.get(i).getPais().equals(pais1)) {
				diferen�aOuroPais2 = medalhas.get(i).getQtdOuro();
				diferen�aPrataPais2 = medalhas.get(i).getQtdPrata();
				diferen�aBronzePais2 = medalhas.get(i).getQtdBronze();
			}

		}

		diferen�aOuroPais2 = diferen�aOuroPais2 - diferen�aOuroPais1;
		diferen�aPrataPais2 = diferen�aPrataPais1 - diferen�aPrataPais2;

		q += "A diferen�a de Medalha entre " + pais1 + " e " + pais2 + "\n - Qtd Medalhas de Ouro: "
				+ diferen�aOuroPais2 + "\n - Qtd Medalhas de Prata: " + diferen�aPrataPais2
				+ "\n - Qtd Medalhas de Bronze: " + diferen�aBronzePais2;

		ViewDiferen�a vde = new ViewDiferen�a(q);
	}

}
