// Guilherme Policarpo de Carvalho

public class Data {
    int dia;
    int mes;
    int ano;
    boolean valida;

    public Data () {
        dia = 1;
        mes = 1;
        ano = 1;
        valida = false;
    }

    public void setDia( int dia ){
        this.dia = dia;
    }

    public void setMes( int mes){
        this.mes = mes;
    }

    public void setAno ( int ano){
        this.ano = ano;
    }

    public boolean ValidaData ( ){
        if (dia >= 01 && dia <= 31) {
            if (mes >= 01 && mes <= 12) {
                if (ano >= 1 && ano <= 2021) {
                    valida = true;
                }
            }
        }

        return valida;
    }

    @Override
    public String toString(){
        return "[" + dia + "/" + mes + "/" + ano + "]";
    }

}
