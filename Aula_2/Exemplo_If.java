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
	        
	        System.out.printf("\nSeu nome �: %s",nome);
	        System.out.printf("\nSua idade �: %d",idade);
	        
	        if(idade>=18) {
		        System.out.printf("\nVoc� � maior de idade");
	        }
	        else if(idade>=1 && idade<18)
	        {
		        System.out.printf("\nVoc� � menor de idade ");
	        }
	        
	        else {
		        System.out.printf("\n Voc� entrou com uma idade inv�lida");
	        }
	 }
}
