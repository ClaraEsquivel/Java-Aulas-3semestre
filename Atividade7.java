/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade7;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author aluno.den
 */
public class Atividade7 {

     public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        ArrayList<Double>  notas = new ArrayList<>();
        
        for (int i = 0; i < 2; i++){
           double nota;
        
            do{
                System.out.println("Digite uma nota: ");
                nota = ler.nextDouble();
            
            } while(nota < 0 ||  nota > 10);
            
            notas.add(nota);
        }
        
        System.out.println("\nExibindo as notas: ");
        for (double nota : notas){
            System.out.println("Nota: " + nota);
        }
        
        ler.close();
    }
}
