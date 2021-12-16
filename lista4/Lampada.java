// Guilherme Policarpo de Carvalho

public class Lampada {
    private String marca;
    private String modelo;
    private String tipo;
    private boolean acesa;

    public Lampada () {
        marca = "Generica";
        modelo = "Bolha";
        tipo = "Amarela";
        acesa = false;
    }

    @Override
    public String toString(){
        return "[Marca: " + marca + ", Modelo: " + modelo + ", Tipo: " + tipo + ", Acesa: " + acesa + "]";
    }
}
