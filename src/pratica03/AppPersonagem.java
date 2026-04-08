package pratica03;

import java.util.Scanner;

public class AppPersonagem {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("=== RPG - Gerenciador de Personagens ===");
		System.out.print("Quantos personagens deseja criar? ");
		int numeroPersonagem = input.nextInt();
		
		Personagem[] personagens = new Personagem[numeroPersonagem];
		
		int id;
		String nome; 
		for (int i = 0; i < personagens.length; i++) {
			System.out.printf("\nDigite o ID do personagem [%d]: ", i);
			id = input.nextInt();
			System.out.printf("Digite o nome do personagem [%d]: ", i);
			nome = input.next();

			personagens[i] = new Personagem(id, nome);
		}

		while (true) {
			
			System.out.println("\n=== Menu Principal ===");
			System.out.println("Personagens cadastrados:");
			
			for (int i = 0; i < personagens.length; i++) {
				System.out.printf("[%d] - %s  | Vida: %d | Mana: %d | Status: %s\n",
								  i, personagens[i].getNome(), personagens[i].getVida(), personagens[i].getMana(), (personagens[i].isVivo() ? "Vivo" : "Morto"));
			}
			
			System.out.print("\nEscolha (1) para continuar ou (0) para finalizar o sistema: ");
			int opcaoSaida = input.nextInt();
			
			if (opcaoSaida == 0) {
				System.out.println("\nSaindo do sistema!");
				break;
			}
			
			System.out.print("Escolha o personagem (índice): ");
			int opcaoPersonagem = input.nextInt();
			
			if (opcaoPersonagem >= 0 && opcaoPersonagem < personagens.length) {
				while(true) {
					
					System.out.printf("\n=== Gerenciando: %s ===", personagens[opcaoPersonagem].getNome());
					
					if (personagens[opcaoPersonagem].isVivo() == false) {
						System.out.println("\nPersonagem Morto!");
					}
					
					System.out.println("\n1 - Receber Dano");	
					System.out.println("2 - Curar");	
					System.out.println("3 - Usar Magia");	
					System.out.println("4 - Recarregar Mana");	
					System.out.println("5 - Mostrar Dados");	
					System.out.println("0 - Voltar ao Menu Principal");	
					System.out.print("\nEscolha entre (0 - 5): ");	
					int opcao = input.nextInt();
					
					int valorDano;
					int valorCura;
					int valorMana;
					int valorRecarregarMana;
					
					switch (opcao) {
					case 1:
						System.out.print("\nDigite a quantidade de dano recebido: ");	
						valorDano = input.nextInt();
						System.out.printf(personagens[opcaoPersonagem].receberDano(valorDano) ? "Dano recebido! Vida atual: %d\n" : "Ação não permitida!\n", personagens[opcaoPersonagem].getVida());

						continue;
					case 2:
						System.out.print("\nDigite a quantidade de cura recebida: ");	
						valorCura = input.nextInt();
						System.out.printf(personagens[opcaoPersonagem].curar(valorCura) ? "Cura recebida! Vida atual: %d\n" : "Ação não permitida!\n", personagens[opcaoPersonagem].getVida());
						
						continue;
					case 3:
						System.out.print("\nDigite a quantidade de mana usada: ");	
						valorMana = input.nextInt();
						System.out.printf(personagens[opcaoPersonagem].usarMagia(valorMana) ? "Magia usada! Mana atual: %d\n" : "Mana insuficiente ou Ação não permitida!\n", personagens[opcaoPersonagem].getMana());
					
						continue;
					case 4:
						System.out.print("\nDigite a quantidade de mana recarregada: ");	
						valorRecarregarMana = input.nextInt();
						System.out.printf(personagens[opcaoPersonagem].recarregarMana(valorRecarregarMana) ? "Mana recarregada! Mana atual: %d\n" : "Ação não permitida!\n", personagens[opcaoPersonagem].getMana());
						
						continue;
					case 5:
						mostrarPersonagem(personagens[opcaoPersonagem]);
						
						continue;
					case 0:
						System.out.println("\nVoltando ao menu!");
						
						break;
					default:
						System.out.println("\nOpção inválida! Escolha entre (0 - 5)");
						
						continue;
					}
					
					break;
				}
			} 
			else {
			    System.out.println("\nÍndice inválido!");
			}
		}
		
		input.close();
	}
	
	public static void mostrarPersonagem(Personagem personagem) {
		System.out.println("\n=== Status Personagem ===");
		System.out.println("ID Personagem: " + personagem.getIdPersonagem());
		System.out.println("Nome.........: " + personagem.getNome());
		System.out.println("Vida.........: " + personagem.getVida());
		System.out.println("Mana.........: " + personagem.getMana());
		System.out.println("Status.......: " + (personagem.isVivo() ? "Vivo" : "Morto"));
	}
}
