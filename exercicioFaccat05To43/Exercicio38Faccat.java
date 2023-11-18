//Algoritmo que lê um número que é um código de usuário informando se a senha esta correta.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio38Faccat {

	public static void main(String[] args) {
	int codigoUsado = 1234;
	int senhaUsada = 9999;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o código do usuário: ");
	int codigoUsuario = sc.nextInt();
	
	if(codigoUsuario != codigoUsado) {
		System.out.println("Usuário inválido");
	}
	else {
		System.out.println("Digite a senha: ");
		int senhaUsuario = sc.nextInt();
	
	if(senhaUsuario != senhaUsada) {
		System.out.println("Senha incorreta!");
		}
	else {
		System.out.println("Acesso permitido.");
	}
	}
	sc.close();
	}
}