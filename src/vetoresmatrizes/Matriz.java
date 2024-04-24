package vetoresmatrizes;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criando a Matriz 3x3, com os valores já adicionados
		int numeros[][] = { {1,2,3}, {4,5,6}, {7,8,9} };
		
		// criando as variaveis onde iremos armazenar os valores das somas das diagonais
		int somaDiagonalPrincipal = 0;
		int somaDiagonalSecundaria = 0;
		
		// estrutura de repetição para montar a matriz na tela
		//primeiro, passamos por cada linha, usando um FOR
		for(int indiceLinha = 0; indiceLinha < numeros.length; indiceLinha++) {
			//dentro de cada linha, iremos percorrer todas as colunas disponiveis para ela
			for(int indiceColuna = 0; indiceColuna < numeros.length; indiceColuna++) {
				//exibimos aqui o valor de cada coluna da linha
				System.out.print(numeros[indiceLinha][indiceColuna]);	
			}
			
			//depois de passar por todas as colunas de uma linha, usamos esse print para pular uma linha, e voltamos no primeiro
			//FOR, para ir para a proxima linha, e repetimos isso até acabar
			System.out.println();
		}
		
		//exibindo os dados que estão dentro da diagonal principal
		System.out.println("Elementos da Diagonal Principal:");
        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.print(numeros[contador][contador] + " ");
            somaDiagonalPrincipal += numeros[contador][contador];
        }
        // exibindo o resultado da soma dos valores que foram exibidos acima
        System.out.println("\nSoma de todos os elementos da Diagonal Principal: " + somaDiagonalPrincipal);
		
		
	}

}
