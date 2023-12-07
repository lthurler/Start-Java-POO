import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Pessoa objetoPessoa = new Pessoa(70.0f, 1.70f);
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.print("Digite o seu peso: ");
            objetoPessoa.setPeso(leitor.nextFloat());

            System.out.print("Digite a sua altura: ");
            objetoPessoa.setAltura(leitor.nextFloat());
        }

        System.out.println("Seu Imc: " + objetoPessoa.calcularIMC());

    }


}
