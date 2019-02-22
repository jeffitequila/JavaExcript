package excript.aula9;

import java.util.Scanner;



public class Aula9 {

    public static void main(String[] args) {
        
                
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva o primeito numero:");
       int n1 = in.nextInt();
        System.out.println("Escreva o segundo numero:");
       int n2 = in.nextInt();  
    
       int soma = n1+n2;
       int sub = n1 - n2;
       int multi = n1*n2;
       int divi = n1/n2;
       int rest = n1%n2;        
    
        System.out.println("A soma é: " +soma+".");
        System.out.println("A subtração é: " +sub+".");
        System.out.println("A multiplicação é: " +multi+".");
        System.out.println("A divisão é: " + divi +".");
        System.out.println("O resto é: " + rest +".");
        
    
    }
    
}
