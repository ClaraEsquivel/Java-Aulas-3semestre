package heranca_ativ3;

public class Sapato extends Produto{
    
    public Sapato(String marca, String cor, String tamanho, double preco) {
            super(marca, cor, tamanho, preco);
       
        }

    @Override
    public String toString() {
        return 
        "\n= Sapato ="+
        super.toString();
    }

    
}
