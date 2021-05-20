import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila { 
    public static void main(String[] args) throws IOException {
       Scanner s = new Scanner(System.in);
       Queue<Integer> fila = new LinkedList<>();
       Queue<Integer> aux = new LinkedList<>();

       int nPessoas = s.nextInt();

       for (int i = 0; i < nPessoas; i++) {
           int id = s.nextInt();
           fila.add(id);
       }
       
       int qtdRemovidos = s.nextInt();
       
       for (int i = 0; i < qtdRemovidos; i++) {
           int idRemovidos = s.nextInt();
           aux.add(idRemovidos);
       }
       
       while(!aux.isEmpty()) {
           int tam = fila.size();
           for(int i = 0; i < tam; i++) {
               if(fila.peek() == aux.peek()) {
                   fila.poll();
                   aux.poll();
               } else if(fila.peek() != aux.peek()) {
                   fila.add(fila.poll());
               }
           }
       }
       for(Integer f : fila) {
           System.out.printf(f + " "); 
       }

       s.close();
    }
}