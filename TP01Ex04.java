/*Nomes: Eduarda Vitória Cunha Matias e Rafael de Oliveira Fonseca 

4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.*/

package exercicios;

import java.util.Scanner;

public class TP01Ex04 {
	public static void main(String[] args) {
		
		double base, altura, area;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a altura do triângulo: ");
		altura = scan.nextDouble();
		System.out.print("Digite a base do triângulo: ");
		base = scan.nextDouble();
		
		area = (base * altura) / 2;
		
		System.out.println("A área do triângulo com altura de " + altura 
				+ ", e base igual a " + base + " é igual a " + area);
		
		scan.close();
	}
}
