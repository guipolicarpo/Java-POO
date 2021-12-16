// Guilherme Policarpo de Carvalho

public class CandidatoVaga extends Arquivo {
	
	Candidato candidato;
	Vaga      vaga;
	
	private boolean contratado;
	
	public CandidatoVaga () {
		contratado = false;
	}
	
	public void setContratado ( boolean contratado ) {
		this.contratado = contratado;
	}
	
	public boolean isContratado () {
		return contratado;
	}
	
	public String toString () {
		return ( contratado ? "[Contratado]\n\t" : "[Em aberto]\n\t" ) +
		       "[Condidato] " + candidato + "\n\t" +
		       "[Vaga] " + vaga;
	}
	
	public String toFile () {
		return candidato.toFile() + getSeparedor() + 
		       vaga.toFile() + getSeparedor() + 
		       contratado;
	}

}

