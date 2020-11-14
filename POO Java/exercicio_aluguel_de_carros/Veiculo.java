package AV2_POO;

public abstract class Veiculo{
    private String nome_veiculo;
    private int qtd_disponivel;
    private double qlm_rodados;

    public Veiculo(String nome_veiculo, int qtd_disponivel, double qlm_rodados){
        this.nome_veiculo = nome_veiculo;
        this.qtd_disponivel = qtd_disponivel;
        this.qlm_rodados = qlm_rodados;
    }

    public String getNome_veiculo() {return nome_veiculo;}

    public void setNome_veiculo(String nome_veiculo) {this.nome_veiculo = nome_veiculo;}

    public int getQtd_disponivel() {return qtd_disponivel;}

    public void setQtd_disponivel(int qtd_disponivel) {this.qtd_disponivel = qtd_disponivel;}

    public double getQlm_rodados() {return qlm_rodados;}

    public void setQlm_rodados(double qlm_rodados) {this.qlm_rodados = qlm_rodados;}

    public abstract double calculaPrecoVenda(double preco_compra);
}

