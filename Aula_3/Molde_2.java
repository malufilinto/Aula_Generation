package Aula_3;
import java.util.Scanner;
public class Molde_2 {
	// ATRIBUTOS
	String mol;
	int id;
	int vi;
	boolean ck;

	
	
	// M�TODO
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
			System.out.println("Decolagem n�o permitida");
	}
	public void status() {
		System.out.println("O modelo do avi�o �: "+this.mol);
		System.out.println("/tO avi�o tem "+this.id+" anos");
		System.out.println("O avi�o j� executou " +this.vi+" viagens");
		System.out.println("O avi�o " +this.mol+ " est� pronto para decolagem?");
	}
	
	
}