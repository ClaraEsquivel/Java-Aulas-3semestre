package enums_exemplo;

public class MainEnums {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Maria", 20, Sexo.FEMININO);

        System.out.println(pessoa1.toString());
    }
}
