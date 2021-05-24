import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Tabelas_Hash {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();	  
		int aux;

        for(int i = 0; i < n; i++){

            int m = s.nextInt(); 
            int c = s.nextInt(); 
            int[] dados = new int[c];

            String[] keys = new String[m];
            Arrays.fill(keys, "");
            
            for (int j = 0; j < c; j++){
                dados[j] = s.nextInt();
            }
            
            for (int x : dados) {
                aux = x % m;
                keys[aux] += " -> " + x;
            }
            
            for (int l = 0; l < m; l++){ 
                System.out.println(l + keys[l] + " -> \\");
            }
            if (i < n-1){
                System.out.println();
            } 
        }
		s.close();
	}
}