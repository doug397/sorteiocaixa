package sorteiocaixa.sorteio;

public class TestVolante {

	public static void main(String[] args) {
		
		
		Volante volante= new Volante(TipoVolanteSorteio.LOTOFACIL);
		
		Volante volo= new Volante(TipoVolanteSorteio.LOTOMANIA);
		
		
		System.out.println(volante.getTipoVolante());
		
		System.out.println(volante.getTipoVolante().getTam());
		
		

	}

}
