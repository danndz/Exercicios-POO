public class Aluno {

    String nome;
    int matricula;
    double notaAv1;
    double notaAv2;

    void mostrarDados() {
        System.out.println();
        System.out.println("Dados do aluno: ");
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota da AV1: " + notaAv1);
        System.out.println("Nota da AV2: " + notaAv2);
        System.out.println("Status: ");
        verificarAprovacao();

    }
    double calcularMedia() {

        return (notaAv1 + notaAv2) / 2;

    }
    void verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media >=4 && media < 7) {
            System.out.println("Prova final.");
        } else {
            System.out.println("Reprovado.");
        }
    }
}