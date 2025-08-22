public class Main {
    public static void main(String[] args) {
        
        Livro obj1 = new Livro();
        Livro obj2 = new Livro();
        Cliente cl1 = new Cliente();

        obj1.titulo = "Maze Runner: Correr ou Morrer";
        obj1.anoPublicacao = 2014;
        obj1.numeroPaginas = 675;
        obj1.preco = 45.50;

        obj2.titulo = "Maze Runner: Prova de Fogo";
        obj2.anoPublicacao = 2015;
        obj2.numeroPaginas = 768;
        obj2.preco = 67.99;

        cl1.nome = "Danilo";
        cl1.cpf = "041.234.563-23";
        cl1.email = "danilo@gmail.com";

        obj1.mostrarInfo();
        System.out.println("-----------------------");
        obj2.mostrarInfo();
        System.out.println("-----------------------");
        cl1.fazerCadastro();
        System.out.println();
        cl1.mostrarInfo();


    }
}