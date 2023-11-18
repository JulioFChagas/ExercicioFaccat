//Algoritmo que realiza teste de mesa.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio43Faccat {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o valor de a: ");
	int a = sc.nextInt();
	
	System.out.println("Digite o valor de b:" );
	int b = sc.nextInt();
	
	System.out.println("Digite o valor de c: ");
	int c = sc.nextInt();
	
	if((a<b+c)&& (b<a+c)&&(c<a+b)) {
		if(a == b && b == c) {
			System.out.println("Triângulo Equilátero");
		} else if (a == b || b == c || a == c) {
			System.out.println("Triângulo Isósceles");
		}else {
			System.out.println("Triângulo Escaleno");
		}
	}
		else {
			System.out.println("Não é possível formar um triângulo");
		}
	sc.close();
	}

}


