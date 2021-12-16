// Guilherme Policarpo de Carvalho

import java.util.Scanner;

public class usaEquacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Equacao equa = new Equacao ();

        System.out.printf("Digite o valor de A: ");
        equa.setA(ler.nextDouble());

        System.out.printf("Digite o valor de B: ");
        equa.setB(ler.nextDouble());

        System.out.printf("Digite o valor de C: ");
        equa.setC(ler.nextDouble());

        equa.Calculo();

        System.out.println("Delta: " + equa.Delta());
    }
}
