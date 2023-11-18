/* 39) Para A = V, B = V e C = F, qual o resultado da avaliação das seguintes expressões:
a) (A e B) ou (A xou B)
b) (A ou B) e (A e C)
c) A ou C e B xou A e não B */

package exercicioFaccat05To43;

public class Exercicio39Faccat {

	 public static void main(String[] args) {
	 boolean a = true;
	 boolean b = true;
	 boolean c = false;

	        
	boolean resultadoA = (a && b) || (a ^ b);
	System.out.println("Resultado a): " + resultadoA);

	boolean resultadoB = (a || b) && (a && c);
	System.out.println("Resultado b): " + resultadoB);

	        
	boolean resultadoC = a || (c && b) ^ (a && !b);
	System.out.println("Resultado c): " + resultadoC);
	    }
	}