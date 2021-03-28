import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);


        Veiculo[] vetorVeiculo = new Veiculo[5];

        vetorVeiculo[0] = new Moto("Moto 1", 3, 5000, true);
        vetorVeiculo[1] = new Carro("Carro 1", 3, 10000, 4);
        vetorVeiculo[2] = new Moto("Moto 2", 3, 4000, false);
        vetorVeiculo[3] = new Carro("Carro 2", 3, 15000, 2);
        vetorVeiculo[4] = new Moto("Moto 3", 3, 6000, true);
        
        Locacao locacao = new Locacao(vetorVeiculo);

        double menorQLM = locacao.getVetorVeiculo()[0].getQlm_rodados();
        int qtdMotos = 0;
    
        for(Veiculo veiculo : locacao){
            if(veiculo.getQlm_rodados() < menorQLM){
                menorQLM = veiculo.getQlm_rodados();
            }
            if(veiculo instanceof Moto){
                qtdMotos++;
            }
        }
        System.out.println(menorQLM);
        System.out.println(qtdMotos);

        s.close();
    }
    
}
