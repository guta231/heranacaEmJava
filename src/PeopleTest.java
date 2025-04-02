public class PeopleTest {

    public static void main(String[] args ){
        Aluno a1 = new Aluno("Silas Kando", "123.456.789-00");
        a1.matricula = 01;
        Professor prof1 = new Professor("Robertinho", "123.456.789-00");
        prof1.salario_prof = 2500;
        prof1.disciplina = "Java";

        Funcionario funcionario1 = new Funcionario("monica", "123.456.789-00");
        funcionario1.salario_funcionario = 1500;
        funcionario1.cargo = "recepcionista";

        a1.exibir_aluno();
        prof1.exibir_professor();
        funcionario1.exibir_funcionario();
    }
}
