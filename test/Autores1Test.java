import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Autores.Autores;



public class Autores1Test {

	@Test
	public void deveFormatarNomeESobrenomeDoAutor(){
		String nomeFormatado = Autores.formatada("paulo coelho");
		assertEquals("COELHO, Paulo", nomeFormatado);
	}
	
	@Test
	public void deveFormatarNomeUnicoParaMaiusculo(){
		String nomeFormatado = Autores.formatada("paulo");
		assertEquals("PAULO", nomeFormatado);
	}
	
	@Test
	public void deveFormatarSobrenomeEPenultimoNome(){
		String nomeFormatado = Autores.formatada("paulo coelho neto");
		assertEquals("COELHO NETO, Paulo", nomeFormatado);
	}
	
	@Test
	public void deveFormatarSobrenomeMaiusculo(){
		String nomeFormatado = Autores.formatada("joão neto");
		assertEquals("NETO, João", nomeFormatado);
	}
	
	@Test
	public void deveManterDaDeDoDasDosMinusculo(){
		String nomeFormatado = Autores.formatada("celso de araujo");
		assertEquals("ARAUJO, Celso de", nomeFormatado);
	}

}
