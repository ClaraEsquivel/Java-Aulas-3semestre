package encapsulamentoPoo4;

public class MainClientePet {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Clara", 21, 
        new Pet("Caramelo", 7, "Felino"));

        System.out.println(cliente1.toString());

    }
}
