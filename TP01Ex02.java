/*Nomes: Eduarda Vit�ria Cunha Matias e Rafael de Oliveira Fonseca 

2. Calcular e exibir a �rea de um quadrado, a partir do valor de sua aresta que ser� digitado.*/

package exercicios;

import java.util.Scanner;

public class TP01Ex02 {
	public static void main(String[] args) {
		
		double aresta, area;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor de uma das arestas do quadrado: ");
		aresta = scan.nextDouble();
		
		
		area = Math.pow(aresta, 2);
		
		System.out.println("A �rea do quadrado com o valor de uma das arestas"
				+ " igual a " + aresta + " � igual a " + area);
		
		scan.close();
	}
}
