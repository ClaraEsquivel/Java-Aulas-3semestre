package heranca_ativ4;

public class Main {

    public static void main(String[] args) {
        Fisica fisica = new Fisica("João", "123456789", "12345678901", "1234567", "01/01/2000");
        Juridica juridica = new Juridica("Empresa", "987654321", "12345678901234", "1234567");

        System.out.println(fisica);
        System.out.println(juridica);
    }
}
