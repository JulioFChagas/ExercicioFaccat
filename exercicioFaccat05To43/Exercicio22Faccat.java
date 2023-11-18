//Algoritmo que lê o número de horas trabalhadas em um mês, o salário por hora e o salário total com as horas extras.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio22Faccat {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o número de horas trabalhadas no mês: ");
	double horas = sc.nextDouble();
	
	System.out.println("Digite o salário por hora: ");
	double salario = sc.nextDouble();
	
	double salarioRegular = horas*salario;
	double horasExtras = 0;	
	double salarioExtras;
	double salarioTotal;
	
	if(horas>40) {
	horasExtras = horas-40;
	salarioExtras = horasExtras*(1.5 * salario);
	salarioTotal = salarioRegular + horasExtras;
	System.out.println("O salário total do funcionário é: R$"+salarioTotal);
	}
	
	else
		{ 
		System.out.println("O salário total do funcionário é: R$"+salarioRegular);
	 	}
	sc.close();
	}
}
