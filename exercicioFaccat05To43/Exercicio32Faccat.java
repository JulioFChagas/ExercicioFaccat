//Algoritmo que lê o nome de 2 times e o número de gols marcados na partida para cada time, informando o resultado.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio32Faccat {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o nome do time da casa: ");
	String time1 = sc.next();
	System.out.println("\nDigite o nome do time visitante: ");
	String time2 = sc.next();
	
	System.out.println("Digite o número de gols do time da casa: ");
	int gol1 = sc.nextInt();
	System.out.println("Digite o número de gols do time visitante: ");
	int gol2 = sc.nextInt();
	
	if(gol1>gol2) {
	System.out.println("Vitoria do time da casa '"+time1+"' por: "+gol1+" a "+gol2);
	}
	else if (gol2>gol1) {
	System.out.println("Vitoria do time visitante  '"+time2+"' por: "+gol2+" a "+gol1);
	}
	
	else
	System.out.println("Empate!");
	}
}