package atividades_0107;

public class Aluno {
 private String nome;
 private double nota1;
 private double nota2;
 
 public Aluno(String nome, double nota1, double nota2) {
     this.nome = nome;
     this.nota1 = nota1;
     this.nota2 = nota2;
 }

 public String getNome() {
     return nome;
 }

 
 public double calcularMedia() {
	return (nota1 + nota2) / 2;
	
 }
    public String situacao() {
        double media = calcularMedia();

        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    
}
}
