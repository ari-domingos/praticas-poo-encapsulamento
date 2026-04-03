package pratica02;

public class Estacionamento {
	private int idEstacionamento;
	private String nome;
	private int vagas;
	private int vagaOcupadas;
	private boolean aberto;
	
	public Estacionamento(int idEstacionamento, String nome, int vagas) {
		this.idEstacionamento = idEstacionamento;
		this.nome = nome;
		this.vagas = vagas;
	}
	
	public boolean abrirEstacionamento() {
		if(aberto) {
			return false;
		}
		
		this.aberto = true;
		return true;
	}
	
	public boolean fecharEstacionamento() {
		if(!aberto) {
			return false;
		}
		
		this.aberto = false;
		return true;			
	}
	
	public boolean entrarVeiculo() {
		if (aberto && vagaOcupadas < vagas) {
			vagaOcupadas++;
			return true;
		}
		
		return false;
	}
	
	public boolean sairVeiculo() {
		if (aberto && vagaOcupadas > 0) {
			vagaOcupadas--;
			
			return true;
		}
		
		return false;
	}
	
	public int getIdEstacionamento() {
		return this.idEstacionamento;
	}
	
	public String getNome() {
		return this.nome;
	}

	public int getVagas() {
		return vagas;
	}

	public int getVagaOcupadas() {
		return vagaOcupadas;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
