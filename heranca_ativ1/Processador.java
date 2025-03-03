package heranca_ativ1;

public class Processador extends MarcaModelo {
    private String frequencia;

    public Processador(String marca, String modelo, String frequencia) {
        super(marca, modelo);
        this.frequencia = frequencia;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return 
        "\n= Processador ="+
        "\nMarca: " + marca + 
        "\nFrequência: " + frequencia + 
        "\nModelo: " + modelo;
    }

    

}
