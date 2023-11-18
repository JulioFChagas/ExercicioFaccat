//Algoritmo que realiza a conversão de Fahrenheit para Celsius.
package exercicioFaccat05To43;
import java.util.Scanner;
public class Exercicio12Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em graus Fahrenheit: ");
		double fh = sc.nextDouble();
		
		double celsius = (fh-32)*5.0/9.0;
		System.out.println("A temperatura de "+fh+" corresponde a: "+celsius+" graus Celsius.");
		
	sc.close();
	}

}
