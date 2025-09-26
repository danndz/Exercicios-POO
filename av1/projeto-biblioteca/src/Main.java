public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(4);
        biblioteca.inserirLivro(new Livro("Sunrise", "Yumi"));
        biblioteca.inserirLivro(new Livro("Falling Stars", "Kaito"));
        biblioteca.inserirLivro(new Livro("Hidden Worlds", "Aiko"));
        biblioteca.inserirLivro(new Livro("Shadows", "Ren"));

        biblioteca.exibir();

        biblioteca.retirarLivro("Falling Stars");
        biblioteca.retirarLivro("Shadows");
        biblioteca.retornarLivro("Falling Stars");

        biblioteca.exibir();
    }
}