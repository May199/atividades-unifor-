public class Pilha {
	
	int elementos[];
	int topo;
	
	public Pilha() {
		elementos = new int[5];
		topo = -1;
	}
	
	public void push(int e) {
		topo++;
		elementos[topo] = e;
	}
	
	public int pop() {
		int e;
		e = elementos[topo];
		topo--;
		return e;
	}
	
	public boolean isEmpty() {
		if(topo == - 1) return true;
		return false;
	}
	
	public boolean isFull() {
		return topo == 4;
	}
	
	public int top() {
		return elementos[topo];
	}
	
	public int show() {
		if (topo >= -1) {
			topo--;
		}
		return elementos[topo];
	}
	public int size() {
		int tam = 0;

		for(int i = 0; i < elementos.length; i++){
			tam += elementos[i];
		}

		return tam;
	}
	
}
