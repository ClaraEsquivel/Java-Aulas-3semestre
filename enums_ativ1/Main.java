package enums_ativ1;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("123-E", "Maria", "R$ 3.000", Setor.FINANCEIRO, Sexo.FEMININO, 23);

        System.out.println(funcionario1.toString());
    }
}
