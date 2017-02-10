package sorteiocaixa.megasena;

import sorteiocaixa.sorteio.TipoVolanteSorteio;
import sorteiocaixa.sorteio.Volante;

public class MegaSena implements RegrasMegaSena {
	
	public Volante volante;
	
	private double arrecadacao;
	
	public double getArrecadacao() {
		return arrecadacao;
	}

	public void setArrecadacao(double arrecadacao) {
		this.arrecadacao = arrecadacao;
	}

	public MegaSena(){
		this.volante= new Volante(TipoVolanteSorteio.MEGASENA);
		
	}

	@Override
	public double quatroAcertos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double cincoAcertos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double seisAcertos() {
		// TODO Auto-generated method stub
		return 0;
	}

}
