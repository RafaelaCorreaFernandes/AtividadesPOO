package atividades_0107;

public class MainContaBancaria {
	 public static void main(String[] args) {
	        ContaBancaria conta = new ContaBancaria(1, "Rafaela", 0);

	        conta.Depositar(1000);
	        conta.Sacar(300);
	        conta.Sacar(900);

	        conta.exibirDados();
	    }
	 
	 
}
