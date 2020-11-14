package exercicio_usando_Interface.src;
public class IngressoComum extends Ingresso implements Interface {

	public IngressoComum(String nome, boolean meia, double preco, int lote) {
		super(nome, meia, preco, lote);
	}

	@Override
	public double calculaReembolso() {
		double valorReembolso = 0;
		if (!meia || lote == 1)	{
			valorReembolso = preco * 0.05;
		} else {
			valorReembolso = preco * 0.03;
		}
		return valorReembolso;
	}

}
