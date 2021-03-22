import java.io.IOException;
import java.util.Scanner;
 

public class Figurinhas {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        int F1, F2, saida=1;

        for(int i = 0; i < N; i++) {
            F1 = s.nextInt();
            F2 = s.nextInt(); 
            if (F1 > F2) {
                saida = mdc(F1, F2);
            } else {
                saida = mdc(F2, F1);
            }
            System.out.println(saida);
        }
    }
  public static int mdc(int dividendo, int divisor) {
    if ((dividendo % divisor == 0)) {
        return divisor;
    } else {
        return mdc(divisor, (dividendo % divisor));
    }
   }

 
}