//Algoritmo que lê o custo de fábrica de um carro apresentando o seu valor final.
package exercicioFaccat05To43;
import java.util.Scanner;
public class Exercicio10Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de fábrica do carro.");
		float valorFabrica = sc.nextFloat();
		
		float distribuidor = valorFabrica*28/100;
		float imposto = valorFabrica*45/100;
		
		float custoFinal = valorFabrica + distribuidor + imposto;
		
		System.out.print("O custo do carro novo é: "+custoFinal);

		sc.close();
	}

}
