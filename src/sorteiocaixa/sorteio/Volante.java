package sorteiocaixa.sorteio;



public class Volante {
	
	
	TipoVolanteSorteio tipoVolante;
	int [] numeros;
	
	
	public Volante(TipoVolanteSorteio tipoVolante){
		this.setTipoVolante(tipoVolante);
	
		this.numeros = new int[tipoVolante.getTam()];
		
		for(int i =0; i<tipoVolante.getTam();i++){
			this.numeros[i]= i+1;
		}
		
	}
	
	public String toString(){
		String volante="Numeros:";
		
		for(int i=0;i<this.numeros.length;i++){
			volante+=this.numeros[i]+"-";
			
		}
		return volante;
	}
	


	public TipoVolanteSorteio getTipoVolante() {
		return tipoVolante;
	}

	public void setTipoVolante(TipoVolanteSorteio tipoVolante) {
		this.tipoVolante = tipoVolante;
	}


	

}
