package exercises.vetores;


import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int maior = 0;
        int menor = numeros[0];
        double media;
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            int numero = sc.nextInt();
            if (numero > numeros[0]) {
                numeros[0] = numero;
                maior = numero;
            }
            if  (numero < numeros[1]) {
                menor = numero;
            }
            soma += numero;
        }
        media = (double) soma / numeros.length;
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
    }
}
