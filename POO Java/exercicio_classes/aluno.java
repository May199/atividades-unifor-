/*Implemente a classe Aluno. A classe tem os atributos “nome”, “idade”
e “media”. Implemente tambem o metodo “mostra”;*/
package exercicio_classes;

public class aluno{
    private String nome;
    private int idade;
    private double media;

    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}
    public int getIdade(){return idade;}
    public void setIdade(int idade){this.idade = idade;}
    public double getMedia(){return media;}
    public void setMedia(double media){this.media = media;}

    public void mostrar(){
        System.out.println(getNome()+", "+"idade: "+getIdade()+", média final: "+getMedia());
    }

}

