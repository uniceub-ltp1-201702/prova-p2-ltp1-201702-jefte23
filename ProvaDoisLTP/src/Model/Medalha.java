package Model;

public class Medalha {

	// Atributos
	private String pais;
	private int QtdOuro;
	private int QtdPrata;
	private int QtdBronze;
	private int Classificacao;

	// Metodo ToString
	@Override
	public String toString() {
		return "<<< Quadro de Medalhas >>> \nPaís: " + pais + " - Qtd Melhas de Ouro: " + QtdOuro
				+ " - Qtd Melhas de Prata: " + QtdPrata + " - Qtd Melhas de Bronze: " + QtdBronze + "- Classificacao: "
				+ Classificacao;
	}

	// Metodo Construtor
	public Medalha(String pais, int qtdOuro, int qtdPrata, int qtdBronze, int classificacao) {
		super();
		this.pais = pais;
		QtdOuro = qtdOuro;
		QtdPrata = qtdPrata;
		QtdBronze = qtdBronze;
		Classificacao = classificacao;
	}

	// Metodos Get's e Set's
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getQtdOuro() {
		return QtdOuro;
	}

	public void setQtdOuro(int qtdOuro) {
		QtdOuro = qtdOuro;
	}

	public int getQtdPrata() {
		return QtdPrata;
	}

	public void setQtdPrata(int qtdPrata) {
		QtdPrata = qtdPrata;
	}

	public int getQtdBronze() {
		return QtdBronze;
	}

	public void setQtdBronze(int qtdBronze) {
		QtdBronze = qtdBronze;
	}

	public int getClassificacao() {
		return Classificacao;
	}

	public void setClassificacao(int classificacao) {
		Classificacao = classificacao;
	}

}
