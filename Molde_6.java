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
	public void poupan�a() {
		this.conta=false;
	}
	public void escrever() {
		if(this.conta==true) 
			System.out.println("A conta � conta corrente ");
		else
			System.out.println("A conta � conta poupan�a ");
	}
	public void status() {
		System.out.println(" O valor em conta � "+this.saldo+ "reais.");
		System.out.println(" Quantidade de saques restantes � de: "+this.saque+" saques. ");
		System.out.println(" Qual � o tipo dessa conta "+this.contaBancaria+" ?" );
	}

}
