// Guilherme Policarpo de Carvalho
import java.util.Scanner;

public class usaAno {
    public static void main(String[] args) {
        Scanner ler = new Scanner ( System.in);
        Ano year = new Ano ();

        System.out.printf("Digite um ano para verificar se e bissexto: ");
        year.setAno(ler.nextInt());

        System.out.println("O ano " + year.getAno() + " e bissexto? -> " + year.ehBissexto());
    }
}
