//Algoritmo que lê o número de litros vendidos e o tipo de combustível.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio35Faccat {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o número de litros vendidos: ");
	double litrosVendidos = sc.nextDouble();
	System.out.println("Digite o tipo de combustiível (A para álcool, G para gasolina): ");
	char tipoCombustivel = sc.next().charAt(0);
	
	double precoLitroAlcool = 2.90;
	double precoLitroGasolina = 3.30;
	double descontoA20Litros = 0.0;
	double descontoMaior20Litros = 0.0;
	
	double precoTotal = 0.0;
	
	if(tipoCombustivel =='A' || tipoCombustivel =='a') {
		if(litrosVendidos>20) {
			descontoMaior20Litros = 0.05;
	}
	precoTotal = litrosVendidos*precoLitroAlcool* (1 - descontoA20Litros - descontoMaior20Litros);
	}
	else if (tipoCombustivel =='G' || tipoCombustivel =='g') {
		if (litrosVendidos > 20) {
			descontoMaior20Litros = 0.06;
		}
		precoTotal = litrosVendidos*precoLitroGasolina *(1 - descontoA20Litros - descontoMaior20Litros);
	}
	else {
		System.out.println("Tipo de combustível inválido. Use A para álcool ou G para gasolina.");
		
	}
	
	System.out.printf("Valor a ser pago pelo cliente: R$%.2f%n",precoTotal);
	sc.close();
	}
}

