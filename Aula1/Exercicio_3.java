package Aula1;
import java.util.Scanner;
public class Exercicio_3 {

	 public static void main(String[] args) {
		 int seg, min, hr, tempo;
	       Scanner id = new Scanner (System.in);

	        System.out.println("Insira os segundos: ");
	        seg=id.nextInt();
	        
	        min=(seg/60);
	        hr=(min/60);
	        
	        System.out.println("O evento teve a dura��o de: "+min+" minutos.");
	        System.out.println("O evento teve a dura��o de: "+hr+" horas.");
	        System.out.println("O evento teve a dura��o de: "+seg+" segundos..");
	 }
}
