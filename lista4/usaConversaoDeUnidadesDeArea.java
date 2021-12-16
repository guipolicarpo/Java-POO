// Guilherme Policarpo de Carvalho

import java.util.Scanner;

public class usaConversaoDeUnidadesDeArea {
    public static void main(String[] args) {
        ConversaoDeUnidadesDeArea con = new ConversaoDeUnidadesDeArea();
        Scanner ler = new Scanner (System.in);
        int esc;

        System.out.println("Qual o tipo de Unidade deseja converter?");
        System.out.printf("[1] Metro [2] Pe [3] Milha [4] Acre: ");
        esc = ler.nextInt();

        if (esc == 1) {
            System.out.printf("Digite o valor em Metros: ");
            con.setMetro(ler.nextDouble());
            System.out.println(con.ConverteMetro());
        }
        if (esc == 2) {
            System.out.printf("Digite o valor em Pes: ");
            con.setPe(ler.nextDouble());
            System.out.println(con.ConvertePe());
        }
        if (esc == 3) {
            System.out.printf("Digite o valor em Milhas: ");
            con.setMilha(ler.nextDouble());
            System.out.println(con.ConverteMilha());
        }
        if (esc == 4) {
            System.out.printf("Digite o valor em Acres: ");
            con.setAcre(ler.nextDouble());
            System.out.println(con.ConverteAcre());
        }
    }
}
