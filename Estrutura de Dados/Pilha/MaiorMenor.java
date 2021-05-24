import java.util.Scanner;

public class MaiorMenor {

	public static void eliminarMaiorMenor(Pilha pilha) { 
	    int maior;
	    int menor;
	    int valor;
	    
	    Pilha aux = new Pilha();

	    maior = menor = pilha.top();
	    while (!pilha.isEmpty()) {
	        valor = pilha.pop();
	        if (valor > maior)
	            maior = valor;
	        else if (valor < menor)
	            menor = valor;
	        aux.push(valor);
	    }

	    while (!aux.isEmpty()) {
	        valor = aux.pop();
	        if (valor != maior && valor != menor)
	            pilha.push(valor);
	    }
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Pilha pilha = new Pilha();
		
		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		pilha.push(40);
		pilha.push(50);
		
		eliminarMaiorMenor(pilha);
		
		while(!pilha.isEmpty()) {
			System.out.println(pilha.pop());
		}
		
		entrada.close();
	}

}
