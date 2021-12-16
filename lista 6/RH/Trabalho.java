// Guilherme Policarpo de Carvalho

public class Trabalho extends Vaga {
	
	private boolean temporario;
	
	public Trabalho () {
		super();
		temporario = false;
	}
	
	public Trabalho ( String descricao, double salario, boolean temporario ) {
		super ( descricao, salario );
		setTemporario ( temporario );
	}
	
	public void setTemporario ( boolean temporario ) {
		this.temporario =  temporario;
	}
	
	public boolean isTemporario () {
		return temporario;
	}
	
	public String toString () {
		return super.toString() + ( temporario ? "; vaga temporaria" : "; vaga definitiva" );
	}
	
	public String toFile () {
		return "Trabalho" + getSeparedor() + super.toFile() + getSeparedor() + temporario;
	}

}

