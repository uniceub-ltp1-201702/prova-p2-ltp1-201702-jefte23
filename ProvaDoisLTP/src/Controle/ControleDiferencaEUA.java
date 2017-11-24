// Questão 4a: Crie uma funcionalidade que solicita do usuário o nome de um país e retorne
// adiferença de medalhas de ouro, de prata e de bronze desse país em relação aos EUA, 
// conforme os dados importados dos arquivos.

package Controle;

import java.util.ArrayList;

import Model.BDSimulado;
import Model.Medalha;
import View.ViewDiferença;
import View.ViewSolicitaPais;

public class ControleDiferencaEUA {

	private BDSimulado bds;

	public ControleDiferencaEUA(BDSimulado bds) {
		this.bds = bds;
	}

	@SuppressWarnings("unused")
	public void DiferencaPais() {

		int diferençaOuro = 0;
		int diferençaPrata = 0;
		int diferençaBronze = 0;
		ArrayList<Medalha> medalhas = bds.getMedalhas();

		ViewSolicitaPais sp = new ViewSolicitaPais();
		String pais = sp.getPais();

		String q = "";
		for (int i = 0; i < medalhas.size(); i++) {
			if (medalhas.get(i).getPais().equals(pais)) {
				diferençaOuro = medalhas.get(i).getQtdOuro() - medalhas.get(0).getQtdOuro();
				diferençaPrata = medalhas.get(i).getQtdPrata() - medalhas.get(0).getQtdPrata();
				diferençaBronze = medalhas.get(i).getQtdBronze() - medalhas.get(0).getQtdBronze();
				q += "A diferença de Medalha entre " + pais + " e  os " + medalhas.get(0).getPais()
						+ "\n - Qtd Medalhas de Ouro: " + diferençaOuro + "\n - Qtd Medalhas de Prata: "
						+ diferençaPrata + "\n - Qtd Medalhas de Bronze: " + diferençaBronze;
			}
		}

		ViewDiferença vde = new ViewDiferença(q);
	}

}
