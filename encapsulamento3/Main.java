/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encapsulamento3;

/**
 *
 * @author aluno.den
 */
public class Main {

    public static void main(String[] args) {
        Pet pet = new Pet("Mingau", 6, "Felino", "Pequeno", "Ração");
        Pet pet2 = new Pet("Bob", 4, "Canino", "Médio", "Natural");
        
        System.out.println("Dados do Animal");
        System.out.println("Nome: " + pet.getNome());
        System.out.println("Idade: " + pet.getIdade());
        System.out.println("Raça: " + pet.getRaca());
        System.out.println("Porte: " + pet.getPorte());
        System.out.println("Alimentação: " + pet.getAlimentacao());
        
        System.out.println("\nDados do Animal");
        System.out.println("Nome: " + pet2.getNome());
        System.out.println("Idade: " + pet2.getIdade());
        System.out.println("Raça: " + pet2.getRaca());
        System.out.println("Porte: " + pet2.getPorte());
        System.out.println("Alimentação: " + pet2.getAlimentacao());
    }
}
