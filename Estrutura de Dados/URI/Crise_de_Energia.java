import java.io.IOException;
import java.util.Scanner;

 public class Crise_de_Energia {
 
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        
        int quantidadeRegioes;
        int proximaRegiao;

        while (true) {
            quantidadeRegioes = s.nextInt();
            if(quantidadeRegioes == 0) {
                break;
            }
            proximaRegiao = 1;
            while (true) {
                if(Electrical(quantidadeRegioes, proximaRegiao) != 11){
                    proximaRegiao ++;
                }else{
                    break;
                }
            }
            System.out.println(proximaRegiao);
        }        
    }
    
    public static int Electrical(int n, int m){
        int retorna = 0;

        for(int i=1; i<n; i++){
            retorna = (retorna + m) % i;
        }
        return retorna;
    }
}