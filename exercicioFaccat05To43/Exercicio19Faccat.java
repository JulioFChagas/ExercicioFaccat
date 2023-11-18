//Algoritmo que le dois valores diferentes apresentando o maior deles.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio19Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		int n1 = sc.nextInt();
		
		int n2;
		do {
		System.out.println("\nDigite o segundo valor diferente do primeiro: ");
		n2 = sc.nextInt();
		
		if(n1 == n2) {
			System.out.println("Os valores digitados são iguais, digite o segundo valor novamente.");
		
			}
		} while(n1 == n2);
		
		if(n1>n2) {
			System.out.println("O maior valor é: "+n1);	
		}
		else {
			System.out.println("O maior valor é: "+n2);	
			}	
		
		sc.close();
	}

}
