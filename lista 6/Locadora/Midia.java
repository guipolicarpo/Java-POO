// Guilherme Policarpo de Carvalho

public class Midia{
    protected int codigo;
    protected String descricao;
    protected String tipo;
    protected String genero;
    protected double valor;

    public Midia(int codigo, String descricao, String tipo, String genero, double valor){
        setCodigo(codigo);
        setDescricao(descricao);
        setTipo(tipo);
        setGenereo(genero);
        setValor(valor); 
    }

    public Midia() {
        super();
    }

    public void setCodigo( int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao( String descricao) {
        this.descricao = descricao;
    }

    public void setTipo( String tipo) {
        this.tipo = tipo;
    }

    public void setGenereo( String genero){
        this.genero = genero;
    }

    public void setValor( double valor){
        this.valor = valor;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getDescricao(){
        return descricao;
    }

    public String getTipo(){
        return tipo;
    }

    public String getGenero(){
        return genero;
    }

    public double getValor(){
        return valor;
    }

    @Override

    public String toString() {
        return "" + codigo + ", " + descricao + ", " + tipo + ", " + genero + ", " + valor;
    }
}