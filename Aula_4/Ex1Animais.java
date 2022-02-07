package Aula_4;

public class Ex1Animais {
	
	private String nome;
	private int idade;
	
	
	public void som() {
		System.out.println("Som que os animais emitem");
	}
	public void movimento() {
		System.out.println("Como os animais se movimentam");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
