import exercises.calculadora.Calculadora;

import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc =  new Calculadora();

        System.out.println(" === Calculadora ===");
        System.out.println("0 - Soma");
        System.out.println("1 - Subatração");
        System.out.println("2 - Divisão");
        System.out.println("3 - Multiplicação");
        System.out.println("Selecione uma das opções acima: ");

        int selecionar;
        selecionar = sc.nextInt();

        if(selecionar == 0){
            System.out.println("=== Soma ===");
            calc.soma(numeros_a(), numeros_b());
        } else if(selecionar == 1){
            System.out.println("=== Subtração ===");
            calc.subtrai(numeros_a(), numeros_b());
        } else if(selecionar == 2){
            System.out.println("=== Divisão ===");
            calc.divide(numeros_a(), numeros_b());
        } else if(selecionar == 3){
            System.out.println("=== Multiplicação ===");
            calc.multiplica(numeros_a(), numeros_b());
        } else {
            System.out.println("Valor invalido!");
        }
    sc.close();

    }
    public static int numeros_a(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do primero numero: ");
        int num_a =  sc.nextInt();
        return num_a;
    }
    public static int numeros_b(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do segundo numero: ");
        int num_b =  sc.nextInt();
        return num_b;
    }
}