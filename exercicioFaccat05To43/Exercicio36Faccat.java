//Algoritmo que lê as idades de 2 homens e 2 mulheres, calculando a soma das idades do homem mais velho com a mulher mais nova e o produto das idades do homem mais novo com a mulher mais velha.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio36Faccat {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite a idade do primeiro homem: ");
	int h1 = sc.nextInt();
	
	System.out.println("Digite a idade do segundo homem diferente do primeiro: ");
	int h2;
	do {
		h2=sc.nextInt();	
	} while (h1==h2);
	System.out.println("Digite a idade da primeira mulher: ");
	int m1 = sc.nextInt();
	
	System.out.println("Digite a idade da segunda mulher diferente da primeira: ");
	int m2;
	do {
		m2=sc.nextInt();
	} while (m1==m2);
	
	int somaIdades = Math.max(h1, h2) + Math.min(m1, m2);
    int produtoIdades = Math.min(h1, h2) * Math.max(m1, m2);
    
    System.out.println("Soma das idades do homem mais velho com a mulher mais nova: "+somaIdades);
    System.out.println("Produto das idades do homem mais novo com a mulher mais velha: "+produtoIdades);
    
    sc.close();
	
	
	}

}
