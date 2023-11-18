//Algoritmo que lê dois valores informando qual o maior ou se são iguais.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio33Faccat {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o primeiro valor: ");
	int n1 = sc.nextInt();
	System.out.println("Digite o segundo o valor: ");
	int n2 = sc.nextInt();
	
	if(n1>n2)
		System.out.println("Primeiro é maior.");
	else if(n2>n1)
		System.out.println("Segundo é maior.");
	else
		System.out.println("Números iguais.");
	sc.close();
	}

}
