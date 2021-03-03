class Main {
    public static void main(String[] args) {
      //senhas da vacinacao
      int v[] = {2, 8, 9, 11, 5, 1, 3, 9};
      imprimirVetor(v);
      System.out.println("\n\n" + temRepetidos(v));
    }
  
      public static void imprimirVetor(int []v) {
      for(int i : v) {
        System.out.print(i + " ");
      }
    }
    
    /**
    Implente um método para verificar se um vetor tem elemenos repetidos ou não.
    **/
    public static boolean temRepetidos(int v[]) {
  
       for(int i = 0; i < v.length; i++) {
         for(int j = i+1; j < v.length; j++) {
           if (v[i] == v[j]) return true;
         }
       }
       // nao encontrou elementos repetidos
       return false;
    }
  
    /**
    Implente um método para imprimir uma vez cada elemento repetido do vetor. Exemplo: {1, 2, 1, 3, 5, 7, 4, 5, 5} => imprimir: 1 e 5 
    **/
    public static void imprimirElementosRepetem(int v[]) {
        temRepetidos(v);
    }
  }