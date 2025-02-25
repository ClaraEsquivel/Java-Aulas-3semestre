package heranca_ativ2;

public class PlacaMae extends MarcaModelo {
    private String soquete;

    public PlacaMae(String marca, String modelo, String soquete) {
        super(marca, modelo);
        this.soquete = soquete;
    }

    public String getSoquete() {
        return soquete;
    }

    public void setSoquete(String soquete) {
        this.soquete = soquete;
    }

    @Override
    public String toString() {
        return 
        "\n= Placa Mãe ="+
        "\nMarca: " + marca + 
        "\nSoquete: " + soquete + 
        "\nModelo: " + modelo;
    }

    

}
