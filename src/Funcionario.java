public class Funcionario extends Pessoa {

    public Funcionario(String nome, String cpf){
        super(nome, cpf);
    }

    public double salario_funcionario;
    public String cargo;


    public void exibir_funcionario(){
        System.out.println("nome: " +  this.nome + "cpf: " + this.cpf + " salario_funcionario: " + this.salario_funcionario);
    }
}
