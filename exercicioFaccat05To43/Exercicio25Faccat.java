//Algoritmo que lê o número da conta do cliente, saldo, débito e crédito, aprensentando o saldo atual.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio25Faccat {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o número da sua conta: ");
	int conta = sc.nextInt();
	System.out.println("Digite o seu saldo: ");
	double saldo = sc.nextDouble();
	System.out.println("Digite o valor de seu débito: ");
	double debito = sc.nextDouble();
	System.out.println("Digite o valor de seu crédito: ");
	double credito = sc.nextDouble();
	
	double saldoAtual = saldo-debito+credito;
	if(saldoAtual>=0) {
		System.out.println("Seu saldo atual é: R$"+saldoAtual+"0 'Saldo Positivo' ");
		}
	else
		{	
		System.out.println("Seu saldo é: R$"+saldoAtual+"0 'Saldo Negativo'");
		}	
	sc.close();
	}
}


