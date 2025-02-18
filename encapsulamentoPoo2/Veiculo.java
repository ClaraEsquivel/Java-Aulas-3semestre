package encapsulamentoPoo2;

public class Veiculo {
    private String placa;
    private String cor;
    private int numeroPassageiros;
    private String capacidadeTanque;
    private String velocidadeMax;
    private String consumoMedio;
    
    public Veiculo() {
    }

    public Veiculo(String placa, String cor, int numeroPassageiros, String capacidadeTanque, String velocidadeMax,
            String consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroPassageiros = numeroPassageiros;
        this.capacidadeTanque = capacidadeTanque;
        this.velocidadeMax = velocidadeMax;
        this.consumoMedio = consumoMedio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public String getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(String capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(String velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public String getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(String consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    @Override
    public String toString() {
        return "Veiculo [placa=" + placa + ", cor=" + cor + ", numeroPassageiros=" + numeroPassageiros
                + ", capacidadeTanque=" + capacidadeTanque + ", velocidadeMax=" + velocidadeMax + ", consumoMedio="
                + consumoMedio + "]";
    }

    

}
