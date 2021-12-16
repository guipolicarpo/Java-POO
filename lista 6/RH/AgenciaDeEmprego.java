// Guilherme Policarpo de Carvalho

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class AgenciaDeEmprego extends Arquivo {

	static Scanner leia    = new Scanner ( System.in );	
	static Scanner leiaStr = new Scanner ( System.in );
	
	static int maxCandidatos = 1000,
		       maxVagas      = 1000,
		       maxCV         = 1000,
		       maxLines      = 1000;
	
	static Candidato     candidatos[] = new Candidato    [maxCandidatos];
	static Vaga          vagas[]      = new Vaga         [maxVagas];
	static CandidatoVaga cv[]         = new CandidatoVaga[maxCV];
	
	static int qtdeCandidatos = 0,
		       qtdeVagas      = 0,
		       qtdeCV         = 0;
		
	static int opcao   = 0,
	           opcaoC  = 0,
	           opcaoV  = 0,
	           opcaoCV = 0,
	           i       = 0;
		
	static String opcaoStr  = "";
	
	static String arqC  = "candidatos.txt",
	              arqV  = "vagas.txt",
	              arqCV = "cvs.txt";
	              
	static String separador = ";";
	
	public static void main (String args[]) throws IOException {
		
		carregarDados ();
		
		do {

			desenhaMenu ();

			System.out.print(">>> Opcao: ");
			opcao = leia.nextInt();

			switch ( opcao ) {
				case 1:
					cadastrarCandidato ();
					break;
				case 2:
					cadastrarVaga ();
					break;
				case 3:
					cadastrarCV ();
					break;
				case 4:
					listarCandidatos ();
					break;
				case 5:
					listarVagas ();
					break;
				case 6:
					listarCV ();
					break;
				case 7:
					contratar ();
					break;
				case 8:
					System.out.print("\n\tFinalizando o programa!");
					break;
				default:
					System.out.print("\n\tOpcao invalida! Selecione outra...");
					opcao = 1;
			}
		} while ( ( opcao >= 1 ) && ( opcao < 8 ) );
		
	}
	
	public static void desenhaMenu () {		
		System.out.println("=========================");
		System.out.println(" = Agencia de Empregos = ");
		System.out.println("=========================");
		System.out.println("1) Cadastrar Candidatos");
		System.out.println("2) Cadastrar Vagas");
		System.out.println("3) Cadastrar Candidato x Vaga");
		System.out.println("4) Listar Quantidade de Candidatos e Situacao");
		System.out.println("5) Listar Vagas por tipo");
		System.out.println("6) Listar Candidato x Vaga");
		System.out.println("7) Preencher Vaga [Contratar]");
		System.out.println("8) Sair");
		System.out.println("-------------------------");
	}
	
	public static void cadastrarCandidato () {
		if ( qtdeCandidatos < maxCandidatos ) {
			System.out.print("\n\tCadastrar candidato a Empregado ou Desempregado [E/D]: ");
			opcaoStr = leiaStr.nextLine();
			candidatos[qtdeCandidatos] = ( opcaoStr.equalsIgnoreCase ("E") ? new Empregado() : new Desempregado() );
			System.out.print("\tNome: ");
			candidatos[qtdeCandidatos].setNome  ( leiaStr.nextLine() );
			System.out.print("\tIdade: ");
			candidatos[qtdeCandidatos].setIdade ( leia.nextInt() );
			if ( opcaoStr.equalsIgnoreCase ("E") ) {
				System.out.print("\tEmpresa: ");
				( (Empregado) candidatos[qtdeCandidatos] ).setEmpresa ( leiaStr.nextLine() );
			} else {
				System.out.print("\tTempo (em meses): ");
				( (Desempregado) candidatos[qtdeCandidatos] ).setMeses ( leia.nextInt() );
			}
			System.out.print("\n\tSalvar dados? [S/N]: ");
			if ( leiaStr.nextLine().equalsIgnoreCase ("S") ) {
				gravarNoArquivo ( arqC, candidatos[qtdeCandidatos].toFile() );
				qtdeCandidatos++;
			}
		} else {
			System.out.print("\n\tErro! Quantidade maxima de cadastros atingida...\n");
		}
	}
	
	public static void cadastrarVaga () {		
		if ( qtdeVagas < maxVagas ) {
			System.out.print("\n\tCadastrar vaga de Estagio ou Trabalho [E/T]: ");
			opcaoStr = leiaStr.nextLine();
			vagas[qtdeVagas] = ( opcaoStr.equalsIgnoreCase ("E") ? new Estagio() : new Trabalho() );
			System.out.print("\tDescricao da Vaga: ");
			vagas[qtdeVagas].setDescricao ( leiaStr.nextLine() );
			System.out.print("\tSalario: ");
			vagas[qtdeVagas].setSalario ( leia.nextDouble() );
			if ( opcaoStr.equalsIgnoreCase ("E") ) {
				System.out.print("\tTempo (em meses): ");
				( (Estagio) vagas[qtdeVagas] ).setTempo ( leia.nextInt() );
			} else {
				System.out.print("\tVaga temporaria ou definitiva [T/D]: ");
				( (Trabalho) vagas[qtdeVagas] ).setTemporario ( leiaStr.nextLine().equalsIgnoreCase ("T") );
			}
			System.out.print("\n\tSalvar dados? [S/N]: ");
			if ( leiaStr.nextLine().equalsIgnoreCase ("S") ) {
				gravarNoArquivo ( arqV, vagas[qtdeVagas].toFile() );
				qtdeVagas++;
			}
		} else {
			System.out.print("\n\tErro! Quantidade maxima de cadastros atingida...\n");
		}
	}
	
	public static void cadastrarCV () {
		if ( qtdeCV < maxCV ) {
			System.out.println("\n\tCadastro de Candidato Vaga");
			System.out.println("\n\t[Selecionar a vaga / 0 - Sair]");
			listarVagas ();
			System.out.print("\n\tOpcao: ");
			opcaoV = leia.nextInt();
			if ( ( opcaoV > 0 ) && ( opcaoV <= qtdeVagas ) ) {
				do {
					System.out.println("\n\t\t[Selecionar o candidato / 0 - Sair]");
					listarCandidatos ();
					System.out.print("\n\t\tOpcao: ");
					opcaoC = leia.nextInt();
					if ( ( opcaoC > 0 ) && ( opcaoC <= qtdeCandidatos ) ) {
						System.out.print("\n\t\tAdicionar candidado a vaga? [S/N]: ");
						if ( leiaStr.nextLine().equalsIgnoreCase ("S") ) {
							cv[qtdeCV]           = new CandidatoVaga();
							cv[qtdeCV].vaga      = vagas[opcaoV-1];
							cv[qtdeCV].candidato = candidatos[opcaoC-1];
							gravarNoArquivo ( arqCV, cv[qtdeCV].toFile() );
							qtdeCV++;
						}					
					}
				} while ( ( opcaoC > 0 ) && ( opcaoC <= qtdeCandidatos ) );
			} else {
				System.out.println("\n\t[Acao cancelada]");
			}
		} else {
			System.out.print("\n\tErro! Quantidade maxima de cadastros atingida...\n");
		}
	}
	
	public static void listarCandidatos () {
		System.out.println("\n\tLista de Candidatos e sua Situacao");
		for ( i = 0 ; i < qtdeCandidatos ; i++ ) {
			System.out.println("\n\t" + ( i + 1 ) + ") " + candidatos[i] + (candidatos[i] instanceof Empregado ? " [Empregado]" : " [Desempregado]") );
		}
	}

	public static void listarVagas () {
		System.out.println("\n\tLista de Vagas");
		for ( i = 0 ; i < qtdeVagas ; i++ ) {
			System.out.println("\n\t" + ( i + 1 ) + ") " + vagas[i] + (vagas[i] instanceof Estagio ? " [Estagio]" : " [Trabalho]") );
		}
	}

	public static void listarCV () {
		System.out.println("\n\tLista de Candidato Vagas");
		for ( i = 0 ; i < qtdeCV ; i++ ) {
			System.out.println("\n\t" + ( i + 1 ) + ") " + cv[i] );
		}
	}
	
	public static void contratar () throws IOException {
		System.out.println("\n\tContratar Candidato de uma Vaga");
		System.out.println("\n\t[Selecionar o candidato vaga / 0 - Sair]");
		listarCV ();
		System.out.print("\n\tOpcao: ");
		opcaoCV = leia.nextInt();
		if ( ( opcaoCV > 0 ) && ( opcaoCV <= qtdeCV ) ) {
			System.out.print("\n\t\tContratar candidado a vaga? [S/N]: ");
			String oldCV = cv[opcaoCV-1].toFile ();
			cv[opcaoCV-1].setContratado( leiaStr.nextLine().equalsIgnoreCase ("S") );
			alterarArquivo ( arqCV, oldCV, cv[opcaoCV-1].toFile() );
		} else {
			System.out.println("\n\t[Acao cancelada]");
		}
	}
	
	public static void gravarNoArquivo ( String arquivo, String dado ) {	
		try {
			FileWriter     fw = new FileWriter     ( arquivo, true );
			BufferedWriter bw = new BufferedWriter ( fw );

			bw.write   ( dado );
			bw.newLine ();

			bw.close ();
			fw.close ();

			System.out.println("\n\tSalvo!\n\t\tDados cadastrados com sucesso!");
			
		} catch ( IOException ex ){
			System.out.println("\n\tErro ao escrever no arquivo: " + arquivo + "!");
		}		
	}
	
	public static String[] lerDoArquivo ( String arquivo ) {
		String linhas[] = new String[maxLines];
		int    controle = 0; 
		try {
            FileReader     fr = new FileReader     ( arquivo );
            BufferedReader br = new BufferedReader ( fr );

            while ( br.ready () ) {
                linhas[controle++] = br.readLine();
            }
            br.close();
            fr.close();

        } catch ( IOException ex ) {
            System.out.println("\n\tErro ao ler o arquivo: " + arquivo + "!");
        }
        return linhas;
	}

	public static void carregarDados () {
		String linhasC[] = lerDoArquivo ( arqC );
		for ( int i = 0 ; i < linhasC.length ; i++ ) {
			if ( linhasC[i] != null ) {
				if ( qtdeCandidatos < maxCandidatos ) {
					String campos[] = linhasC[i].split ( separador );
					if ( campos[0].equals("Empregado") ) {
						candidatos[qtdeCandidatos] = new Empregado();
						candidatos[qtdeCandidatos].setNome  ( campos[1] );
						candidatos[qtdeCandidatos].setIdade ( Integer.parseInt ( campos[2] ) );
						( (Empregado) candidatos[qtdeCandidatos] ).setEmpresa ( campos[3] );
					} else {
						candidatos[qtdeCandidatos] = new Desempregado();
						candidatos[qtdeCandidatos].setNome  ( campos[1] );
						candidatos[qtdeCandidatos].setIdade ( Integer.parseInt ( campos[2] ) );
						( (Desempregado) candidatos[qtdeCandidatos] ).setMeses ( Integer.parseInt ( campos[3] ) );
					}
					qtdeCandidatos++;
				} else {
					System.out.print("\n\tErro! Quantidade maxima de cadastros atingida...\n");
				}
			}
		}

		String linhasV[] = lerDoArquivo ( arqV );
		for ( int i = 0 ; i < linhasV.length ; i++ ) {
			if ( linhasV[i] != null ) { 
				if ( qtdeVagas < maxVagas ) {
					String campos[] = linhasV[i].split ( separador );
					if ( campos[0].equals("Estagio") ) {
						vagas[qtdeVagas] = new Estagio();
						vagas[qtdeVagas].setDescricao ( campos[1] );
						vagas[qtdeVagas].setSalario   ( Double.parseDouble ( campos[2] ) );
						( (Estagio) vagas[qtdeVagas] ).setTempo ( Integer.parseInt ( campos[3] ) );
					} else {
						vagas[qtdeVagas] = new Trabalho();
						vagas[qtdeVagas].setDescricao ( campos[1] );
						vagas[qtdeVagas].setSalario   ( Double.parseDouble ( campos[2] ) );
						( (Trabalho) vagas[qtdeVagas] ).setTemporario ( Boolean.parseBoolean ( campos[3] ) );
					}
					qtdeVagas++;
				} else {
					System.out.print("\n\tErro! Quantidade maxima de cadastros atingida...\n");
				}
			}
		}		

		String linhasCV[] = lerDoArquivo ( arqCV );
		for ( int i = 0 ; i < linhasCV.length ; i++ ) {
			if ( linhasCV[i] != null ) { 
				if ( qtdeCV < maxCV ) {
					String campos[] = linhasCV[i].split ( separador );
					
					cv[qtdeCV] = new CandidatoVaga();
					if ( campos[0].equals("Empregado") ) {
						cv[qtdeCV].candidato = new Empregado( campos[1],
															  Integer.parseInt ( campos[2] ),
															  campos[3] );
					} else {
						cv[qtdeCV].candidato = new Desempregado( campos[1],
																 Integer.parseInt ( campos[2] ),
																 Integer.parseInt ( campos[3] ) );
					}
					
					if ( campos[4].equals("Estagio") ) {
						cv[qtdeCV].vaga = new Estagio( campos[5],
													   Double.parseDouble ( campos[6] ),
													   Integer.parseInt   ( campos[7] ) );
					} else {
						cv[qtdeCV].vaga = new Trabalho( campos[5],
														Double.parseDouble   ( campos[6] ),
														Boolean.parseBoolean ( campos[7] ) );
					}
					
					cv[qtdeCV].setContratado ( Boolean.parseBoolean ( campos[8] ) );
					qtdeCV++;
				} else {
					System.out.print("\n\tErro! Quantidade maxima de cadastros atingida...\n");
				}
			}
		}
	}
	
	public static void alterarArquivo ( String file, String oldValue, String newValue ) throws IOException {
		try {
			File diretorio = new File ( "" );  
			Path path = Paths.get ( diretorio.getAbsolutePath () + "/" + file );
			List<String> linhas = Files.readAllLines ( path );
			for ( int i = 0 ; i < linhas.size () ; i++ ) {
				if ( linhas.get ( i ).equals ( oldValue ) ) {
					linhas.remove ( i );
					linhas.add    ( i, newValue );
				}
			}
			Files.write(path, linhas);		

			System.out.println("\n\tSalvo!\n\t\tDados alterados com sucesso!");
			
		} catch ( IOException ex ){
			System.out.println("\n\tErro ao escrever no arquivo: " + file + "!");
		}		
	}
}

