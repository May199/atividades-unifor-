import classes.Pilha;
import java.util.Scanner;

// Palíndromo é uma palavra, frase ou número que permanece igual quando lida de trás para diante.
// EX: LOL

public class Palindrome {
    public static void main(String[] args){
       Pilha pilha = new Pilha();
	   Pilha aux = new Pilha();

        Scanner s = new Scanner(System.in);
		
		String n = s.nextLine();
		
		for (int i = 0; i < (n.length()+1)/2; i++) {
			pilha.push(n.charAt(i));
			aux.push(n.charAt(n.length() - (i+1)));
		}
		
		if(pilha.pop() != aux.pop()) {
			System.out.println("Não é palíndromo");
		} else{
            System.out.println("É palíndromo");
        } 
		

        s.close();
    }
}
