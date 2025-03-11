package interface_ativ2;

public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        System.out.println(soma.getDescricao() + ": " + soma.calcular(10, 5));
        System.out.println(subtracao.getDescricao() + ": " + subtracao.calcular(10, 5));
        System.out.println(multiplicacao.getDescricao() + ": " + multiplicacao.calcular(10, 5));
        System.out.println(divisao.getDescricao() + ": " + divisao.calcular(10, 5));
    }



}
