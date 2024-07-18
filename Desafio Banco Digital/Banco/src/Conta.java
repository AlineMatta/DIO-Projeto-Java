public abstract class Conta implements ContaOperacoes{
    
    protected static String AGENCIA_PADRAO = "1234";
    protected static int SEQUENCIAL = 100;
    protected static double SALDOPADRAO = 0;

    protected String agencia;
    protected int numero;
    protected double saldo;
    protected static Cliente titular;


    public Conta(Cliente titular) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = SALDOPADRAO;
        Conta.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
	public void sacar(double valorSaque) {
		this.saldo -= valorSaque;
	}

	@Override
	public void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	}

	@Override
	public void transferir(double valorTransferido, Conta contaDestino) {
		this.sacar(valorTransferido);
		contaDestino.depositar(valorTransferido);
	}
}



