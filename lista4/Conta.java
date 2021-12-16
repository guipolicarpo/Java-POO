// Guilherme Policarpo de Carvalho

public class Conta {
    double valor;
    int pessoas;
    double comissao;

    public Conta () {
        valor = 0;
        pessoas = 0;
        comissao = 0.10;
    }

    public void setValor (double valor) {
        if (valor > 0) {
            this.valor = valor;
        }
    }

    public void setPessoas (int pessoas) {
        if (pessoas > 0) {
            this.pessoas = pessoas;
        }
    }

    public double getValor () {
        return valor;
    }

    public int getPessoas () {
        return pessoas;
    }

    public double getComissao () {
        return comissao;
    }
}
