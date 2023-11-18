//Algoritmo que lê o antecessor do numero que foi digitado.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio05Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número para aparecer o seu antecessor: ");
		int valor = sc.nextInt();
		
		int valorf = valor-1;
		
		System.out.println("O antecessor de "+valor+" é: "+valorf);
		sc.close();
	}
	
}
