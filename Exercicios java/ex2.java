package pratica.java;

import java.util.Scanner;

//2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
//expressa em anos, meses e dias.
public class ex2 {

	public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        // guarda informa��es de entrada e mostra informa��es de saida 
        
        int meses, dias,diasIdade,anos;
        System.out.println("digite sua idade em dias : ");
        //imprimi ao usu�rio alguma informa��o ou dado.
        diasIdade = leia.nextInt();
        // nextInt Valida se o que o usu�rio digita corresponde a variavel
         anos = (diasIdade / 365);
         meses = (diasIdade % 365) /30;
         dias = (diasIdade % 365) * 30;
         
        System.out.println("a sua idade � " + anos + " anos " + meses+ " meses " + dias +" dias "); 
        leia.close();		// TODO Auto-generated method stub

		 
		
		
		
	}

}
