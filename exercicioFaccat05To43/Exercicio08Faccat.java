/*Algoritmo em Java que lê o número total de eleitores de um município, o número de votos brancos, nulos e válidos.
 * Calcula e exibe o percentual que cada tipo de voto representa em relação ao total de eleitores.*/

package exercicioFaccat05To43;
import java.util.Scanner;
public class Exercicio08Faccat {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número total de eleitores do município: ");
		float totalEleitores = sc.nextFloat();
		System.out.println("Digite o número de votos brancos:");
		float votosBrancos = sc.nextFloat();
		System.out.println("Digite o número de votos nulos: ");
		float votosNulos = sc.nextFloat();
		System.out.println("Digite o número de votos válidos do município: ");
		float votosValidos = sc.nextFloat();
		
		
		float porcentagemVotosBrancos = votosBrancos*100/totalEleitores;
		float porcentagemVotosNulos = votosNulos*100/totalEleitores;
		float porcentagemValidos = votosValidos*100/totalEleitores;
		
		
		System.out.println("Percentual de votos brancos corresponde a: "+porcentagemVotosBrancos+"%");
		System.out.println("Percentual de votos nulos: "+porcentagemVotosNulos+"%");
		System.out.println("Percentual de votos válidos: "+porcentagemValidos+"%");
		sc.close();
	}
}
