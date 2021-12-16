//Guilherme Policarpo de Carvalho
import java.util.Scanner;

public class exc3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner ( System.in );
        double numero;

        System.out.print("Entre com um numero: ");
        numero = ler.nextDouble();

        System.out.println("\n" + (! isPositivo(numero)?"Negativo" : "Positivo"));

        System.out.println("\n" + (! isZero(numero)?"Nao" : "") + " eh zero");

    }

    static boolean isPositivo ( double numero){
        return (numero >= 0.0);
    }

    static boolean isZero (double numero){
        return (numero == 0.0);
    }

}
