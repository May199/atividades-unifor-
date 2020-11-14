package exercicio_usando_Interface.src;
public abstract class Ingresso {
	
	private String nome;
	protected boolean meia;
	protected double preco;
	protected int lote;
	
	public Ingresso(String nome, boolean meia, double preco, int lote)	{
		this.nome = nome;
		this.meia = meia;
		this.preco = preco;
		this.lote = lote;
	}

	public String getNome() {
		return nome;
	}

	public boolean isMeia() {
		return meia;
	}

	public double getPreco() {
		return preco;
	}

	public int getLote() {
		return lote;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMeia(boolean meia) {
		this.meia = meia;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}
	
	public abstract double calculaReembolso();


	public void mostra() {
		System.out.println("Nome: " + nome);
		System.out.println("Meia? " + meia);
		System.out.println("Pre�o: "+ preco);
		System.out.println("Lote: " + lote);
	}
	
}
