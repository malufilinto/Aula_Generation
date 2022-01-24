programa
{
	
	funcao inicio()
	{
	inteiro idade, meses, dias, totaldias
	escreva("Qual a sua idade? ")
	leia(idade)
	escreva("Quantos meses faltam para seu aniversário? ")
	leia(meses)
	escreva("Quantos dias faltam para seu aniversário? ")
	leia(dias)

	meses=12 - meses
	dias=(idade*365-meses)
	
		escreva("Sua idade em dias é de: ", dias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 353; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */