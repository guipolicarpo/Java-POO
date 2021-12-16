// Guilherme Policarpo de Carvalho

public class Cliente {
    int codigo;
    String nome;
    int idade;

    public Cliente(){
        codigo = 0;
        nome = "";
        idade = 0;
    }

    public void setCodigo( int codigo){
        this.codigo = codigo;
    }

    public void setNome( String nome){
        this.nome = nome;
    }

    public void setIdade( int idade){
        this.idade = idade;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    @Override
    public String toString(){
        return codigo + ", " + nome + ", " + idade;
    }
}
