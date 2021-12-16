// Guilherme Policarpo de Carvalho

public abstract class Planta {
	
	private String nome, especie;
	
	public Planta ( String nome, String especie ) {
		setPlanta ( "planta", "generica" );
		setPlanta ( nome, especie );
	}
	
	private void setPlanta ( String nome, String especie ) {
		setNome ( nome );
		setEspecie ( especie );
	}
	
	public void setNome ( String nome ) {

		isNulo ( "Nome", nome );
		isVazio ( "Nome", nome );
		tamanhoMinimo ( "Nome", nome, 3 );

		this.nome = nome;
	}
	
	public void setEspecie ( String especie ) {
		
		isNulo ( "Especie", especie );
		isVazio ( "Especie", especie );
			
		this.especie = especie;
	}
	
	protected void isNulo ( String atributo, String valor ) {

		if ( valor == null ) 
			throw new IllegalArgumentException( atributo + " naum pode ser nulo!");		
	}
	
	protected void isVazio ( String atributo, String valor ) {
		
		if ( valor.isEmpty() ) 
			throw new IllegalArgumentException( atributo + " precisa ter um valor diferente de vazio!");
	}
	
	protected void tamanhoMinimo ( String atributo, String valor, int tamanho ) {
		
		if ( valor.length() < tamanho ) 
			throw new IllegalArgumentException( atributo + " precisa ter tamanho minimo de " + tamanho + "!");
	}
	
	@Override
	public String toString () {
		return nome + ", " + especie;
	}
}

