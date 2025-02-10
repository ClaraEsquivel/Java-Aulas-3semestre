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
public class Atividade1 {
    public static void main(String[] args) {
        //biblioteca
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();
        
        double valorPrestacao = valorCompra / 5;
        
        System.out.println("Loja Mamão com Açúcar");
        System.out.println("Valor da compra: R$" + valorCompra);
        System.out.println("Valor de cada prestação: R$" + valorPrestacao);
        
        scanner.close();
    }
}
