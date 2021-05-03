import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Infixa_para_Posfixa {
    public static void main(String[] args) throws IOException {
        
        Stack<Character> pilha = new Stack<Character>();
        Stack<Character> output = new Stack<Character>();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String texto;

        for (int i = 0; i < n; i++) {
            texto = s.next();

            for (int j = 0; j < texto.length(); j++){
                if(texto.charAt(j) == '+' || texto.charAt(j) == '-' || texto.charAt(j) == '*' || 
                    texto.charAt(j) == '/' || texto.charAt(j) == '^'){
                        while(!pilha.empty() && priority(pilha.peek()) >= priority(texto.charAt(j))){
                            output.push(pilha.peek());
                            pilha.pop();
                        }
                        pilha.push(texto.charAt(j));
                        
                    }else if(texto.charAt(j) == '('){
                        pilha.push(texto.charAt(j));
                    }else if(texto.charAt(j) == ')'){
                        while(!pilha.peek().equals('(')){
                            output.push(pilha.pop());
                        }
                        pilha.pop();
                    }else{
                        output.push(texto.charAt(j));
                    }
            }
            while(!pilha.empty()){
                output.push(pilha.pop());
            }
            for(int k = 0; k < output.size(); k++){
                System.out.print(output.elementAt(k));
            }
            System.out.println();

            while(!output.empty()){
                output.pop();
            }
        }
        s.close();
    }
    public static int priority(int i){
        
        char preced1 = '+';
        char preced2 = '-';
        char preced3 = '/';
        char preced4 = '*';
        char preced5 = '^';

        if(i == preced1 || i == preced2)
            return 1;
        else if(i == preced3 || i == preced4)
            return 2;
        else if(i == preced5)
            return 3;
        else
            return -1;

    }
}