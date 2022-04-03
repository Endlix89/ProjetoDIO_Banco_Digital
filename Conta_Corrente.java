public class Conta_Corrente extends Conta{
    public Conta_Corrente(Cliente cliente){
        super(cliente);
    }

    @Overrider
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfoComuns();

    }
}
