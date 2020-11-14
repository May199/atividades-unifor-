package exercicio_usando_Interface.src;
public class IngressoVIP extends Ingresso implements Interface{

	public IngressoVIP(String nome, boolean meia, double preco, int lote) {
		super(nome, meia, preco, lote);	
	}

	@Override
	public double calculaReembolso() {
		double valorReembolso = 0;
		if (!meia && lote == 1)	{
			valorReembolso = preco * 0.1;
		} else {
			valorReembolso = preco * 0.06;
		}
		return valorReembolso;
	}

}
