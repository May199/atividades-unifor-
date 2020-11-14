package AV2_POO;
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
