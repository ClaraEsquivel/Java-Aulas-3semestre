package heranca_ativ3;

public class Camisa extends Produto {

    public Camisa(String marca, String cor, String tamanho, double preco) {
        super(marca, cor, tamanho, preco);
        
    }

    @Override
    public String toString() {
        return 
        "\n= Camisa =" +
        super.toString();
    }

}
