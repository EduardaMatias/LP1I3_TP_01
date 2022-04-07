/*Nomes: Eduarda Vitória Cunha Matias e Rafael de Oliveira Fonseca 

1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.*/

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
		
		System.out.println("A área do retangulo de base igual a " + base
				+ ", e altura igual a " + altura + " é igual a " + area);
		
		scan.close();
	}
}
