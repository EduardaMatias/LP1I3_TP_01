/*Nomes: Eduarda Vitória Cunha Matias e Rafael de Oliveira Fonseca 

6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.*/

package exercicios;

import java.util.Scanner;

public class TP01Ex06 {
	public static void main(String[] args) {
		
		int i;
		double valor, media, soma = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(i = 0; i < 4; i++) {
			System.out.print("Digite o " + (i + 1) + "° valor: ");
			valor = scan.nextDouble();
			soma = soma + valor;
		}
		 
		media = soma / 4;
		
		System.out.println("A média dos valores digitados é igual a " + media);
		
		scan.close();
	}
}
