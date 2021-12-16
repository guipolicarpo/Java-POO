//Guilherme Policarpo de Carvalho
import java.util.Scanner;

public class exc2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        double numero;

        System.out.printf("Digite um numero: ");
        numero = ler.nextDouble();

        System.out.println((! isZero (numero) ? "não " : "") + "e zero");

    }

    static boolean isZero (double numero){
        if(numero == 0.0){
            return true;
        }

        return false;
    }
}
