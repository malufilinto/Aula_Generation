package Aula_3;

public class Molde_5 {
	String patinete, cor;
	int rodas;
	boolean freio;

			
	public void sim()
	{
		this.freio=true;
	}
	public void não() {
		this.freio=false;
	}
	public void escrever() {
		if(this.freio==true) 
			System.out.println("Possui freio ");
		else
			System.out.println("Não possui freio ");
	}
	public void status() {
		System.out.println(" Este patinete é da cor: "+this.cor);
		System.out.println(" Este patinete possui "+this.rodas+" rodas ");
		System.out.println("Este patinete "+this.patinete+" tem freios ?" );
	}

}
