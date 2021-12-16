// Guilherme Policarpo de Carvalho

public class Livro extends Midia {
    private String autor;
    private String editora;
    private int edicao;

    public Livro(int codigo, String descricao, String tipo, String genero, double valor){
        super(002, "pequeno principe", "cartoon", "infantil", 37);
        autor = "Maicon Silva";
        editora = "Editora Bala";
        edicao = 24567;
    }

    public Livro(){
        super(002, "pequeno principe", "cartoon", "infantil", 37);
        autor = "Maicon Silva";
        editora = "Editora Bala";
        edicao = 24567;
    }

    @Override
    public String toString(){
        return super.toString() + ", " + autor + ", " + editora + ", " + edicao;
    }

    

}
