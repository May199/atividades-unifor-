## Atividades Unifor Padrões GOF

> Os padrões utilizado foram o Templade Method, Strategy e Iterator

> Estrutura da classe Veiculo utilizado os padrões GOF. Os mesmos padrões podem ser utilizado em outras classes do projeto. 

### Exemplo Iterator

``` Java

public interface Iterator {
    int qtdMotos(); 
    double menorQLM(); 
}
public class Locacao implements Iterator{

    public Veiculo[] vetorVeiculo;


    public Locacao(Veiculo[] vetorVeiculo){
        this.vetorVeiculo = vetorVeiculo;
    }
    //Padrão Template onde aguarda de outra classe, no caso a classe principal main a lista de veiculos
    public Veiculo[] getVetorVeiculo(){
        return vetorVeiculo;
    }
    public void setVetorVeiculo(Veiculo[] vetorVeiculo){
        this.vetorVeiculo = vetorVeiculo;
    }

    //Padrão Iterator onde as classes menorQLM() e qtdMotos() da classe Iterator irão percorrer pelo objeto Veiculo para saber a menor quilometragem e quantas motos, e retorna essa informação pela variavel aux implementada em ambas as classes.

    @Override
    public double menorQLM(){
        double aux = vetorVeiculo[0].getQlm_rodados();

        for (int i = 0; i < vetorVeiculo.length; i++){
            if(vetorVeiculo[i].getQlm_rodados() < aux){
                aux = vetorVeiculo[i].getQlm_rodados();
            }
        }
        return aux;
    }
    @Override
    public int qtdMotos(){
        int aux = 0;
        
        for (int i = 0; i < vetorVeiculo.length; i++){
            if (vetorVeiculo[i] instanceof Moto){
                aux++;
            }
        }return aux;
    }

}
```

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
### classe Principal do projeto que controla as entradas

``` Java
    import java.util.Scanner;

    public class Principal {
        public static void main(String[] args){
            Scanner s = new Scanner(System.in);



            System.out.println("Informe a quantidade de veiculos: ");
            int qtd = s.nextInt();

            Veiculo[] vetorVeiculo = new Veiculo[qtd];

            for(int i = 0; i < vetorVeiculo.length; i++){
                double rando = Math.random();

                if(rando < 0.5){
                    System.out.println("Informe o nome do veiculo:  ");
                    String nome_veiculo = s.next();
                    System.out.println("Informe quantos estão disponíveis: ");
                    int qtd_disponivel = s.nextInt();
                    System.out.println("Informe a quilometragem: ");
                    double qlm_rodados = s.nextDouble();
                    System.out.println("Informe a quantidade de portas: ");
                    int num_portas = s.nextInt();
                    vetorVeiculo[i] = new Carro(nome_veiculo, qtd_disponivel, qlm_rodados, num_portas);

                }else {
                    System.out.println("Informe o nome do veiculo:  ");
                    String nome_veiculo = s.next();
                    System.out.println("Informe quantos estão disponíveis: ");
                    int qtd_disponivel = s.nextInt();
                    System.out.println("Informe a quilometragem: ");
                    double qlm_rodados = s.nextDouble();
                    System.out.println("É espotiva? True/False");
                    boolean tipo_moto = s.nextBoolean();
                    vetorVeiculo[i] = new Moto(nome_veiculo, qtd_disponivel, qlm_rodados, tipo_moto);
                }
            }

            Locacao locacao = new Locacao(vetorVeiculo);
            System.out.println(locacao.menorQLM());
            System.out.println(locacao.qtdMotos());
            s.close();
        }
    }

```
### Iterator
>Percorrer seqüencialmente os itens de um objeto agregado, sem expor sua representação interna aos clientes. 
### Templade Method 
>Definir o esqueleto de um algoritmodentro de uma operaçãoem uma classe X, deixando alguns passos para serem preenchidos pelas subclasses de X. Permite que subclasses redefinam certos passos de um algoritmo sem alterar a estrutura desse algoritmo.

### Strategy
>Definir   umafamília   de   algoritmos,encapsularcada um, e fazê-losintercambiáveis. Essepadrão   permite   que   o   algoritmovarieindependentementedos clientes que o utilizam.