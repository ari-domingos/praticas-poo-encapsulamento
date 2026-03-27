package pratica01;

public class ContaBancaria {

	private int numeroConta;
	private String titular;
	private double saldo;
	private boolean ativa;
	
	public ContaBancaria(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}
	
	public int getNumeroConta() {
		return this.numeroConta;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public boolean isAtiva() {
		return this.ativa;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public boolean ativarDesativar() {
		this.ativa = !ativa;
		
		return this.ativa;
	}
	
	public boolean depositar(double valor) {
		if (this.ativa && valor > 0) {
			this.saldo += valor;	
			return true;
		}
		
		return false;
	}
	
	public boolean sacar(double valor) {
		if (this.ativa && valor > 0 && this.saldo >= valor) {
			this.saldo -= valor;
			return true;			
		}
		
		return false;					
	}
}
