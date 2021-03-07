//Algoritmo de cadastro de pessoas: nome, idade, peso. Guarda em vetores, mostra na tela e mostra maior e menor dos vetores númericos inteiro e real.
// peso = at1 idade = at2

import java.util.Scanner;

public class cadastro {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas que deseja cadastrar: ");
        int n = s.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] peso = new double[n];
        int media = 0;
        int totalIdade = 0;

        for (int i = 0; i < n; i++)	{
            System.out.println("Digite o nome da "+i+"°"+" pessoa");
            nome[i] = s.next();
            System.out.println("Digite a idade da "+i+"°"+" pessoa");
            idade[i] = s.nextInt();
            System.out.println("Digite o peso da "+i+"°"+" pessoa");
            peso[i] = s.nextDouble();


        }

        for (int i = 0; i < n; i++){
            System.out.println("Dados de pessoas cadastradas: "+nome[i]+" tem "+idade[i]+" anos e pesa "+peso[i]+"Kg.");
        }
        //buscando maior valor do atribundo 1 'at1'
        double maiorPeso = peso[0];
        for (int i = 0; i < n; i++)	{
            if (peso[i] > maiorPeso)	{
                maiorPeso = peso[i];
            }
        }

        //Buscando média do atributo 2 'at2'
        for (int i = 0; i < n; i++){
            totalIdade += idade[i];
            media = totalIdade/n;
        }

        System.out.println("O maior peso cadastrado foi: "+maiorPeso);
        System.out.println("A média de idade informada é: "+media);
    }
}