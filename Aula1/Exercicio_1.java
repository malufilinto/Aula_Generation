package Aula1;
import java.util.Scanner;
public class Exercicio_1 {
	  public static void main(String[] args) {

	        int idade, meses, dias;

	        Scanner id = new Scanner (System.in);

	        System.out.println("Qual a sua idade? \n");
	        idade=id.nextInt();

	        System.out.println("Quantos meses faltam para seu aniversário? \n");
	        meses=id.nextInt();

	        System.out.println("Quantos dias faltam para seu aniversário? \n");
	        dias=id.nextInt();
	        
	        meses=-12-meses;
	        dias=(idade*365-meses);
	        
	        System.out.println("\nA sua idade em dias é: "+dias);
}
}
