package atividades_0107;

import java.util.Scanner;

public class MainFuncionário {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Salário: ");
        double salario = sc.nextDouble();

        Funcionário funcionario = new Funcionário(nome, salario);

        double salarioAntigo = funcionario.getSalario();

        funcionario.aumentarSalario(15);

        System.out.println("\n--- DADOS DO FUNCIONÁRIO ---");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário antigo: R$ " + salarioAntigo);
        System.out.println("Salário novo: R$ " + funcionario.getSalario());
        System.out.println("Salário anual: R$ " + funcionario.calcularSalarioAnual());

        sc.close();
    }
}