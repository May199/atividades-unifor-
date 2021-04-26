package Nivelamento;

import java.util.ArrayList;

public class valorRepetido {
    public static void main(String[] args){

        int[] vetor = {1, 2, 1, 3, 5, 7, 4, 5, 5};
        ArrayList<Integer> valorRepetido = new ArrayList<Integer>();

        for(int i=0; i < vetor.length; i++){
            for(int j=0; j < vetor.length; j++){

                if(vetor[i] == vetor[j] && j!=i){
                    if(!valorRepetido.contains(vetor[i])){
                        valorRepetido.add(vetor[i]);
                    }
                }
            }
        }
        System.out.println(valorRepetido);
    }
}
