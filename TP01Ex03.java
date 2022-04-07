/*Nomes: Eduarda Vitória Cunha Matias e Rafael de Oliveira Fonseca 

3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.*/

package exercicios;
import java.util.Scanner;
public class TP01Ex03 {
	public static void main(String[] args) {
		
		double diagonal, area;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a diagonal do trabalho: ");
		diagonal = scan.nextDouble();
		
		area = Math.pow(diagonal, 2)/2;
		
		System.out.println("A área do quadrado com o valor de uma da diagonal"
				+ " igual a " + diagonal + " é igual a " + area);
		
		scan.close();
		
	}
}
