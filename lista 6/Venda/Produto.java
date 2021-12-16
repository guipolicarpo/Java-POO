// Guilherme Policarpo de Carvalho

public class Produto {
    private double preco;
    private int quantidade;

    public Produto (Double preco, int quantidade) {
        this.preco = preco;
        if (quantidade < 100) {
            this.quantidade = quantidade;
        }
    }

    public void setPreco ( double preco ){
        this.preco = preco;
    }

    public void setQuantidade ( int quantidade ){
        this.quantidade = quantidade;
    }

    public double getPreco (){
        return preco;
    }

    public int getQuantidade (){
        return quantidade;
    }
   
}
