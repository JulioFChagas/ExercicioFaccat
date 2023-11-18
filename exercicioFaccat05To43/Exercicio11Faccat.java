/*Algoritmo que lê o número de carros vendidos pelo funcionário, o valor total de suas
vendas, o salário fixo e o valor que ele recebe por carro vendido.*/
package exercicioFaccat05To43;
import java.util.Scanner;
public class Exercicio11Faccat {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite o nome do funcionário: ");
		String nome = sc.next();
		System.out.print("\nDigite a quantidade de carros vendidos: ");
		byte carros = sc.nextByte();
		System.out.print("\nDigite o sálario fixo do funcionário: ");
		float valorSalario = sc.nextFloat();
		System.out.print("\nDigite o valor da comissão: ");
		float comissao = sc.nextFloat();
		
		float comissaoCarro = (comissao*carros)*1.05f;
	
		float valorTotal = comissaoCarro+valorSalario;
		
		
		System.out.print("O funcionário "+nome+" vendeu "+carros+" carros somando: "+comissaoCarro+" com seus adicionais.");
		System.out.println("\nSeu salário é de "+valorSalario+" totalizando com suas vendas o valor final de: "+valorTotal);
		sc.close();
	}

}
