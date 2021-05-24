public class Inverte {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		Pilha pilhaAux1 = new Pilha();
		Pilha pilhaAux2 = new Pilha();
		
		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		pilha.push(40);
		pilha.push(50);
		
		while(!pilha.isEmpty()) {
			pilhaAux1.push(pilha.pop());
		}
		
		while(!pilhaAux1.isEmpty()) {
			pilhaAux2.push(pilhaAux1.pop());
		}
		
		while(!pilhaAux2.isEmpty()) {
			pilha.push(pilhaAux2.pop());
		}
	}

}
