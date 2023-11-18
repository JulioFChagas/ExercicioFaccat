//Algoritmo que le as notas das avaliações de um aluno calculando a média aritmética simples.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio17Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a nota da primeira avaliação do aluno: ");
		double n1 = sc.nextDouble();
		System.out.println("Digite a nota da segunda avaliação do aluno: ");
		double n2 = sc.nextDouble();
		
		double mediaSimples = (n1+n2)/2;
		
		System.out.println("A nota final é: "+mediaSimples);
		if(mediaSimples>=6) 
			System.out.println("\nO aluno está aprovado.");
		else 
			System.out.println("\nO aluno está reprovado");
		sc.close();
	}

}
