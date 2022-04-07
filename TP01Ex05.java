/*Nomes: Eduarda Vitória Cunha Matias e Rafael de Oliveira Fonseca 

5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.*/

package exercicios;

import java.util.Scanner;

public class TP01Ex05 {
	public static void main(String[] args) {
		
		double diametro, raio, volume;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor do diâmetro da esfera: ");
		diametro = scan.nextDouble();
		
		raio = diametro/2;
		
		volume = (4 * Math.PI * (Math.pow(raio, 3)))/3;
		
		System.out.println("O volume da esfera com diâmetro de " + diametro 
				+ ", e raio igual a " + raio + ", tem volume igual a " + volume);
		
		scan.close();
	}
}
