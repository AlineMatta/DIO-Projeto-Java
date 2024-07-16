package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class carrinhoCompra {

    private List<itens> itemList;

    public carrinhoCompra() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem (String nome, double preço, int quantidade){
        itens item = new itens (nome, preço, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<itens> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
          for (itens i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
              itensParaRemover.add(i);
            }
          }
          itemList.removeAll(itensParaRemover);
        } else {
          System.out.println("A lista está vazia!");
        }
      }
    
      public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
          for (itens item : itemList) {
            double valorItem = item.getPreco() * item.getQuant();
            valorTotal += valorItem; 
          }
          return valorTotal;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
      }
    
      public void exibirItens() {
        if (!itemList.isEmpty()) {
          System.out.println(this.itemList);
        } else {
          System.out.println("A lista está vazia!");
        }
      }
    
      @Override
      public String toString() {
        return "CarrinhoDeCompras{" +
            "itens=" + itemList +
            '}';
      }
    
      public static void main(String[] args) {
        carrinhoCompra carrinhoCompra = new carrinhoCompra();
    
        carrinhoCompra.adicionarItem("Lápis", 2d, 3);
        carrinhoCompra.adicionarItem("Caneta", 1d, 5);
        carrinhoCompra.adicionarItem("Caderno", 35d, 1);
        carrinhoCompra.adicionarItem("Borracha", 2d, 2);
    
        carrinhoCompra.exibirItens();
    
        carrinhoCompra.removerItem("Lápis");
    
        carrinhoCompra.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhoCompra.calcularValorTotal());
      }
    }