// Guilherme Policarpo de Carvalho

public class LampadaEst {
    String estado;

    public LampadaEst(){
        estado = "Apagada";
    }

    public void setAcesa() {
        this.estado = "Acesa";
    }

    public void setMeialuz(){
        this.estado = "Meia-luz";
    }

    public void setApagada(){
        this.estado = "Apagada";
    }

    @Override

    public String toString(){
        return "A lampada esta: " + estado;
    }
}
