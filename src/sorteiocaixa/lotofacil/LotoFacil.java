package sorteiocaixa.lotofacil;

import sorteiocaixa.sorteio.TipoVolanteSorteio;
import sorteiocaixa.sorteio.Volante;

public class LotoFacil implements RegrasLotofacil {
	
	public Volante volante;
	private double arrecadacao;
	NumerosSortiados numerosSortiados;

	public LotoFacil(){
		this.volante = new Volante(TipoVolanteSorteio.LOTOFACIL);
		
	}
	
	public double getArrecadacao() {
		return arrecadacao;
	}


	public void setArrecadacao(double arrecadacao) {
		this.arrecadacao = arrecadacao;
	}


	@Override
	public double onzeAcertos() {
		// TODO Auto-generated method stub
		return 4;
	}


	@Override
	public double dozeAcertos() {
		// TODO Auto-generated method stub
		return 8;
	}


	@Override
	public double trezeAcertos() {
		// TODO Auto-generated method stub
		return 20;
	}


	@Override
	public double quartorzeAcertos() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double quinzeAcertos() {
		// TODO Auto-generated method stub
		return 0;
	}
	


}
