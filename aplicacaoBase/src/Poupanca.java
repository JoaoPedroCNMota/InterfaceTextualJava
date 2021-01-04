public class Poupanca extends Conta{

    public Poupanca(String numero, Cliente cliente) {
        super(numero, cliente);
        // TODO Auto-generated constructor stub
    }
    
    public void renderJuros(double taxa){
        double saldoAtual = getSaldo();
        creditar(saldoAtual * taxa);
    }
}
