// Guilherme Policarpo de Carvalho

public class Desempregado extends Candidato {
	
	private int meses;
	
	public Desempregado () {
		super();
		meses = 1;
	}
	
	public Desempregado ( String nome, int idade, int meses ) {
		super ( nome, idade );
		setMeses ( meses );
	}
		
	public void setMeses ( int meses ) {
		this.meses = meses;
	}
	
	public int getMeses () {
		return meses;
	}
	
	public String toString () {
		return super.toString() + "; desempregado a meses: " + meses;
	}
	
	public String toFile () {
		return "Desempregado" + getSeparedor() + super.toFile() + getSeparedor() + meses;
	}

}

