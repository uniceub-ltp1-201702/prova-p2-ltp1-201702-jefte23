package Model;

import java.util.ArrayList;

import Util.DocumentReader;

public class BDSimulado {

	// Atributo
	private ArrayList<Esporte> esportes;
	private ArrayList<Medalha> medalhas;
	private String fileEsporte = "esportes.txt";
	private String FileMedalha = "medalhas.txt";

	// Metodo Construtor
	public BDSimulado() {

		// Instancia ArrayList
		this.esportes = new ArrayList<Esporte>();
		this.medalhas = new ArrayList<Medalha>();

		// Instanciar o DocumentReader
		DocumentReader dr1 = new DocumentReader();
		DocumentReader dr2 = new DocumentReader();

		// Ler linhas do arquivo esportes.txt
		ArrayList<String> leitura1 = dr1.read(fileEsporte);

		// Ler linhas do arquivo medalhas.txt
		ArrayList<String> leitura2 = dr2.read(FileMedalha);

		/*------------------------------------------------*/

		// Percorre o ArrayList Criando esporte
		for (int i = 0; i < leitura1.size(); i++) {
			// Separa a linha em um array de String
			String[] linhaEsporte = leitura1.get(i).split(";");

			// Cria esporte com os dados da linha
			Esporte e = new Esporte(linhaEsporte[0], linhaEsporte[1]);

			// coloca o esporte no Arraylist
			this.esportes.add(e);
		}

		// Percorre o Arraylist criando medalha
		for (int i = 0; i < leitura2.size(); i++) {

			// Separa a linha em um array de String
			String[] linhaMedalha = leitura2.get(i).split(";");

			// Cria Musica com dados da linha
			Medalha m = new Medalha(linhaMedalha[0], Integer.parseInt(linhaMedalha[1]),
					Integer.parseInt(linhaMedalha[2]), Integer.parseInt(linhaMedalha[3]),
					Integer.parseInt(linhaMedalha[4]));

			// Coloca a musica no ArrayList
			this.medalhas.add(m);
		}
	}

	public ArrayList<Esporte> getEsportes() {
		return esportes;
	}

	public ArrayList<Medalha> getMedalhas() {
		return medalhas;
	}

}