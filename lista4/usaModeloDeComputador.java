// Guilherme Policarpo de Carvalho

import java.util.Scanner;

public class usaModeloDeComputador {
    public static void main(String[] args) {
        ModeloDeComputador pc = new ModeloDeComputador ();
        Scanner ler = new Scanner (System.in);
        int esc;
        
        System.out.println("Escolha o processador!");
        System.out.printf("[1] 1600Mhz $700 | [2] 1800Mhz $830 | [3] Gamer $910: ");
        esc = ler.nextInt();
        if (esc == 1) {
            pc.setProcessador(700);
        }
        if (esc == 2) {
            pc.setProcessador(830);
        }
        if (esc == 3) {
            pc.setProcessador(910);
        }

        System.out.println("Escolha a memoria!");
        System.out.printf("[1] 4GB $200 | [2] 8GB $320 | [3] 16GB $600: ");
        esc = ler.nextInt();
        if (esc == 1) {
            pc.setMemoria(200);
        }
        if (esc == 2) {
            pc.setMemoria(320);
        }
        if (esc == 3) {
            pc.setMemoria(600);
        }

        System.out.println("Escolha o tamanho do disco!");
        System.out.printf("[1] 500GB $300 | [2] 1TB $420 | [3] 2TB $500: ");
        esc = ler.nextInt();
        if (esc == 1) {
            pc.setDisco(300);
        }
        if (esc == 2) {
            pc.setDisco(420);
        }
        if (esc == 3) {
            pc.setDisco(500);
        }

        System.out.println("Escolha o tamanho do monitor!");
        System.out.printf("[1] 15pol $320 | [2] 17pol $520: ");
        esc = ler.nextInt();
        if (esc == 1) {
            pc.setMonitor(320);
        }
        if (esc == 2) {
            pc.setMonitor(520);
        }
        
        System.out.println("Valor total do pc: R$" + pc.calcularPreco());
    }
}
