import classes.Pilha;

// Não funcionou :/ fiquei sem ideias, tentei quase tudo. 
public class Ordenar {
    public static void main(String[] args){
        Pilha pilha = new Pilha();

        pilha.push(40);
		pilha.push(12);
		pilha.push(30);
		pilha.push(50);
		pilha.push(20);

        
        int[] aux = new int[pilha.size()];
        for(int i = pilha.pop(); i > -1; i--){
            aux[i] += pilha.elementos[i];
        }

        for(int j = 0; j < aux.length; j++) {
            int temp;
            for(int l = j+1; l < aux.length; l++) {
                if(aux[j] > aux[l]) {
                    temp = aux[j];
                    aux[j] = aux[l];
                    aux[l] = temp;
                }
            }
        }

        for(int y : aux) {
            pilha.push(y);
        }

        for(int i = 0; i < pilha.size(); i++){
            System.out.println(pilha.elementos[i]);   
        }

    }
}
