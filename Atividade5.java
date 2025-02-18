/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



import java.util.Scanner;
/**
 *
 * @author aluno.den
 */
public class Atividade5 {

    public static void main(String[] args) {
        
        Scanner notas =  new Scanner(System.in);
        
        String nome, resultado;
        double primeiraNota, segundaNota, media;
        
        
        System.out.println("Digite o nome do Aluno: ");
        nome = notas.next();
        
        
        do{
            System.out.println("Digite a primeira nota: ");
            primeiraNota = notas.nextDouble();
            
            System.out.println("A nota não pode ser menor que 0 ou maior que 10!");    
        } while(primeiraNota < 0 || primeiraNota > 10);
        
        
        do{
           System.out.println("Digite a segunda nota: ");
           segundaNota = notas.nextDouble(); 
           
           System.out.println("A nota não pode ser menor que 0 ou maior que 10!");    
        } while (segundaNota < 0 || segundaNota > 10);
        


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
