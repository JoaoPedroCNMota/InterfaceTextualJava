public class ContaBonificada extends Conta {

    private double bonificacao;

    public ContaBonificada(String numero, Cliente cliente) {
        super(numero, cliente);
        // TODO Auto-generated constructor stub
    }

    public void creditar(double valor){
        bonificacao = bonificacao + (valor * 0.01);
        super.creditar(valor);
    }

    public void renderBonus(){
        super.creditar(bonificacao);
        bonificacao = 0;
    }

    public double getBonus(){
        return bonificacao;
    }

}
