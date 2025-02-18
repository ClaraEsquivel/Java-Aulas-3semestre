/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


/**
 *
 * @author aluno.den
 */
public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Clara", "clara@gmail.com", 21);
        //get = trazer
        //set = colocar
        
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Idade: " + cliente.getIdade());
    }
}
