package Aula_3;

public class Molde_5 {
	String patinete, cor;
	int rodas;
	boolean freio;

			
	public void sim()
	{
		this.freio=true;
	}
	public void n�o() {
		this.freio=false;
	}
	public void escrever() {
		if(this.freio==true) 
			System.out.println("Possui freio ");
		else
			System.out.println("N�o possui freio ");
	}
	public void status() {
		System.out.println(" Este patinete � da cor: "+this.cor);
		System.out.println(" Este patinete possui "+this.rodas+" rodas ");
		System.out.println("Este patinete "+this.patinete+" tem freios ?" );
	}

}
