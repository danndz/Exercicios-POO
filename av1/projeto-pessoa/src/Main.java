public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Danilo", 20);
        Pessoa p2 = new Pessoa("Samara", 23);

        System.out.println();
        System.out.println("Pessoa 1: ");
        System.out.println("Nome: " + p1.nome + " | Idade: " + p1.idade);
        System.out.println();
        System.out.println("Pessoa 2: ");
        System.out.println("Nome: " + p2.nome + " | Idade: " + p2.idade);
    }
}