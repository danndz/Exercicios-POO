package veiculos;

public class Main {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[2];

        veiculos[0] = new Carro("Fiat", "Uno", 4);
        veiculos[1] = new Moto("Honda", "CG", 150);

        for (Veiculo v : veiculos) {
            v.exibirInfo();
        }
    }
}
