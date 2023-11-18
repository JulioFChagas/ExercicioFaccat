//Algoritmo que lê a descrição de um produto, a quantidade adquirida e o preço unitário.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio40Faccat {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a descrição do produto: ");
	String descricao = sc.nextLine();
	
	System.out.println("Digite a quantidade adquirida: ");
	int quantidade = sc.nextInt();
	
	System.out.println("Digite o preço unitário: ");
	double unitario = sc.nextDouble();
	
	double total = quantidade*unitario;
	
	double desconto = 0.0;
	
	if(quantidade<=5) {
		desconto = 0.02*total;
	}
	else if(quantidade >5 && quantidade<=10) {
		desconto = 0.03*total;
	}
	else {
		desconto =0.05*total;
	}
	double pagamento = total - desconto;
	
	System.out.println("Descrição do produto: "+descricao);
	System.out.println("Total: R$"+total+"0");
	System.out.println("Desconto: R$"+desconto+"0");
	System.out.println("Total a pagar: R$"+pagamento+"0");
	
	sc.close();
	}

}
