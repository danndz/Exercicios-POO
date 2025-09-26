public class Main {
    public static void main(String[] args) {
        
        Carro c1 = new Carro();

        c1.setMarca("Mclaren");
        c1.setAno(2025);

        System.out.println("Meu carro é uma: " + c1.getMarca());
        System.out.println("O ano dele é: " + c1.getAno());
    }
}