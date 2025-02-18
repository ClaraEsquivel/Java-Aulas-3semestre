package encapsulamentoPoo5;

public class MainFuncionarioContaBancaria {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("3553", "Pedro", "Ribeira", "71 98888-5555", "pedro@gmail.com", 
        new ContaBancaria("Nubank", "0012", "2269-9", "Corrente", "2,500", "7,000"));

        System.out.println(funcionario1.toString());
    }

}
