package Nivelamento.AlgoritmosJava;

import java.util.Scanner;

public class Alg_Fund_3_Somatório {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int soma = 0;
        
        System.out.println("Informe a quantidade de números: ");
        int n = s.nextInt();

        System.out.println("Informe um número: ");
        int num = s.nextInt();

        for(int i = 0; i <= n; i++){
            soma += num; 
        }
        System.out.println("A soma dos números "+n+" e o número "+num+" é: "+soma);
    }
}
