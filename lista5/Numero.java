// Guilherme Policarpo de Carvalho

public class Numero {
    int numero;

    public Numero () {
        numero = 0;
    }

    public void setNumero ( int numero){
        this.numero = numero;
    }

    public int getNumero () {
        return numero;
    }

    public int Inverter(){
        int i = 0;
		while (numero > 0) {
		    i *= 10;
		    i += (numero % 10);
		    numero /= 10;
		} 
			 
	    return i;	
    }
}
