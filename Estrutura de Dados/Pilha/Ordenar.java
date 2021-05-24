public class Ordenar {

	public static void main(String[] args) { 
		int menor;
		int valor;
		
		Pilha pilha = new Pilha();
		Pilha pilhaAux1 = new Pilha();
		Pilha pilhaAux2 = new Pilha();
		
		pilha.push(40);
		pilha.push(12);
		pilha.push(50);
		pilha.push(20);
		pilha.push(30);
		
		while(!pilha.isEmpty()) {
			menor = pilha.top();
			
			while(!pilha.isEmpty()) {
				valor = pilha.pop();
				if(valor < menor) {
					menor = valor;
					pilhaAux1.push(valor);
				}
			}
			
			while(!pilhaAux1.isEmpty()) {
				valor = pilhaAux1.pop();
				if(valor==menor) {
					pilhaAux2.push(valor);
				} else pilha.push(valor);
			}
		}

		while(!pilhaAux2.isEmpty()) {
			pilha.push(pilhaAux2.pop());
		}
		
		//System.out.println(pilha.top());
		
		while(pilha.isEmpty() == false) {
			System.out.println(pilha.top());
			//pilha.pop();
		}
		
	}
}
