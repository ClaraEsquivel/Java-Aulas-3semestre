/*package pessoa;*/

public class Cliente extends Pessoa{
    private String dataDaCompra;
    private String formaDePagamento;

    
    public Cliente(String nome, String idade, String dataDaCompra, String formaDePagamento) {
        super(nome, idade);
        this.dataDaCompra = dataDaCompra;
        this.formaDePagamento = formaDePagamento;
    }


    public String getDataDaCompra() {
        return dataDaCompra;
    }


    public void setDataDaCompra(String dataDaCompra) {
        this.dataDaCompra = dataDaCompra;
    }


    public String getFormaDePagamento() {
        return formaDePagamento;
    }


    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }


    @Override
    public String toString() {
        return 
        "\nCliente " +
        "\nNome: " + nome +
        "\nData Da Compra: " + dataDaCompra + 
        "\nIdade: " + idade +
        "\nForma De Pagamento: " + formaDePagamento;
    }

    
}
