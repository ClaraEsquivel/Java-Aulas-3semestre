/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;
/**
 *
 * @author aluno.den
 */
public class Atividade3 {
    public static void main(String[] args) {
        
        Scanner notas =  new Scanner(System.in);
        
        String nome, resultado;
        double primeiraNota, segundaNota, media;
        
        System.out.println("Digite o nome do Aluno: ");
        nome = notas.next();
        
        System.out.println("Digite a primeira nota: ");
        primeiraNota = notas.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        segundaNota = notas.nextDouble();
        
        media = (primeiraNota + segundaNota) / 2;
        
        if (media >= 7){
            resultado = "Aprovado";
        } else if (media >= 5){
            resultado = "Recuperação";
        } else{
            resultado = "Reprovado";
        }
        
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Resultado: " + resultado);
        
        notas.close();
    }
}
