package StartIF;

import java.util.Scanner;

public class App {   

    public static void main(String[] args) {
        
        int numero;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        numero = leitor.nextInt();
        
        if (numero >= 100 && numero <= 200) {
            System.out.println("O numero esta no intervalo");
        
            
        } else {
            System.out.println("O numero nao esta no intervalo");
        
        }        
    }
}
