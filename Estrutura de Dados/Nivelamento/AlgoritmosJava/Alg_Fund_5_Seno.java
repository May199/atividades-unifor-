package Nivelamento.AlgoritmosJava;

import java.util.Scanner;
import java.lang.Math; 
public class Alg_Fund_5_Seno {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o valor de x:");
        double x = s.nextDouble();
        System.out.println("Informe o número de termos da série:");
        double n = s.nextDouble();
        double termo, sinal = 1, j=1, seno = 0;

        for (double i = 1; i <= n; i++){

            termo = Math.pow(x, j)/(double) fatorial(j);
            seno = seno + sinal * termo;
            sinal = -1 * sinal;
            j = j + 2;
        }
        System.out.printf("Seno = %.2f", seno);

    }

    public static Object fatorial(double n) {
        double fat = 1;

        for (double i = n; i >= 1; i--){
            fat = fat * i;
        }
        return fat;
    }
}
