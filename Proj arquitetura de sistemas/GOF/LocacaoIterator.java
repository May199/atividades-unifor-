
import java.util.Iterator;

public class LocacaoIterator implements Iterator<Veiculo>{

    private Veiculo[] vetorVeiculo;
    private int index;

    public LocacaoIterator(Veiculo[] vetorVeiculo){
        this.vetorVeiculo = vetorVeiculo;
        this.index = 0;
    }
    @Override
    public boolean hasNext(){
        if(vetorVeiculo == null || vetorVeiculo.length == index){
            return false;
        }
        return vetorVeiculo[index] != null;
    }

    @Override
    public Veiculo next(){
        Veiculo prox = vetorVeiculo[index];
        index++;

        return prox;
    }
    

}