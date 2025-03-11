package interface_ativ3;

public class Diretor extends Funcionario_abstract implements Contratacao_interface{
    private final double PREMIO = 0.20;

    public Diretor(String nome, String dataNascimento, Sexo_enum sexo, Setor_enum setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    @Override
    public void admitirFuncionario(Funcionario_abstract funcionario) {
        System.out.println("Funcionário admitido: " + funcionario.getNome());
    }   

    @Override   
    public void demitirFuncionario(Funcionario_abstract funcionario) {
        System.out.println("Funcionário demitido: " + funcionario.getNome());
    }

    @Override
    public double getSalarioFinal() {
        return salarioBase + (salarioBase * PREMIO);
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nPrêmio: " + PREMIO +
               "\nSalário Final: " + getSalarioFinal();
    }
}
