public class Endereco {
    private String rua;
    private int numero;

    public Endereco (String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }
    public String getRua() {
        return this.rua;
    }
    public int getNumero() {
        return this.numero;
    }
}
