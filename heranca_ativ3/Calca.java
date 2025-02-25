package heranca_ativ3;

public class Calca extends Produto {


    public Calca(String marca, String cor, String tamanho, double preco) {
        super(marca, cor, tamanho, preco);
        
    }

    @Override
    public String toString() {
        return 
        "\n= Calça ="+
        super.toString();
    }
    
}
