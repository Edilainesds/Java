package lista16;

import java.util.Scanner;

public class Exercicio6 {

	

		public static void main(String[] args) {
			// receber 5 números inteiros
			
			int numero, soma = 0, media, quantidade = 0;
			
			Scanner entrada = new Scanner(System.in);
			
//			System.out.println("Digite cinco números inteiros: ");
//			numero1 = entrada.nextInt();
//			numero2 = entrada.nextInt();
//			numero3 = entrada.nextInt();
//			numero4 = entrada.nextInt();
//			numero5 = entrada.nextInt();
			
			
			// imprimir média de todos os numeros APENAS multiplos de 3
			// media = soma de valores / quantidade de itens
			
//			if (numero1 % 3 == 0) {
//				System.out.println("Esse número é multiplo de 3");
//			}
			
			for (int contador = 1; contador <= 5; contador++) { // loop enquanto a condição for verdadeira
				System.out.println("Digite o " + contador + "º valor.");
				numero = entrada.nextInt();
				
				if (numero % 3 == 0) {
					soma += numero;
					quantidade++;
				}
			}

			media = soma / quantidade;
			
			System.out.println("Média de todos os números múltiplos de 3 é: " + media);
			entrada.close();
			
			// Creditos para Sarah recebi ajuda :)
		}

	}
