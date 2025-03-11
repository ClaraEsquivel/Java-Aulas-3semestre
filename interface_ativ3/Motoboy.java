package interface_ativ3;

public class Motoboy extends Funcionario_abstract {

    private String carteiraDeHabilitacao;

    public Motoboy(String nome, String dataNascimento, Sexo_enum sexo, Setor_enum setor, double salarioBase, String carteiraDeHabilitacao) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    // Getter
    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    // Setter
    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return super.getSalarioBase();
    }

    // ToString
    @Override
    public String toString() {
        return "Motoboy{" +
               super.toString() +
               "\nCarteira de Habilitacao: " + carteiraDeHabilitacao;
 
            }

    
}
