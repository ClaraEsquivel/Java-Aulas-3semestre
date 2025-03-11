package interface_ativ3;

public abstract class Funcionario_abstract {
    protected String nome;
    protected String dataNascimento;
    protected Sexo_enum sexo;
    protected Setor_enum setor;
    protected double salarioBase;

    public Funcionario_abstract(String nome, String dataNascimento, Sexo_enum sexo, Setor_enum setor, double salarioBase) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.salarioBase = salarioBase;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public Sexo_enum getSexo() {
        return sexo;
    }

    public Setor_enum getSetor() {
        return setor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setSexo(Sexo_enum sexo) {
        this.sexo = sexo;
    }

    public void setSetor(Setor_enum setor) {
        this.setor = setor;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double getSalarioFinal();

    // ToString
    @Override
    public String toString() {
        return "Funcionario:\n" +
                "Nome: " + nome + "\n" +
                "Data de Nascimento: " + dataNascimento + "\n" +
                "Sexo: " + sexo + "\n" +
                "Setor: " + setor + "\n" +
                "Salário Base: " + salarioBase;
    }
}
