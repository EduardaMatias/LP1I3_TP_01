/*Nomes: Eduarda Vit�ria Cunha Matias e Rafael de Oliveira Fonseca 

7. Calcular e exibir a m�dia geom�trica de dois valores quaisquer que ser�o digitados.*/

package exercicios;

import java.util.Scanner;

public class TP01Ex07 {
	public static void main(String[] args) {

		double media, valorUm, valorDois;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o 1� valor: ");
		valorUm = scan.nextDouble();
		System.out.print("Digite o 2� valor: ");
		valorDois = scan.nextDouble();
		
		media = Math.sqrt(valorUm * valorDois);
		
		System.out.println("A m�dia geom�trica dos valores digitados � igual a " + media);

		scan.close();
	}
}
