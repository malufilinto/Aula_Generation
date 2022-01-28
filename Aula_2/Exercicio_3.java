package Aula_2;
import java.util.Scanner;
public class Exercicio_3 {
	 public static void main(String[] args) {
		 int idade, v=0 ,c=0;
		 
	       Scanner id = new Scanner (System.in);
	       
	        System.out.println("Insira a sua idade: ");
	        idade=id.nextInt();
	        
	        while(idade<=99)
	        {
	        	if(idade<=21)
	        		v++;
	        	
	        	if(idade>=50)
	        		c++;
	        	
	            System.out.println("Insira a sua idade: ");
	            idade=id.nextInt();
	        }
	        
	        System.out.println("O total de pessoas com menos de 21 anos é: " +v);
	        System.out.println("O total de pessoas com mais de 50 anos é: " +c );
	 }
}
