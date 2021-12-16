// Guilherme Policarpo de Carvalho

public class CompData {
	
	private int dia;
	private int mes;
	private int ano;
	
	public CompData () {
		setData ( 1, 1, 1900 );
	}
	
	public CompData ( int dia, int mes, int ano ) {
		setData ( 1, 1, 1900 );
		setData ( dia, mes, ano );
	}
	
	public CompData ( CompData data ) {
		setData ( data.getDia(), data.getMes(), data.getAno() );
	}
	
	public void setData ( int dia, int mes, int ano ) {
		setDia ( dia );
		setMes ( mes );
		setAno ( ano );
	}
	
	public void setDia ( int dia ) {
		if ( dia >= 1 && dia <= 31 ) {
			this.dia = dia;
		}
	}
	
	public void setMes ( int mes ) {
		if ( mes >= 1 && mes <= 12 ) {
			this.mes = mes;
		}
	}
	
	public void setAno ( int ano ) {
		if ( ano >= 1900 && ano <= 2100 ) {
			this.ano = ano;
		}
	}
	
	public CompData getData () {
		return this;
	}
	
	public int getDia () {
		return dia;
	}
	
	public int getMes () {
		return mes;
	}
	
	public int getAno () {
		return ano;
	}
	
	public boolean isData () {
		
		if ( mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
			return ( dia <= 30 );
		}
		
		if ( mes == 2 ) {
			return ( dia <= ( 29 - ( ano % 4 ) ) );
		}
		
		return true;
	}
	
	public int getDias () {
		return dia + mes * 30 + ano * 365;
	}
	
	public CompData max ( CompData data ) {
		return ( getDias() > data.getDias() ) ? this : data;
	}
	
	public CompData min ( CompData data ) {
		return ( getDias() < data.getDias() ) ? this : data;
	}
	
	public int intervalo ( CompData data ) {
		return Math.abs ( getDias () - data.getDias () );
	}
	
	@Override
	public String toString () {
		return dia + "/" + mes + "/" + ano;
	}
}

