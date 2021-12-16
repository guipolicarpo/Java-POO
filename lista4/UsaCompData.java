// Guilherme Policarpo de Carvalho

public class UsaCompData {
	
	public static void main (String[] args) {
		
		CompData d1 = new CompData ();
		d1.setMes (512);
		System.out.println ( "D1: " + d1 );
		System.out.println ( "Dias de D1: " + d1.getDias () );
		d1.setDia (2);
		System.out.println ( "D1: " + d1 );
		System.out.println ( "Dias de D1: " + d1.getDias () );
		
		CompData d2 = new CompData ( 24, 512, 2021 );
		System.out.println ( "D2: " + d2 );
		
		System.out.println ( "Maior D1 ou D2: " + d1.max ( d2 ) );
		System.out.println ( "Intervalo entre D1 e D2: " + 
								d1.intervalo ( d2 ) );
		System.out.println ( "Menor D1 ou 1/1/1900: " + 
								d1.min ( new CompData ( 1, 1, 1900 ) ) );
		System.out.println ( "Intervalo entre D1 e 1/1/1900: " + 
								d1.intervalo ( new CompData ( 1, 1, 1900 ) ) );
		
		CompData d3 = new CompData ();
		d3.setData ( 29, 2, 2020 );
		System.out.println ( d3 );
		System.out.println ( "D3 eh valida? " + d3.isData() );
		
		CompData d4 = new CompData ( d3.getData() );
		//Data d4 = d3;
		System.out.println ( d4 );
		
		d3.setDia(12);
		d4.setMes(10);
		System.out.println ( d3 );
		System.out.println ( d4 );
	}
}

