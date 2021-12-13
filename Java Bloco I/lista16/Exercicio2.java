package lista16;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
// 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		int contadorImpar = 0;
		int contadorPar = 0;
		Scanner leia = new Scanner(System.in);
		float numeros = 0;
		for(int i = 0; i <= 9; i++) {
		
		 if(numeros %2 == 0) {
			 contadorPar++;
		 }
		 else {
			 contadorImpar++;
			 
		 }
		 System.out.println(" digite um numero" );
		  numeros = leia.nextFloat();
		 
		  
		}	
		
		System.out.println("essa é a quantidade de numeros pares " + contadorPar);
		System.out.println("essa é a quantidade de numeros impares " + contadorImpar);

	}

}
