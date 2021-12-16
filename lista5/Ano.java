// Guilherme Policarpo de Carvalho

public class Ano {
    int ano;
    boolean bi;

    public Ano (){
        ano = 0;
        bi = false;
    }

    public void setAno( int ano){
        this.ano = ano;
    }

    public int getAno(){
        return ano;
    }

    public boolean ehBissexto(){
        if(ano % 400 == 0){
            bi = true;
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            bi = true;
        } else{
            bi = false;
        }

        return bi;
    }
}
