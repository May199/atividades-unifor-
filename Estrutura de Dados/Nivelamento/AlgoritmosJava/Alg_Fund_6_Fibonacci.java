package Nivelamento.AlgoritmosJava;

import java.util.Scanner;
public class Alg_Fund_6_Fibonacci {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o número de termos da sequência:");
        int n = s.nextInt();
        int sucessor, anterior = 0, atual = 1; 

        for (int i = 1; i <= n; i++){
            if (i == n){
                System.out.println(anterior);
            } else {
                System.out.print(anterior+" ");
                sucessor = anterior+atual;
                anterior = atual;
                atual = sucessor;
            }
                 
        }

    }  
}