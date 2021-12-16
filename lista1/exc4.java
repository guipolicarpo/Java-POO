//Guilherme Policarpo de Carvalho
import java.util.Scanner;

public class exc4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner ( System.in );

        double a, b, c;

        System.out.printf("Entre com o valor A: ");
        a = ler.nextDouble();

        System.out.printf("Entre com o valor B: "); 
        b= ler.nextDouble();

        System.out.printf("Entre com o valor C: ");
        c = ler.nextDouble();

        System.out.println("\nDelta: " + delta (a, b, c) );
    }

    static double delta (double a, double b, double c){
        return Math.pow(b, 2) - 4 * a * c;
    }

}
