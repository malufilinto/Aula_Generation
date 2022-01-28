package Aula_2;
import java.util.Scanner;
public class Exemplo_While {
	 public static void main(String[] args) {
		 int idade;
		 
	        Scanner id = new Scanner (System.in);
	        
		 System.out.printf("Insira sua idade: \n");
	        idade=id.nextInt();
	        
	        while(idade>=1)
	        {
	   		 System.out.printf("\nSua idade: %d", idade);
	   		 if(idade>=18)
	   		 {
	   			 System.out.printf("\nVocê é maior de idade");
	   		 }
	   		 else
	   		 {
	   			 System.out.printf("\nVocê é menor de idade");
	   		 }
	   		 
			 System.out.printf("\nInsira sua idade: ");
		        idade=id.nextInt();
	   		 
	        }
	        	
	 }

}
