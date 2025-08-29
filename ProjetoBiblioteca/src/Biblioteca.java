public class Biblioteca {
    private Livro[] acervo;
    private int quantidade = 0;

    public Biblioteca(int capacidade) {
        this.acervo = new Livro[capacidade];
    }

    public void inserirLivro(Livro livro) {
        if (quantidade < acervo.length) {
            acervo[quantidade] = livro;
            quantidade++;
        }
    }

    public void retirarLivro(String titulo) {
        for (int i = 0; i < quantidade; i++) {
            Livro item = acervo[i];
            if (item.obterNome().equals(titulo)) {
                item.retirar();
            }
        }
    }

    public void retornarLivro(String titulo) {
        for (int i = 0; i < quantidade; i++) {
            Livro item = acervo[i];
            if (item.obterNome().equals(titulo)) {
                item.devolver();
            }
        }
    }

    public void exibir() {
        System.out.println("total=\"" + quantidade + "\" ->");
        for (int i = 0; i < quantidade; i++) {
            Livro item = acervo[i];
            System.out.println("\t" + item.exibir());
        }
    }
}