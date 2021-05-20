import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila_do_Recreio { 
    public static void main(String[] args) throws IOException {
      Scanner s = new Scanner(System.in);

      int n, numAlunos, aux;

      n = s.nextInt();

      while(n-->0){
          numAlunos = s.nextInt();

          Queue<Integer> filaAnt = new LinkedList<>(); 
          Queue<Integer> filaDep = new LinkedList<>(); 

          for(int i = 0; i < numAlunos; i++){
              filaAnt.add(s.nextInt());
              filaDep.addAll(filaAnt);
          }aux = 0;
          for(int j = 0; j < filaDep.size(); j++){
              if(filaAnt.peek() == filaDep.peek()){
                  aux++;
              }
          }
          System.out.println(aux);    
      }
      s.close();
    }
}