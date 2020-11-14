/*• Implemente a classe Turma. A classe tem como atributos um vetor de
n objetos do tipo Aluno, o “curso” da turma e o “ano de ingresso”.
Implemente tambem o metodo “mostra”;
• Na classe Turma, implemente um metodo que retorna a maior media;
• Na classe Turma, implemente um metodo que retorna o objeto Aluno
que possui a maior media.*/
package exercicio_classes;

public class turma{
    private aluno[] cadastrados;
    private String curso;
    private int anoIngresso;
    private aluno melhorAluno;

    public turma(aluno[] cadastrados, String curso, int anoIngresso){
        this.cadastrados = cadastrados; this.curso = curso;
        //seta o ano de ingresso como 2000 se o número de ingresso informado for menor ou igural a 0;
        this.anoIngresso = anoIngresso <= 0 ? 2000 : anoIngresso;

        //descobre a maior media da turma.
        double media = 0.0;
        for (int i = 0; i < this.cadastrados.length; i++){
            if (media < this.cadastrados[i].getMedia()) {
                media = this.cadastrados[i].getMedia();
                this.melhorAluno = this.cadastrados[i];
            }
        }
    }
    public aluno[] getCadastrados(){return cadastrados;}
    public String getCurso(){return curso;}
    public int getAnoIngresso(){return anoIngresso;}
    public double getMaiorMedia(){return melhorAluno.getMedia();}
    public aluno getMelhorAluno(){return melhorAluno;}

    public void mostrar() {
        System.out.println("\n");

        System.out.println("Nome da turma: " +getCurso()+", ano de ingresso: "+getAnoIngresso());
        System.out.println("Maior media da turma: "+getMaiorMedia());
        System.out.println("Total de alunos cadastrados:  "+cadastrados.length);

        for(int i = 0; i < cadastrados.length; i++){
            cadastrados[i].mostrar();
        }
        System.out.println("\n");
    }

}