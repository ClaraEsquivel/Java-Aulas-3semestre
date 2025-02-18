/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author aluno.den
 */
public class Main {

    public static void main(String[] args) {
        Livro livro = new Livro("Harry Potter", "J.K", 350, 66.5);
        Livro livro2 = new Livro("Percy Jackson", "Rick Riordan", 269, 45.0);
        
        
        System.out.println("Dados do primeiro livro:");
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Número de páginas: " + livro.getNumeroPaginas());
        System.out.println("Preço: " + livro.getPreco());
        
        System.out.println("\nDados do segundo livro:");
        System.out.println("Título: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Número de páginas: " + livro2.getNumeroPaginas());
        System.out.println("Preço: " + livro2.getPreco());
    }
}
