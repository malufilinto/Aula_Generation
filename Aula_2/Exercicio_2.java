package Aula_2;
import java.util.Scanner;

public class Exercicio_2 {
	 public static void main(String[] args) {
		 int x, y, par=0, imp=0;
	       Scanner id = new Scanner (System.in);

		        for(x=1; x<=10; x++) 
		        {
					System.out.print("Insira um número: \n");
			        y=id.nextInt();
			        
			        if(y%2==0)
			        {
			        	par++;
			        }
			        else
			        {
			        	imp++;
			        }
		        }
		        System.out.printf("\nA soma dos números pares é: "+par);
		        System.out.printf("\nA soma de números impares é: "+imp);
	 }
}
