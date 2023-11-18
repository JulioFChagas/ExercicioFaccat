//Algoritmo que calcula o peso ideal coletando informações como nome, sexo, altura
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio23Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		String nome = sc.next();
		System.out.println("\nDigite o sexo (M ou F): ");
		char sexo = sc.next().charAt(0);
		
		System.out.println("Digite a altura em metros: ");
		double altura = sc.nextDouble();
		
		double pesoIdeal;
		
		if (sexo =='M'|sexo == 'm') {
			pesoIdeal=(72.7*altura) - 58;
		}
		else if (sexo =='F'|sexo == 'f') {
			pesoIdeal = (62.1*altura) - 44.7;
		}
		else {
			System.out.println("Escolha inválida, informe M ou F");
			return;
		}
		System.out.println("O peso ideal para "+nome+" é: "+pesoIdeal+" kg");
		sc.close();
	}
		
}
