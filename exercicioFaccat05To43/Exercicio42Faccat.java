//Algoritmo que verifica a qualificação de um empregado para aposentadoria ou não.
package exercicioFaccat05To43;
import java.util.Scanner;
public class Exercicio42Faccat {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o número do empregado: ");
	int codigo = sc.nextInt();
	
	System.out.println("\nDigite o ano de nascimento do empregado: ");
	int ano = sc.nextInt();
	
	System.out.println("\nDigite o ano de ingresso na empresa: ");
	int anoIngresso = sc.nextInt();
	
	int idade = java.time.Year.now().getValue() - ano;
	
	int tempo = java.time.Year.now().getValue() - anoIngresso;
	
	if(idade >=65 || tempo >= 30 || (idade>=60 && tempo >= 25)) {
	System.out.println("Idade: "+idade+" anos.");
	System.out.println("Tempo de trabalho: "+tempo+" anos.");
	System.out.println("Requerer aposentadoria.");
	}else {
	System.out.println("Idade: "+ idade +" anos");
	System.out.println("Tempo de trabalho: "+ tempo +" anos");
	System.out.println("Não requerer aposentadoria.");
	}
	sc.close();
	}

}
