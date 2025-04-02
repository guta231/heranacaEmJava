public class Professor extends Pessoa{

    public Professor(String nome, String cpf){
        super(nome, cpf);
    }

    public double salario_prof;
    public String disciplina;


    public void exibir_professor(){
        System.out.println(this.nome+"\t"+this.cpf+"\t"+this.salario_prof);
    }

}

