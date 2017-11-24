package View;

import javax.swing.JOptionPane;

public class ViewBuscaEsporte {

	@SuppressWarnings("unused")
	public ViewBuscaEsporte(String esportes) {

		if (esportes != "") {
			JOptionPane.showMessageDialog(null, esportes);
			ViewPrincipal vp = new ViewPrincipal();
		} else {
			JOptionPane.showConfirmDialog(null, "Esporte não cadastrado");
		}
	}

}
