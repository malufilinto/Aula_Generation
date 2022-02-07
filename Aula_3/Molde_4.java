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
			System.out.println("Este funcionário trabalha no período da manhã ");
		else
			System.out.println("Este funcionário trabalha no período da noite ");
	}
	public void status() {
		System.out.println(" Este funcionário tem o cargo de "+this.cargo);
		System.out.println("O tempo de serviço do funcionário é de "+this.tempo+" horas diárias ");
		System.out.println("Em que turno "+this.funcionario+" trabalha ?" );
	}

}
