package vetores.matrizes;


public class exercicio1 {
//1. Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
//	atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
	public static void main(String[] args) {
		
		int [] Pontuacao = new int [5];
		int maiorValor = 0;
		Pontuacao [0] = 55;
		Pontuacao [1] = 42;
		Pontuacao [2] = 54;
		Pontuacao [3] = 22;
		Pontuacao [4] = 29;
				
		//.length contar quantos valores o vetor tem.
	     for( int i = 0; i < Pontuacao.length; i++ ) {
	    	 //usar conchetes dentro do i para ele poder fazer essa compara��o e descobrir no caso deste exercicio quq e o maior.
	    	 if(Pontuacao [i] >= maiorValor) {
	    		 maiorValor = Pontuacao[i];
	    		 
	    	 }
	    	
	     }
	     
               System.out.println(" o maior valor � a " + maiorValor);
               
		       
		
		
		

	}

}
