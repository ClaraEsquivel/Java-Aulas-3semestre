package heranca_ativ5;

public abstract class Funcionario {
    private String nome;
    private String email;
    private float salario;
    private Endereco endereco;

    public Funcionario(String nome, String email, float salario, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
        this.endereco = endereco;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\n= Dados do Funcionário = "+
               "\nNome: " + nome +
               "\nEmail: " + email +
               "\nSalário: R$ " + String.format("%.2f", salario) +
               "\n= Endereço = " + endereco;
    }
}
