/*
Guilherme Policarpo de Carvalho
 */

import java.util.Scanner;

public class exc25 {
    public static void main(String[] args) {

        Scanner leia = new Scanner (System.in);

        int numero;

        System.out.print("Entre com um numero: ");
        numero = leia.nextInt();
        if (numero <= 0) {
            System.out.print("Erro! Valor inválido.");
            System.exit(1);
        } else {
            perfeito(numero);
        }

        leia.close();
    }

    static void perfeito(int num) {
        for(int i = 1 ; i <= num ; i++){
            int soma=0;
            for(int j = 1 ; j < i ; j++){
                if(i%j==0){  
                    soma = soma + j;
                } 
            } 
            if (soma == i){ 
                System.out.printf("%d ",i); 
            }       
        }

    }
}
