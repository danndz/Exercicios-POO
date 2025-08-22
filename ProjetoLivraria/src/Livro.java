public class Livro {

        String titulo;
        int anoPublicacao;
        int numeroPaginas;
        double preco;

        void mostrarInfo(){

            System.out.println("Características do Livro: ");
            System.out.println();
            System.out.println("Título: " + titulo);
            System.out.println("Ano de Publicação: " + anoPublicacao);
            System.out.println("Número de Páginas: " + numeroPaginas);
            System.out.println("Preço do Livro: " + preco);
        }

    }