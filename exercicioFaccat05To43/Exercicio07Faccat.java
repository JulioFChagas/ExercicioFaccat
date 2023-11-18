//Algoritmo que lê o seu tempo de vida em dias.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio07Faccat {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite quantos anos de vida você tem: ");
	int anos = sc.nextInt();
	System.out.println("\nDigite quantos meses de vida você tem: ");
	int meses = sc.nextInt();
	System.out.println("\nDigite quantos dias de vida você tem: ");
	int dias = sc.nextInt();
	
	meses=meses*30;
	anos=anos*365;
	
	int total = meses+anos+dias;
	System.out.println("\n\n Você tem: "+total+" dias de vida.");
	sc.close();
	}

}
