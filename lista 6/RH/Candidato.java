// Guilherme Policarpo de Carvalho

public class Candidato extends Arquivo {
	
	private String nome;
	private int idade;
	
	public Candidato () {
		nome="nome";
		idade=18;
	}
	
	public Candidato ( String nome, int idade ) {
		setNome  ( nome  );
		setIdade ( idade );
	}
	
	public void setNome ( String nome ) {
		this.nome = nome;
	}
	
	public void setIdade ( int idade ) {
		this.idade = idade;
	}
	
	public String getNome () {
		return nome;
	}
	
	public int getIdade () {
		return idade;
	}
	
	public String toString () {
		return "nome: " + nome + "; idade: " + idade;
	}
	
	public String toFile () {
		return nome + getSeparedor() + idade;
	}
}

