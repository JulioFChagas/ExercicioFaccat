//Algoritmo que calcula a area de um retângulo.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio06Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da base do retângulo: ");
		double base = sc.nextDouble();
		
		System.out.println("\nDigite o valor da altura do retângulo: ");
		double altura = sc.nextDouble();
		
		double area = base*altura;
		
		System.out.println("\n\nA área do retãngulo é: "+area);
		sc.close();
	}

}
