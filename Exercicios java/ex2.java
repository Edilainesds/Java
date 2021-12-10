package pratica.java;

import java.util.Scanner;

//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
//expressa em anos, meses e dias.
public class ex2 {

	public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        // guarda informações de entrada e mostra informações de saida 
        
        int meses, dias,diasIdade,anos;
        System.out.println("digite sua idade em dias : ");
        //imprimi ao usuário alguma informação ou dado.
        diasIdade = leia.nextInt();
        // nextInt Valida se o que o usuário digita corresponde a variavel
         anos = (diasIdade / 365);
         meses = (diasIdade % 365) /30;
         dias = (diasIdade % 365) * 30;
         
        System.out.println("a sua idade é " + anos + " anos " + meses+ " meses " + dias +" dias "); 
        leia.close();		// TODO Auto-generated method stub

		 
		
		
		
	}

}
