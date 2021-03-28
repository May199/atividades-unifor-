import java.util.Iterator;
// Exemplo de implementação Iterator

public class Locacao implements Iterable<Veiculo>{

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

    //Padrão Iterator onde as classes menorQLM() e qtdMotos() da classe Iterator irão percorrer pelo objeto para saber o menor
    //quilometro e quantas motos e retorna essa informação pela variavel aux implementada em ambas as classes.

    @Override
    public Iterator<Veiculo> iterator(){
        return new LocacaoIterator(this.vetorVeiculo);
    }

}