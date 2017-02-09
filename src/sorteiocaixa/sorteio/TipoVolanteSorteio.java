package sorteiocaixa.sorteio;

public enum TipoVolanteSorteio {
	
	LOTOFACIL("Lotofacil",TiposVolante.LOTOFACIL),
	LOTOMANIA("Lotomania",TiposVolante.LOTOMANIA),
	MEGASENA("Mega Sena",TiposVolante.MEGASENA),
	QUINA("Quina",TiposVolante.QUINA);
	
	
	private String descricao;
	private byte tam;
	
	TipoVolanteSorteio(String descricao,byte tam){
		
		this.setDescricao(descricao);
		this.setTam(tam);
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
