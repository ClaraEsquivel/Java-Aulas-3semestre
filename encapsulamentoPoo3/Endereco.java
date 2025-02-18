package encapsulamentoPoo3;

public class Endereco {
    private String logradouro;
    private int numero;
    private String Cidade;

    public Endereco() {
    }

    public Endereco(String logradouro, int numero, String cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        Cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    @Override
    public String toString() {
        return "\nLogradouro: " + logradouro + 
        "\nNúmero: " + numero + 
        "\nCidade: " + Cidade;
    }

    

    
}
