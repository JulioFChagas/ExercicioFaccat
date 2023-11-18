//Algoritmo que lê e calcula o salário e percentual de ajuste do funcionário.
package exercicioFaccat05To43;
import java.util.Scanner;
public class Exercicio09Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o salário atual do funcionário: ");
		float salarioMensal = sc.nextFloat();
		System.out.print("Digite a porcentagem de reajuste salário do funcionário: ");
		float porcentagem = sc.nextFloat();
		
		float salarioCalculo = salarioMensal*porcentagem/100;
		float salarioFinal = salarioMensal+salarioCalculo;
		System.out.println("O valor do salário com reajuste é: "+salarioFinal);
		sc.close();
	}

}
