
package excript.aula10;

import java.util.Scanner;

public class Aula10 {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        
        System.out.println("Escola uma das ospções abaaixo");
        System.out.println("1 - Adição.");
        System.out.println("2 - Subtração.");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
            
             int opc = in.nextInt();
        
        
        if( opc == 1 ){
        System.out.println("Escreva o primeito numero:");
        int n1 = in.nextInt();
        System.out.println("Escreva o segundo numero:");
        int n2 = in.nextInt(); 
       
        int soma = n1 + n2;
       
        System.out.println("A soma é: " +soma+".");
        }
        
        if( opc == 2 ){
        System.out.println("Escreva o primeito numero:");
        int n1 = in.nextInt();
        System.out.println("Escreva o segundo numero:");
        int n2 = in.nextInt(); 
        
        int sub = n1 - n2;   
               
        System.out.println("A subtração é: " +sub+".");
        } 
        if( opc == 3 ){
        System.out.println("Escreva o primeito numero:");
        int n1 = in.nextInt();
        System.out.println("Escreva o segundo numero:");
        int n2 = in.nextInt(); 
        
        int multi = n1 * n2;   
               
        System.out.println("A multiplicação  é: " + multi +".");
        } 
        if( opc == 4 ){
        System.out.println("Escreva o primeito numero:");
        int n1 = in.nextInt();
        System.out.println("Escreva o segundo numero:");
        int n2 = in.nextInt(); 
        
        int divi = n1 / n2;   
               
        System.out.println("A divisão é: " +divi+".");
        } 
        
    }

    
}
