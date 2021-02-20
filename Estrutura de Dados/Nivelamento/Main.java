import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int fat = 1;
        int n = s.nextInt(); 
        int i = n; 

        while(i >= 1){
            fat *= i;
            i -= 1;
        }
        System.out.println(fat);
    }  
}