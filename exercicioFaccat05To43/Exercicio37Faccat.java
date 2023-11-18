//Algoritmo que lê a quantidade em Kg de morangos e maçãs levando em consideração os descontos no resultado final.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio37Faccat {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a quantidade de morango em Kg: ");
	double quantMorangos = sc.nextDouble();
	
	System.out.println("Digite a qunatidade de maças em kg: ");
	double quantMacas = sc.nextDouble();
	
	double precoMorangos;
	if(quantMorangos<=5) {
		precoMorangos = 2.50 *quantMorangos;
	}else {
		precoMorangos = 2.20 *quantMorangos;
	}
	
	double precoMacas;
	if(quantMacas<=5) {
		precoMacas = 1.80 * quantMacas;
	}
	else {
		precoMacas = 1.50 * quantMacas;
	}
	double valorTotal = precoMorangos + precoMacas;
	
	if(quantMorangos+quantMacas>8 ||valorTotal >25.00) {
		valorTotal *=0.90;
	}
	System.out.printf("Valor a ser pago pelo cliente: R$%.2f%n",valorTotal);
	sc.close();
	}

}
