//Algoritmo que lê 3 valores apresentando a soma dos 2 maiores
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio29Faccat {

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
	
	int somaValoresMaiores;
	
	if ((n1 > n2 && n1 > n3) || (n1 == n2 && n1 > n3) || (n1 == n3 && n1 > n2)) {
        somaValoresMaiores = n1 + Math.max(n2, n3);
    } else if ((n2 > n1 && n2 > n3) || (n2 == n3 && n2 > n1)) {
        somaValoresMaiores = n2 + Math.max(n1, n3);
    } else {
        somaValoresMaiores = n3 + Math.max(n1, n2);
    }
	System.out.println("A soma dos dois maiores valores é: "+somaValoresMaiores);
	sc.close();
	}

}
