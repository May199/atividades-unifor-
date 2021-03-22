import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Lista_de_Chamada {
    
    private static String nome;
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        
        int qtdAlunos, alunoPremiado;
        
        qtdAlunos = s.nextInt();
        alunoPremiado = s.nextInt();
    
        String[] alunos = new String[qtdAlunos];

        for(int i= 0; i < qtdAlunos; i++){
            nome = s.next().toLowerCase();
            alunos[i] = nome; 
        }
        ordenar(alunos, qtdAlunos);
        System.out.printf("%s \n", alunos[alunoPremiado - 1]);

        s.close();
    }
    private static String[] ordenar(String[] alunos, int qtdAlunos){
                    
        Arrays.sort(alunos);
        
        for(int i= 1; i < qtdAlunos; i++){
            for(String nome: alunos){
                alunos[i] = nome;
            }
        }
        return alunos;
    }
}
