package startexercicio22;

import java.util.Scanner;

public class App {    

    public static void main(String[] args) {

        String nome;
        float custo;
        float venda;
        float resultado;
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        int i = 0;       
        
        Scanner leitor = new Scanner(System.in);

        for(; i < 40; i++) {

            System.out.print("Digite o nome do produto: ");
            nome = leitor.nextLine();

            System.out.print("Digite o preço de custo: ");
            custo = leitor.nextFloat();

            System.out.print("Digite o preço de venda: ");
            venda = leitor.nextFloat();

            resultado = venda - custo;

            totalCusto = totalCusto + custo;
            totalVenda = totalVenda + venda;

            System.out.println("Produto: " + nome);
            System.out.println("Preço de custo: " + custo);
            System.out.println("Preço de venda: " + venda);
            System.out.println("");            

            if(resultado > 0) {
                System.out.println("Obteve Lucro");
                System.out.println("");
            
            } else if(resultado == 0) {
                System.out.println("obteve empate");
                System.out.println("");

            } else {
                System.out.println("Obteve prejuizo");
                System.out.println("");
            }          

        }

            System.out.println("Media de preço de custo: " + (totalCusto / i));
            System.out.println("Media de preco de venda: " + (totalVenda / i));
            System.out.println("");

    }
}
