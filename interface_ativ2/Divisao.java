package interface_ativ2;

public class Divisao implements OperacaoMatematica {

    @Override
    public double calcular(double a, double b) {
        return a / b;
    }

    public String getDescricao() {
        return "Divisao";
    }

}
