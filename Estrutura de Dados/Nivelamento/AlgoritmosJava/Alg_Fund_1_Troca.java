import java.util.Scanner;

public class Alg_Fund_1_Troca {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        String aux = ""; 

        System.out.println("Informe valor para a variável A:");
        String a = s.next();

        System.out.println("Informe valor para a variável B:");
        String b = s.next();

        aux = a;
        a = b;
        b = aux;

        System.out.println("Novo valor da variável A: "+a);
        System.out.println("Novo valor da variável B:"+b);
    }
}
