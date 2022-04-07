/*Nomes: Eduarda Vitória Cunha Matias e Rafael de Oliveira Fonseca 

2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.*/

package exercicios;

import java.util.Scanner;

public class TP01Ex02 {
	public static void main(String[] args) {
		
		double aresta, area;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor de uma das arestas do quadrado: ");
		aresta = scan.nextDouble();
		
		
		area = Math.pow(aresta, 2);
		
		System.out.println("A área do quadrado com o valor de uma das arestas"
				+ " igual a " + aresta + " é igual a " + area);
		
		scan.close();
	}
}
