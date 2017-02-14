package sorteiocaixa.sorteio;

import sorteiocaixa.lotofacil.NumerosSortiados;

public  class Jogo {
	
	public Volante volante;
	private double arrecadacao;
	NumerosSortiados numerosSortiados;
	
	public Jogo(TipoVolanteSorteio tipo){
		this.volante.tipoVolante=tipo;
		this.volante.numeros= new int[tipo.getTam()];
		
		
	}
	
	public Volante getVolante() {
		return volante;
	}

	public void setVolante(Volante volante) {
		this.volante = volante;
	}

	public double getArrecadacao() {
		return arrecadacao;
	}

	public void setArrecadacao(double arrecadacao) {
		this.arrecadacao = arrecadacao;
	}

	public NumerosSortiados getNumerosSortiados() {
		return numerosSortiados;
	}

	public void setNumerosSortiados(NumerosSortiados numerosSortiados) {
		this.numerosSortiados = numerosSortiados;
	}


	
	
}
