package Nivelamento.AlgoritmosJava;

import java.util.Scanner;
import java.lang.Math;
public class Alg_Fund_8_Base {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Informe um número inteiro decimal:");
        int n = s.nextInt();

        double q = n;
        double[] r = new double[100];
        int i = 0;

        while (q > 0){
            r[i] = q % 2;
            i++;
            q = Math.floor(q / 2);
        }
        System.out.println("Número: "+n+" na base binária: ");

        while (i > 0){
            i--;
            System.out.printf("%.0f", r[i]);
        }
    }    
}
