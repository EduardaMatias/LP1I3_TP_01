/*Nomes: Eduarda Vit�ria Cunha Matias e Rafael de Oliveira Fonseca 

1. Entrar via teclado com a base e a altura de um ret�ngulo, calcular e exibir sua �rea.*/

package exercicios;
import java.util.Scanner;
public class TP01Ex01 {
	public static void main(String[] args) {
		
		double base, altura, area;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a base do retangulo: ");
		base = scan.nextDouble();
		System.out.print("Digite a altura do retangulo: ");
		altura = scan.nextDouble();
		
		area = base * altura;
		
		System.out.println("A �rea do retangulo de base igual a " + base
				+ ", e altura igual a " + altura + " � igual a " + area);
		
		scan.close();
	}
}
