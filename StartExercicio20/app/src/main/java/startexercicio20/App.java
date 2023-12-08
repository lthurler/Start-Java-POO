package startexercicio20;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        int anoCarro;
        float precoCarro;
        float valorDesconto;
        float precoFinal;

        char continua = 'S';

        int totalCarros2000 = 0;
        int totalCarros = 0;

        try (Scanner leitor = new Scanner(System.in)) {

            while(continua == 'S' || continua == 's') {

                System.out.println("");
                System.out.print("Digite o valor do carro: ");
                precoCarro = leitor.nextFloat();

                System.out.print("Digite o ano do carro: ");
                anoCarro = leitor.nextInt();
                System.out.println("");
                
                if(anoCarro <= 2000) {

                    valorDesconto = precoCarro * 0.12f;
                    precoFinal = precoCarro - valorDesconto;  
                    totalCarros2000 ++;             

                } else {

                    valorDesconto = precoCarro * 0.07f;
                    precoFinal = precoCarro - valorDesconto;

                }

                totalCarros ++;

                System.out.println("Valor do desconto: " + valorDesconto);
                System.out.println("Preço a pagar: " + precoFinal);
                System.out.println("");

                System.out.print("Deseja continuar (S/N)? ");
                continua = leitor.next().charAt(0);
            }
        }
        
        System.out.println("Total de carros: " + totalCarros);
        System.out.println("Total de carros com ano até 2000: " + totalCarros2000);
    }
}
