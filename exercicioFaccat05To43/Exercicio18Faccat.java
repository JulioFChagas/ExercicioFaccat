//Algoritmo que lê o ano atual e o ano de nascimento de uma pessoa informando se ela poderá votar este ano ou não.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio18Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ano atual: ");
		int ano = sc.nextInt();
		System.out.println("\nDigite o ano em que você nasceu: ");
		int anoPessoa = sc.nextInt();
		
		int idade = ano-anoPessoa;
		
		if(idade>=16) 
			System.out.println("Você pode votar.");
		else
			System.out.println("Você não pode votar.");
		
		sc.close();
	}

}
