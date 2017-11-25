package Controle;

import java.io.IOException;

import javax.swing.JOptionPane;

import Model.BDSimulado;
import View.ViewPrincipal;

public class ControlePrincipal {

	private BDSimulado bds;
	private ViewPrincipal vp;
	private ControleBuscaEsporte cbe;
	private ControleBuscaEsporteString cbes;
	private ControleDiferencaEUA cde;
	private ControleDiferencaPaises cdpa;
	private ControleMedalhasMercosul cmm;
	private ControleCadastraEsporte cce;

	public ControlePrincipal() throws IOException {

		this.bds = new BDSimulado();

		this.vp = new ViewPrincipal();

		this.cbe = new ControleBuscaEsporte(bds);
		this.cbes = new ControleBuscaEsporteString(bds);
		this.cde = new ControleDiferencaEUA(bds);
		this.cdpa = new ControleDiferencaPaises(bds);
		this.cmm = new ControleMedalhasMercosul(bds);
		this.cce = new ControleCadastraEsporte(bds);

		tratarOpcao(this.vp.getOpcao());
	}

	public void tratarOpcao(String opcao) throws IOException {

		while (true) {
			switch (opcao) {
			case "1":
				this.cbe.BuscaModalidade();
				break;
			case "2":
				this.cde.DiferencaPais();
				break;
			case "3":
				this.cdpa.DiferencaPaises();
				break;
			case "4":
				this.cmm.MedalhasMercosul();
				break;
			case "5":
				this.cbes.BuscaEsportString();
				break;
			case "6":
				this.cce.CadastraEsporte();
				break;
			case "7":
				JOptionPane.showMessageDialog(null, "Até Breve");
				return;
			default:
				JOptionPane.showConfirmDialog(null, "Digite um número válido");
			}
			opcao = this.vp.getOpcao();
		}

	}
}
