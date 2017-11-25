// Quest�o 5: Conceba um conjunto de classes e fun��es que apresenteao usu�rioo nome e a quantidade de medalhasde ouro, 		
// prata e bronze dos pa�ses que comp�em o MERCOSUL. O usu�rio pode optar pela apresenta��o, tamb�m, das medalhas dos 
// pa�ses associadosao MERCOSUL.

// MERCOSUL � composto por Argentina, Brasil, Paraguai e Uruguai e Venezuela. Tem como pa�ses associados Chile, Bol�via, Peru, Col�mbia e Equador.

package Controle;

import java.util.ArrayList;

import Model.BDSimulado;
import Model.Medalha;
import View.ViewExibePaises;
import View.ViewSolicitaTipo;

public class ControleMedalhasMercosul {

	private BDSimulado bds;

	public ControleMedalhasMercosul(BDSimulado bds) {
		this.bds = bds;
	}

	@SuppressWarnings("unused")
	public void MedalhasMercosul() {

		ArrayList<Medalha> medalhas = bds.getMedalhas();

		String m = "";
		for (int i = 0; i < medalhas.size(); i++) {

			if (medalhas.get(i).getPais().equalsIgnoreCase("BRASIL")
					|| medalhas.get(i).getPais().equalsIgnoreCase("ARGENTINA")
					|| medalhas.get(i).getPais().equalsIgnoreCase("PARAGUAI")
					|| medalhas.get(i).getPais().equalsIgnoreCase("URUGUAI")
					|| medalhas.get(i).getPais().equalsIgnoreCase("VENEZUELA")) {

				m += "\n" + medalhas.get(i).getPais() + "\n Medalha de Ouro: " + medalhas.get(i).getQtdOuro()
						+ "\n Medalha de Prata: " + medalhas.get(i).getQtdPrata() + "\n Medalhas de Bronze: "
						+ medalhas.get(i).getQtdBronze();

			}
		}

		ViewSolicitaTipo st = new ViewSolicitaTipo();
		int tipo = st.getValidador();

		// Testa se usuario deseja ver paises associados
		if (tipo == 1) {

			for (int i = 0; i < medalhas.size(); i++) {

				if (medalhas.get(i).getPais().equalsIgnoreCase("CHILE")
						|| medalhas.get(i).getPais().equalsIgnoreCase("BOLIVIA")
						|| medalhas.get(i).getPais().equalsIgnoreCase("PERU")
						|| medalhas.get(i).getPais().equalsIgnoreCase("COLOMBIA")
						|| medalhas.get(i).getPais().equalsIgnoreCase("EQUADOR	")) {

					m += "\n" + medalhas.get(i).getPais() + "\n Medalha de Ouro: " + medalhas.get(i).getQtdOuro()
							+ "\n Medalha de Prata: " + medalhas.get(i).getQtdPrata() + "\n Medalhas de Bronze: "
							+ medalhas.get(i).getQtdBronze();

				}
			}
		}

		ViewExibePaises ep = new ViewExibePaises(m);

	}

}
