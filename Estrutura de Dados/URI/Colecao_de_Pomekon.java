import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Colecao_de_Pomekon {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        Queue<String> pokemon = new PriorityQueue<String>();
        
        int n = s.nextInt();
        int captura = 151;

        s.nextLine();
        for(int i = 0; i < n; i++){
            pokemon.add(s.nextLine());
        }

        String aux1 = pokemon.poll();
        String aux2 = pokemon.poll();
        
        while (aux2 != null) {
            if (aux1.equals(aux2)) {
                aux2 = pokemon.poll();
            } else {
                captura--;
                aux1 = aux2;
                aux2 = pokemon.poll();
            }
        }
        captura--;
        
        System.out.printf("Falta(m) %d pomekon(s).%n", captura);
        
        s.close();
    }
 
}