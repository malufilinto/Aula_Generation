package Aula1;
import java.util.Scanner;
public class Exercicio_4 {
    public static void main(String[]args) {

        double a, b, c, d, r, s;
        Scanner id = new Scanner (System.in);

        System.out.println("Insira o primeiro valor:  ");
        a=id.nextDouble();

        System.out.println("Insira o segundo valor:  ");
        b=id.nextDouble();

        System.out.println("Insira o terceiro valor:  ");
        c=id.nextDouble();

        r=Math.pow((a+b), 2);

        s=Math.pow((b+c), 2);

        d=(r+s)/2;

        System.out.println("O valor de D é: "+d);
    }
}
