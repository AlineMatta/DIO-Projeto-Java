package br.com.dio.desafio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 5d;

    private String titulo;
    private String descricao;

    protected String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularxp();

    

}
