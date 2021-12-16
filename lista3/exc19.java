/*
Guilherme Policarpo de Carvalho
 */

import java.util.Scanner;
import java.util.Arrays;

public class exc19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        int[] n = new int[2];

        System.out.print("Entre com um valor: ");
        n[0] = ler.nextInt();

        System.out.print("Entre com outro valor: ");
        n[1] = ler.nextInt();

        primos(n);

    }

    static void primos(int[] n){
        int primo = 0;

        for (int i= n[0]; i<= n[1]; i++) {
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
}
