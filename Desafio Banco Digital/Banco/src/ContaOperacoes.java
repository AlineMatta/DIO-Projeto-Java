public interface ContaOperacoes {

    public void sacar (double valorSaque);
    public void depositar (double valorDeposito);
    public void transferir(double valorTransferido, Conta contaDestino);
}
