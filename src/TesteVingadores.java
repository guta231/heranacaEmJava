public class TesteVingadores {

    public static void main(String[] args) {
        Heroi vingador = new Heroi("Homem de ferro", 50, true, 1.80);
        vingador.identificador = 01;
        vingador.fatality = "Esnobar todo mundo";

        Vilao vilao1 = new Vilao("Thanos", 400, true, 2.20);
        vilao1.poder = "Estalar os dedos e fazer metado do mundo desaparecer";
        vilao1.plano_maligno = "Destruir o Universo";

        System.out.println("Criação de um herói \n");
        System.out.println("Nome do vingador:" + vingador.nome);
        System.out.println("idade do vingador: " + vingador.idade);
        System.out.println("armadura do vingador: " + vingador.armadura);
        System.out.println("altura do vingador: " + vingador.altura);
        System.out.println("fatality do vingador: " + vingador.fatality);
        System.out.println("ID do vingador: " + vingador.identificador);

        System.out.println("Criação de um herói \n");
        System.out.println("Nome do vilao:" + vilao1.nome);
        System.out.println("idade do vilao: " + vilao1.idade);
        System.out.println("armadura do vilao: " + vilao1.armadura);
        System.out.println("altura do vilao: " + vilao1.altura);
        System.out.println("fatality do vilao: " + vilao1.poder);
        System.out.println("ID do vilao: " + vilao1.plano_maligno);

        Vingadores objVingadores = new Vingadores("Homem aranha", 20, false, 1.73);

        objVingadores.exibir_vingador();


        vingador.exibir_vingador();

    }
}
