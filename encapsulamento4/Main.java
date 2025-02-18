/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author aluno.den
 */
public class Main {

    public static void main(String[] args) {
        Livro livro = new Livro("É Assim que Acaba", "Collen", 123456, 320, 55.50);
        Veiculo veiculo = new Veiculo("SJP-1234", "Preto", 3, 35.5, 180, 14);
        
        System.out.println("Dados do livro");
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("ISBN: " + livro.getISBN());
        System.out.println("Número de páginas: " + livro.getNumeroPaginas());
        System.out.println("Preço: R$" + livro.getPreco());
        
        System.out.println("\nDados do veiculo");
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Cor: " + veiculo.getCor());
        System.out.println("Número de Passageiros: " + veiculo.getNumeroPassageiros());
        System.out.println("Capacidade do Tanque: " + veiculo.getCapacidadeTanque()+"L");
        System.out.println("Velocidade máxima: " + veiculo.getVelocidadeMax() + "Km/h");
        System.out.println("Consumo médio: " + veiculo.getConsumoMedio() + "Km/L");
       
    }
}
