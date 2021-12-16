// Guilherme Policarpo de Carvalho

import java.util.Scanner;

public class usaLampadaEst {
    public static void main(String[] args) {
        LampadaEst lamp = new LampadaEst();
        Scanner ler = new Scanner (System.in);
        int esc;

        do {
            System.out.print(lamp);
            System.out.print("\nOque deseja fazer com a lampada? [1] Acender [2] Meia-luz [3] Apagar [4] Sair: ");
            esc = ler.nextInt();

            if (esc == 1) {
                lamp.setAcesa();
            }

            if (esc == 2) {
                 lamp.setMeialuz();
            }

            if (esc == 3) {
                 lamp.setApagada();
            }

        }while (esc != 4);

        
    }
}
