public class Carro extends Veiculo{
    private int num_portas;
    public Carro (String nome_veiculo, int qtd_disponivel, double qlm_rodados, int num_portas){
        super(nome_veiculo, qtd_disponivel, qlm_rodados);
        this.num_portas = num_portas;
    }

    public int getNum_portas(){return num_portas;}

    public void setNum_portas(int num_portas){this.num_portas = num_portas;}

    @Override
    public double calculaPrecoVenda(double preco_compra){
        double preco_venda = 0;
        if(getQlm_rodados() > 15000){
            preco_venda = preco_compra * 0.6;
        }else {
            preco_venda = preco_compra * 0.8;
        }
        return preco_venda;
    }
}