/*Nomes: Eduarda Vit�ria Cunha Matias e Rafael de Oliveira Fonseca 

6. Calcular e exibir a m�dia aritm�tica de quatro valores quaisquer que ser�o digitados.*/

package exercicios;

import java.util.Scanner;

public class TP01Ex06 {
	public static void main(String[] args) {
		
		int i;
		double valor, media, soma = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(i = 0; i < 4; i++) {
			System.out.print("Digite o " + (i + 1) + "� valor: ");
			valor = scan.nextDouble();
			soma = soma + valor;
		}
		 
		media = soma / 4;
		
		System.out.println("A m�dia dos valores digitados � igual a " + media);
		
		scan.close();
	}
}
