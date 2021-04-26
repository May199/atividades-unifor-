package Nivelamento;

import java.util.Scanner;

public class Fibonacci_Recursivo {
  public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
    
    int n = s.nextInt();
    
    for (int i = 0; i <= n; i++) {
        System.out.println("Fibonacci(" + i + ") = " + fibonacci(i));
    }
  }
    
  public static int fibonacci(int n) {

    if (n == 0 || n == 1 )
        return n;
        
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}