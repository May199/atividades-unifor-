public class Moto extends Veiculo{
    private boolean tipo_moto;
    public Moto (String nome_veiculo, int qtd_disponivel, double qlm_rodados, boolean tipo_moto){
        super(nome_veiculo, qtd_disponivel, qlm_rodados);
        this.tipo_moto = tipo_moto;
    }
    //Padrão Template onde aguarda de outra classe, no caso espera que a classe principal main retorne o tipo 
    public boolean isTipo_moto() {
        return tipo_moto;
    }

    public void setTipo_moto(boolean tipo_moto) {

        this.tipo_moto = tipo_moto;
    }
    @Override
    public double calculaPrecoVenda(double preco_compra){
        double preco_venda = 0;
        if(getQlm_rodados() > 8000){
            preco_venda = preco_compra * 0.7;
        }else {
            preco_venda = preco_compra * 0.9;
        }
        return preco_venda;
    }
}