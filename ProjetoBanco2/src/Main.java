import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ContaBancaria ct1 = new ContaBancaria(82754, 800.0);

        Scanner entrada = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 4) {

            System.out.println("----- Menu -----");
            System.out.println("Depositar - 1");
            System.out.println("Sacar - 2");
            System.out.println("Ver saldo - 3");
            System.out.println("Sair - 4");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1 ->  {

                    System.out.println("Informe o valor de depósito: ");
                    double valor = entrada.nextDouble();
                    ct1.depositar(valor);
                }
                case 2 ->  {

                    System.out.println("Informe o valor de saque: ");
                    double valor = entrada.nextDouble();
                    ct1.sacar(valor);
                }
                case 3 ->  {
                    System.out.println("Seu saldo atual é: " + ct1.getSaldo());
                }
                case 4 ->  {
                    System.out.println("Saindo...");
                }
            }
        }
        entrada.close();
    }
}
