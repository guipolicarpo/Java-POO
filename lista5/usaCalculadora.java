// Guilherme Policarpo de Carvalho
import java.util.Scanner;

public class usaCalculadora {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Calculadora calc = new Calculadora ();

        int n1, n2, opcao;

        System.out.printf("Entre com um numero inteiro: ");
        calc.setNumero1 (ler.nextInt());

        System.out.printf("Emtre com outro numero inteiro: ");
        calc.setNumero2 (ler.nextInt());

        do {
            System.err.println("\nSelecione a operacao");
            System.out.println("(1) Somar");
            System.out.println("(2) Subtrair");
            System.out.println("(3) Multiplicar");
            System.out.println("(4) Dividir");
            System.out.println("(5) Sair");
            System.out.printf(">>> Opcao: ");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Soma: " + calc.somar());
                    break;
                case 2:
                    System.out.println("Subtracao: " + calc.subtrair());
                    break;
                case 3:
                    System.out.println("Multiplicacao: " + calc.multiplicar());
                    break;

                case 4:
                    System.out.println("Divisao: " + calc.dividir());
                    break;

                case 5:
                    
                    break;
                default:
                    System.out.println("Opcao Invalida!");
                    break;
            }

        } while(opcao != 5);

    }
}
