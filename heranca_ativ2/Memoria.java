package heranca_ativ2;

public class Memoria extends MarcaModelo{
    private String capacidadeArmazenamento;

    public Memoria(String marca, String modelo, String capacidadeArmazenamento) {
        super(marca, modelo);
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public String getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(String capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    @Override
    public String toString() {
        return 
        "\n= Memoria ="+
        "\nMarca: " + marca + 
        "\nCapacidade de Armazenamento: " + capacidadeArmazenamento + 
        "\nModelo: " + modelo;
    }

}
