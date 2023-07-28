package application;

import entities.Ex03Aluno;

import java.util.Scanner;

public class Ex03App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Ex03Aluno aluno = new Ex03Aluno();

        System.out.println("Digite o nome do aluno");
        aluno.nome = leitor.nextLine();
        System.out.println("Digite a nota do primeiro trimestre");
        aluno.trimestre1 = leitor.nextDouble();
        System.out.println("Digite a nota do segundo trimestre");
        aluno.trimestre2 = leitor.nextDouble();
        System.out.println("Digite a nota do terceiro trimestre");
        aluno.trimestre3 = leitor.nextDouble();

        System.out.printf("FINAL GRADE = %.2f\n", aluno.finalGrade());
        if (aluno.finalGrade() >= 60.00){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", aluno.missing());
        }
        leitor.close();
    }
}
