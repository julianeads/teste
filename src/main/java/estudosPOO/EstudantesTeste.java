package estudosPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class EstudantesTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Estudantes> estudantes = new ArrayList<>();
        
        
        System.out.println("Informe a quantidade de estudantes: ");
        int aluno = scanner.nextInt(); 
        
        scanner.nextLine(); //necessario para limpar o buffer
        
        for (int i = 0; i < aluno; i++) {
            System.out.println("Quantidade de alunos: " + (i+1)); //(i + 1) serve para o cadastro não começar com 0
           
            Estudantes estudante = new Estudantes(); // dentro do loop
            
            System.out.println("Digite o nome do aluno: ");
            String nome = scanner.nextLine();
            estudante.setNome(nome);
           
            System.out.println("Digite o numero da matricula: ");
            String matricula = scanner.nextLine();
            estudante.setMatricula(matricula);
            
            
            System.out.println("Digite a nota1: ");
            int nota1 = scanner.nextInt();
            
            System.out.println("Digite a nota2: ");
            int nota2 = scanner.nextInt();
            
            System.out.println("Digite a nota3: ");
            int nota3 = scanner.nextInt();
            
            scanner.nextLine();
            
            estudante.calularNota(nota1, nota2, nota3);
            estudantes.add(estudante);
            
            System.out.println("Cadastro realizado com sucesso!");
            
        }
        System.out.println("\nEstudantes cadastrados!");
        for (Estudantes e: estudantes) {
           e.mostrarDados();
        }
        scanner.close(); // fechar o scanner para evitar o vazemento de recursos
    }

}