import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        String nome; 
        String matriz[][] = new String[n][17];

        s.nextLine();

        for (int i = 0; i < n; i++) {
            nome = s.nextLine();
            int len = nome.length();

            for (int j = 0; j < matriz.length; j++) {
                if (matriz[j][len - 2] == null) {
                    matriz[j][len - 2] = nome;
                    break;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            ArrayList<String> listaNome = new ArrayList<String>();

            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != null) {
                    listaNome.add(matriz[i][j]);
                }
            }
            System.out.println(String.join(",", listaNome));
            
        }

        s.close();
    }
}