//Algoritmo que lê 3 valores (A,B e C) representando as medidas dos lados de um triângulo informando se formam ou não um triângulo.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio31Faccat {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o valor do lado A: ");
	double a = sc.nextDouble();
	System.out.println("Digite o valor do lado B: ");
	double b = sc.nextDouble();
	System.out.println("Digite o valor do lado C: ");
	double c = sc.nextDouble();
	
	boolean triangulo = (a<b+c) && (b<a+c) && (c<a+b);
	
	if(triangulo) {
		System.out.println("Os lados formam um triângulo.");
	}
	else {
		System.out.println("Os lados não formam um triângulo");
	}
	sc.close();
	}

}
