//Algoritmo que le 3 notas obitidas por um aluno nas 3 verificações e a média dos execicios.
package exercicioFaccat05To43;

import java.util.Scanner;

public class Exercicio41Faccat {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite a nota da primeira verificação: ");
	double n1 = sc.nextDouble();
	
	System.out.println("Digite a nota da segunda verificação: ");
	double n2 = sc.nextDouble();
	
	System.out.println("Digite a nota da terceira verificação: ");
	double n3 = sc.nextDouble();
	
	System.out.println("Digite a média dos exercícios: ");
	double mediaExercicios = sc.nextDouble();
	
	double aproveitamento = (n1+n2*2+n3*3+mediaExercicios)/7;
	
	String formato = "%.1f";
	String mediaFormatada = String.format(formato, aproveitamento);
	
	char conceito;
	if(aproveitamento>=9.0) {
		conceito = 'A';
	} else if (aproveitamento>=7.5) {
		conceito = 'B';
	}
	else if (aproveitamento>=6.0) {
		conceito = 'C';
	}
	else {
		conceito = 'D';
	}
	
	System.out.println("Média de aproveitamento: "+mediaFormatada);
	System.out.println("\nConceito "+ conceito);
	sc.close();
	}
	

}
