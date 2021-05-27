import java.util.Scanner;
import classes.Pilha;

public class Expressao {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
    
        String n = s.next();

        if(!expression(n)){
            System.out.println("Não Válida!");
        }else{
            System.out.println("É Válida!");
        }

        s.close();
    }
    public static boolean expression(String n){
        Pilha pilha = new Pilha();

        for(int i = 0; i < n.length(); i++) {
            switch(n.charAt(i)){
                case '(':
                    pilha.push(')');
                    break;
                case '[':
                    pilha.push(']');
                    break;
                case '{':
                    pilha.push('}');
                    break;
                case ')':
                    if(pilha.isEmpty() || pilha.pop() != ')'){
                        return false;
                    }break;
                case ']':
                    if(pilha.isEmpty() || pilha.pop() != ']'){
                        return false;
                    }break;
                case '}':
                    if(pilha.isEmpty() || pilha.pop() != '}'){
                        return false;
                    }break;
            }
        }
        return pilha.isEmpty();
    }

}