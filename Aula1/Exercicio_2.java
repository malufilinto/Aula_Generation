package Aula1;
import java.util.Scanner;
public class Exercicio_2 {
	
	public static void main(String[] args) {
    int idade, meses, dias, anos;

    Scanner id = new Scanner (System.in);
    
    System.out.println("Qual a sua idade em dias? ");
    dias=id.nextInt();
    
    meses=(dias/30);
    anos=(meses/12);
    
    System.out.println("Sua idade em meses é de: "+meses);
    System.out.println("Sua idade em anos é de: "+anos);
}
}
