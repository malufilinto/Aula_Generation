package Aula_3;
public class Molde_1{


		//Cliente

		String nome;
		String email;
		String cpf; 
		String rg;

		public Molde_1()
		{
			this.nome="Maria ";
			this.email="maria@email.com";
			this.cpf="123.456.789-00";
			this.rg="12-345.678-9";
		}

		public void informenome()
		{
			System.out.println("Informe seu nome: "+nome);
		}

		public void informeemail()
		{
			System.out.println("Informe seu email: "+email);
		}

		public void informecpf()
		{
			System.out.println("Informe seu cpf: "+cpf);
		}

		public void informerg()
		{
			System.out.println("Informe seu Rg: "+rg);
		}

	}



