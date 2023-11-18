//Algoritmo que realiza teste de mesa.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio34Faccat {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Digite o valor de X: ");
    int x = sc.nextInt();

    System.out.print("Digite o valor de Y: ");
    int y = sc.nextInt();

    int z = (x * y) + 5;

    char resposta;

    if (z <= 0) {
        resposta = 'A';
    } 
    else if (z <= 100) {
        resposta = 'B';
    } 
    else {
        resposta = 'C';
    	}
    
    System.out.println("Para X = " + x + ", Y = "+y+ ":");
	System.out.println("Z = "+ z);
	System.out.println("Resposta = "+ resposta);
	sc.close();
	}
}