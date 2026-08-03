import exercises.contaBancaria.ContaBancaria;

import java.util.ArrayList;
import java.util.Scanner;

public class MainContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ContaBancaria> contaBancarias = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            ContaBancaria conta = new ContaBancaria();
            System.out.println("Digite o nome do Titular: ");
            conta.setTitular(sc.next());
            contaBancarias.add(conta);

            System.out.println("Conta criada com sucesso!");

        }

        while (true) {
            System.out.println("===== Sistema ====\n");
            System.out.println("Nome do Titular a ser consultado: ");
            String titular = sc.next();
            ContaBancaria contaEncontrada = null;
            for (ContaBancaria conta : contaBancarias) {
                if (conta.getTitular().equalsIgnoreCase(titular)) {
                    contaEncontrada = conta;
                    break;
                }
            }

            if (contaEncontrada != null) {
                System.out.println("Titular encontrado!");
                System.out.println();
                contaEncontrada.conta();
                System.out.println();
                System.out.println("=== Banco === ");
                System.out.println("0 - Depositar");
                System.out.println("1 - Sacar");
                System.out.println("2 - Sair");
                System.out.println("Digite a opção: ");
                int opcao = sc.nextInt();

                if (opcao == 0) {
                    System.out.println("Digite o valor a ser depositado: ");
                    double valor = sc.nextDouble();
                    contaEncontrada.depositar(valor);
                } else if (opcao == 1) {
                    System.out.println("Digite o valor a ser sacado: ");
                    double valor = sc.nextDouble();
                    contaEncontrada.sacar(valor);
                }  else if (opcao == 2) {
                    break;
                } else {
                    System.out.println("Valor Invalido!");
                }

            } else {
                System.out.println("Titular não encontrado! Tente novamente");
            }
        }


    }
}
