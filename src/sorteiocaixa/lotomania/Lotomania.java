package sorteiocaixa.lotomania;

import sorteiocaixa.sorteio.TipoVolanteSorteio;
import sorteiocaixa.sorteio.Volante;

public class Lotomania implements RegrasLotomania {
	
	public Volante volante;
	private double arrecadacao;
	
	public double getArrecadacao() {
		return arrecadacao;
	}

	public void setArrecadacao(double arrecadacao) {
		this.arrecadacao = arrecadacao;
	}

	public Lotomania(){
		this.volante= new Volante(TipoVolanteSorteio.LOTOMANIA);
		
	}

	@Override
	public double quinzeAcertos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double dezesseisrzeAcertos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double dezeseteAcertos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double dezoitoAcertos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double dezenoveAcertos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double vinteAcertos() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
