package Aula_2;
import java.util.*;
public class Exemplo_If {
	 public static void main(String[] args) {
		 Scanner id= new Scanner(System.in);
		 int idade;
		 String nome;
		 System.out.printf("Qual a sua idade? \n");
	        idade=id.nextInt();
	        
	        id.nextLine();
	        
	        System.out.printf("\nQual a seu nome? \n");
	        nome=id.nextLine();
	        
	        System.out.printf("\nSeu nome é: %s",nome);
	        System.out.printf("\nSua idade é: %d",idade);
	        
	        if(idade>=18) {
		        System.out.printf("\nVocê é maior de idade");
	        }
	        else if(idade>=1 && idade<18)
	        {
		        System.out.printf("\nVocê é menor de idade ");
	        }
	        
	        else {
		        System.out.printf("\n Você entrou com uma idade inválida");
	        }
	 }
}
