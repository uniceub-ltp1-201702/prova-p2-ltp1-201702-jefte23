package Model;

public class Esporte {

	// Atributos
	private String esporte;
	private String modalidade;

	// Metodo ToString
	@Override
	public String toString() {
		return "Esporte: " + esporte + " - " + "Modalidade: " + modalidade;
	}

	// Metodo Construtor
	public Esporte(String esporte, String modalidade) {
		super();
		this.esporte = esporte;
		this.modalidade = modalidade;
	}

	// Metodo Get's e Set's
	public String getEsporte() {
		return esporte;
	}

	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

}
