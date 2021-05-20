import java.io.IOException;
import java.util.Scanner;

public class Fila_do_Supermercado {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = s.nextInt();
        }
        int[] aux = new int[n];
        int t=0;

        while(t<m){
            if(t<n){
                aux[t]=b[t]*a[t];
                t++;
            }else{
                int index = aux[0];
                int z = 0;

                for(int i=0; i <n; i++){
                    if(index>aux[i]){
                        index = aux[i];
                        z=i;
                    }
                }
                aux[z] += b[t]*a[z];
                z=0;
                t++;
            }
        }
        int index = aux[0];
        for(int i=0; i<n; i++){
            if(index < aux[i]){
                index = aux[i];
            }
        }
        System.out.println(index);

        s.close();
    }
 
}