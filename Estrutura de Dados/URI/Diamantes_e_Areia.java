import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;
public class Diamantes_e_Areia{
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        for(int i = 0; i < n; i++){
            String x = s.next();
    
            if(x.length() > 1000){
                break;
            }
            System.out.println(countingDiamonds(x));
        }
        s.close();
    }
    public static int countingDiamonds(String x){
        Stack<Character> pilha = new Stack<Character>();

        int qtdDiamond = 0;
 
        for(int i = 0; i < x.length(); i++){
            if(x.charAt(i) == '<'){
                pilha.push(x.charAt(i));
            }else{
                if(x.charAt(i) == '>'){
                    if(!pilha.isEmpty()){
                        pilha.pop(); 
                        qtdDiamond++;
                    }
                }
            }
        }
        return qtdDiamond;
    }
}