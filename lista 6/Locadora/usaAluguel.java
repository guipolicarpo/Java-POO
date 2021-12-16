// Guilherme Policarpo de Carvalho

import java.util.Scanner;

public class usaAluguel {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Scanner lerStr = new Scanner (System.in);

        Midia mid = new Midia();
        Cliente cli = new Cliente();
        Filme f1 = new Filme();
        Livro l1 = new Livro();
        Jogo j1 = new Jogo();

        int opc, alu, cob, cod;
        boolean pago;

        do{
            System.out.println("\nBem vindo a locadora Policarpo!");
            System.out.println("[1] Alugar uma midia");
            System.out.println("[2] Receber uma midia");
            System.out.println("[3] Sair");
            System.out.printf("Escolha: ");
            opc = ler.nextInt();

            switch (opc) {
                case 1:
                    System.out.printf("\nQual o codigo do cliente?: ");
                    cli.setCodigo(ler.nextInt());

                    System.out.printf("Qual o nome do cliente?: ");
                    cli.setNome(lerStr.nextLine());

                    System.out.printf("Qual a idade do cliente?: ");
                    cli.setIdade(ler.nextInt());

                    //

                    System.out.println("\nQue tipo de midia deseja alugar?");
                    System.out.printf("[1] Filme [2] Livro [3] Jogo: ");
                    alu = ler.nextInt();
                    switch (alu) {
                        case 1:
                            System.out.println("\nFilme disponivel:");
                            System.out.println(f1);
                            System.out.printf("Pagar agora ou depois? [1] Agora [2] Depois: ");
                            cob = ler.nextInt();

                            if (cob == 1) {
                                pago = true;
                            }
                            if (cob == 2) {
                                pago = false;
                            }
                            break;

                        case 2:
                            System.out.println("\nLivro disponivel:");
                            System.out.println(l1);
                            System.out.printf("Pagar agora ou depois? [1] Agora [2] Depois: ");
                            cob = ler.nextInt();

                            if (cob == 1) {
                                pago = true;
                            }
                            if (cob == 2) {
                                pago = false;
                            }
                            break;

                        case 3:
                            System.out.println("\nJogo disponivel:");
                            System.out.println(j1);
                            System.out.printf("Pagar agora ou depois? [1] Agora [2] Depois: ");
                            cob = ler.nextInt();

                            if (cob == 1) {
                                pago = true;
                            }
                            if (cob == 2) {
                                pago = false;
                            }
                            break;
                    
                        default:
                            System.out.println("Digite um valor valido!");
                            break;
                    }

                    break;

                case 2:
                    System.out.println("\nQual o codigo do cliente que deseja receber: ");
                    cod = ler.nextInt();

                    if (cli.getCodigo() == cod) {
                        System.out.println("Cliente: " + cli);
                        if (pago = true) {
                            System.out.println("O cliente ja pagou por este alugel!");
                            
                        }
                        if (pago = false){
                            System.out.println("Valor pendente a ser pago!");
                        }

                    }
                    else{
                        System.out.println("Esse cliente nao esta cadastrado!");
                    }
                    break;
            
                default:
                    System.out.println("Digite um valor valido!");
                    break;
            }
           

        }while(opc != 3);

        

    }
}
