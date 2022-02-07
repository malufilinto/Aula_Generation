package Aula_3;

public class Molde_6 {
	String contaBancaria;
	int saque;
	float saldo;
	boolean conta;

			
	public void corrente()
	{
		this.conta=true;
	}
	public void poupança() {
		this.conta=false;
	}
	public void escrever() {
		if(this.conta==true) 
			System.out.println("A conta é conta corrente ");
		else
			System.out.println("A conta é conta poupança ");
	}
	public void status() {
		System.out.println(" O valor em conta é "+this.saldo+ "reais.");
		System.out.println(" Quantidade de saques restantes é de: "+this.saque+" saques. ");
		System.out.println(" Qual é o tipo dessa conta "+this.contaBancaria+" ?" );
	}

}
