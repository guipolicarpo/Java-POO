/*
Guilherme Policarpo de Carvalho
 */

import javax.swing.text.StyledEditorKit.BoldAction;
import java.util.Scanner;

public class exc18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int num, primo = 0;
        boolean pri = false;

        System.out.printf("Digite um numero inteiro para verificar se ele é primo: ");
        num = ler.nextInt();

        System.out.println("Seu numero e primo: " + ehPrimo(num));

        System.out.println("\n==========> Numero primos de 1 a 1000 <==========");

        for (int i=1; i<=1000; i++) {
            for (int j=1; j<=i; j++) {
                if (i % j == 0) {
                    primo++;
                }
            }
            if (primo == 2) {
                System.out.print(i + ", ");
            }
            primo = 0;
        }

    }

    private static boolean ehPrimo(int num) {
        for (int j = 2; j < num; j++) {
            if (num % j == 0)
                return false;   
        }
        return true;
    }

    
}
