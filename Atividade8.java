/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atividade7;

import java.util.Scanner;

public class Atividade8 {

 
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        String login, senha;
        
        System.out.println("Login: ");
        login = read.next();
        
        System.out.println("Senha: ");
        senha = read.next();
        
        boolean resultadoLogin = login.equals("Maria");
        boolean resultadoSenha = senha.equals("123");
        
        if(resultadoLogin && resultadoSenha){
            System.out.println("Bem - vindo!");
        } else{
            System.out.println("Login ou senha inválidos!");
        }
        
    }
    
}
