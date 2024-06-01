package BancoDigital2;
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("João");

        Conta cc = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupança(cliente1);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
