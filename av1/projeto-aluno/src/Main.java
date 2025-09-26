public class Main {
    public static void main(String[] args) {
        
        Aluno al1 = new Aluno();
        Aluno al2 = new Aluno();

        al1.nome = "Danilo";
        al1.matricula = 9867;
        al1.notaAv1 = 9;
        al1.notaAv2 = 10;

        al2.nome = "Robsu";
        al2.matricula = 8895;
        al2.notaAv1 = 5;
        al2.notaAv2 = 6;

        al1.mostrarDados();
        al2.mostrarDados();

    }
    
}