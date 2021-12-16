//Guilherme Policarpo de Carvalho
import java.util.Scanner;

public class exc12 {

    static int jogardado (int dado){
        return (int)(Math.random() * 6 + 1);
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        int dado = 0;
        char sn;

        System.out.printf("Jogar o dado? [s/n]: ");
        sn = ler.next().charAt(0);

        do{
            System.out.println("\nSaiu: " + jogardado(dado));

            System.out.printf("Jogar o dado novamente? [s/n]: ");
            sn = ler.next().charAt(0);
        }while(sn == 's' || sn == 'S');
  
    }
}

