programa
{
	
	funcao inicio()
	{
	real P, M, E
		escreva("Quantos Kilos Você trouxe? ")
		leia(P)
		E=(P-50)
		M=(P*4)
		
		se(P <=50)
		{
			escreva("Prossiga sem multas")
		}
		senao
		{
			escreva("Você possui um excesso de: ", E, "kilos, você deve pagar uma multa de R$", M)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 89; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */