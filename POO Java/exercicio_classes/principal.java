/*Declare e inicialize um objeto do tipo Turma. Mostre os atributos do
objeto fazendo uma chamada ao m´etodo especıfico.*/
package exercicio_classes;
import java.util.Scanner;

public class principal {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //Solicita dados relacionados a turma que será cadastrada.
        System.out.println("Quantos alunos serão cadastrados? ");
        int n = s.nextInt();
        System.out.println("Nome da turma: ");
        String curso = s.next();
        System.out.println("Ano de ingresso: ");
        int anoIngresso = s.nextInt();

        aluno[] alunos = new aluno[n];
        //Adiciona alunos de acordo com o número de alunos que será cadastrado.
        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = new aluno();

            System.out.println("Nome do aluno: ");
            alunos[i].setNome(s.next());

            System.out.println("Idade do(a) aluno: "+alunos[i].getNome());
            alunos[i].setIdade(s.nextInt());

            System.out.println("Media do(a) aluno: "+alunos[i].getNome());
            alunos[i].setMedia(s.nextDouble());

        }
        turma turma = new turma(alunos, curso, anoIngresso);
        turma.mostrar();
        s.close();
    }

}

