package pratica02;

public class AppEstacionamento {

	public static void main(String[] args) {

		Estacionamento[] estacionamentos = new Estacionamento[3];
		
		estacionamentos[0] = new Estacionamento(1, "Estacionamento Central", 50);
		estacionamentos[1] = new Estacionamento(2, "Estacionamento Shopping", 100);
		estacionamentos[2] = new Estacionamento(3, "Estacionamento Hospital", 20);
		
		System.out.println("Mostrando os dados dos estacionamentos.");
		for (int i = 0; i < estacionamentos.length; i++) {
			if (estacionamentos[i] != null) {
				mostrarDadosEstacionamento(estacionamentos[i]);
			}
		}
		
		System.out.println("\nAbrindo o primeiro e segundo estacionamento.");
		System.out.println(estacionamentos[0].abrirEstacionamento() ? "\n\tEstacionamento aberto com sucesso!" : "\n\tEstacionamento já estava aberto!");
		System.out.println(estacionamentos[1].abrirEstacionamento() ? "\tEstacionamento aberto com sucesso!" : "\n\tEstacionamento já estava aberto!");
		
		System.out.println("\nRegistrando entrada de 3 veículos no primeiro estacionamento.");
		for (int i = 0; i < 3; i++) {
			System.out.printf(estacionamentos[0].entrarVeiculo() ? "\n\tVeículo entrou! Vagas ocupadas: %d/%d" : "\n\tEntrada não permitida!", estacionamentos[0].getVagaOcupadas(), estacionamentos[0].getVagas());
		}
		
		System.out.println();
		System.out.println("Registrando entrada de 2 veículos no segundo estacionamento.");
		for (int i = 0; i < 2; i++) {
			System.out.printf(estacionamentos[1].entrarVeiculo() ? "\n\tVeículo entrou! Vagas ocupadas: %d/%d" : "\n\tEntrada não permitida!", estacionamentos[1].getVagaOcupadas(), estacionamentos[1].getVagas());
		}
		
		System.out.println();
		System.out.println("Registrando saída de 1 veículo no primeiro estacionamento.");
		System.out.printf(estacionamentos[0].sairVeiculo() ? "\n\tVeículo saiu! Vagas ocupadas: %d/%d\n" : "\n\tSaída não permitida!", estacionamentos[0].getVagaOcupadas(), estacionamentos[0].getVagas());
		
		System.out.println("Tentando registrar a entrada de 1 veículo no terceiro estacionamento.");
		System.out.println(estacionamentos[2].entrarVeiculo() ? "\n\tEstacionamento aberto" : "\n\tEstacionamento fechado!");
		
		System.out.println("Fechando o segundo estacionamento.");
		System.out.println(estacionamentos[1].fecharEstacionamento() ? "\n\tEstacionamento fechado com sucesso!" : "\n\tEstacionamento já estava fechado!");
		
		int vagasOcupadasTotal = 0;
		for (int i = 0; i < estacionamentos.length; i++) {
			vagasOcupadasTotal += estacionamentos[i].getVagaOcupadas();
		}
		
		System.out.println("Total de vagas ocupadas: " + vagasOcupadasTotal);
	}
	
	public static void mostrarDadosEstacionamento(Estacionamento estacionamento) {
		System.out.println("\n\tID Estacionamento: " + estacionamento.getIdEstacionamento());
		System.out.println("\tNome.............: " + estacionamento.getNome());
		System.out.println("\tVagas............: " + estacionamento.getVagas());
		System.out.println("\tVagas Ocupadas...: " + estacionamento.getVagaOcupadas());
		System.out.println("\tEstacionamento...: " + (estacionamento.isAberto() ? "Aberto" : "Fechado"));
	}

}
