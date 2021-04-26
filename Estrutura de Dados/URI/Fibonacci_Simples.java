import java.io.IOException;
import java.util.Scanner;

public class Fibonacci_Simples {
    public static void main(String[] args) throws IOException {
        Scanner s =new Scanner(System.in);

        int n1=0, n2=1, n3, i, n; 

        n = s.nextInt();
        
        if(n > 0) {
            
            for(i=2; i<n; ++i){
                n3=n1+n2;
                n1=n2;
                n2=n3;
                
                System.out.println(" "+n3);
            }
            System.out.println(n1+" "+n2);
        }
    }
}