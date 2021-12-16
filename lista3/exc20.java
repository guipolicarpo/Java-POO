/*
Guilherme Policarpo de Carvalho
 */

import java.util.Scanner;

public class exc20 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        int valor1, valor2;

        System.out.printf("Entre com um valor: ");
        valor1 = ler.nextInt();

        System.out.printf("Entre com outro valor: ");
        valor2 = ler.nextInt();

        calculaMDC(valor1, valor2);
    }

    static void calculaMDC(int valor1, int valor2) {  
        int resto;
        while (valor2 != 0) {
            resto = valor1 % valor2;
            valor1 = valor2;
            valor2 = resto;
            System.out.println("MDC: " + valor1); 
        }
    }
}
