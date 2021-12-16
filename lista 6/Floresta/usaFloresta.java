// Guilherme Policarpo de Carvalho

import java.util.Scanner;

public class usaFloresta {
	
	public static void main (String[] args) {
		
		Scanner leia    = new Scanner ( System.in );
		Scanner leiaStr = new Scanner ( System.in );
		
		int     opcao      = 0,
				quantidade = 0;
				
		String  nome       = "", 
				especie    = "",
				cor        = "";
				
		boolean frutifera  = false,
			    venenosa   = true;
		
		Planta[] floresta = new Planta[10000];
		
		do {
			System.out.println("\nMENU MAMAE NATUREZA");
			System.out.println("1) Add Arvore");
			System.out.println("2) Add Flor");
			System.out.println("3) Add Planta Carnivora");
			System.out.println("4) Lista Plantas");
			System.out.println("5) Mostra Quantidade de Plantas");
			System.out.println("6) Quantidade de Plantas por Tipo");
			System.out.println("7) Sair");
			System.out.print(">>> Opcao: ");
			opcao = leia.nextInt();
			
			switch ( opcao ) {
				case 1:
					System.out.println(" Cadastro de Arvores ");
					
					System.out.print("Nome: ");
					nome = leiaStr.nextLine();
					
					System.out.print("Especie: ");
					especie = leiaStr.nextLine();
					
					System.out.print("Eh Frutifera [s/n]: ");
					frutifera = leiaStr.nextLine().equalsIgnoreCase("s");
					
					floresta [ quantidade++ ] = 
								new Arvore ( nome, especie, frutifera );
					break;
					
				case 2:
					System.out.println(" Cadastro de Flores ");
					
					System.out.print("Nome: ");
					nome = leiaStr.nextLine();
					
					System.out.print("Especie: ");
					especie = leiaStr.nextLine();
					
					System.out.print("Cor: ");
					cor = leiaStr.nextLine();
					
					Flor flor = new Flor ( nome, especie, cor );
					
					floresta [ quantidade++ ] = flor;
								
					break;
					
				case 3:
					System.out.println(" Cadastro de Plantas Carnivoras ");
					
					System.out.print("Nome: ");
					nome = leiaStr.nextLine();
					
					System.out.print("Especie: ");
					especie = leiaStr.nextLine();
					
					System.out.print("Eh Venenosa [s/n]: ");
					venenosa = leiaStr.nextLine().equalsIgnoreCase("s");
					
					floresta [ quantidade++ ] = 
								new Carnivora ( nome, especie, venenosa );
					break;
				case 7:
					break;
				default:
					System.out.println("\t\nOpcao Invalida!!!\n");
			}
			
		} while ( opcao != 7 );
		
	}
}

