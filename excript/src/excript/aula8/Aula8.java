
package excript.aula8;

import java.util.Scanner;

public class Aula8 {

    public static void main(String[] args) {
        
        System.out.println("Infome a idade do cachorro");
        Scanner in = new Scanner(System.in);
        
        int idade = in.nextInt();
        idade = idade*7;
        System.out.println("Seu cachorro tem " + idade + "em anos humanos");
        
    }
    
}
