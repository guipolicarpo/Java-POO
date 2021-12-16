// Guilherme Policarpo de Carvalho

public class Filme extends Midia{
    private String classificacao;
    private int duracao;

    public Filme(int codigo, String descricao, String tipo, String genero, double valor){
        super(001, "invocacao do mal", "blue-ray", "terror", 20);
        classificacao = "+18";
        duracao = 138;
    }

    public Filme() {
        super(001, "invocacao do mal", "blue-ray", "terror", 20);
        classificacao = "+18";
        duracao = 138;
    }

    @Override
    public String toString(){
        return super.toString() + ", " + classificacao + ", " + duracao;
    }
}
