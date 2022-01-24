programa
{
	
	   funcao inicio()
    {
        inteiro v[3], x=0, ML=0, aperto=0
        real soma=0, media=0

        para(x=0;x<3;x++)
        {
        escreva("Insira um dado: ")
        leia(v[x])

            se(v[x]>ML)
            {
                ML=v[x]
                aperto++

            }
        soma=soma+v[x]

        }
        media=soma/3

            escreva("O maior dado foi:\n ", ML)
            escreva("\nFoi apresentada a maior ocorrencia: ",aperto)
            escreva("\nA média aritmética é :\n ", media )

    }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 549; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */