package pratica.java;

import java.util.Scanner;

//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
//dias e mostre-a expressa apenas em dias.
public class idade {

	public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        // guarda informações de entrada e mostra informações de saida 
        
        int idade, meses, dias,anos,mesesIdade;
        System.out.println("digite sua idade : ");
        //imprimi ao usuário alguma informação ou dado.
        idade = leia.nextInt();
        // nextInt Valida se o que o usuário digita corresponde a variavel
        System.out.println("digite a quantos meses você fez aniversário : ");
          mesesIdade = leia.nextInt();
          
          anos = (365*idade);
          meses = (30*mesesIdade);
          dias = (anos+meses);
        System.out.println("a sua idade em dias é " + dias);
        leia.close();
        

        
	}

}
