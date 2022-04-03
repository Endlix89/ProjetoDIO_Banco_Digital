public class Main {

    public static void main(String[] args){
        Cliente Elder = new Cliente();
        Elder.setNome("Elder");

        Conta cc = new Conta contaCorrente();
        Conta poupanca = new ContaPoupanca();


        cc.depositar(150);
        cc.transferi(100, poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
