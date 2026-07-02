package atividades_0107;

import java.util.Scanner;

public class MainLivro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        Livro livro = new Livro(titulo, autor);

        System.out.println("\n--- DADOS DO LIVRO ---");
        livro.exibirInformacoes();

        System.out.println("\nEmprestando o livro...");
        livro.emprestar();
        livro.exibirInformacoes();

        System.out.println("\nDevolvendo o livro...");
        livro.devolver();
        livro.exibirInformacoes();

        sc.close();
    }
}