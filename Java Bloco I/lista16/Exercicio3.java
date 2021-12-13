package lista16;

import java.util.Scanner;

public class Exercicio3 {

	
	
		public static void main(String[] args) {
	     
			Scanner entrada = new Scanner(System.in);

			int idade = 0;
			int contador21 = 0;
			int contador50 = 0;

			System.out.println("digite sua idade");
			idade = entrada.nextInt();

			while(idade != -99) {
				if(idade >= 0 && idade <= 21) {
				 contador21++;
				}
				if(idade >= 50) {
					contador50++;
			
				}	
				System.out.println("digite sua idade ");
				idade = entrada.nextInt();
			}	
			System.out.println("quantidade de pessoas com mais de 50 anos " + contador50);
			System.out.println("quantidade de pessoas com menos de 21 anos "+contador21);

			
}
}