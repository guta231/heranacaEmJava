//Criação da classe filha (subclasse)

public class Heroi extends Vingadores {


    public Heroi(String nome, int idade, boolean armadura, double altura){

        super(nome, idade, armadura, altura); //executa o método construtor da classe mãe


    }

    public int identificador;
    public String fatality;

}
