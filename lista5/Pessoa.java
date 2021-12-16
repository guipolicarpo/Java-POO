// Guilherme Policarpo de Carvalho
import javax.swing.plaf.TreeUI;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa () {
        this.nome = "Joseverson";
        this.idade = 35;
        this.altura = 1.83;

    }

    public void setNome ( String nome) {
        if (! nome.isEmpty()){
            this.nome = nome;
        }
    }

    public void setIdade ( int idade) {
        if (idade >= 0){
            this.idade = idade;
        }
    }

    public void setAltura ( double altura) {
        if (altura > 0 && altura <= 3.5) {
            this.altura = altura;
        }
    }

    public String getNome () {
        return this.nome;
    }

    public int getIdade () {
        return this.idade;
    }

    public double getAltura () {
        return this.altura;
    }

    public void fazAniversario ( boolean faz) {
        if (faz){
            this.idade++;
        }
    }

    @Override

    public String toString () {
        return "[Nome: " + nome + ", Idade: " + idade + ", Altura: " + altura + "]";
    }


}
