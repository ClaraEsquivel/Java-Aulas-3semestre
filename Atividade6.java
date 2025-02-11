/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testesjava1;

import java.util.Scanner;
/**
 *
 * @author aluno.den
 */
public class Atividade6 {
    public static void main(String[] args) {
        
        Scanner ler =  new Scanner(System.in);
        
        String nome, resultado;
        double media = 0;
        double[] notas = new double[2];
        
        
        
        System.out.println("Digite o nome do Aluno: ");
        nome = ler.next();
        
        for (int i = 0; i < 2; i++){
            do{
                System.out.println("Digite a " + (i + 1) + " nota: ");
                notas[i] = ler.nextDouble();
                
                if(notas [i] < 0 || notas[i] > 10){
                    System.out.println("Nota inválida");
                } 
            } while(notas [i] < 0 || notas[i] > 10);
        }
        
        
        ler.close();
        
       media = (notas[0] + notas [1]) / 2;
        
        
        if (media >= 7){ 
            resultado = "Aprovado";
        } else if (media >= 5){
            resultado = "Recuperação";
        } else{
            resultado = "Reprovado";
        }
        
        
        System.out.println("Nome do aluno: " + nome);
        
        System.out.println("\nExibindo os Resultados: ");
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }
        
        System.out.println("Média: " + media);
        System.out.println("Resultado: " + resultado);
    }
}
