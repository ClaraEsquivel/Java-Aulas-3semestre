package AtividadeExemplo;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Maria", 22, 
        new Endereco("Ribeira", 115, "Salvador"));

        System.out.println(cliente1.toString());
    }
}
