package br.com.generation.lista15;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		// 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
		
				// o que vou precisar?
				//Declarar 3 variaveis
				//receber 3 valores
				// fazer comparacao dos numeros
				// mostrar ao usuario
				
				Scanner entrada = new Scanner(System.in);
		        int numero1, numero2, numero3;
		        
		        System.out.println(" digite o primeiro numero inteiro : ");
		        numero1 = entrada.nextInt();
		        
		        System.out.println("digite o segundo numero inteiro : ");
		        numero2 = entrada.nextInt();
		        
		        System.out.println(" digite o terceiro numero inteiro : ");
		        numero3 = entrada.nextInt();
		        
		       if(numero1 >= numero2 && numero1 >= numero3) {
		    	   System.out.println("o primeiro numero inteiro é maior : ");
		    	    }
		       
		       else if(numero2 >= numero1 && numero2 >= numero3){
		       System.out.println(" o segundo numero  inteiro é maior : ");
		       }
		       
		       
		       else if(numero3 >= numero1 && numero3 >= numero1) {
		    	   System.out.println(" o terceiro numero inteiro é maior : ");
		       }

	}

}
