// Guilherme Policarpo de Carvalho
import java.util.Scanner;
public class usaPessoa {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Scanner lerStr = new Scanner (System.in);
        Pessoa pessoa = new Pessoa ();

        System.out.println(pessoa);

        pessoa.setNome("Allbertino");
        pessoa.setIdade(45);
        pessoa.setAltura(1.68);

        System.out.println("O nome e: " + pessoa.getNome());
        System.out.println("A idade e: " + pessoa.getIdade());
        System.out.println("Com altura de: " + pessoa.getAltura());

        System.out.println("\nE aniversario do(a) " + pessoa.getNome() + " [s/n]: ");
        if (lerStr.nextLine().equalsIgnoreCase("s") ) {
            pessoa.fazAniversario( true );
            System.out.println("A nova idade e: " + pessoa.getIdade());
        }
    }
}
