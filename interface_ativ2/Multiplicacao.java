package interface_ativ2;

public class Multiplicacao implements OperacaoMatematica{

    @Override
    public double calcular(double a, double b) {
        return a * b;
    }

    public String getDescricao() {
        return "Multiplicação";
    }

}
