package OperacoesBasicas;

public class itens {

private String nome;
private double preco;
private int quant;

public itens (String nome, double preco, int quant){
    this.nome = nome;
    this.preco = preco;
    this.quant = quant;
}

public String getNome(){
    return nome;
}

public double getPreco(){
    return preco;
}

public int getQuant(){
    return quant;
}

@Override
public String toString(){
    return "Item " +
                        nome + '\''+
                        ", preco = " + preco +
                        ", quant = " + quant
                        ;
    }       
}
