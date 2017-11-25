// Questão 7:Crie as classes que permitam incluir um novo esporte e todas as modalidades relacionadas
//  a esse esporte.Depois de informar o nome do novo esporte o usuário poderá incluir quantas novas 
// modalidades ele quiser para o novo esporte.

package Controle;

import Model.BDSimulado;
import Model.Esporte;
import View.ViewCadastraModalidade;
import View.ViewSolicitaEsporte;
import View.ViewSolicitaModalidade;

public class ControleCadastraEsporte {

	private BDSimulado bds;

	public ControleCadastraEsporte(BDSimulado bds) {
		this.bds = bds;
	}

	@SuppressWarnings("unused")
	public void CadastraEsporte() {

		ViewSolicitaEsporte vse = new ViewSolicitaEsporte();
		String nomeEsporte = vse.getEsporte();

		ViewSolicitaModalidade vsm = new ViewSolicitaModalidade();
		String nomeModalidade = vsm.getModalidade();

		// Instanciar um objeto da classe cliente com os dados digitado
		Esporte incluir = new Esporte(nomeEsporte, nomeModalidade);

		bds.gravarEsporte(incluir);
		while (true) {
			ViewCadastraModalidade vcm = new ViewCadastraModalidade();
			int cadastra = vcm.getValidador();

			if (cadastra == 1) {
				ViewSolicitaModalidade vsm1 = new ViewSolicitaModalidade();
				String nomeModalidade1 = vsm1.getModalidade();

				Esporte incluir2 = new Esporte(nomeEsporte, nomeModalidade);

			} else {
				break;
			}

		}

	}

}
