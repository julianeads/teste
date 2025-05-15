package estudosPOO;
import java.util.Scanner;

public class ContaTeste {
    public static void main(String[] args) {
        
       Scanner ler = new Scanner(System.in);
        Scanner lerTexto = new Scanner(System.in);
        
        //clase mae
        
        ContaBancaria conta = new ContaBancaria();
        
        
        System.out.println("Digite o titular da conta: ");
        String titular = lerTexto.nextLine();
        
        System.out.println("Digite o numero da conta: ");
        int numeroConta = ler.nextInt();
        
        System.out.println("Digite o saldo da conta: ");
        double saldoInicial = ler.nextDouble();
        
        
        //atualizando os dados da conta
        conta.setTitular(titular);
        conta.setNumeroConta(numeroConta);
        conta.setSaldo(saldoInicial);
        
        
        //exibindo as informacoes
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Numero da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        
        System.out.println("Digite o valor do deposito: ");
        double deposito = ler.nextDouble();
        conta.depositar(deposito);
        
        System.out.println("Digite o valor do saque: ");
        double saque = ler.nextDouble();
        conta.sacar(saque);
        
        System.out.println("Saldo atualizado: " + conta.getSaldo());
        
        
        ContaCorrente conta2 = new ContaCorrente();
        
        //classe filha para teste
        
        conta2.setTitular("Juliane");
        conta2.setNumeroConta(25610);
        conta2.setSaldo(800);
        
        System.out.println(conta2);
        
        
        
        
    }
}