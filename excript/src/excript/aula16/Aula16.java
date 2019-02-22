package excript.aula16;

import java.util.Scanner;

public class Aula16 {

    public static void main(String[] args) {
        
        final double vsom = 340.28;
        System.out.println("Digite o esboço de tempo: ");
        Scanner in = new Scanner(System.in);
        int tempo = in.nextInt();
        
        System.out.println("Distancia seria de " + tempo * vsom + "metros percorridos");
        
    }
    
}
