package aplicacao.uninter;

import java.util.Scanner;

import entidades.uninter.Euro;
import entidades.uninter.Moedas;
import entidades.uninter.RubloRusso;
import entidades.uninter.Yen;
import entidades.uninter.cofrinho.Cofrinho;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Cofrinho cofrinho = new Cofrinho();
		Moedas euro = new Euro();
		Moedas yen = new  Yen();
		Moedas rubloRusso = new RubloRusso();
		try {
			while(true) {
				System.out.println("Bem vindo ao seu cofrinho!");
				System.out.println("1)Para Adicionar Moedas");
				System.out.println("2)Para Remover Moedas");
				System.out.println("3)Para Listar as Moedas");
				System.out.println("4)Para Mostrar o Valor Total Do Cofrinho");
				System.out.println("5)Sair do cofrinho");
				
				int opicao = ler.nextInt();
				if(opicao == 1) {
					System.out.println("Adicionar moedas");
					try {
						boolean adicionarMais = true;
						while(adicionarMais) {
							System.out.println("Moedas que podem ser adicionadas 1)Yen/2)Euro/3)RubloRusso");
							int opc = ler.nextInt();
							while(opc != 1 && opc != 2 && opc != 3) {
								System.out.println("Valores invalidos. tente Novamente");
								opc = ler.nextInt();
							}
							if(opc == 1) {
								System.out.println("A moeda escolhida foi o yen");
								System.out.println("agora entre com o valor que deseja: ");
								double valor = ler.nextDouble();
								yen = new Yen(valor);
								cofrinho.addMoedas(yen);
							}else if(opc == 2) {
								System.out.println("A moeda escolhida foi o euro");
								System.out.println("agora entre com o valor que deseja: ");
								double valor = ler.nextDouble();
								euro = new Euro(valor);
								cofrinho.addMoedas(euro);
							}else if(opc == 3) {
								System.out.println("A moeda escolhida foi o rublorusso");
								System.out.println("agora entre com o valor que deseja: ");
								double valor = ler.nextDouble();
								rubloRusso = new RubloRusso(valor);
								cofrinho.addMoedas(rubloRusso);
								
							}
							System.out.println("Deseja adicionar mais alguma moeda?(s/n)");
							String add = ler.next();
							if(!add.equalsIgnoreCase("s")) {
							 adicionarMais = false;
							}
							
						}
						
					}
					
					catch (IllegalArgumentException e) {
						System.out.println("O valor adiconado não é valido" + e.getMessage());
					}
				}
				else if(opicao == 2) {
					System.out.println("Remover moedas");
					try {
						Boolean removerMais = true;
						while(removerMais) {
							System.out.println("escolha a moeda que deseja retirar 1)Yen/2)Euro/3)RubloRusso");
							int opc = ler.nextInt();
							while(opc != 1 && opc != 2 && opc != 3) {
								System.out.println("Valores invalidos. tente Novamente");
								opc = ler.nextInt();
							}
							if(opc == 1) {
								System.out.println("cofrinho era remover Yen");
								cofrinho.removerMoedas(yen);
							}else if(opc == 2) {
								System.out.println("cofrinho era remover Euro");
								cofrinho.removerMoedas(euro);
							}else if(opc == 3) {
								System.out.println("cofrinho era remover RubloRusso");
								cofrinho.removerMoedas(rubloRusso);
							}
							System.out.println("Deseja remover mais alguma moeda?(s/n)");
							String add = ler.next();
							if(!add.equalsIgnoreCase("s")) {
							 removerMais = false;
							}
						}
						
					} catch (IllegalArgumentException e) {
						System.out.println("Error " + e.getMessage());
					}
				}
				else if(opicao == 3) {
					String x = cofrinho.ListagemMoedas();
					System.out.println(x.toString());
				}
				else if(opicao == 4) {
					double valorTotal = cofrinho.valorTotal();
					System.out.println("O valor total do cofrinho " + valorTotal);
				}
				else {
					break;
				}
				
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		ler.close();
	}

}
