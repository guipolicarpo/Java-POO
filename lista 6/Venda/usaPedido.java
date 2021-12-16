// Guilherme Policarpo de Carvalho

import java.util.Scanner;

public class usaPedido {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Frios fri = new Frios(8.90, 1);
        Pao paes = new Pao(1.50, 1);
        Doce doc = new Doce(3.50, 1);
        
        double carrinho = 0;
        int quantidade = 0;
        int quant;
        int opc;

        do{
            System.out.println("\nValor do carrinho: R$" + carrinho);
            System.out.println("Quantidade de produtos: " + quantidade);
            System.out.println("--------------------------------");

            System.out.println("Oque deseja?");
            System.out.printf("[1] Frios [2] Pao [3] Doce [4] Sair: ");
            opc = ler.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Valor dos Frios: R$" + fri.getPreco());
                    System.out.printf("Quantos Frios quer adicionar ao carrinho: ");
                    quant = ler.nextInt();
                    quantidade += quant;

                    if (quantidade <= 100) {
                        carrinho += quant * fri.getPreco();
                        
                    }
                    else{
                        System.out.println("Limite maximo do carrinho excedido!");
                        quantidade -= quant;
                    }    
                    break;
                
                case 2:
                    System.out.println("Valor do Pao: R$" + paes.getPreco());
                    System.out.printf("Quantos Paes quer adicionar ao carrinho: ");
                    quant = ler.nextInt();
                    quantidade += quant;

                    if (quantidade <= 100) {
                        carrinho += quant * paes.getPreco();
                        
                    }
                    else{
                        System.out.println("Limite maximo do carrinho excedido!");
                        quantidade -= quant;
                    } 
                    break;

                case 3:
                    System.out.println("Valor do Doce: R$" + doc.getPreco());
                    System.out.printf("Quantos Dcoes quer adicionar ao carrinho: ");
                    quant = ler.nextInt();
                    quantidade += quant;

                    if (quantidade <= 100) {
                        carrinho += quant * doc.getPreco();
                        
                    }
                    else{
                        System.out.println("Limite maximo do carrinho excedido!");
                        quantidade -= quant;
                    } 
                    break;
            
                default:
                    System.out.println("Digite um valor valido!");
                    break;
            }

        }while(opc != 4);
    }
}
