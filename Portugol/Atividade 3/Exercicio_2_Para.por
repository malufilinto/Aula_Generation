programa
{
	
	funcao inicio()
	{
	 inteiro x = 0, soma=0
        escreva("Soma dos números, impares de 1 até 500")
        para(x=1; x<=500;x+=2){
            se(x%3==0){
                soma = soma+ x
                }
                   }
    escreva("\nA A soma dos números impares de 1 à 500 é: ",soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 245; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */