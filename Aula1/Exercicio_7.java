package Aula1;
import java.util.Scanner;
public class Exercicio_7 {
	public static void main(String[] args) {
		double a, b, c, d, e, f, x, y;
		
	       Scanner id = new Scanner (System.in);

	        System.out.println("Insira o valor de a: ");
	        a=id.nextDouble();
	        
	        System.out.println("Insira o valor de b: ");
	        b=id.nextDouble();
	        
	        System.out.println("Insira o valor de c: ");
	        c=id.nextDouble();
	        
	        System.out.println("Insira o valor de d: ");
	        d=id.nextDouble();
	        
	        System.out.println("Insira o valor de e: ");
	        e=id.nextDouble();
	        
	        System.out.println("Insira o valor de f: ");
	        f=id.nextDouble();
	        
			x=(c*e-b*f)/(a*e-b*d);
					y=(a*f-c*d)/(a*e-b*d);
					
			        System.out.println("O valor de x é:  "+x);		
			        System.out.println("O valor de y é:  "+y);	
	}
}
