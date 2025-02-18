/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author aluno.den
 */
public class Atividade9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        String login, senha;
        boolean resultadoLogin, resultadoSenha;
         
        do{
            
            System.out.println("Login: ");
            login = read.next();
        
            System.out.println("Senha: ");
            senha = read.next();
        
            resultadoLogin = login.equals("Maria");
            resultadoSenha = senha.equals("123");
            
                if(!resultadoLogin || !resultadoSenha){
                    System.out.println("Login ou senha inválidos!");
                } 
                
            
        }while(!resultadoLogin || !resultadoSenha);
            
        System.out.println("Bem - vindo!");           
            
        read.close();
    }
    
}
