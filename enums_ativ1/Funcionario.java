package enums_ativ1;

public class Funcionario {
    private String id;
    private String nome;
    private String salario;
    private Setor setor;
    private Sexo sexo;
    private int idade;
    
    public Funcionario() {
    }

    public Funcionario(String id, String nome, String salario, Setor setor, Sexo sexo, int idade) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return 
        "\nID: " + id + 
        "\nNome: " + nome + 
        "\nSalário: " + salario +
        "\nSetor: " + setor + 
        "\nSexo: " + sexo + 
        "\nIdade: " + idade;
    }


    

}
