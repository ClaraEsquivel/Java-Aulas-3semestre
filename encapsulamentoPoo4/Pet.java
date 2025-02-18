package encapsulamentoPoo4;

public class Pet {
    private String nome;
    private int idade;
    private String raça;
    
    public Pet() {
    }

    public Pet(String nome, int idade, String raça) {
        this.nome = nome;
        this.idade = idade;
        this.raça = raça;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    @Override
    public String toString() {
        return 
        "\nNome: " + nome +
         "\nIdade: " + idade + 
         "\nRaça: " + raça;
    }

    
}
