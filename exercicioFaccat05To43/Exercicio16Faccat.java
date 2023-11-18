//Algoritmo que calcula o custo total de compra de maçãs levando em conta o desconto.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio16Faccat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("================MAÇÃ por R$1,30================");
		System.out.println("\n========LEVE 12 PAGUE R$1,00 NA UNIDADE========");
		System.out.println("\nDigite a quantidade de maças que deseja comprar.");
		double quantMacas = sc.nextDouble();
		double precoMacas=1.30;
		
		if(quantMacas>=12) {
		quantMacas=quantMacas*1;
		System.out.println("Você esta levando "+quantMacas+" maçãs totalizando o valor de R$"+quantMacas+"0");
		}
		else {
		precoMacas = quantMacas*precoMacas;	
		System.out.println("Você esta levando "+quantMacas+" maças totalizando o valor de R$"+precoMacas+"0");
		sc.close();
		}
	}
}
