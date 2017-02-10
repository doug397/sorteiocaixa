package sorteiocaixa.quina;

import sorteiocaixa.sorteio.TipoVolanteSorteio;
import sorteiocaixa.sorteio.Volante;

public class Quina implements RegrasQuina {
		public Volante volante;
		
		private double arrecadacao;
		
		
		public double getArrecadacao() {
			return arrecadacao;
		}


		public void setArrecadacao(double arrecadacao) {
			this.arrecadacao = arrecadacao;
		}


		public Quina(){
			
			this.volante= new Volante(TipoVolanteSorteio.QUINA);
		}


		@Override
		public double doisAcertos() {
			// TODO Auto-generated method stub
			return 0;
		}


		@Override
		public double tresAcertos() {
			// TODO Auto-generated method stub
			return 0;
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
}
