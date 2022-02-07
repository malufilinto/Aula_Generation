package Aula_3;

import java.util.Scanner;

public class Exercicio_1 {

	String nome;
	int idade;
	String rg;
	String cpf;
		
	public void informaecpf()
	{
		if(this.cpf.length()==14)
			System.out.println("O CPF é: "+this.cpf);
		else
			System.out.println("/tFavor digitar o CPF corretamente");
	}
	
	public void informeidade()
	{
		System.out.println("/tIdade: "+this.idade);
	}
	
	public void informenome()
	{
		System.out.println("/tNome: "+this.nome);
	}
	
	public void informerg()
	{
		if(this.rg.length()==7)
			System.out.println("/tRG: "+this.rg);
		else
			System.out.println("Favor digitar o RG corretamente");
	}
}


