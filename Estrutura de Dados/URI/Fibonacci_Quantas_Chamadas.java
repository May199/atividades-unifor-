import java.io.IOException;
import java.util.Scanner;

public class Fibonacci_Quantas_Chamadas {
    
    private static int calls = 0;
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int casos = s.nextInt();
        int resultado, n;
        
        for(int i = 0; i < casos; i++){
            calls = 0; 
            n = s.nextInt();
            resultado = Fibonacci(n);
            
            System.out.println("fib("+n+ ") = " + (calls - 1) + " calls = " +resultado);
        }
        s.close();
    }
    private static int Fibonacci(int n){
        calls++;
        if(n < 2){
            return n;
        }
        else{
            return (Fibonacci(n -1) + Fibonacci(n -2));
        }
    }
}
