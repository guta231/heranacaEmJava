//Classe mãe (classe base para herança)


import java.util.Locale;

public class Vingadores {

    public String nome;
    public int idade;
    public boolean armadura;
    public double altura;



    //Método construtor

    public Vingadores(String nome, int idade, boolean armadura, double altura){

        this.nome = nome;
        this.idade = idade;
        this.armadura = armadura;
        this.altura = altura;

    }

    public void exibir_vingador(){

        System.out.println("Nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.println("Armadura: " + this.armadura);
        System.out.println("Altura: " + this.altura);
    }




}