//Guilherme Policarpo de Carvalho
import java.util.Scanner;

public class exc11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        int numero, outro = 0;
        char op = 's';

        System.out.print("Entre com um valor inteiro: ");
        numero = ler.nextInt();
        outro = numero;

        do{      
            System.out.print("Inserir outro [S/N]: ");
            op = ler.next().charAt(0);  

            System.out.print("Entre com um valor inteiro: ");
            numero = ler.nextInt();
     
            menor(numero, outro);
            
        }while(op == 's' || op == 'S');

        System.out.println("\nO menor valor eh: " + outro);
        
    }

    static void menor (int numero , int outro){
        if(numero < outro){
            outro = numero;
        }
    }
}
