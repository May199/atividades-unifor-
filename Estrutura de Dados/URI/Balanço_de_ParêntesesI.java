import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Balanço_de_ParêntesesI {

    public static void main(String[] args) throws IOException {
        // Lê texto de um fluxo de entrada de caracteres, 
        // armazenando caracteres em buffer para fornecer uma leitura eficiente de caracteres, matrizes e linhas.
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));

        String n;
        
        while ((n = s.readLine()) != null){
            // Se parametersCheck for igual a true com a entrada n está correto
            if(parametersCheck(n))
                System.out.println("correct");
            else
                System.out.println("incorrect");

            if(n.length() >= 10000){
                break;
            }
        }
 
    }
    public static boolean parametersCheck(String n){
        
        int abertoParameters = 0;
        boolean error = false;

        for (int i = 0; i < n.length(); i++){

            // convertendo string n para char  
           char c = n.charAt(i);
           
            // Se existir um parenteses fechado e não existir um aberto tá errado, do contrario também tá errado.     
            if(c == ')'){
                if(abertoParameters == 0){
                    error = true;
                    break;
                }
                abertoParameters--;
            }
            if(c == '('){
                abertoParameters++;
            }

        }
        // se for igual a true ou parâmetros abertos tá errado
        if(error || abertoParameters > 0)
            return false;
        else
            return true;
    }
 
}