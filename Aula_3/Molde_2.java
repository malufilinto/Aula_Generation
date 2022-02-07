package Aula_3;
import java.util.Scanner;
public class Molde_2 {
	// ATRIBUTOS
	String mol;
	int id;
	int vi;
	boolean ck;

	
	
	// MÉTODO
	public void apto()
	{
		this.ck=true;
	}
	public void reprovado() {
		this.ck=false;
	}
	public void escrever() {
		if(this.ck==true) 
			System.out.println("Pronto para decolagem");
		else
			System.out.println("Decolagem não permitida");
	}
	public void status() {
		System.out.println("O modelo do avião é: "+this.mol);
		System.out.println("/tO avião tem "+this.id+" anos");
		System.out.println("O avião já executou " +this.vi+" viagens");
		System.out.println("O avião " +this.mol+ " está pronto para decolagem?");
	}
	
	
}