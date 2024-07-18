public class Cliente {
    
    private String clienteNome;
    private String senha;
    private Conta conta;

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Cliente(String clienteNome, String senha) {
        this.clienteNome = clienteNome;
        this.senha = senha;
    }

    public String getclienteNome() {
        return clienteNome;
    }

    public void setclienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
