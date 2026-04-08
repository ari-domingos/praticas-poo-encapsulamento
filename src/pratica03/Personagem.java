package pratica03;

public class Personagem {
	private int idPersonagem;
	private String nome;
	private int vida;
	private int mana;
	private boolean vivo;
	
	public Personagem(int idPersonagem, String nome) {
		this.idPersonagem = idPersonagem;
		this.nome = nome;
		this.vida = 100;
		this.mana = 50;
		this.vivo = true;
	}
	
	public boolean receberDano(int dano) {
		if (!vivo || dano <= 0) {
			return false;
		}
		
		vida -= dano;
		
		if (vida <= 0) {
			vida = 0;
			vivo = false;
		}
		
		return true;
	}
	
	public boolean curar(int cura) {
		if (!vivo || cura <= 0) {
			return false;
		}
		
		vida += cura;
		
		if (vida > 100) {
			vida = 100;
		}
		
		return true;
	}
	
	public boolean usarMagia(int custoMana) {
		if (!vivo || custoMana <= 0) {
			return false;
		}
		
		if (mana < custoMana) {
		    return false;
		}
		mana -= custoMana;
		
		return true;
	}
	
	public boolean recarregarMana(int mana) {
		if (!vivo || mana <= 0) {
			return false;
		}
		
		this.mana += mana;
		
		if (this.mana > 50) {
			this.mana = 50;
		}
		
		return true;		
	}
	
	public int getIdPersonagem() {
		return idPersonagem;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getVida() {
		return vida;
	}
	
	public int getMana() {
		return mana;		
	}
	
	public boolean isVivo() {
		return vivo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}