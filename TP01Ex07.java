/*Nomes: Eduarda Vitória Cunha Matias e Rafael de Oliveira Fonseca 

7. Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados.*/

package exercicios;

import java.util.Scanner;

public class TP01Ex07 {
	public static void main(String[] args) {

		double media, valorUm, valorDois;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o 1° valor: ");
		valorUm = scan.nextDouble();
		System.out.print("Digite o 2° valor: ");
		valorDois = scan.nextDouble();
		
		media = Math.sqrt(valorUm * valorDois);
		
		System.out.println("A média geométrica dos valores digitados é igual a " + media);

		scan.close();
	}
}
