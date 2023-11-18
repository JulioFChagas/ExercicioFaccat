//Algoritmo que lê um numero inteiro e informa se o mesmo é maior que 10 ou não.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio14Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor para saber se é maior que 10: ");
		int valor = sc.nextInt();
		
		if(valor>10) 
			{
			System.out.println("É MAIOR QUE 10!.");
			}
		else
			{
				System.out.println("NÃO É MAIOR QUE 10!");
			}
		sc.close();
	}	
}
