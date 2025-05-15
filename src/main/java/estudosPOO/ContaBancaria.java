package estudosPOO;

public class ContaBancaria {
    
    private int numeroConta;
    private String titular;
    private double saldo = 0.0;

    public ContaBancaria() {
    }

    public ContaBancaria(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
        System.out.println("Deposito realizado com sucesso.");    
        }
        
    }
    
    public void sacar(double valor){
        if (valor > saldo) {
            System.out.println("Saque indisponivel.");
            } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        }
    }
    
    public void consultarSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }
    
    @Override
    public String toString(){
        return "Titular: " + titular + 
                " Numero da conta: " + numeroConta + 
                " Saldo: " + saldo;
    }
    
}