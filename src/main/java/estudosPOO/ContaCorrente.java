package estudosPOO;

public class ContaCorrente extends ContaBancaria { 
    public ContaCorrente(){
        super(); //chama o construtor da classe mae
}
    @Override
     public void sacar(double valor){
        if (valor > getSaldo()) {
            System.out.println("Saque indisponivel.");
            } else {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }
}
