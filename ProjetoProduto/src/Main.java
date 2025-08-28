public class Main {
    public static void main(String[] args) {
        
        Produto pr1 = new Produto();
        Produto pr2 = new Produto();

        pr1.setNome("Cadeira Gamer");
        pr1.setPreco(789.0);

        pr2.setNome("Teclado");
        pr2.setPreco(-254);

        System.out.println("Nome do produto: " + pr1.getNome());
        System.out.println("Preço do produto: " + pr1.getPreco());

        System.out.println("------------------------");

        System.out.println("Nome do produto: " + pr2.getNome());
        System.out.println("Preço do produto: " + pr2.getPreco());

        System.out.println();
        if (pr2.getPreco() == 0.0) {
            System.out.println("ERRO! Preço de produto INVÁLIDO (negativo).");
        }
    }
}