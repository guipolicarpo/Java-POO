// Guilherme Policarpo de Carvalho

import java.util.Scanner;

public class usaConta {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Conta rest = new Conta();
        int com = 0;
        double total = 0;

        System.out.printf("Qual o valor total da conta: R$");
        rest.valor = ler.nextDouble();

        System.out.printf("Quantas pessoas irao dividir: ");
        rest.pessoas = ler.nextInt();

        System.out.print("Deseja pagar a comissao de 10% para o garcom?");
        System.out.printf("[1] SIM | [2] NAO: ");
        com = ler.nextInt();

        if (com == 1) {
            total = (rest.valor * rest.comissao) + rest.valor;
            System.out.println("O valor total da conta ficou: R$" + total + ", e o valor para cada pessoa ficou: R$" + total/rest.pessoas);
        }
        else{
            total = rest.valor;
            System.out.println("O valor total da conta ficou: R$" + total + ", e o valor para cada pessoa ficou: R$" + total/rest.pessoas);
        }
        
    }
}
