import exercises.mediaAlunos.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class MainAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        for  (int i = 0; i < 3; i++) {
            Aluno aluno = new Aluno();
            System.out.println("Digite o nome do aluno: ");
            aluno.setNome(sc.next());
            System.out.println("Digite o numero de matricula do aluno: ");
            aluno.setMatricula(sc.nextLong());
            System.out.println("Digite a nota da P1: ");
            aluno.setP1(sc.nextDouble());
            System.out.println("Digite a nota da P2: ");
            aluno.setP2(sc.nextDouble());
            System.out.println("Digite a nota da P3: ");
            aluno.setP3(sc.nextDouble());
            System.out.println("Digite a nota da P4: ");
            aluno.setP4(sc.nextDouble());

            alunos.add(aluno);
            System.out.println("Aluno Cadastrado com Sucesso!");
        }

        for (Aluno aluno : alunos) {
            aluno.boletim();
        }
    }
}
