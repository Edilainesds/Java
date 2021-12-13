package br.com.generation.lista15;

import java.util.Scanner;

public class Exercicio2 {
//2- Faça um programa que entre com três números e coloque em ordem crescente.
	// o que eu preciso?
	// Preciso de 3 variaveis.
	// Preciso receber 3 numeros do usuario.
	
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("digite o primeiro numero : ");
        a = entrada.nextInt();
        
        System.out.println("digite o segundo numero : ");
        b = entrada.nextInt();
        
        System.out.println("digite o terceiro numero : ");
        c = entrada.nextInt();
        
        if(a < b) {
        	
        }  if(b < c) {
        	System.out.println(a+ "-" +b+ "-" +c);
        }
        	
        
        
        
       
	}

}
