import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Fila {
	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();

		fila.add("Ceara");
		fila.add("Fortaleza");
		fila.add("Floresta");
		fila.add("Ferroviario");

		System.out.println(fila + "\n");
		
		removerCauda(fila);
		invertaFilaUsandoPilha(fila);
		inverterFilaUsandoApenasFila(fila);

	} 
	private static void inverterFilaUsandoApenasFila(Queue<String> fila) {
		Queue<String> aux = new LinkedList<String>();
		
		while(!fila.isEmpty()) {
			for (int i = 1; i < fila.size(); i++) {
				fila.add(fila.poll());
			}
			
			aux.add(fila.poll());
		}
		
		System.out.println(aux);
	}
	private static void invertaFilaUsandoPilha(Queue<String> fila) {
		Stack<String> pilha = new Stack<String>();
		
		while(!fila.isEmpty()) {
			pilha.add(fila.poll());
		}
		
		while(!pilha.isEmpty()) {
			fila.add(pilha.pop());
		}
		
		System.out.println(fila);
	}
	private static void removerCauda(Queue<String> fila) {
		for (int i = 1; i < fila.size(); i++) {
			fila.add(fila.poll());
		}
		fila.remove(fila.poll());

		System.out.println(fila);
	}
}
