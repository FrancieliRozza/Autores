 package Autores;

public class Autores{

	public static String formatada(String nomeAutor) {
		nomeAutor = nomeAutor.toLowerCase();
		String[] separandoPalavras =  nomeAutor.split(" "); // split separa as palavras pelo que ta dentro do parenteses que nesse caso é um espaço
		String nomeFormatado="";
				
		if (separandoPalavras.length == 1){
			nomeFormatado = separandoPalavras[0].toUpperCase();
			
		} else {
			String ultimoNome = separandoPalavras[separandoPalavras.length - 1];// pegando o sobrenome -1 seria o ultimo nome
			String ultimoNomeMaiusculo = ultimoNome.toUpperCase();
			String penultimoNome = separandoPalavras[separandoPalavras.length - 2];
			String penultimoNomeMaiusculo = penultimoNome.toUpperCase();
			String primeiroNome = separandoPalavras[0]; // pega o primeiro nome da pessoa 
			String primeiraLetra = primeiroNome.substring(0,1);
			primeiraLetra = primeiraLetra.toUpperCase();
			String restoNome = primeiroNome.substring(1,primeiroNome.length());// considera o resto do nome a pastir da segunda letra que é a posição 1
			String primeiraLetraNome;
			
			for (int i = 0; i < separandoPalavras.length; i++ ){
				if ((!"da".equals(separandoPalavras[i])) && (!"de".equals(separandoPalavras[i])) && (!"do".equals(separandoPalavras[i]))
					&& (!"das".equals(separandoPalavras[i])) && (!"dos".equals(separandoPalavras[i]))) { // Se a palavra for diferente de (da, de, do, das e dos) entra na condição e a coloca maiúscula
					
					primeiraLetraNome = separandoPalavras[i].substring(0, 1); // Primeira letra da palavra percorrida pelo laço
					primeiraLetraNome = primeiraLetraNome.toUpperCase(); // Coloca a primeira letra maiuscula
					separandoPalavras[i] = primeiraLetraNome + separandoPalavras[i].substring(1, separandoPalavras[i].length());
				}
			}
			
			if (("Filho".equals(separandoPalavras[separandoPalavras.length -1]) || "Filha".equals(separandoPalavras[separandoPalavras.length -1]) 
				|| "Neto".equals(separandoPalavras[separandoPalavras.length -1]) || "Neta".equals(separandoPalavras[separandoPalavras.length -1]) 
				|| "Sobrinho".equals(separandoPalavras[separandoPalavras.length -1]) || "Sobrinha".equals(separandoPalavras[separandoPalavras.length -1]) 
				|| "Junior".equals(separandoPalavras[separandoPalavras.length -1])) && separandoPalavras.length > 2)    {
				
				nomeFormatado = penultimoNomeMaiusculo + " " + ultimoNomeMaiusculo + ", " + primeiraLetra + restoNome;
			} else if (separandoPalavras.length < 3) {
				
				nomeFormatado = ultimoNomeMaiusculo + ", " + primeiraLetra + restoNome;
			} else {
				nomeFormatado = ultimoNomeMaiusculo + ","; 
				
				for(int i = 0; i < separandoPalavras.length -1; i++){
					nomeFormatado = nomeFormatado + " " + separandoPalavras[i];
				}
			}
		}
		
		return nomeFormatado;
	}	
}