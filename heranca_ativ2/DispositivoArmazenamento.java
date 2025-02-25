package heranca_ativ2;

public class DispositivoArmazenamento extends MarcaModelo{
    private String capacidadeArmazenamento;
    private String tipoConexao;
    
    public DispositivoArmazenamento(String marca, String modelo, String capacidadeArmazenamento, String tipoConexao) {
        super(marca, modelo);
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.tipoConexao = tipoConexao;
    }

    public String getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(String capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    @Override
    public String toString() {
        return 
        "\n= Dispositivo de Armazenamento ="+
        "\nMarca: " + marca + 
        "\nCapacidade de Armazenamento: " + capacidadeArmazenamento + 
        "\nModelo: " + modelo + 
        "\nTipo de Conexâo:" + tipoConexao;
    }

    

}
