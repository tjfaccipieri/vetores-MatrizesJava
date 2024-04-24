package vetoresmatrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int numeros[] = {1, 2, 3, 4, 5};
//		
//		System.out.println("O tamanho do seu vetor é: " + numeros.length);
//		System.out.println("O valor do indice 2 é: " + numeros[numeros.length - 1]);
//		System.out.println("O valor do indice 2 é: " + numeros[4]);
		
		String nomes[] = new String[5];
		Scanner leia = new Scanner(System.in);
		
//		Arrays.sort(nomes);
		
		//receber os nomes
		for(int contador = 0; contador < nomes.length; contador++) {
			System.out.println("Por favor, digite um nome:");
			nomes[contador] = leia.nextLine();
		}
		
		//exibe os nomes
		for(int contador = 0; contador < nomes.length; contador++) {
			System.out.println(nomes[contador]);
		}
	}

}
