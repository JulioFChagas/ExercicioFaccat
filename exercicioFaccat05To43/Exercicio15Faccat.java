//Algoritmo que lê um valor e esreve se é positivo ou negativo (considere 0 como positivo).
package exercicioFaccat05To43;
import java.util.Scanner;
public class Exercicio15Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor para saber se é positivo ou negativo: ");
		int valor = sc.nextInt();
		
		if(valor>=0) 
			System.out.println("O valor é positivo.");
		else
			System.out.println("O valor é negativo.");
		
		sc.close();
	}

}
