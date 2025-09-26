public class Main {
    public static void main(String[] args) {

        Endereco end1 = new Endereco("São Francisco", 869);
        Endereco end2 = new Endereco("José Ferreira", 657);
        
        Pessoa p1 = new Pessoa("Danilo", 20, end1);
        Pessoa p2 = new Pessoa("Ester", 19, end2);

        p1.mostrarDados();
        System.out.println("----------------------");
        p2.mostrarDados();

    }
}
