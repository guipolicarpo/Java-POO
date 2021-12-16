// Guilherme Policarpo de Carvalho

public class Flor extends Planta {
	
	private String cor;
	
	public Flor ( String nome, String especie, String cor ) {
		super ( nome, especie );
		setFlor ( cor );
	}
	
	private void setFlor ( String cor ) {
		
		isNulo ( "Cor", cor );
		isVazio ( "Cor", cor );
		tamanhoMinimo ( "Cor", cor, 4 );
		
		setCor ( cor );
	}
	
	public void setCor ( String cor ) {
		if ( ! cor.isEmpty () ) 
			this.cor = cor;
	}
	
	@Override
	public String toString () {
		return super.toString () + ", " + cor;
	}
}

