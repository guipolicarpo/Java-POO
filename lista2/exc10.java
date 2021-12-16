//Guilherme Policarpo de Carvalho
import java.util.Scanner;

public class exc10 {

    static int isMaior(int num1, int num2){
        return Math.max(num1, num2);
    }

    static int isMaior (int num1, int num2, int num3){
        return Math.max(num1, Math.max(num2, num3));
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        int num1, num2, num3;

        System.out.printf("Digite o valor 1: ");
        num1 = ler.nextInt();

        System.out.printf("Digite o valor 2: ");
        num2 = ler.nextInt();

        System.out.printf("Digite o valor 3: ");
        num3 = ler.nextInt();

        System.out.printf("\nO maior e: " + isMaior(num1, num2, num3) );      
    }
}

