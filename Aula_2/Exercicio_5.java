package Aula_2;
import java.util.Scanner;
public class Exercicio_5 {
	 public static void main(String[] args) {
		 int n, soma=0;
		 
		 Scanner id = new Scanner (System.in);
		 
		 do {
				System.out.print("Insira um número: \n");
		        n=id.nextInt();
		        soma=n+soma; }
		 while(n!=0);
		 
			System.out.print("O valor da soma é: \n"+soma);
	 }
}

