//Algoritmo que lê dois valores e apresenta os mesmos em ordem crescente (não considerando valores 
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio20Faccat {

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
	
		int menor, maior;

    if (n1 < n2)
    {
        menor = n1;
        maior = n2;
    } 
    else
    {
        menor = n2;
        maior = n1;
    }

	System.out.println("Os valores em ordem crescente são: "+menor+","+ maior);
	sc.close();
	}
	
}
