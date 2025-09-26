public class Cliente {
    
    String nome;
    String cpf;
    String email;

    void fazerCadastro(){

        System.out.println("Fazendo cadastro do cliente...");

    }
    void mostrarInfo(){

        System.out.println("Dados do cliente: ");
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);

    }
}