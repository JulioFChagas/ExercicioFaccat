//Algoritmo que lê um valor e escreve se é positivo ou negativo ou zero.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio27Faccat {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite um valor para saber se ele é positivo ou negativo.");
	int valor = sc.nextInt();
	
	if(valor>0) {
		System.out.println(valor+" É um valor positivo.");
	}
	else if(valor<0) {
		System.out.println(valor+" É um valor negativo.");
	}
	else {
		System.out.println("Zero");
	}
	sc.close();
	}

}
