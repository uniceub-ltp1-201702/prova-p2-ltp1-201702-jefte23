// Quest�o 4a: Crie uma funcionalidade que solicita do usu�rio o nome de um pa�s e retorne
// adiferen�a de medalhas de ouro, de prata e de bronze desse pa�s em rela��o aos EUA, 
// conforme os dados importados dos arquivos.

package Controle;

import java.util.ArrayList;

import Model.BDSimulado;
import Model.Medalha;
import View.ViewDiferen�a;
import View.ViewSolicitaPais;

public class ControleDiferencaEUA {

	private BDSimulado bds;

	public ControleDiferencaEUA(BDSimulado bds) {
		this.bds = bds;
	}

	@SuppressWarnings("unused")
	public void DiferencaPais() {

		int diferen�aOuro = 0;
		int diferen�aPrata = 0;
		int diferen�aBronze = 0;
		ArrayList<Medalha> medalhas = bds.getMedalhas();

		ViewSolicitaPais sp = new ViewSolicitaPais();
		String pais = sp.getPais();

		String q = "";
		for (int i = 0; i < medalhas.size(); i++) {
			if (medalhas.get(i).getPais().equals(pais)) {
				diferen�aOuro = medalhas.get(i).getQtdOuro() - medalhas.get(0).getQtdOuro();
				diferen�aPrata = medalhas.get(i).getQtdPrata() - medalhas.get(0).getQtdPrata();
				diferen�aBronze = medalhas.get(i).getQtdBronze() - medalhas.get(0).getQtdBronze();
				q += "A diferen�a de Medalha entre " + pais + " e  os " + medalhas.get(0).getPais()
						+ "\n - Qtd Medalhas de Ouro: " + diferen�aOuro + "\n - Qtd Medalhas de Prata: "
						+ diferen�aPrata + "\n - Qtd Medalhas de Bronze: " + diferen�aBronze;
			}
		}

		ViewDiferen�a vde = new ViewDiferen�a(q);
	}

}
