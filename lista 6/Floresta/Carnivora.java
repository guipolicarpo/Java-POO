// Guilherme Policarpo de Carvalho

public class Carnivora extends Planta {
	
	private boolean venenosa;
	
	public Carnivora ( String nome, String especie, boolean venenosa ) {
		super ( nome, especie );
		this.venenosa = venenosa;
	}
	
	public void setVenenosa ( boolean venenosa ) {
		this.venenosa = venenosa;
	}
	
	@Override
	public String toString () {
		return super.toString () + ", " + 
		       ( venenosa ? "" : "naum eh " ) + "frutifera";
	}
}

