package pratica01;

public class AppContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria cb1 = new ContaBancaria(1, "Arielle");
		
		mostrarContaBancaria(cb1);
	
		cb1.ativarDesativar();
		mostrarContaBancaria(cb1);
		
		cb1.depositar(500);
		mostrarContaBancaria(cb1);
		
		System.out.println(cb1.depositar(-100) ? "Saldo..........: " + cb1.getSaldo() : "\nValor inválido");
		
		cb1.sacar(200);
		mostrarContaBancaria(cb1);
		
		System.out.println(cb1.sacar(1000) ? "Saldo..........: " + cb1.getSaldo() : "\nSaldo insuficiente");
		
		cb1.ativarDesativar();
		mostrarContaBancaria(cb1);
		
		cb1.depositar(100);
		mostrarContaBancaria(cb1);
	}
	
	public static void mostrarContaBancaria(ContaBancaria contaBancaria) {
		System.out.println();
		System.out.println("Número da Conta: " + contaBancaria.getNumeroConta());
		System.out.println("Titular........: " + contaBancaria.getTitular());
		System.out.println("Saldo..........: " + (contaBancaria.isAtiva() ? contaBancaria.getSaldo() : "Conta desativada"));
		System.out.println("Ativa..........: " + (contaBancaria.isAtiva() ? "Conta ativada" : "Conta desativada"));
	}

}
