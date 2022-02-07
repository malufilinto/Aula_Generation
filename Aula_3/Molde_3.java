package Aula_3;

public class Molde_3 {
	
	String modelo, cor;
	int garantia;
	boolean premium;

			
	public void premium()
	{
		this.premium=true;
	}
	public void slim() {
		this.premium=false;
	}
	public void escrever() {
		if(this.premium==true) 
			System.out.println("Este produto é da linha premium ");
		else
			System.out.println("Este produto é da linha slim ");
	}
	public void status() {
		System.out.println(" Esse produto é do modelo "+this.modelo);
		System.out.println(" A garantia do produto é de "+this.garantia+" meses");
		System.out.println(" A cor do produto é " +this.cor);
		System.out.println(" O produto "+this.modelo+ " é de qual linha?" );
	}
}
