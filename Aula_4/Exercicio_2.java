package Aula_4;

public class Exercicio_2 {
	public static void main(String[] args) {
		
		Ex1Animais a= new Ex1Animais();
		Cachorro c= new Cachorro();
		Cavalo  v= new Cavalo();
		Preguiça p=new Preguiça();
		
		a.som();
		c.som();
		v.som();
		p.som();
		
		System.out.println("\n");
		
		a.movimento();
		c.movimento();
		v.movimento();
		p.movimento();
		
		
	}
}
