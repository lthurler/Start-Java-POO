package startexercicio24;

import java.util.Scanner;

public class App {    

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        char continuar = 'S';

        while(continuar == 'S' || continuar == 's') {            

            System.out.println("Digite um número: ");
            int numero = leitor.nextInt();            

            if(numero > 0) {
                System.out.println("Número maior que 0!");
            }

            else if(numero == 0) {
                System.out.println("Zero!");
            }

            else {
                System.out.println("Número menor que 0!");
            }

            System.out.println("Deseja Continuar (S/N)? ");
            
            continuar = leitor.next().charAt(0);
        }
    }
}
