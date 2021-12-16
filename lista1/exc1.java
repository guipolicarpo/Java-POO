//Guilherme Policarpo de Carvalho
import java.util.Scanner;

public class exc1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        double numero;

        System.out.printf("Digite o numero: ");
        numero = ler.nextDouble();

        if(numero < 0){
            System.out.println("É NEGATIVO");
        }
        else{
            System.out.println("É POSITIVO");
        }
    }

    static boolean isPositivo ( double numero ){
        return (numero >= 0.0);
    }
}