//Algoritmo que lê a quantidade atual em estoque, quantidade maxima e quantidade minima, apresentando a quantidade média.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio26Faccat {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite a quantidade atual em estoque: ");
	int quantidadeAtual = sc.nextInt();
	System.out.println("Digite a quantidade máxima em estoque: ");
	int quantidadeMaxima = sc.nextInt();
	System.out.println("Digite a quantidade minima em estoque: ");
	int quantidadeMinima = sc.nextInt();
	
	int quantidadeMedia = (quantidadeMaxima+quantidadeMinima)/2;
	
	if(quantidadeAtual>=quantidadeMedia)
		System.out.println("Não efetuar compra.");
	else
		System.out.println("Efetuar compra.");
		
	}

}
