public class Locacao implements Info{

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