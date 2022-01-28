package Aula1;
import java.util.Scanner;
public class Exercicio_5 {
	   public static void main(String[]args) {
	        double nt1, nt2, nt3;
	        double notaFinal;
	        Scanner id = new Scanner (System.in);

	        System.out.print("Insira a primeira nota: ");
	        nt1=id.nextDouble();

	        System.out.print("Insira a segunda nota: ");
	        nt2=id.nextDouble();

	        System.out.print("Insira a terceira nota: ");
	        nt3=id.nextDouble();

	        notaFinal=((nt1)+(nt2)+(nt3*5))/10;

	                System.out.println("A média final do aluno é:  " + notaFinal);

	    }
}
