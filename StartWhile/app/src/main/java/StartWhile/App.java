package StartWhile;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        int totalAlunos = 10;
        
        Scanner leitor = new Scanner(System.in);
        
        while(totalAlunos > 0) {
            
         System.out.println("Digite o nome do aluno: ");
         String nomeAluno = leitor.nextLine();
         
         System.out.println("Digite a idade: ");
         int idade = leitor.nextInt();
         
         System.out.println("o nome do aluno e: " + nomeAluno + "e sua idade e: " + idade);
         
         totalAlunos = totalAlunos - 1;
            
        }        
    }
}
