// Guilherme Policarpo de Carvalho

public class Estagio extends Vaga {
	
	private int tempo;
	
	public Estagio () {
		super();
		tempo = 6;
	}
	
	public Estagio ( String descricao, double salario, int tempo ) {
		super ( descricao, salario );
		setTempo ( tempo );
	}
	
	public void setTempo ( int tempo ) {
		this.tempo = tempo;
	}
	
	public int getTempo () {
		return tempo;
	}
	
	public String toString () {
		return super.toString() + "; tempo (em meses): " + tempo;
	}
	
	public String toFile () {
		return "Estagio" + getSeparedor() + super.toFile() + getSeparedor() + tempo;
	}

}

