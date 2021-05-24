import java.util.Scanner;

public class Expressao {
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		
		String exp = s.nextLine();
		
		if(!expressao(exp)){
			System.out.println("N � v�lida");
		}else{ 
			System.out.println("� v�lida");
		}
		s.close();

	}
	public static boolean expressao(String n) {
		Pilha pilha = new Pilha();
		
		for (int i = 0; i < n.length(); i++) {
			switch(n.charAt(i)) {
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
					if(pilha.isEmpty() || pilha.pop() != ')')
						return false;
					break;
				case ']':
					if(pilha.isEmpty() || pilha.pop() != ']')
						return false;
					break;
				case '}':
					if(pilha.isEmpty() || pilha.pop() != '}')
						return false;
					break;
			}
		}
		return pilha.isEmpty();
	}
}
