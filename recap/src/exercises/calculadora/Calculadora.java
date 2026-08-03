package exercises.calculadora;

public class Calculadora {
    public void soma(int a, int b){
        int soma = a + b;
        System.out.println("Resultado: " + soma);
    };
    public void subtrai(int a, int b){
        int subtrai = a - b;
        System.out.println("Resultado: " + subtrai);
    };
    public void divide(int a , int b){
        if (a > 0 && b > 0) {
            int divisao = a / b;
            System.out.println("Resultado: " + divisao);
        } else {
            System.out.println("Erro: Divisão por zero ou números negativos.");
        }
    };
    public void multiplica(int a , int b){
        int multiplica = a * b;
        System.out.println("Resultado: " + multiplica);
    };

}
