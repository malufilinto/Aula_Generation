package Aula_2;
import java.util.Scanner;
public class Exercicio_4 {
	 public static void main(String[] args) {
		 int idade, sexo, humor,feminino=0, masculino=0, outros=0, calmo=0, nervoso=0, agressivo=0,dados=0;
		 
	       Scanner id = new Scanner (System.in);
	       
	     while(dados<=150)
	       {
	        System.out.println("\tInsira a sua idade: ");
	        idade=id.nextInt();
	        
	        System.out.println("\tInsira a seu sexo? \t (1)feminino\t (2) masculino \t (3)outro ");
	        sexo=id.nextInt();
	        
	        System.out.println("\tQual o seu humor? \t (1)calma \t (2) nervosa \t (3)agressiva");
	        humor=id.nextInt();
	        
	        if(sexo==1)
	        {
	        	feminino++;
	        }
	        if(sexo==2)
	        {
	        	masculino++;
	        }
	        if(sexo==3)
	        {
	        	outros++;
	        }
	        if(humor==1)
	        {
	        	calmo++;
	        }
	        if(humor==2)
	        {
	        	nervoso++;
	        }
	        if(humor==3)
	        {
	        	agressivo++;
	        }
	        dados++;
	       }
	     
	     System.out.println("O número de pessoas do sexo feminino é de: " +feminino);
	     System.out.println("O número de pessoas do sexo masculino é de: " +masculino);
	     System.out.println("O número de pessoas de outro sexo  é de: " +outros);
	     System.out.println("O número de pessoas calmas é de: " +calmo);
	     System.out.println("O número de pessoas nervosas é de: " +nervoso);
	     System.out.println("O número de pessoas agressivas é de: " +agressivo);
	 }

}
