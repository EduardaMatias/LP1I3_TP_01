/*Nomes: Eduarda Vit�ria Cunha Matias e Rafael de Oliveira Fonseca 

3. Calcular e exibir a �rea de um quadrado a partir do valor de sua diagonal que ser� digitado.*/

package exercicios;
import java.util.Scanner;
public class TP01Ex03 {
	public static void main(String[] args) {
		
		double diagonal, area;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a diagonal do trabalho: ");
		diagonal = scan.nextDouble();
		
		area = Math.pow(diagonal, 2)/2;
		
		System.out.println("A �rea do quadrado com o valor de uma da diagonal"
				+ " igual a " + diagonal + " � igual a " + area);
		
		scan.close();
		
	}
}
