//Algoritmo que le o salario fixo e o valor das vendas efetuado pelo vendedor de uma empresa.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio24Faccat {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o salário fixo do vendedor: ");
	double salario = sc.nextDouble();
	System.out.println("Digite o valor das vendas efetuadas: ");
	double vendas = sc.nextDouble();
	double comissao;
	
	if(vendas<=1500) {
		comissao = 0.03* vendas;
	}
	else {
		comissao = (0.03*1500) + (0.05*(vendas-1500));
	}
	
	double salarioTotal = salario+comissao;
	
	System.out.println("O salário total do vendedor é: R$"+salarioTotal);
	sc.close();
	}

}
