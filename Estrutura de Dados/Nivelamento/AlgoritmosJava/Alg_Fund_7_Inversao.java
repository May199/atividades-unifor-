import java.util.Scanner;
import java.lang.Math; 

public class Alg_Fund_7_Inversao {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Informe um número inteiro positivo:");
        int numero = s.nextInt();
        double invertido = 0, digito, q = numero;

        while (q > 0){
            digito = q % 10;
            invertido = invertido * 10 + digito;
            q = Math.floor(q / 10);
        }
        System.out.println("Número original: " + numero);
        System.out.println("Número invertido: "+ invertido);
    }
}
