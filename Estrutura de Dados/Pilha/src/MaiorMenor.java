import classes.Pilha;

public class MaiorMenor {
    public static void main(String[] args){
        Pilha pilha = new Pilha();
        
        pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		pilha.push(40);
		pilha.push(50);

        Maiormenor(pilha);
    }

    public static void Maiormenor(Pilha pilha) {
        Pilha aux = new Pilha();
        int n, menor, maior;

        maior = pilha.pop();
        menor = pilha.pop();

        while(!pilha.isEmpty()){
            n = pilha.pop();

            if(n > maior){
                maior = n;
            }if(n < menor){
                menor = n;
            }aux.push(n);
        }

        while(!aux.isEmpty()){
            n = aux.pop();
            if(n != maior && n != menor){
                pilha.push(n);
            }
        }
        System.out.printf(maior + "\n" + menor);
    }
}
