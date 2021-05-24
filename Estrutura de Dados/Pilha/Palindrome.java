import java.util.Scanner; 

public class Palindrome {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String palavra = entrada.nextLine();
		
		Pilha pilha = new Pilha();
		Pilha pilha2 = new Pilha();
		
		
		for (int i = 0; i < (palavra.length()+1)/2; i++) {
			pilha.push(palavra.charAt(i));
			pilha2.push(palavra.charAt(palavra.length() - (i+1)));
		}
		
		while(!pilha.isEmpty()) {
			if(pilha.pop() != pilha2.pop()) {
				System.out.println("Não é palíndrome");
			} else System.out.println("é palíndrome");
		}
	}

}
