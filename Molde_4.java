package Aula_3;

public class Molde_4 {
	
	String funcionario, cargo;
	int tempo;
	boolean periodo;

			
	public void manha()
	{
		this.periodo=true;
	}
	public void noite() {
		this.periodo=false;
	}
	public void escrever() {
		if(this.periodo==true) 
			System.out.println("Este funcion�rio trabalha no per�odo da manh� ");
		else
			System.out.println("Este funcion�rio trabalha no per�odo da noite ");
	}
	public void status() {
		System.out.println(" Este funcion�rio tem o cargo de "+this.cargo);
		System.out.println("O tempo de servi�o do funcion�rio � de "+this.tempo+" horas di�rias ");
		System.out.println("Em que turno "+this.funcionario+" trabalha ?" );
	}

}
