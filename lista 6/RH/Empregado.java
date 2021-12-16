// Guilherme Policarpo de Carvalho

public class Empregado extends Candidato {
	
	private String empresa;
	
	public Empregado () {
		super();
		empresa = "empresa";
	}
	
	public Empregado ( String nome, int idade, String empresa ) {
		super ( nome, idade );
		setEmpresa ( empresa );
	}
	
	public void setEmpresa ( String empresa ) {
		this.empresa = empresa;
	}
	
	public String getEmpresa () {
		return empresa;
	}
	
	public String toString () {
		return super.toString() + "; empregado na empresa: " + empresa;
	}
	
	public String toFile () {
		return "Empregado" + getSeparedor() + super.toFile() + getSeparedor() + empresa;
	}

}

