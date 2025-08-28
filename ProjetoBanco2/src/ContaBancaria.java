public class ContaBancaria {
    
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;

    }
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Valor adicionado com sucesso!");
    }
    public void sacar(double valor) {
        
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saldo realizado com sucesso!");
        } else {
            System.out.println("Valor ultrapassa o dinheiro em conta!");
        }
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
}
