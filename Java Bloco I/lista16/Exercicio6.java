package lista16;

import java.util.Scanner;

public class Exercicio6 {

	

		public static void main(String[] args) {
			// receber 5 n�meros inteiros
			
			int numero, soma = 0, media, quantidade = 0;
			
			Scanner entrada = new Scanner(System.in);
			
//			System.out.println("Digite cinco n�meros inteiros: ");
//			numero1 = entrada.nextInt();
//			numero2 = entrada.nextInt();
//			numero3 = entrada.nextInt();
//			numero4 = entrada.nextInt();
//			numero5 = entrada.nextInt();
			
			
			// imprimir m�dia de todos os numeros APENAS multiplos de 3
			// media = soma de valores / quantidade de itens
			
//			if (numero1 % 3 == 0) {
//				System.out.println("Esse n�mero � multiplo de 3");
//			}
			
			for (int contador = 1; contador <= 5; contador++) { // loop enquanto a condi��o for verdadeira
				System.out.println("Digite o " + contador + "� valor.");
				numero = entrada.nextInt();
				
				if (numero % 3 == 0) {
					soma += numero;
					quantidade++;
				}
			}

			media = soma / quantidade;
			
			System.out.println("M�dia de todos os n�meros m�ltiplos de 3 �: " + media);
			entrada.close();
			
			// Creditos para Sarah recebi ajuda :)
		}

	}
