import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Fonte: https://www.devmedia.com.br/diferencas-entre-treeset-hashset-e-linkedhashset-em-java/29077
        // O TreeSet implementa um algoritmo conhecido por red-black tree ou árvore rubro-negra. 
        
        TreeSet<Integer> pilha = new TreeSet<Integer>();
        Scanner s = new Scanner(System.in);

        int n, q, casos = s.nextInt();
        
       
        while(casos --> 0){
            q = s.nextInt();
            
            switch(q){
                case 1:
                    pilha.add(n = s.nextInt());
                    break;
                case 2:
                    pilha.remove(n = s.nextInt());
                    break;
                case 3:
                    System.out.println(pilha.first());
                    break;
            }
        }
        
        s.close();
    }
}
