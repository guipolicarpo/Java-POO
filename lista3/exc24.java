/*
Guilherme Policarpo de Carvalho
 */

import java.util.Scanner;

public class exc24 {
    public static void main(String[] args) {

        Scanner leia = new Scanner (System.in);

        int numero;

        System.out.print("Entre com um numero inteiro: ");
        numero = leia.nextInt();
        if(numero <= 0){
            System.out.println("Erro! Valor invalido.");
            System.exit(1);
        }

        if(perfeito(numero) == true){
            System.out.println("O numero " + numero + " eh perfeito");
        } else {
            System.out.println("O numero " + numero + " não eh perfeito");
        }

        leia.close();
    }

    static boolean perfeito(int numero){
        int soma = 0;

        for (int i = 1 ; i < numero ; i++){
            if(numero%i == 0){
                soma += i;
            }
        }
        if(soma == numero){
            return true;
        } else{
            return false;
        }

    }
}
