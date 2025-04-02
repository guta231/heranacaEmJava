public class Aluno extends Pessoa {


    public Aluno(String nome, String cpf){
        super(nome, cpf);
    }

    public int matricula;


    public void exibir_aluno(){

        System.out.println(this.nome + " " + this.cpf + " " + this.matricula);
    }


}
