package Aula_3;

public class Molde_7 {
	String paciente;
	int idade;
	int retorno;
	boolean med;

			
	public void sim()
	{
		this.med=true;
	}
	public void não() {
		this.med=false;
	}
	public void escrever() {
		if(this.med==true) 
			System.out.println("O paciente precisa de medicamentos ");
		else
			System.out.println("O paciente não necessitará de medicamentos");
	}
	public void status() {
		System.out.println(" O paciente tem "+this.idade+ " anos.");
		System.out.println(" O paciente deverá retornar em "+this.retorno+" dias. ");
		System.out.println(" O paciente "+this.paciente+" precisará de medicação? " );
	}
}
