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

    @Override
    public Iterator<Veiculo> iterator(){
        return new LocacaoIterator(this.vetorVeiculo);
    }

}