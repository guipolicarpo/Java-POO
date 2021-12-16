// Guilherme Policarpo de Carvalho

import java.util.Scanner;

public class usaData {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Data date = new Data();

        System.out.printf("Digite o Dia: ");
        date.setDia(ler.nextInt());

        System.out.printf("Digite o Mes: ");
        date.setMes(ler.nextInt());

        System.out.printf("Digite o Ano: ");
        date.setAno(ler.nextInt());

        System.out.println("\nData valida: " + date.ValidaData());

        System.out.println(date);
        
    }
}
