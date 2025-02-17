/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atividade7;

/**
 *
 * @author aluno.den
 */
public class ComparacaoTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nomeUsuario = "Marta";
       int senha = 123;
       
       boolean resultadoNome = nomeUsuario.equals("Marta");
       boolean resultadoSenha = (senha == 456);
       
        System.out.println("O nome do usuário está correto? " + resultadoNome);
        System.out.println("A senha está correta? " + resultadoSenha);
       
       
    }
    
}
