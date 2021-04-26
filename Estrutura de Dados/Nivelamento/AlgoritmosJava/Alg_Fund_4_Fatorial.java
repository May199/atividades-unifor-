package Nivelamento.AlgoritmosJava;

import java.util.Scanner;

public class Alg_Fund_4_Fatorial {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int fatorial = 1;

        System.out.println("Informe um número: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++){
            fatorial *= i;
        }
        System.out.println("O fatorial de "+n+" é: "+fatorial);
    }
}
