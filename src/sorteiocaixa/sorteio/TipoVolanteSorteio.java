package sorteiocaixa.sorteio;

public enum TipoVolanteSorteio {
	
	LOTOFACIL("Lotofacil",TiposVolante.LOTOFACIL,15),
	LOTOMANIA("Lotomania",TiposVolante.LOTOMANIA,22),
	MEGASENA("Mega Sena",TiposVolante.MEGASENA,6),
	QUINA("Quina",TiposVolante.QUINA,5);
	
	
	private String descricao;
	private byte tam;
	private int [] sorteio;
	
	TipoVolanteSorteio(String descricao,byte tam,int sorteio){
		this.setSorteio( new int[sorteio]);
		this.setDescricao(descricao);
		this.setTam(tam);
	}

	public int[] getSorteio() {
		return sorteio;
	}

	public void setSorteio(int[] sorteio) {
		this.sorteio = sorteio;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public byte getTam() {
		return tam;
	}

	public void setTam(byte tam) {
		this.tam = tam;
	}

}
