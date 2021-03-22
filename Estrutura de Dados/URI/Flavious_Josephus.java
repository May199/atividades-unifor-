import java.io.IOException;
import java.util.Scanner;

public class Flavious_Josephus {
 
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);     

        int casos, instancias, soldados, pulos;

        casos = s.nextInt();
        instancias = 0;

        for(int i = 1; i <= casos; i++) {
            instancias ++;
            soldados = s.nextInt();
            pulos = s.nextInt();

            System.out.printf("Case %d: %d\n", instancias, Flavious(soldados, pulos) + 1);
        }
    }
    private static int Flavious(int soldados, int pulos){
        int retorno = 0;
        for(int i = 2; i <= soldados; i++){
            retorno = (retorno + pulos) % i;
        }
        return retorno;
    } 
 
}