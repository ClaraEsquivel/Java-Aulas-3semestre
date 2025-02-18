

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author aluno.den
 */
public class MetodosString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nome = "Marta";
        String sobrenome = "Silveira";
        
        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: " + sobrenome.length());
        
        String nomeCompleto = nome.concat(" ").concat(sobrenome);
        
        System.out.println("Concatenação Maiúscula: " + nomeCompleto.toUpperCase());
        System.out.println("Concatenação Minúscula: " + nomeCompleto.toLowerCase());
    }
    
}
