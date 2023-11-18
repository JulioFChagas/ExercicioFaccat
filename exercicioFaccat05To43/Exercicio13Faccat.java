//Algoritmo que lê as três notas de um aluno e realiza a média ponderada apresentando seu valor final.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio13Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno: ");
		double n1 = sc.nextDouble();
		System.out.println("\nDigite a segunda nota do aluno: ");
		double n2 = sc.nextDouble();
		System.out.println("\nDigite a primeira nota do aluno: ");
		double n3 = sc.nextDouble();
		
		n1 = n1*2;
		n2 = n2*3;
		n3 = n3*5;

		double mediaPonderada = (n1+n2+n3)/10;
		
		System.out.println("A média final do aluno é: "+mediaPonderada);
		sc.close();
	}
}
