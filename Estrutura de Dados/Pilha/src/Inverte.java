import classes.Pilha;
public class Inverte {
    public static void main(String[] args){
        Pilha pilha = new Pilha();
        Pilha aux1 = new Pilha();
        Pilha aux2 = new Pilha();

        pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		pilha.push(40);
		pilha.push(50);

        while(!pilha.isEmpty()){
            aux1.push(pilha.pop());
        }
        while(!aux1.isEmpty()){
            aux2.push(aux1.pop());
        }
        while(!aux2.isEmpty()){
            pilha.push(aux2.pop());
        }
        
        for(int i = 0; i < pilha.size(); i++){
            System.out.println(pilha.elementos[i]);   
        }
    }
}
