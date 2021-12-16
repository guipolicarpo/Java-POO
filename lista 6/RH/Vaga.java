// Guilherme Policarpo de Carvalho

public class Vaga extends Arquivo {
	
	private String descricao;
	private double salario;
	
	public Vaga () {
		descricao = "descicao da vaga";
		salario = 1000.0;
	}
	
	public Vaga ( String descricao, double salario ) {
		setDescricao ( descricao );
		setSalario   ( salario );
	}
	
	public void setDescricao ( String descricao ) {
		this.descricao = descricao;
	}
	
	public void setSalario ( double salario ) {
		this.salario = salario;
	}
	
	public String getDescricao () {
		return descricao;
	}
	
	public double getSalario () {
		return salario;
	}
	
	public String toString () {
		return "descricao da vaga: " + descricao + "; salario: r$ " + salario;
	}
	
	public String toFile () {
		return descricao + getSeparedor() + salario;
	}

}

