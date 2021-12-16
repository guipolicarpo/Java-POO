// Guilherme Policarpo de Carvalho
import java.util.Scanner;

public class usaNumero {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Numero num = new Numero();

        System.out.printf("Digite um numero inteiro: ");
        num.setNumero(ler.nextInt());

        System.out.println("O numero " + num.getNumero() + " invertido fica " + num.Inverter());
    }
}
