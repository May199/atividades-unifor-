## Atividades Unifor Padrões GOF

> Os padrões utilizado foram o Templade Method e o Strategy
> Estrutura da classe Veiculo utilizado os padrões GOF Templade Method e o Strategy. Os mesmos padrões são utilizado em >outras classes do projeto. 

``` Java
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

```

### Templade Method 
>Definir o esqueleto de um algoritmodentro de uma operaçãoem uma classe X, deixando alguns passos para serem preenchidos >pelas subclasses de X. Permite que subclasses redefinam certos passos de um algoritmo sem alterar a estrutura desse >algoritmo.

### Strategy
>Definir   umafamília   de   algoritmos,encapsularcada um, e fazê-losintercambiáveis. Essepadrão   permite   que   o   >algoritmovarieindependentementedos clientes que o utilizam.