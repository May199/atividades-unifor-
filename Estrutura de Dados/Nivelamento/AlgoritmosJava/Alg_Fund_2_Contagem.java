package Nivelamento.AlgoritmosJava;

import java.util.Scanner;

public class Alg_Fund_2_Contagem {
    
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int contador = 0;

        System.out.println("Informe a quantidade notas:"); 
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Informe uma nota: ");
            int nota = s.nextInt();

            if(nota >= 50){
                contador += 1;
            }
        }
        System.out.println("Número de alunos que passaram no exame: "+contador);
    }
}
