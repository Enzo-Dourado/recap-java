package exercises.contaBancaria;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria() {
        this.saldo = 0;
    }
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }


    public void sacar(double valor){
        if (saldo >= valor){
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void conta(){
        System.out.println("Titular: " + this.titular + " | Saldo: " + this.saldo);
    }
}
