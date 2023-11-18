//Algoritmo que lê 3 valores e escreve o maior deles.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio28Faccat {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o primeiro valor");
	int n1 = sc.nextInt();
	
	int n2;
	do {
	System.out.println("Digite o segundo valor diferente do primeiro");
		n2 = sc.nextInt();
	}while (n1==n2);
	
	int n3;
	do {
	System.out.println("Digite o terceiro valor diferente do primeiro e segundo");
	n3 = sc.nextInt();
	}while (n3 == n1 | n3 == n2);
	
	int maiorValor;
	
	if(n1>n2 && n1>n3) {
		maiorValor = n1;
	}
	
	else if(n2>n3) {
		maiorValor = n2;
	}
	
	else {
		maiorValor = n3;
	}
	System.out.println("O maior deles é: "+maiorValor);
	sc.close();
	}

}
