package Aula1;
import java.util.Scanner;
public class Exercicio_8 {
	public static void main(String[]args) {
		double prcfab, prcfn;
		 Scanner id = new Scanner (System.in);
		 

	        System.out.print("Qual o valor do carro, sem impostos? ");
	        prcfab=id.nextDouble();
	        
	        prcfn=(prcfab*0.73)+prcfab;
	        System.out.print("O valor do carro com impostos é de: " +prcfn);
	        
	}
}
