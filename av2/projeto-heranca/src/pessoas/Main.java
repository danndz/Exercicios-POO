package pessoas;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Maria", 18, "F", 1234, "Informática");
        Professor p1 = new Professor("Carlos", 40, "M", "Matemática", 3500.00);
        Funcionario f1 = new Funcionario("João", 30, "M", "Administração", true);
        Fornecedor forn1 = new Fornecedor("Pedro", 45, "M", 5000, 1200);

        System.out.println("Aluno: " + a1.getNome() + " - Curso: " + a1.getCurso());
        System.out.println("Professor: " + p1.getNome() + " - Salário: " + p1.getSalario());
        System.out.println("Funcionário: " + f1.getNome() + " - Trabalhando: " + f1.isTrabalhando());
        System.out.println("Fornecedor: " + forn1.getNome() + " - Saldo: " + forn1.obterSaldo());
    }
}
