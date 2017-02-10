package test;

import sorteiocaixa.lotofacil.LotoFacil;
import sorteiocaixa.lotomania.Lotomania;

public class TestVolante {

	public static void main(String[] args) {
		
		LotoFacil loto= new LotoFacil();
		Lotomania mania= new Lotomania();
		
		
		System.out.println(loto.volante.numeros.length);
		System.out.println(loto.volante.toString());
		
		

		System.out.println(mania.volante.numeros.length);
		System.out.println(mania.volante.toString());
		

	}

}
