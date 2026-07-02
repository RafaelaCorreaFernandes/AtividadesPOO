package atividades_0107;

public class Produto {
    private String nome;
    private int quantidade;
    private double preco;

//construtor 
  public Produto(String nome, int quantidade, double preco) {
	this.nome = nome;
	this.quantidade = quantidade;
	this.preco = preco;
}

 public void aumentarEstoque(int quantidade) {
	this.quantidade = this.quantidade + quantidade;
  }

  public void diminuirEstoque(int quantidade) {
	this.quantidade = this.quantidade - quantidade;
   }


  public double calcularValorTotal() {
	return preco * quantidade;
  }

  public void exibirDados() {
	  System.out.println("Nome: " + nome);
	  System.out.println("Estoque: " + quantidade);
	  System.out.println("Preço: " + preco);
	  
  }
}



