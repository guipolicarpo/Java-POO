// Guilherme Policarpo de Carvalho

public class Jogo extends Midia {
    private String console;

    public Jogo(int codigo, String descricao, String tipo, String genero, double valor) {
        super(003, "Resident Evil", "Historia", "Zumbi", 159);
        console = "PS5";
    }

    public Jogo() {
        super(003, "Resident Evil", "Historia", "Zumbi", 159);
        console = "PS5";
    }

    @Override

    public String toString(){
        return super.toString() + ", " + console;
    }
}
