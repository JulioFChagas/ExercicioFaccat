//Algoritmo que lê a hora de inicio e fim de um jogo de Xadrez considerando apenas as horas.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio21Faccat {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite a hora de início do jogo: ");
	int horaInicial = sc.nextInt();
	
	System.out.println("Digite a hora de fim do jogo: ");
	int horaFim = sc.nextInt();
	
	int duracao;
	
	if(horaInicial<=horaFim) {
	    duracao = horaFim - horaInicial;
	}
	else {
		duracao = (24 - horaInicial)+ horaFim;
	}
	
	System.out.println("A duração do jogo é de "+duracao+" horas.");
	sc.close();
	}

}
