//Algoritmo que lê 3 valores e escreve os mesmos em ordem crescente.
package exercicioFaccat05To43;
import java.util.Scanner;

public class Exercicio30Faccat {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o primeiro valor: ");
	int n1 = sc.nextInt();
	
	int n2;
	int n3;
	do {
	System.out.println("\nDigite o segundo valor diferente do primeiro: ");
	n2 = sc.nextInt();
	
	}while(n2==n1);
	do {
		System.out.println("Digite o terceiro valor diferente do primeiro e segundo");
		n3 = sc.nextInt();
		}while (n3 == n1 | n3 == n2);
	
  int menor, meio, maior;

  if (n1 < n2 && n1 < n3){
	menor = n1;
    if(n2<n3) {
    meio = n2;
    maior = n3;
    }
    else
    {
    meio = n3;
    maior = n2;
    }
  }
  
  else if (n2<n3)
  {
	menor = n2;
	if(n1<n3)
	{
	meio = n1;
	maior = n3;
	}
	else 
	{
	meio = n3;
	maior = n1;
	}
  }
  
	else
	 {
	menor = n3;
	if(n1<n2) {
	meio = n1;
	maior = n2;	 
	 }
	else
	{
	meio = n2;
	maior = n1;
	}
		 
  } 
 
	
	System.out.println("Os valores em ordem crescente são: "+menor+","+meio+","+maior);
	sc.close();
	}
	
}