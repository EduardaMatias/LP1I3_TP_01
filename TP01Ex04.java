/*Nomes: Eduarda Vit�ria Cunha Matias e Rafael de Oliveira Fonseca 

4. A partir dos valores da base e altura de um tri�ngulo, calcular e exibir sua �rea.*/

package exercicios;

import java.util.Scanner;

public class TP01Ex04 {
	public static void main(String[] args) {
		
		double base, altura, area;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a altura do tri�ngulo: ");
		altura = scan.nextDouble();
		System.out.print("Digite a base do tri�ngulo: ");
		base = scan.nextDouble();
		
		area = (base * altura) / 2;
		
		System.out.println("A �rea do tri�ngulo com altura de " + altura 
				+ ", e base igual a " + base + " � igual a " + area);
		
		scan.close();
	}
}
