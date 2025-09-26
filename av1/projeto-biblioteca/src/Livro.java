public class Livro {
    private String escritor;
    private String nome;
    private boolean emEstoque = true;

    public Livro(String nome, String escritor) {
        this.escritor = escritor;
        this.nome = nome;
    }

    public String obterNome() {
        return this.nome;
    }

    public boolean estaDisponivel() {
        return this.emEstoque;
    }

    public void retirar() {
        if (emEstoque) {
            System.out.println("Retirado: " + nome);
            this.emEstoque = false;
        }
    }

    public void devolver() {
        if (!emEstoque) {
            System.out.println("Devolvido: " + nome);
            this.emEstoque = true;
        }
    }

    public String exibir() {
        return "nome=\"" + this.nome + "\" escritor=\"" + this.escritor + "\" emEstoque=\"" + this.emEstoque + "\"";
    }
}